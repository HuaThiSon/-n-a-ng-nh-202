package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kichthuocotu extends AppCompatActivity {
   private Button btnXacNhan,btnQuayLai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kichthuocotu);
        btnXacNhan = findViewById(R.id.dkxacnhan);
        btnQuayLai = findViewById(R.id.dkquaylai);
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextthanhtoan();
            }
        });
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quaylai();
            }
        });
    }

    private void quaylai() {
        Intent intent = new Intent(kichthuocotu.this, GiaoDien.class);
        startActivity(intent);
    }

    private void nextthanhtoan() {
        Intent intent = new Intent(kichthuocotu.this, thanhtoan.class);
        startActivity(intent);
    }
}