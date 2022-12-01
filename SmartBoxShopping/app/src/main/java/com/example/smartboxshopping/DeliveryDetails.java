package com.example.smartboxshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class DeliveryDetails extends AppCompatActivity {

    public static final String TAG = "DeliveryDetails";
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_details);
        Intent intent = getIntent();
        radioGroup = findViewById(R.id.radiobutton_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio1:
                        Toast.makeText(DeliveryDetails.this, "Order for Pickup", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio2:
                        Toast.makeText(DeliveryDetails.this, "Order for Delivery", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });

    }

    public void orderConfirmation(View view) {
//        Toast.makeText(this, "Order has been placed.", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(DeliveryDetails.this,Ordersummary.class));
        finish();
    }

//    public void onRadioButtonClicked(View view) {
//        Log.d(TAG,"inside onRadioButtonClicked method");
////        Toast.makeText(this, "Order for Pickup.", Toast.LENGTH_SHORT).show();
//        Log.d(TAG,"end of onRadioButtonClicked method");
//    }
}