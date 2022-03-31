package com.example.samplelinearlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private ListView list;

    private ListViewAdapter adapter;

    String[] listNama;

    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    Bundle bundle = new Bundle();

    Intent intent;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_home);


        listNama = new String[]{"Marcus","Ilham","Horizon","Budi","Udin"};

        list = findViewById(R.id.listkontak);

        classNamaArrayList = new ArrayList<>();


        for (int i =0; i < listNama.length; i++)
        {
            ClassNama classNama = new ClassNama(listNama[i]);

            classNamaArrayList.add(classNama);

        }

        adapter = new ListViewAdapter(this);

        list.setAdapter(adapter);

        list.setOnClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public  void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String nama = classNamaArrayList.get(position).getName();


                bundle.putString("a",nama.trim());


                PopupMenu pm = new PopupMenu(getApplicationContext(),view);


                pm.setOnMenuItemClickListener(Home_Activity.this);


                pm.inflate(R.menu.popup_menu);


                pm.show();

            }
        });
        @Override
        public boolean onMenuItemClick(MenuItem menuItem){

            switch (menuItem.getItemId())
            {
                case R.id.mnview:
                    intent = new Intent(getApplicationContext(),ActivityLihatData.class);
                    intent .putExtras(bundle);
                    startActivity(intent);
                    break;
                case R.id.mnedit:
                    Toast.makeText(getApplicationContext(),"Ini untuk edit kontak",
                            Toast.LENGTH_LONG).show();
                    break;



            }
            return false;


        }





    }


}
