package com.example.componentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btnPulsar = findViewById(R.id.btnPulsar);

        btnPulsar.setOnClickListener(v -> {
            Toast.makeText(this, "Has pulsado el botón", Toast.LENGTH_LONG).show();
            btnPulsar.setVisibility(View.INVISIBLE);
        });
    }
}