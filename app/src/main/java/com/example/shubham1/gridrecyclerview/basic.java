package com.example.shubham1.gridrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;

public class basic extends AppCompatActivity {

  private TextView tv_txt,tv_theory;
  private String title,theory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        getids();
    }
    private void getids()
    {
        tv_txt=(TextView)findViewById(R.id.tv_txt);
        tv_theory=(TextView)findViewById(R.id.tv_theory);
        title=getIntent().getStringExtra("title");
        theory=getIntent().getStringExtra("titles");
        tv_txt.setText(title);
        tv_theory.setText(theory);
    }
}
