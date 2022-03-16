package com.example.samplelinearlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edPassword;

    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignIn);

        edemail = findViewById(R.id.edEmail);

        edPassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = edemail.getText().toString();

                password = edPassword.getText().toString();

                if (edemail.getText().toString().equals("freedom@mail.id") && edPassword.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login sukses", Toast.LENGTH_SHORT).show();

                    //Membuat objek bundle
                    Bundle z = new Bundle();

                    //measukkan value dari variable nama dengan kunci "x"
                    //dan dimasukkan kedalam bundle
                    z.putString("x", nama.trim());

                    //measukkan value dari variable nama dengan kunci "m"
                    //dan dimasukkan kedalam bundle
                    z.putString("m", password.trim());

                    //membuat objek inten berpindah activity dari main aactivity ke ActivityHasil
                    Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                    //memasukkan bundle kedalam intent untuk dikirimkan ke activity kedua
                    i.putExtras(z);

                    //beripndah ke ActivityHasil
                    startActivity(i);

                }else if (edemail.getText().toString().equals("Justice@mail.id") && edPassword.getText().toString().equals("12345")) {
                    Toast.makeText(MainActivity.this, "Login sukses", Toast.LENGTH_SHORT).show();
                    Bundle x = new Bundle ();
                    x.putString("A",nama.trim());
                    x.putString("s",password.trim());
                    Intent y = new Intent(getApplicationContext(), Activity00.class);
                    y.putExtras(x);
                    startActivity(y);


                } else if (edemail.getText().toString().equals("freedom@mail.id")) {
                    Toast.makeText(MainActivity.this, "Password salah", Toast.LENGTH_SHORT).show();
                } else if (edemail.getText().toString().equals("Justice@mail.id")) {
                    Toast.makeText(MainActivity.this, "Password salah", Toast.LENGTH_SHORT).show();
                } else if (edPassword.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Email salah", Toast.LENGTH_SHORT).show();
                } else if (edPassword.getText().toString().equals("12345")) {
                    Toast.makeText(MainActivity.this, "Email salah", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Email dan password salah", Toast.LENGTH_SHORT).show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu
        getMenuInflater().inflate(R.menu.apalis, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Membuat kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar)
        {
            //Method untuk memanggil activity "ActivityEmpat"
            Intent i = new Intent(getApplicationContext(), Activityempat.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }




}