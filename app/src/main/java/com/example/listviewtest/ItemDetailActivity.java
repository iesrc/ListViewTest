package com.example.listviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        TextView textview=(TextView) findViewById(R.id.textView);
        Intent intent =getIntent();
        String getdata = intent.getStringExtra("qw");
        textview.setText(getdata);

    }
}