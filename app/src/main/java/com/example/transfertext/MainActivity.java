package com.example.transfertext;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private TextView outputText;
    private Button add;
    private Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.editText);
        outputText = findViewById(R.id.textView);
        add = findViewById(R.id.bt_add);
        save = findViewById(R.id.bt_save);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Value = inputText.getText().toString();
                outputText.setText(Value);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(outputText.getText().toString())) {
                    String Data = inputText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("data", Data);
                    startActivity(intent);
                    finish();
                } else {
                    String Data = outputText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("data", Data);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
