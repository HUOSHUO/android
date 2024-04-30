package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiyan);/*设置当前要显示的layout*/
      /*  *//*Spinner spinner=(Spinner) findViewById(R.id.spinner);*//*
        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        String[]city=new String[]{"南昌","广西","北京","上海"};
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);
        spinner.setAdapter(adapter);
*/
    }
}