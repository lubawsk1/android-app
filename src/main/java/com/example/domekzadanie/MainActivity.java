package com.example.domekzadanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class    MainActivity extends AppCompatActivity {
    public int like = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void likeDodaj(View view) {
        like++;
        licznik(view);
    }

    public void likeUsun(View view) {
        if (like != 0) like--;
        licznik(view);
    }

    public void licznik(View view) {
        TextView L = findViewById(R.id.liki);
        L.setText(like + " polubień");
    }
}