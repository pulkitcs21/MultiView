package com.pulkitagarwal.multicolumn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] Products = new String[]{"Pizza", "Burger", "Pasta", "PavBhaji", "Rice","Sandwich","Chipotle", "Oats", "Peas", "Mango"};
    private int[] Qty = new int[]{1,2,3,4,6,7,8};
    private ArrayList<FoodModel> foodModelArrayList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //foodModelArrayList = new ArrayList<>();
        foodModelArrayList = populateList();

        FoodAdapter foodAdapter = new FoodAdapter(this,foodModelArrayList);
        listView.setAdapter(foodAdapter);

    }

    private ArrayList<FoodModel> populateList(){

        ArrayList<FoodModel> list = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            FoodModel foodModel = new FoodModel();
            foodModel.setProduct(Products[i]);
            foodModel.setQty(Qty[i]);
            list.add(foodModel);
        }

        return list;
    }
}