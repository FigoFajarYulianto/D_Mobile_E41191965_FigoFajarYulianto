package com.figofajaryulianto.tugas_recyler_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Figo", "E41191965", "08223934556"));
        mahasiswaArrayList.add(new Mahasiswa("Tuti", "E4119123", "0812884859"));
        mahasiswaArrayList.add(new Mahasiswa("Luni", "E41190000", "081525435"));
        mahasiswaArrayList.add(new Mahasiswa("Karto", "E411996467", "0817273784"));
        mahasiswaArrayList.add(new Mahasiswa("Lurah", "E41190010", "0875353546"));
        mahasiswaArrayList.add(new Mahasiswa("Martin", "E4119200", "0853737374"));
        mahasiswaArrayList.add(new Mahasiswa("Coki", "E411969797", "08266475752"));
    }
}