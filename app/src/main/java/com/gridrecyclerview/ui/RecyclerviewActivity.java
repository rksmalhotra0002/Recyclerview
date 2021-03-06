package com.gridrecyclerview.ui;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;

import com.gridrecyclerview.R;
import com.gridrecyclerview.adapter.CountryAdapter;
import com.gridrecyclerview.model.Model;
import java.util.ArrayList;

public class RecyclerviewActivity extends AppCompatActivity {

    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        getids();
    }

    private void getids()
    {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        builder=new AlertDialog.Builder(this);
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
        CountryAdapter adapter = new CountryAdapter(a, this);
      recyclerView.setAdapter(adapter);
      recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onBackPressed() {
     builder.setMessage("Do you want to close this Application?")
             .setCancelable(false)
             .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {

                     finish();
                 }
             })
             .setNegativeButton("No", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                      dialog.cancel();
                 }
             });

AlertDialog alertDialog=builder.create();
alertDialog.setTitle("RecyclerviewActivity");
alertDialog.show();
    }
}
