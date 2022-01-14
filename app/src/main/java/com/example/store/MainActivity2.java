package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView photo;
    TextView textTitle;
    TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int number=getIntent().getIntExtra("cofeID",0);
       Toast.makeText(this,Detail.arrayListCoffe.get(0).getName(),Toast.LENGTH_LONG).show();
        photo=findViewById(R.id.imageInfo);
        textTitle=findViewById(R.id.textView2);
        textInfo=findViewById(R.id.textView3);
        photo.setImageResource(Detail.arrayListCoffe.get(0).getDenalId());
        textTitle.setText(Detail.arrayListCoffe.get(number).getName());
        textInfo.setText(Detail.arrayListCoffe.get(number).getDes());
    }
}