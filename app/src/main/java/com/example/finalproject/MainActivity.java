package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.adjustmenttestlibrary.MatchBoundary;
import com.example.adjustmenttestlibrary.Person;
import com.example.adjustmenttestlibrary.MatchController;

public class MainActivity extends AppCompatActivity implements MatchController.onRecordEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person p1 =new Person(12345678L,"chen","ifargan",28,"Scorpio");
        Person p2= new Person(45678912L,"eden","ifargan",29,"Sagittarius");
        MatchBoundary matchBoundary = new MatchBoundary(p1,p2);
        MatchController.match(matchBoundary,MainActivity.this);

    }

    @Override
    public void onMatchReturn(double val) {
        Log.d("TAG", "onLis: "+val);
    }
}