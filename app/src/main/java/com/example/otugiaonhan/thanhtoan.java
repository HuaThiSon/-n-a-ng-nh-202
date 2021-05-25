package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thanhtoan extends AppCompatActivity {
    private Button btnxacnhan3,btnquaylai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoan);
        btnquaylai3 =findViewById(R.id.dkquaylai3);
        btnxacnhan3 = findViewById(R.id.dkxacnhan3);

        btnquaylai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quaylai3();
            }
        });
        btnxacnhan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacnhan3();
            }
        });
    }

    private void xacnhan3() {
        Intent intent = new Intent(thanhtoan.this,xacthucthanhcong.class);
        startActivity(intent);
    }

    private void quaylai3() {
        Intent intent = new Intent(thanhtoan.this,kichthuocotu.class);
        startActivity(intent);
    }
}