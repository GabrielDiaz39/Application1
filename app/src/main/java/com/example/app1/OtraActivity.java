package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class OtraActivity extends AppCompatActivity {
    Button btnSig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);
        btnSig =findViewById(R.id.btnNext);
        btnSig.setOnClickListener(v -> Toast.makeText(getApplicationContext(),
                "No hay actualización", Toast.LENGTH_LONG).show());
    }
}