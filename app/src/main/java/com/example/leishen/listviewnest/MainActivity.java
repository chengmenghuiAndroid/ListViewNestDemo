package com.example.leishen.listviewnest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.leishen.listviewnest.adapter.ParentAdapter;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_listview);
        initView();
    }

    private void initView(){
        ParentAdapter parentAdapter = new ParentAdapter(this);
        ListView parentList = (ListView) findViewById(R.id.list_parent);
        parentList.setAdapter(parentAdapter);
    }
}
