package com.example.shubham1.gridrecyclerview.adapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shubham1.gridrecyclerview.R;
import com.example.shubham1.gridrecyclerview.basic;
import com.example.shubham1.gridrecyclerview.model.Model;
import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
   private ArrayList<Model>arrayList;
    private Context context;

    public CountryAdapter(ArrayList<Model>arrayList,Context context)
    {
        this.arrayList=arrayList;
        this.context=context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     Model model=arrayList.get(position);
     holder.tv_color101.setText(model.getName());
     holder.tv_color_theory.setText(model.getColortheory());
     holder.tv_desc.setText(model.getDesc());
     holder.learn_more.setText(model.getLearnmore());
    holder.tv_color101.setVisibility(View.INVISIBLE);
    if (position==0)
    {
        holder.tv_color101.setVisibility(View.VISIBLE);
        holder.tv_color101.setText("shubham");
        holder.tv_color101.setTextColor(Color.RED);
    }
      holder.itemView.setOnClickListener(v -> {
          Intent intent=new Intent(v.getContext(), basic.class);
          intent.putExtra("title",model.getName());
          intent.putExtra("titles",model.getDesc());
          v.getContext().startActivity(intent);
      });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
      private TextView tv_color101,tv_color_theory,tv_desc,learn_more;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_color101=itemView.findViewById(R.id.tv_color101);
            tv_color_theory=itemView.findViewById(R.id.tv_color_theory);
            tv_desc=itemView.findViewById(R.id.tv_desc);
            learn_more=itemView.findViewById(R.id.learn_more);
        }
    }
}
