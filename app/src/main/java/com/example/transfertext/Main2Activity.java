package com.example.transfertext;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    private String data;
    private Button Back;
    private TextView Display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Back = findViewById(R.id.bt_back);
        Display = findViewById(R.id.textView);
//        Bundle bn = getIntent().getExtras();
//        assert bn != null;
//        String name = bn.getString("data");
//        Display.setText(String.valueOf(name));

        Intent intent = getIntent();
        data = intent.getStringExtra("data");
        Display.setText(data);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}