package com.example.antoinelefevre.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private String TAG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("http://anglicanaorlu.org/wp-content/uploads/2018/08/colonne-de-douche-hydromassante-grohe-espace-aubade-avec-1384-robinetterie-hydrotherapie-grohe-euphoria-system-1-et-acheter-colonne-de-douche-55-1500x900px-acheter-colonne-de-douche.jpg");
        mNames.add("Douche Simulator");

        mImageUrls.add("http://s1.lprs1.fr/images/2018/09/11/7884678_f80557a0-b5c9-11e8-a7cd-95bd362358b1-1_940x500.jpg");
        mNames.add("BlaBla Sims");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerView");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
