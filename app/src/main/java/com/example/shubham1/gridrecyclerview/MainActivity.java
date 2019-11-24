package com.example.shubham1.gridrecyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.shubham1.gridrecyclerview.adapter.CountryAdapter;
import com.example.shubham1.gridrecyclerview.model.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getids();
    }
    private void getids()
    {
        recyclerView=findViewById(R.id.recyclerview);
      ArrayList<Model>a=new ArrayList<>();
      a.add(new Model("Color 101","Color theory","Color theory talks about the ways in which we use color to create beauty and usability in user interfaces.","Learn More"));
      a.add(new Model("Color 101","Color theory","Color theory talks about the ways in which we use color to create beauty and usability in user interfaces.","Learn More"));
      a.add(new Model("Color 101","Color theory","Color theory talks about the ways in which we use color to create beauty and usability in user interfaces.","Learn More"));
      a.add(new Model("Color 101","Color theory","Color theory talks about the ways in which we use color to create beauty and usability in user interfaces.","Learn More"));
      a.add(new Model("Color 101","Color theory","Color theory talks about the ways in which we use color to create beauty and usability in user interfaces.","Learn More"));
      a.add(new Model("Tools","Color theory","Color theory talks about the ways in which we use color to create beauty and usability in user interfaces.","Learn More"));
      a.add(new Model("Color 102","Color theory","Color theory talks about the ways in which we use color to create beauty and usability in user interfaces.","Learn More"));
      a.add(new Model("Color 103","Color theory","Color theory talks about the ways in which we use color to create beauty and usability in user interfaces.","Learn More"));

      LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
      adapter=new CountryAdapter(a,this);
      recyclerView.setAdapter(adapter);
      recyclerView.setLayoutManager(linearLayoutManager);

    }
}