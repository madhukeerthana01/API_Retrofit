package com.example.retrofit;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

///photos
public class MainActivity extends AppCompatActivity {
    private Button getData;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData = findViewById(R.id.getData);
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Methods methods = RetrofitClient.getRetrofitInstance().create(Methods.class);
                Call<Model> call= methods.getAllData();
                call.enqueue(new Callback<Model>() {

                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {
                        Log.e(TAG, "OnResponse: code : " +response.code());

                        ArrayList<Model.data> data = response.body().getData();
                        for(Model.data data1 : data ) {
                            Log.e(TAG,"OnResponse: email : "+data1.getEmail());
                        }
                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {
                        Log.e(TAG,"OnFailure: "+t.getMessage());

                    }
                });

            }
        });

    }

}