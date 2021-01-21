package com.example.videogamesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.example.videogamesapp.Adapters.ViewPagerAdapter;
import com.example.videogamesapp.Models.InfoModel;
import com.example.videogamesapp.RestApi.ManagerAll;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    RecyclerView recyclerView;
    EditText searchEditText;
    List<InfoModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializing();
        fillToViewpager2();

        callForGameInfo();
    }

    public void callForGameInfo(){
        list = new ArrayList<>();
        Call<List<InfoModel>> infoList = ManagerAll.getInstance().comeAllInfo();
        infoList.enqueue(new Callback<List<InfoModel>>() {
            @Override
            public void onResponse(Call<List<InfoModel>> call, Response<List<InfoModel>> response) {
               //Log.i("cem", response.body().toString());

                //gelen veri Recyclerview ve ViewPager'a set edilecek.
            }

            @Override
            public void onFailure(Call<List<InfoModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void fillToViewpager2(){
        List<String> list = new ArrayList<>();
        list.add("First Item");
        list.add("Second Item");
        list.add("Third Item");
        list.add("Fourth Item");
        viewPager2.setAdapter(new ViewPagerAdapter(this, list, viewPager2));
    }

    public void initializing(){
        viewPager2 = findViewById(R.id.viewPager2_);
        recyclerView = findViewById(R.id.recycler_view);
        searchEditText = findViewById(R.id.search);
    }
}
