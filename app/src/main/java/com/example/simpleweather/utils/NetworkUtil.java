package com.example.simpleweather.utils;

import static android.content.Context.CONNECTIVITY_SERVICE;

import android.content.Context;
import android.net.ConnectivityManager;

public class NetworkUtil {

    public static boolean isNetworkConnected(Context context){
        ConnectivityManager connectivityManager=(ConnectivityManager)context.getSystemService(CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo()!=null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

}
