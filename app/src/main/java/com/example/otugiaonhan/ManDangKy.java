package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManDangKy extends AppCompatActivity {
    private Button btnDangky,btnTroVeDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_dang_ky);
        btnDangky = findViewById(R.id.dkxacnhandangky);
        btnTroVeDangNhap = findViewById(R.id.dktrovedangnhap);

        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangky();
            }
        });
        btnTroVeDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trovedangnhap() ;
            }
        });
    }

    private void trovedangnhap() {
        Intent intent = new Intent(ManDangKy.this, GiaoDien.class);
        startActivity(intent);
    }

    private void dangky() {
        Intent intent = new Intent(ManDangKy.this, ThongBao.class);
        startActivity(intent);
    }
}