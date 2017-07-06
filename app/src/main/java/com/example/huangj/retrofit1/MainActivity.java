package com.example.huangj.retrofit1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.huangj.retrofit1.adapter.HomeAdapter;
import com.example.huangj.retrofit1.entity.HomeEntity;
import com.example.huangj.retrofit1.service.RetrofitService;
import com.example.huangj.retrofit1.util.CacheInterceptor;
import com.example.huangj.retrofit1.util.GetDataCache;

import java.util.List;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private HomeAdapter homeAdapter;


    private CacheInterceptor mCacheInterceptor;
    private GetDataCache mGetDataCache;
    private Cache mCache;
    private RetrofitService retrofitService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lv);
        homeAdapter = new HomeAdapter(this);
        listView.setAdapter(homeAdapter);

        init();//缓存所用到的方法;

        loadDatas();
    }

    private void init() {
        //封装在Util之中三个类;
        mGetDataCache = new GetDataCache(this);
        mCache = mGetDataCache.getCache();
        mCacheInterceptor = new CacheInterceptor(this);
    }

    /**
     * 请求数据；
     */
    private void loadDatas() {

        if (retrofitService == null) {
            OkHttpClient okHttpclient = new OkHttpClient.Builder()
                    .cache(mCache)
                    .addInterceptor(mCacheInterceptor)//增加拦截器;
                    .build();
            //Retrofit本身是不能进行缓存的，因此需要通过OkHttp进行设置，再将设置好的OkHttp，设置给Retrofit即可;
            //下载JSON；
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.otbmall.com")
                    .addConverterFactory(GsonConverterFactory.create())//需要依赖Retrofit2 的 converter; 解析;
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpclient)    //使用Util2则将client改为OkHttpClients.genericClient(this)即可;
                    .build();

            retrofitService = retrofit.create(RetrofitService.class);
        }


        Call<HomeEntity> call = retrofitService.getJSON("https://api.otbmall.com/v3/plan/list/?eyJsaW1pdCI6MjAsIm9mZnNldCI6MH0=");

        call.enqueue(new Callback<HomeEntity>() {
            @Override
            public void onResponse(Call<HomeEntity> call, Response<HomeEntity> response) {

                HomeEntity homeEntity = response.body();//直接得到解析好的对象;
                HomeEntity.DataBean data = homeEntity.getData();
                List<HomeEntity.DataBean.RowsBean> dataRows = data.getRows();
                homeAdapter.setDatas(dataRows);

            }

            @Override
            public void onFailure(Call<HomeEntity> call, Throwable t) {

            }
        });


    }
}
