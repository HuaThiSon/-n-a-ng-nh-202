package com.example.otugiaonhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoTuThanhCong extends AppCompatActivity {
    private Button btntrangchu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_tu_thanh_cong);
        btntrangchu =findViewById(R.id.dktrangchu);

        btntrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trangchu();
            }
        });
    }

    private void trangchu() {
        Intent intent = new Intent(MoTuThanhCong.this,GiaoDien.class);
        startActivity(intent);
    }
}