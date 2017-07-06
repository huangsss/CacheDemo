package com.example.huangj.retrofit1.util2;

import android.content.Context;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator "健" on 2016/12/16.20:42
 */

public class OkHttpClients {

    public static OkHttpClient genericClient(final Context context) {
        //缓存路径
        File cacheFile = new File(context.getCacheDir().getAbsolutePath(), "HttpCache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 10);//缓存文件为10MB

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        int maxAge = 60*60; // 有网络时 设置缓存超时时间1个小时
                        int maxStale = 60 * 60 * 24 * 28; // 无网络时，设置超时为4周
                        Request request = chain.request();
                        if (NetWork.isNetworkReachable(context)) {
                            request= request.newBuilder()
                                    .addHeader("apikey", "2ffc3e48c7086e0e1faa003d781c0e69")
                                    .cacheControl(CacheControl.FORCE_NETWORK)//有网络时只从网络获取
                                    .build();
                        }else {
                            request= request.newBuilder()
                                    .cacheControl(CacheControl.FORCE_CACHE)//无网络时只从缓存中读取
                                    .build();
                        }
                        Response response = chain.proceed(request);
                        if (NetWork.isNetworkReachable(context)) {
                            response= response.newBuilder()
                                    .removeHeader("Pragma")
                                    .header("Cache-Control", "public, max-age=" + maxAge)
                                    .build();
                        } else {
                            response= response.newBuilder()
                                    .removeHeader("Pragma")
                                    .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                                    .build();
                        }
                        return response;
                    }

                })
                .connectTimeout(1000, TimeUnit.SECONDS)
                .cache(cache)
                .build();
        return httpClient;
    }
}
