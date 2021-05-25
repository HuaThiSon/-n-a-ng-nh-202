package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ManDangNhap extends AppCompatActivity {
    private  EditText edtTaiKhoan;
    private EditText edtMatKhau;
    private Button btnDangNhap,btnDangky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_dang_nhap);
        edtMatKhau = findViewById(R.id.matkhau);
        edtTaiKhoan = findViewById(R.id.taikhoan);
        btnDangky = findViewById(R.id.dangky);
        btnDangNhap = findViewById(R.id.dangnhap);
        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextGiaodien();
            }
        });
    }

    private void nextActivity() {
        Intent intent = new Intent(ManDangNhap.this,ManDangKy.class);
        startActivity(intent);


    }
    private  void nextGiaodien(){

        Intent intent = new Intent(ManDangNhap.this, GiaoDien.class);
        startActivity(intent);
    }
}