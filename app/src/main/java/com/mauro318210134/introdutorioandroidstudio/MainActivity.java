package com.mauro318210134.introdutorioandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected EditText txtValor;
    protected Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValor.findViewById(R.id.txtValor);
        btnLimpar.findViewById(R.id.btnLimpar);
    }
}