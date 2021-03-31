package com.example.activityeventkelasb;

public class ActivityLihatData {
    Textview tvnama, tvnohp;

    Bundle bundle = getIntent().getExtras();
    //membuat variabel nama dan assign value dari pesan

    String nama = bundle.getString( key: "a");

    switch(nama)
        case"Inayah":
            tvnama.setText("Inayah M");
            tvnohp.setText("081333433224");
            break
        case "Ilham":
            tvnama.setText("Ilham R");
            tvnohp.setText("08129129188");
            break
        case"Eris":
            tvnama.setText("Eris J");
            tvnohp.setText("081333433224");
            break
        case"Fikri":
            tvnama.setText("M Fikri");
            tvnohp.setText("081333433421");
            break
        case "Maul":
            tvnama.setText("Maul M");
            tvnohp.setText("081291292332");
            break
        case"Intan":
            tvnama.setText("Intan S");
            tvnohp.setText("0813334323");
            break
         case"Gita":
            tvnama.setText("Gita S");
            tvnohp.setText("081333223331");
            break
         case "Vina":
            tvnama.setText("Vina R");
            tvnohp.setText("08129129188");
            break
         case"Lutfi":
            tvnama.setText("Lutfi M");
            tvnohp.setText("081333433224");
            break
         case"Vian":
            tvnama.setText("Vian M");
            tvnohp.setText("081333433224");
            break


}
