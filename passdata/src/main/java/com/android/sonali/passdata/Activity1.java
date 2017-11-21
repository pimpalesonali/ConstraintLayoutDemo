package com.android.sonali.passdata;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    private String vehicle;
    public static final String KEY_VEH = "vehicle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

    }

    public void onClick(View view)
    {
        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("resId", R.drawable.bus);
        startActivity(intent);

    }






}
