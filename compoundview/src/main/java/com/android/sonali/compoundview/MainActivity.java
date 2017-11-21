package com.android.sonali.compoundview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import static android.view.View.INVISIBLE;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater inflater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
    }

    public void onAdd(View view)
    {
        LinearLayout containerll = findViewById(R.id.containerll);
        View vw = inflater.inflate(R.layout.compound_view, containerll,true);
        vw.findViewById(R.id.imgVw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(INVISIBLE);
            }
        });

    }
}
