package com.example.smartboxshopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter adapter;
    ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_recycler);
        list = new ArrayList<>();

        list.add(new Product("Metal", "1", 50, R.drawable.newmetal, 500));
        list.add(new Product("Wood", "2", 20, R.drawable.wood2, 400));
        list.add(new Product("Fasteners", "3", 5, R.drawable.screws, 200));
        list.add(new Product("Wires", "4", 20, R.drawable.wires, 20));

//        list.add(new Product("Blue Hose", "5", 10, R.drawable.bluehose, 50));
//        list.add(new Product("Red Hose", "6", 10, R.drawable.redhose, 50));
//        list.add(new Product("Green Hose", "7", 10, R.drawable.greenhose, 100));
//        list.add(new Product("Table", "8", 20, R.drawable.table, 100));

        list.add(new Product("Pipes", "9", 10, R.drawable.pipeparts1, 1000));
        list.add(new Product("Pipe Parts", "10", 6, R.drawable.pipe, 500));
        list.add(new Product("Metal Pipe Parts", "11", 2, R.drawable.metalpipeparts, 500));
        list.add(new Product("Washing Machine: Washer", "12", 629, R.drawable.washer, 100));

        list.add(new Product("Washing Machine: Dryer", "13", 700, R.drawable.dryer, 100));
        list.add(new Product("Combo Washing", "14", 1500, R.drawable.combo, 30));
        list.add(new Product("Bulb", "15", 5, R.drawable.bulb, 400));
        list.add(new Product("Lamp", "15", 10, R.drawable.lamp, 100));
//
//        list.add(new Product("Outlets", "16", 3, R.drawable.combo, 150));
//        list.add(new Product("Detergent", "17", 6, R.drawable.combo, 200));
//        list.add(new Product("Plant Pots", "18", 4, R.drawable.combo, 200));
//        list.add(new Product("Dirt", "19", 30, R.drawable.combo, 350));
//        list.add(new Product("SnowBlower", "20", 1000, R.drawable.wires, 8));




        adapter = new ProductAdapter(this, list);
        LinearLayoutManager llm = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(adapter);
    }
}