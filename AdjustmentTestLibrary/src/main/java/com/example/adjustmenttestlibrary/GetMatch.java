package com.example.adjustmenttestlibrary;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface GetMatch {

    @PUT("person")
    Call<Double> getMatch(@Body MatchBoundary matchBoundary);
}
