package com.coolweather.android.gson;

/**
 * Created by 蔡海锋 on 2019/2/19.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
