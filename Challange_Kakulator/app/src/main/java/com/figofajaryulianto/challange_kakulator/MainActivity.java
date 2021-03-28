package com.figofajaryulianto.challange_kakulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNilaiPertama;
    private EditText edtNilaiKedua;

    private Button btnPlus;
    private Button btnMinus;
    private Button btnBagi;
    private Button btnKali;

    private TextView txHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        edtNilaiPertama =findViewById(R.id.edt_nilai_pertama);
        edtNilaiKedua = findViewById(R.id.edt_nilai_kedua);


        btnBagi = findViewById(R.id.btn_bagi);
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer nilaiPertama = Integer.parseInt(edtNilaiPertama.getText().toString());
                Integer nilaiKedua = Integer.parseInt(edtNilaiKedua.getText().toString());
                Integer hasilBagi = nilaiPertama / nilaiKedua;
                txHasil.setText(String.valueOf(hasilBagi));

            }
        });

        btnPlus = findViewById(R.id.btn_plus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer nilaiPertama = Integer.parseInt(edtNilaiPertama.getText().toString());
                Integer nilaiKedua = Integer.parseInt(edtNilaiKedua.getText().toString());
                Integer hasilPlus = nilaiPertama + nilaiKedua;
                txHasil.setText(String.valueOf(hasilPlus));

            }
        });

        btnKali = findViewById(R.id.btn_kali);
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer nilaiPertama = Integer.parseInt(edtNilaiPertama.getText().toString());
                Integer nilaiKedua = Integer.parseInt(edtNilaiKedua.getText().toString());
                Integer hasilKali = nilaiPertama * nilaiKedua;
                txHasil.setText(String.valueOf(hasilKali));


            }
        });

        btnMinus = findViewById(R.id.btn_minus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer nilaiPertama = Integer.parseInt(edtNilaiPertama.getText().toString());
                Integer nilaiKedua = Integer.parseInt(edtNilaiKedua.getText().toString());
                Integer hasilMinus = nilaiPertama - nilaiKedua;
                txHasil.setText(String.valueOf(hasilMinus));

            }
        });

        txHasil= findViewById(R.id.tx_hasil);
    }
}