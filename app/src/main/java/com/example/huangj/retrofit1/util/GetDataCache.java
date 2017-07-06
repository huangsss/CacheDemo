package com.example.huangj.retrofit1.util;

import android.content.Context;

import java.io.File;

import okhttp3.Cache;


public class GetDataCache {
    private Context mContext;
    public GetDataCache(Context context) {
        mContext = context;
    }


    public Cache getCache() {
        File cacheFile = new File(mContext.getExternalCacheDir(), "OkHttpCache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 50);

        return cache;

    }
}
