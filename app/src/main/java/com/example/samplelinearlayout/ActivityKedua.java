package com.example.samplelinearlayout;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;



public class ActivityKedua extends AppCompatActivity {
    TextView txnama, txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);

        txnama = (TextView) findViewById(R.id.name);

        txnama.setText("freedom");

        //Menghubungkan variabel txEmail dengan komponen Textview pada layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txEmail dengan komponen Textview pada layout
        txPassword = findViewById(R.id.tvPassword);

        //Mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
        //pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "x"
        String email = bundle.getString("x");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "m"
        String pass = bundle.getString("m");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel email kedalam txPassword
        txPassword.setText(pass);


    }
}
