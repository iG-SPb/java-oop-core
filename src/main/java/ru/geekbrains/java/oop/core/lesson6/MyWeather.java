package ru.geekbrains.java.oop.core.lesson6;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class MyWeather {

    public static void main(String[] args) {
        getMethod();
        parseMethod();
    }

    // запрос данных на 5-ть дней
    public static void getMethod() {
        OkHttpClient client = new OkHttpClient();
        /*RequestBody formBody = new FormBody.Builder()
                .add("id", "498817")
                .add("lang", "RU")
                .add("appid", "bed3336d9de0a44b8c8c9d5fd8f16498")
                .build();
        */
        Request request = new Request.Builder()
                .url("http://api.openweathermap.org/data/2.5/forecast?id=498817&lang=RU&appid=bed3336d9de0a44b8c8c9d5fd8f16498")
                //.put(formBody)
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            String body = response.body().string();
            // сохранение полученных данных
            FileWriter myFile = new FileWriter("src/main/resources/weather.json");
            myFile.write(body);
            myFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // разбор полученного JSON по 6-ти показателям погоды (для примера)
    public static void parseMethod() {
        String collect = "";
        try {
            collect = Files.lines(Paths.get("src/main/resources/weather.json")).collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = new JSONObject(collect);
        JSONArray array = jsonObject.getJSONArray("list");
        for (int i = 0; i < array.length(); i++) {
            JSONObject firstObject = (JSONObject) array.get(i);
            String dataWeather = firstObject.get("dt_txt").toString();
            double tempWeather = firstObject.getJSONObject("main").getDouble("temp");
            int pressureWeather = firstObject.getJSONObject("main").getInt("pressure");
            double speedWind = firstObject.getJSONObject("wind").getDouble("speed");
            int degWind = firstObject.getJSONObject("wind").getInt("deg");

            JSONArray temp_array = firstObject.getJSONArray("weather");
            JSONObject temp_Object = (JSONObject) temp_array.get(0);
            String descriptionWeather = temp_Object.get("description").toString();
            String mainWeather = temp_Object.get("main").toString();

            System.out.println("-----" + dataWeather + "_____");
            System.out.println("Temp: " + tempWeather);
            System.out.println("Pressure: " + pressureWeather);
            System.out.println("Wind: speed - " + speedWind + "; deg - " + degWind + ";");
            System.out.println("Сloudy: " + mainWeather + ", " + descriptionWeather + ";");
        }
    }

}
