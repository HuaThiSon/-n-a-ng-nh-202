package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NhanDo extends AppCompatActivity {
    private Button btnXacNhan,btnQuayLai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan_do);
        btnXacNhan = findViewById(R.id.dkxacnhan1);
        btnQuayLai = findViewById(R.id.dkquaylai1);
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacnhan1();
            }
        });

        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quaylai1();
            }
        });
    }

    private void quaylai1() {
        Intent intent = new Intent(NhanDo.this,GiaoDien.class);
        startActivity(intent);
    }

    private void xacnhan1() {
        Intent intent = new Intent(NhanDo.this,xacnhannhando.class);
        startActivity(intent);
    }
}