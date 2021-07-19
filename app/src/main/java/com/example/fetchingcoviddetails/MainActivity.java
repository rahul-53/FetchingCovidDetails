package com.example.fetchingcoviddetails;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button mBtnLogin;
    List<CovidModel> covidModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setRecyclerView();
    }
    private void callApi(){
        ApiInterface apiInterface;
    }

    private void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        mBtnLogin=findViewById(R.id.tvBtn);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApi();
            }
        });
    }

    private void setRecyclerView(){

    }

}