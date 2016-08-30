package com.example.ashutosh.classroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;

public class CourseTopic extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_topic);
        textView=(TextView)findViewById(R.id.textView);

        Intent intent = getIntent();
        /// HashMap<String,String> hashMap=(HashMap<String,String>)intent.getSerializableExtra("map");
        // Log.v("HashMapTest",HashMap.get("C"));
        Bundle bundle=intent.getExtras();
        HashMap hashmap= (HashMap) getIntent().getSerializableExtra("map");
        //textView.setText((CharSequence) hashmap);
    }
}
