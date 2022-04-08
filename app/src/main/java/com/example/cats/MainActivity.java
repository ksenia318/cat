package com.example.cats;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    IAPI api=new ApiHandler().getmInstance().getService();
    RecyclerView recyclerView;
    AdapterList adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doParse();
    }

    private void doParse() {
        AsyncTask.execute(() -> {
            api.getResponce().enqueue(new Callback<MyResponce>() {
                @Override
                public void onResponse(Call<MyResponce> call, Response<MyResponce> response) {
                    recyclerView=findViewById(R.id.recycler);
                    adapter=new AdapterList(getApplicationContext(), response.body().getData());
                    recyclerView.setAdapter(adapter);
                }

                @Override
                public void onFailure(Call<MyResponce> call, Throwable t) {

                }
            });
        });
//        AsyncTask.execute(() ->{
//            api.getResponce().enqueue(new Callback<MyResponce>() {
//                @Override
//                public void onResponse(Call<MyResponce> call, Response<MyResponce> response) {
//                    if(response.isSuccessful()){
//                        recyclerView=findViewById(R.id.recycler);
//                        adapter=new AdapterList(getApplicationContext(), response.body().getData());
//                        recyclerView.setAdapter(adapter);
//                        //adapter.notifyDataSetChanged();
//                    }
//                    else {
//                        Toast.makeText(MainActivity.this, ""+response.code(), Toast.LENGTH_SHORT).show();
//                    }
//
//                }
//
//                @Override
//                public void onFailure(Call<MyResponce> call, Throwable t) {
//                    Toast.makeText(MainActivity.this, "нет инета"+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//
//                }
//            });
//        });
    }
}