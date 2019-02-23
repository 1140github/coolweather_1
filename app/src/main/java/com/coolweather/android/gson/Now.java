package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 蔡海锋 on 2019/2/19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
