package com.example.harripotterapi;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.harripotterapi.DefaultConstants.*;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiCall apiCall = retrofit.create(ApiCall.class);
        Call<hechizos> call = apiCall.getSearchSpell("1");
        call.enqueue(new Callback<hechizos>() {
            @Override
            public void onResponse(Call<hechizos> call, Response<hechizos> response) {
                if (response.code() != 200) {
                    Log.i("testApi", "checkConnection");
                    return;
                } else {
                    ArrayList<hechizo> arraySearch = new ArrayList<>();
                    arraySearch = response.body().getHechizos();
                    Log.d("hechizo", arraySearch.toString());
                }
            }

            @Override
            public void onFailure(Call<hechizos> call, Throwable t) {

            }
        });
    }
}