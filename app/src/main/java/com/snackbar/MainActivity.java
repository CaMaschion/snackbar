package com.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbrir;
    private Button buttonFechar;
    private Snackbar snackbar;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fazer assim:

        buttonAbrir = findViewById(R.id.buttonAbrir);
        buttonFechar = findViewById(R.id.buttonFechar);

        buttonAbrir.setOnClickListener(v -> {

            Snackbar.make(
                    v, "botão pressionado",
                    Snackbar.LENGTH_LONG
            ).setAction("Confirmar", v1 -> {
             //   buttonAbrir.setText("Botão alterado");

            }).setActionTextColor(getResources().getColor(R.color.design_default_color_secondary_variant))
                    .show();
        });

//        buttonFechar.setOnClickListener(v1 -> {
//
//            snackbar.dismiss();
//
//        });

    }

    //ou fazer um método
    public void abrirSnackbar(View view) {

    }

}