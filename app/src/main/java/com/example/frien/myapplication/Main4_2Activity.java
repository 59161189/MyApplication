package com.example.frien.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main4_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_2);
        Button next = (Button)findViewById(R.id.vote);
        ImageButton next1 = (ImageButton)findViewById(R.id.profile4);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(Main4_2Activity.this,Main6Activity.class);
                startActivity(u);
            }
        });
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(Main4_2Activity.this,Main8Activity.class);
                startActivity(u);
            }
        });
    }
}
