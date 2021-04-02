package com.figofajaryulianto.tugas_recyler_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnListView;
    private Button btnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListView = findViewById(R.id.btn_list_view);
        btnRecyclerView = findViewById(R.id.btn_recycler_view);

        btnListView.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ListViewActivity.class)));
        btnRecyclerView.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RecylerViewActivity.class)));
    }
}