package com.example.samplelinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

                }else if (edemail.getText().toString().equals("Justice@mail.id") && edPassword.getText().toString().equals("1234")) {
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
                } else if (edPassword.getText().toString().equals("x19-A")) {
                    Toast.makeText(MainActivity.this, "Email salah", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Email dan password salah", Toast.LENGTH_SHORT).show();
            }
        });

    }
}