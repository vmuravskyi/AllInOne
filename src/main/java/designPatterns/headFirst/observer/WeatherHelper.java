package designPatterns.headFirst.observer;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WeatherHelper {

    public static void main(String[] args) {

        try {
            getWeather();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void getWeather() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://community-open-weather-map.p.rapidapi.com/weather?q=London%2Cuk&lat=0&lon=0&callback=test&id=2172797&lang=null&units=imperial&mode=xml")
                .get()
                .addHeader("x-rapidapi-key", "SIGN-UP-FOR-KEY")
                .addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response);
    }
}
