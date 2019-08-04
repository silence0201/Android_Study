package com.silence.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Data> dataList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        ListView listView = findViewById(R.id.list_view);
        DataAdapter adapter = new DataAdapter(this,R.layout.my_item,dataList);
        listView.setAdapter(adapter);
    }

    private void init(){
        for (int i = 0; i < 50;i++) {
            Data data = new Data("aa"+i,R.mipmap.ic_launcher);
            dataList.add(data);
        }
    }
}
