package com.androidrion.customlistview1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    int[] iconList = new int[]{
            R.drawable.parang, R.drawable.megaa, R.drawable.sidomukti, R.drawable.rupa,
            R.drawable.lasem, R.drawable.barong, R.drawable.sekar, R.drawable.sedapir, R.drawable.sidoluhur,
            R.drawable.tambal
    };

    String[] Headline = {"Batik Parang Kusumo", "Batik Mega Mendung", "Batik Sidomukti", "Batik Tujuh Rupa",
            "Batik Lasem", "Batik Singa Barong", "Batik Sekar Jagad", "Batik Pring Sedapur", "Batik Sidoluhur",
            "Batik Tambal",};

    String[] Subhead = {"Solo & Yogyakarta", "Cirebon", "Solo", "Pekalongan",
            "Rembang", "Cirebon", "Yogyakarta & Solo", "Magetan", "Solo",
            "Yogyakarta"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter(this, iconList, Headline, Subhead);
        lv.setAdapter(listAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), Parang.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), Mega.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), Sidomukti.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), Rupa.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), Lasem.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), Barong.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), Sekar.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), Sedapir.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), Sidoluhur.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), Tambal.class);
                    startActivityForResult(intent, 0);
                }

                Toast.makeText(getApplicationContext(),
                        "You have selected : " + Headline[position],
                        Toast.LENGTH_SHORT).show();

            }
        });

    }


}
