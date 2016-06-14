package com.easeplan.layoutanimator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView parent;
    private int i = 0;
    private int j = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parent = (ListView) findViewById(R.id.parent);
        List list=new ArrayList();
        for (int i=0;i<200;i++){
            list.add("I:"+i);
        }

        ArrayAdapter array=new ArrayAdapter(this,R.layout.item,list);

        parent.setAdapter(array);
    }
    //我们给需要加布局动画的viewgroup android:animateLayoutChanges=”true“
    //这样当布局变化的时候就可以显示动画了。  亲测leanerlayout才行
}

