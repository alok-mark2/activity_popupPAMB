package com.example.activityeventkelasb;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private ListView list;

    private ListAdapter adapter;

    String[] listNama;

    public static ArrayList<ClassNama> classNamaArrayList =new ArrayList<com.example.activityeventkelasb.ClassNama>();
    Bundle bundle = new Bundle();

    Intent intent;

    @Override
    protected void onCreate (Bundle sabedInstanceState){
        super.onCreate(sabedInstanceState);
        setContentView(R.layout.activity_home);

        listNama = new String[]{"Inayah","Ilham","Eris","Fikri","Maul","Intan", " Vina","Gita","Vian","Lutfi"};
        list = findViewById(R.id.listKontak);

        classNamaArrayList = new ArrayList<>();

        for {int i = 0; i < listNama.length; i++)
            {

            //membuat objek class nama da
                ClassNama classNama = new ClassNama(listNama[i]);
                //binds string ke array
                ClassNamaArrayList.add(classNama);
            }

            //Membuat objek dari listviewerAdapter
            adapter = new ListViewAdapter(this);

            //Bind Adapter ke ListVie
            list.setAdapter(adapter);

            //Membuat event dari dari list onclick
            list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?>parent, View view,int position, long id) {
                    //Deklarasi variabel nama yang berisi item yang diklik
                    String nama = classNamaArrayList.get(position).getName()

                    bundle.putString("a",nama.trim());
                    //membuat objek popup menu
                    PopupMenu pm = new PopupMenu(getApplicationContext(),view);

                    pm.setOnMenuItemClickListener(Home_Activity.this);
                    //menampilkan popup menu dari layouy menu
                    pm.inflate(R.menu.popup_menu);

                    //menampilkan popup menu
                    pm.show();


                }
            }

            @Override
            public boolean OnMenuItemClick(MenuItem menuitem) {
                switch (menuItem.getItemId())
                {
                    case R.id.mnview;
                        intent = new Intent(getApplicationContext(),ActivityLihatData.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break
                    case R.id.mnedit:
                        Toast.makeText(getApplicationContext(),"Ini untuk edit kontak",)
                                Toast.LENGTH_LONG).show();
                        break;
                       }
                       return false;
                }
            }
        
    }
}
