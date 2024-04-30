package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiyan);

        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        String[]city=new String[]{"南昌","广西","北京","上海"};
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(  this,android.R.layout.simple_list_item_1,city);
       /* ArrayAdapter<String> adapter =new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1,city);*/
        spinner.setAdapter(adapter);
    }
}