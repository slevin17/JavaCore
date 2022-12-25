package HW_lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Meteo {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(6000, TimeUnit.MILLISECONDS)
                .build();


        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("developer.accuweather.com")
                .addPathSegment("/forecasts/v1/daily/5day/1111")
                .addQueryParameter("apikey", "yUGrivUFBZfMqamCgh7SVt8kk4tUbwF5")
                .addQueryParameter("language", "ru")
                .addQueryParameter("details", "false")
                .addQueryParameter("metric", "false")
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .build();

        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.body().string());


    }
}

