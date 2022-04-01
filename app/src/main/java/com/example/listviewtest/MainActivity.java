package com.example.listviewtest;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Data> dataList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        MyAdapter adapter=new MyAdapter(MainActivity.this,R.layout.item,dataList);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Data data=dataList.get(i);
                Toast.makeText(MainActivity.this,data.getName(),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,ItemDetailActivity.class);
                intent.putExtra("qw","手机品牌:"+data.getName()+"   热度:"+data.getIndex());
                startActivity(intent);
            }

        });
    }
    private void initData(){
        for(int i=0;i<1;i++) {
            Data data1 = new Data("联想", R.drawable.a," 510947");
            dataList.add(data1);
            Data data2 = new Data("戴尔", R.drawable.b, " 421405");
            dataList.add(data2);
            Data data3 = new Data("华硕", R.drawable.c, " 397656");
            dataList.add(data3);
            Data data4 = new Data("苹果", R.drawable.d, " 324535");
            dataList.add(data4);
            Data data5 = new Data("惠普", R.drawable.e, " 300070");
            dataList.add(data5);
            Data data6 = new Data("宏基", R.drawable.f, " 289676");
            dataList.add(data6);
            Data data7 = new Data("索尼", R.drawable.g, " 250890");
            dataList.add(data7);
            Data data8 = new Data("三星", R.drawable.h, " 239898");
            dataList.add(data8);
            Data data9 = new Data("神舟", R.drawable.i, " 228989");
            dataList.add(data9);
            Data data10 = new Data("东芝", R.drawable.j, " 189935");
            dataList.add(data10);
        }
    }
}