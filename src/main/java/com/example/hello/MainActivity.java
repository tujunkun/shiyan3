package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import static android.widget.AdapterView.OnItemClickListener;
import static android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="lifecycle";
    private String[] names=new String[]
            {"lion","tiger","monkey","dog","cat","elephant"};
    private String[] des=new String[]
            {"我是狮子","我是老虎","我是猴子","我是狗","我是猫","我是大象"};
    private int[] images=new int[]
            {R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,
                    R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(TAG,"oncreate");
        List<Map<String,Object>> listItems=
                new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", images[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", des[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listItems,
                R.layout.item,new String[]{"header","personName","desc"},
                new int[]{R.id.imageView,R.id.textView,R.id.textView2});
        ListView list=(ListView)findViewById(R.id.listView);
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new OnItemClickListener()
        {
            // 第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                TextView textView= (TextView) view.findViewById(R.id.textView);
                Toast.makeText(MainActivity.this, textView.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"onstart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onresume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onpause");
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.d(TAG,"onstop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onrestart");
    }
}
