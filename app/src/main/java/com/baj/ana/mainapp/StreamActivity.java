package com.baj.ana.mainapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import jp.wasabeef.recyclerview.adapters.SlideInBottomAnimationAdapter;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class StreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView rvStream = (RecyclerView) findViewById(R.id.rvStream);
        rvStream.setLayoutManager(new GridLayoutManager(this, 2));
        SlideInBottomAnimationAdapter adapter= new SlideInBottomAnimationAdapter(new MyStreamAdapter());
        adapter.setDuration(1000);
        adapter.setInterpolator(new AccelerateInterpolator());
        adapter.setFirstOnly(false);
        rvStream.setAdapter(adapter);
    }

    private class MyStreamAdapter extends RecyclerView.Adapter<MyStreamAdapter.Holder> {

        private final ArrayList<StreamModel> items;

        public MyStreamAdapter() {
            items = new ArrayList<>();
            items.add(new StreamModel(R.drawable.cs, "Comp. Science"));
            items.add(new StreamModel(R.drawable.ce, "Civil Engg."));
            items.add(new StreamModel(R.drawable.me, "Mech. Engg."));
            items.add(new StreamModel(R.drawable.ae, "Aero Space"));
            items.add(new StreamModel(R.drawable.ec, "Elec. & Comm."));
            items.add(new StreamModel(R.drawable.ee, "Elec. & Electronic"));
        }

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(StreamActivity.this).inflate(R.layout.cell_simple_stream, parent, false);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(Holder holder, final int position) {
            holder.ivIcon.setImageResource(items.get(position).icon);
            holder.tvTitle.setText(items.get(position).title);
            holder.card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jumpToActivity(v, position);
                }
            });

        }

        private void jumpToActivity(View v, int position) {
            Intent i = new Intent();
            switch (position) {
                case 0:
                    i.setClass(StreamActivity.this, CsActivity.class);
                    break;
                case 1:
                    i.setClass(StreamActivity.this, CeActivity.class);
                    break;
                case 2:
                    i.setClass(StreamActivity.this, MechActivity.class);
                    break;
                case 3:
                    i.setClass(StreamActivity.this, AeActivity.class);
                    break;
                case 4:
                    i.setClass(StreamActivity.this, EceActivity.class);
                    break;
                case 5:
                    i.setClass(StreamActivity.this, EeeActivity.class);
                    break;
            }
            try {
                startActivity(i);
            } catch (Exception e) {

            }
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        //holder
        class Holder extends RecyclerView.ViewHolder {

            private final TextView tvTitle;
            private final ImageView ivIcon;
            private final CardView card;
            private final View itemView;

            public Holder(View itemView) {
                super(itemView);
                tvTitle = (TextView) itemView.findViewById(R.id.tvheading);
                ivIcon = (ImageView) itemView.findViewById(R.id.ivicon);
                card = (CardView) itemView.findViewById(R.id.cellBlock);
                this.itemView = itemView;
            }

        }


        //model
        private class StreamModel {
            int icon;
            String title;

            StreamModel(int icon, String title) {
                this.icon = icon;
                this.title = title;
            }
        }
    }
}
