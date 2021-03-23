package com.example.activityeventkelasb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu
        getMenuInflater().inflate(R.menu.menu, menu);
    }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    //membuatt kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.daftar)
        {
            //method untuk memanggil activity "Daftar Activity"
            Intent i = new Intent(getApplicationContext(), DaftarActivity,class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

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


                ///menengeset email yang benar
                String email - "admin@mail.com";

                //mengeset password yang benar
                String pass = "123";

                //mengecek apakah edittext email dan password terdapat isi atau tidak
                if (nama.isEmpty() || password.isEmpty()) {
                    //membuat variabel toast dan menampilkan pesan "edittext tidak boleh kosong"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan password wajib diisi !!!",
                            Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                }else {

                //mengecek apakah isi dari email dan password sudah sama dengan email dan
                //password yang sudah diset
                if (nama.equals(email) && password.equals(pass)) {
                    //membuat toast dengan menampilkan pesan " Login Sukses"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukes" ,
                            Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();

                    //membuat objek bundle
                    Bundle b = new Bundle();

                    //memsukan value dari variabel nama dengan kunci "a"
                    //dan dimasukan kedalam bundle
                    b.putString("a", nama.trim());
                    //memasukan value dari variabel passwird dengan kunci "b"
                    //dan dimasukan kedalam bundle
                    b.putString("b " , password.trim());

                    //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                    Intent i = new Intent(getApplicationContext(), ActivityHasil.class);
                    //memasukan bundle ke dalan intent untuk dikirimkan ke ActivityHasil
                    i.putExtras(b);

                    //berpindah ke ActivityHasil
                    startActivity(i);
                }else {
                    //membuat variabel toast dan membuat toastt dan menampilkan Login GAGAL! "
                    Toast t =Toast.makeText(getApplicationContext()),
                            "Login Gagal", Toast.LENGTH_LONG);

                    //menampilkan toast
                    t.show()
                }
                }
                //Membuat method untuk event dari floating button
                fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Membuat kondisi untuk mengecek apakah EditText kosong atau tidak
                        if (qnama.getText().toString() ||
                                qalamat.getText().toString().isEmpty() ||
                                qemail.getText().toString().isEmpty() ||
                                qpassword.getText().toString().isEmpty() ||
                                repassword.getText().toString().isEmpty())
                        {
                            //Menampilkan pesan notifikasi jika seluruh edittext wajib diisi
                            Snackbar.make(view, text: "Wajib isi seluruh data !!!!," , Snackbar.LENGTH_LONG).show();
                        }
                        else
                        {
                            //Membuat kondisi untuk mengecek apakah isi dari EditText password dan EditText repasswird
                            //sama atau tidak
                            if (qpassword).getText.toString().equals(repassword.getText().toString()))
                            {
                                //Menampilkan pesan notifikasi jika pendaftaran berhasil
                                Toast.makeText(getApplicationContext(), text:"Pendaftaran Berhasil.." ,
                                Toast.LENGTH_LONG).show();

                                //Method untuk kembali ke activity Main
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(i);
                            }
                            else
                            {
                                Snackbar.make(view, text: "Password dan Repassword harus sama !!!!",
                                    Snackbar.LENGTH_LONG).show();
                            }
            }
            });