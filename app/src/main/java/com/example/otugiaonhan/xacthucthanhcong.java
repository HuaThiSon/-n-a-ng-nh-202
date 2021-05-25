package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class xacthucthanhcong extends AppCompatActivity {
    private Button btnTrangChu1,btnDangKyMoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xacthucthanhcong);

        btnTrangChu1 = findViewById(R.id.dktrangchu1);
        btnDangKyMoi =findViewById(R.id.dkdangkymoi1);

        btnDangKyMoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangkymoi();
            }
        });

        btnTrangChu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trangchu1();
            }
        });


    }

    private void trangchu1() {
        Intent intent = new Intent(xacthucthanhcong.this, GiaoDien.class);
        startActivity(intent);
    }

    private void dangkymoi() {
        Intent intent = new Intent(xacthucthanhcong.this, ManDangKy.class);
        startActivity(intent);
    }
}