package com.example.activityeventkelasb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button buttonlogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variable untuk menyimpan email dan password
    String  nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btLogin komponen button pada layout
        buttonlogin=findViewById(R.id.btSignIn);

        //Menghubungkan variabel edmail dengan komponen pada Layout
        edemail=findViewById(R.id.edEmail);
        //Menghubungkan variabel edpassword dengab componen button pada Layout
        edpassword=findViewById(R.id.edPassword);
        //membuat fungsi onclik pada button btnLogin
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel
                Toast t = Toast.makeText(getApplicationContext(),
                text:"email anda" +nama+ "dan Password anda:" +password+ "", Toast.LENGTH_LONG);
                //menampilkan toast
                t.show();

                buttonlogin = (Button) findViewById(R.id.btSignIn);
                edemail = (EditText) findViewById(R.id.edEmail);
                edpassword = (EditText) findViewById(R.id.edPassword);

                buttonlogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!edemail.getText().toString().equals("20190140066")) {
                            edemail.setError("Username salah");
                        } else {
                            edemail.setError(null);
                        }
                        if (!edpassword.getText().toString().equals("adham")) {
                            edpassword.setError("Password salah");
                        } else {
                            edpassword.setError(null);
                        }
                    });