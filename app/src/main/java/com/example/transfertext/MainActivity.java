package com.example.transfertext;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private TextView outputText;
    private Button Add;
    private Button Save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.editText);
        outputText = findViewById(R.id.textView);
        Add = findViewById(R.id.bt_add);
        Save = findViewById(R.id.bt_save);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Value = inputText.getText().toString();
                outputText.setText(Value);
            }
        });
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Data = outputText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("data", Data);
                startActivity(intent);
                finish();
            }
        });
    }
}
