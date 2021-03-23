import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activityeventkelasb.R;

public class Activitykedua extends AppCompatActivity {
    //mendeklarasikan variabel dengan tipe data Textvuew
    View txEmail, txpassword

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //Menghubungkan variabel txEmail dengan komponen textview Pada layot
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan variabel txEmail dengan componen Textview pada layout
        txpassword = findViewById(R.id.tvPassword);
        //mendeklarasikan variabel bundle yang digunakan untuk mengambil pesan
        //yang dikirimkan dari activity sebelumnya
        Bundle bundle = getIntent().getBundleExtra();
        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a:
        String email = bundle.getString(key:"a");

        //membuat variabel string yang digunakan untuk menyimpn data
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass bundle.getString(key:"b");
        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);
        //menampilkan value dari variabel pass kedalam txPassword
        txpassword.setText(pass);
    }

}