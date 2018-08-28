package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCong, btnTru, btnNhan, btnChia, btnUC, btnThoat;
    TextView txtKQ;
    EditText soA, soB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtKQ = (TextView) findViewById(R.id.kq);
        soA = (EditText) findViewById(R.id.soA);
        soB = (EditText) findViewById(R.id.soB);

        btnCong = (Button) findViewById(R.id.cong);
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soA.getText() + "");
                int b = Integer.parseInt(soB.getText() + "");
                txtKQ.setText(a + b + "");
            }
        });

        btnTru = (Button) findViewById(R.id.tru);
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soA.getText() + "");
                int b = Integer.parseInt(soB.getText() + "");
                txtKQ.setText(a - b + "");
            }
        });

        btnNhan = (Button) findViewById(R.id.nhan);
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soA.getText() + "");
                int b = Integer.parseInt(soB.getText() + "");
                txtKQ.setText(a * b + "");
            }
        });

        btnChia = (Button) findViewById(R.id.chia);
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(soA.getText() + "");
                float b = Float.parseFloat(soB.getText() + "");
                txtKQ.setText(a / b + "");
            }
        });

        btnUC = (Button) findViewById(R.id.uocChung);
        btnUC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soA.getText() + "");
                int b = Integer.parseInt(soB.getText() + "");
                while (a!=b){
                    if(a>b)
                        a-=b;
                    else if(a<b)
                        b-=a;
                }
                txtKQ.setText(a + "");
            }
        });

        btnThoat = (Button) findViewById(R.id.thoat);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thoat", Toast.LENGTH_SHORT).show();
                System.exit(0);
            }
        });
    }
}
