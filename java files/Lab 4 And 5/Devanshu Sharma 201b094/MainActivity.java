package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    boolean issecond=true;
    public void change(View view) {
        ImageView iv = findViewById(R.id.imageView1);
        if(issecond){
            iv.setImageResource(R.drawable.one);
            issecond=false;
        }else{
            iv.setImageResource(R.drawable.second);
            issecond=true;
        }
    }

    {
        ImageView imageView = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        if (issecond) {
            imageView.animate().alpha(1).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);
            issecond = false;
        } else {
            imageView.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            issecond = true;
        }
    }

        public void disp(View view){
        Log.i("disp","THere is an error");
        Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}