package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class xacnhannhando extends AppCompatActivity {
    private Button btnXacNhan1,btnQuayLai1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xacnhannhando);
        btnXacNhan1 =findViewById(R.id.dkxacnhan1);
        btnQuayLai1 =findViewById(R.id.dkquaylai1);

        btnXacNhan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacnhan1();
            }
        });
        btnQuayLai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quaylai1();
            }
        });
    }

    private void quaylai1() {
        Intent intent = new Intent(xacnhannhando.this,NhanDo.class);
        startActivity(intent);
    }

    private void xacnhan1() {
        Intent intent = new Intent(xacnhannhando.this,NhapMaOTP.class);
        startActivity(intent);
    }
}