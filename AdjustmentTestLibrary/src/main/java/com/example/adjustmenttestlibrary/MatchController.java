package com.example.adjustmenttestlibrary;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

public class MatchController {
    private static onRecordEventListener mClickListener;



    public static void match(MatchBoundary matchBoundary,onRecordEventListener onRecordEventListener){
        mClickListener = onRecordEventListener;
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        GetMatch getMatch = retrofit.create(GetMatch.class);
        Call<Double> listCall = getMatch.getMatch(matchBoundary);
        listCall.enqueue(new Callback<Double>() {
            @Override
            public void onResponse(Call<Double> call, Response<Double> response) {
                if(!response.isSuccessful()){
                    Log.d("TAG", "onResponse: "+response.code());
                }

            mClickListener.onMatchReturn(response.body());
              //  Log.d("TAG", " "+response.body());

            }

            @Override
            public void onFailure(Call<Double> call, Throwable t) {
                Log.d("TAG", "onFailure: ");
            }
        });

    }
    public  interface onRecordEventListener{
        void onMatchReturn(double val);
    }

}
