package com.figofajaryulianto.tugas_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionLinearLayout(View view) {
        Toast.makeText(this, "Ini Adalah Linear Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionRelativeLayout(View view) {
        Toast.makeText(this, "Ini Adalah Relative Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionConstraintLayout(View view) {
        Toast.makeText(this, "Ini Adalah Constraint Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinear2Layout(View view) {
        Toast.makeText(this, "Ini Adalah Linear Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionTabelLayout(View view) {
        Toast.makeText(this, "Ini Adalah Tabel Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionMaterialDesign(View view) {
        Toast.makeText(this, "Ini Adalah Material Design", Toast.LENGTH_SHORT).show();
    }

    public void actionScrollView(View view) {
        Toast.makeText(this, "Ini Adalah Scroll View", Toast.LENGTH_SHORT).show();
    }

    public void actionScrollViewHorizontal(View view) {
        Toast.makeText(this, "Ini Adalah Scroll View Horizontal", Toast.LENGTH_SHORT).show();
    }
}