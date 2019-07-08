package com.example.a1893955.myapplication;

import android.os.AsyncTask;

import static android.net.wifi.WifiConfiguration.Status.strings;

public class Syncdata extends AsyncTask<String,Void,String> {


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);


    }

    @Override
    protected String doInBackground(String... strings) {
        String jurl=strings[0];
        httphandler hp=new httphandler();
        String json=hp.makeService(jurl);
        System.out.print("this is from sync data"+json);




        return json;
    }
}
