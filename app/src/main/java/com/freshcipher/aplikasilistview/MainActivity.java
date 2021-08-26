package com.freshcipher.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] namaNegara = new String[]{
            "Indonesia", "Malaysia", "Singapore", "Vietnam",
            "Thailand", "Brunei Darussalam", "Australia",
            "Korea Selatan", "Inggris", "Jerman",
            "Timor Leste", "Afrika",
            "Jepang", "Korea Utara", "Argentina",
            "Italia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = findViewById(R.id.list_text_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namaNegara);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih : " + namaNegara[position], Toast.LENGTH_LONG).show();
            }
        });

    }
}