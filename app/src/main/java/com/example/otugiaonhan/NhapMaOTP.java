package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NhapMaOTP extends AppCompatActivity {
    private Button btnxacnhan2,btnquaylai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_ma_o_t_p);
        btnxacnhan2 = findViewById(R.id.dkxacnhan2);
        btnquaylai2 = findViewById(R.id.dkquaylai2);

        btnxacnhan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xachan2();
            }
        });
        btnquaylai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quaylai2();
            }
        });
    }

    private void quaylai2() {
        Intent intent = new Intent(NhapMaOTP.this,xacnhannhando.class);
        startActivity(intent);
    }

    private void xachan2() {
        Intent intent = new Intent(NhapMaOTP.this,MoTuThanhCong.class);
        startActivity(intent);
    }
}