package com.example.qrcodescanner_generator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button generate_btn,scan_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();

        
    }

    private void initWidget() {
        generate_btn=findViewById(R.id.generate_btn);
        scan_btn=findViewById(R.id.scan_btn);
    }
}