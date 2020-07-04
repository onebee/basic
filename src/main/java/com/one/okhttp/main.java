package com.one.okhttp;


import okhttp3.*;

import java.io.IOException;

public class main {
    public static void main(String[] args) {


        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

        Request request = new Request.Builder().url("https://www.baidu.com").get().build();


        Call call = okHttpClient.newCall(request);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Response response = call.execute();
//                    String string = response.body().string();
//                    System.out.println("同步请求: " + string);
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();



        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println(e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {


                String string = response.body().string();
                System.out.println(string);
            }
        });

    }
}
