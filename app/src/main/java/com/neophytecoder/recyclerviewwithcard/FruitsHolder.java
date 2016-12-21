package com.neophytecoder.recyclerviewwithcard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Neophyte Coder on 20/12/16.
 */
public class FruitsHolder extends RecyclerView.ViewHolder {
    private ImageView imgFruits;
    private TextView tvFruitsName;

    private Context mContext;

    public FruitsHolder(View itemView, Context context) {
        super(itemView);

        mContext = context;

        imgFruits = (ImageView) itemView.findViewById(R.id.img_fruit);
        tvFruitsName = (TextView) itemView.findViewById(R.id.tv_name);
    }

    public void populateItems(int item, String s) {
        Glide.with(mContext).load(item).into(imgFruits);
        tvFruitsName.setText(s);
    }
}
