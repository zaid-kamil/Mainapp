package com.baj.ana.mainapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo laptop on 03-07-2016.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.Holder> {


private final ArrayList<Model> list;

public DataAdapter(ArrayList<Model> list) {
        this.list = list;
        }

@Override
public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.content_card, parent, false);
        Holder holder = new Holder(view);
        return holder;
        }

@Override
public void onBindViewHolder(Holder holder, int position) {
        //data binding

    Model model = list.get(position);
    holder.tvh1.setText(model.tvheading1);
    holder.tvh2.setText(model.tvheading2);
    holder.tvh3.setText(model.tvheading3);
    holder.cvCell.setOnClickListener(new View.OnClickListener()
    {
@Override
public void onClick(View v) {
        //intent
        }
        });
        }

@Override
public int getItemCount() {
        return list.size();
        }

//inner
class Holder extends RecyclerView.ViewHolder {

    CardView cvCell;
    TextView tvh1,tvh2,tvh3;

    public Holder(View itemView) {
        super(itemView);
        cvCell = (CardView) itemView.findViewById(R.id.cvCellContainer);
        tvh1 = (TextView) itemView.findViewById(R.id.tvheading1);
        tvh2 = (TextView) itemView.findViewById(R.id.tvheading2);
        tvh3 = (TextView) itemView.findViewById(R.id.tvheading3);




    }
}
}

