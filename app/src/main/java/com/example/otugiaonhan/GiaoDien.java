package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GiaoDien extends AppCompatActivity {
    private Button btnGuiDo,btnNhanDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien);
        btnGuiDo = findViewById(R.id.dkguido);
        btnNhanDo = findViewById(R.id.dknhando);

        btnNhanDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhando();
            }
        });
        btnGuiDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guido();
            }
        });
    }

    private void guido() {
        Intent intent = new Intent(GiaoDien.this,kichthuocotu.class);
        startActivity(intent);
    }

    private void nhando() {
        Intent intent = new Intent(GiaoDien.this,NhanDo.class);
        startActivity(intent);
    }


}
