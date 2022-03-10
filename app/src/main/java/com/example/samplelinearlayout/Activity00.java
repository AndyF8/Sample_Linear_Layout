package com.example.samplelinearlayout;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Activity00 extends AppCompatActivity {
    TextView x0nama, x0Email, x0Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_jus);

        x0nama = (TextView) findViewById(R.id.name02);
        x0nama.setText("Justice");
        x0Email = findViewById(R.id.adEmail);
        x0Password = findViewById(R.id.adPassword);
        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString("A");
        String pass = bundle.getString("s");
        x0Email.setText(email);
        x0Password.setText(pass);



    }


}
