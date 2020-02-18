package com.gridrecyclerview.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.gridrecyclerview.R;

public class basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        getids();
    }
    private void getids()
    {
        TextView tv_txt = findViewById(R.id.tv_txt);
        TextView tv_theory = findViewById(R.id.tv_theory);
        String title = getIntent().getStringExtra("title");
        String theory = getIntent().getStringExtra("titles");
        tv_txt.setText(title);
        tv_theory.setText(theory);
    }
}
