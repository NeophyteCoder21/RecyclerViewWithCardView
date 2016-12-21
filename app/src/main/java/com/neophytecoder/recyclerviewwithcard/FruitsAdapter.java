package com.neophytecoder.recyclerviewwithcard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Neophyte Coder on 20/12/16.
 */
public class FruitsAdapter extends RecyclerView.Adapter<FruitsHolder> {
    private int[] items;
    private String[] fruitsName;

    private Context mContext;

    public FruitsAdapter(int[] items, String[] fruitsName, Context context) {

        this.items = items;
        this.fruitsName = fruitsName;

        mContext = context;

    }

    @Override
    public FruitsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fruits, parent, false);

        return new FruitsHolder(view, mContext);
    }

    @Override
    public void onBindViewHolder(FruitsHolder holder, int position) {
        holder.populateItems(items[position], fruitsName[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
