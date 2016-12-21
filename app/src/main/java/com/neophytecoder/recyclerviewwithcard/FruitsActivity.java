package com.neophytecoder.recyclerviewwithcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FruitsActivity extends AppCompatActivity implements RecyclerItemTouch.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv);
        recyclerSetup(recyclerView);
    }


    @Override
    public void onItemClick(View view, int position) {
        TextView textView = (TextView) view.findViewById(R.id.tv_name);

        if (textView != null) {
            Toast.makeText(this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onLongItemClick(View view, int position) {

    }

    private void recyclerSetup(RecyclerView recyclerView) {
        int[] items = {R.drawable.apota, R.drawable.apple, R.drawable.banana,
                R.drawable.grapes, R.drawable.guava, R.drawable.lemon,
                R.drawable.orange, R.drawable.papaya, R.drawable.pineapple,
                R.drawable.pomegranate, R.drawable.watermelon};


        String[] fruitsName = {"Apota", "Apple", "Banana", "Grapes", "Guava", "Lemon", "Orange",
                "Papaya", "Pineapple", "Pomegranate", "Pomegranate", "Watermelon"};

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new FruitsAdapter(items, fruitsName, this));

        recyclerView.addOnItemTouchListener(new RecyclerItemTouch(FruitsActivity.this, recyclerView, this));
    }

}
