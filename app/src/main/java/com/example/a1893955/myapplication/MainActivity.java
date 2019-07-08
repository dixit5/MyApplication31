package com.example.a1893955.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String link=getResources().getString(R.string.link);


        try {
            String myjson=new Syncdata().execute(link).get();
        }catch (ExecutionException e)
        {
            Log.e("MainActivity",e.getMessage());
        }catch (InterruptedException e){
            Log.e("MainActivity",e.getMessage());
        }
    }
}
