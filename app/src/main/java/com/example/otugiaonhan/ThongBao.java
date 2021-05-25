package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThongBao extends AppCompatActivity {
    private Button btnQuayLaiDangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);
        btnQuayLaiDangnhap =findViewById(R.id.mandangnhap);

        btnQuayLaiDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quaylaidangnhap();
            }
        });
    }

    private void quaylaidangnhap() {
        Intent intent = new Intent(ThongBao.this, ManDangNhap.class);
        startActivity(intent);
    }
}