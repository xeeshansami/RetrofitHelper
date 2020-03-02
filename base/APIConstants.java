package com.gatakalfzzah.consumer.network.base;


import com.gatakalfzzah.consumer.BuildConfig;


public class APIConstants {
    public static String BASE_URL = BuildConfig.API_BASE_URL;

    public static final long CONNECT_TIMEOUT = 10;
    public static final long WRITE_TIMEOUT = 10;
    public static final long READ_TIMEOUT = 10;

    public static final long READ_TIMEOUT_LONG = 300L;
    public static final String TAG = "LogValue";


}
