package com.android.sonali.passdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent recInt = getIntent();

        if(recInt != null)
        {
            Bundle bundle = recInt.getExtras();

            if(bundle != null)
            {
                int resid = bundle.getInt("resid");
                ((ImageView)findViewById(R.id.imageView)).setImageResource(resid);
            }


        }

    }


}

