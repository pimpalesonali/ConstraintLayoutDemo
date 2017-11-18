package com.android.sonali.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SportsActivity extends AppCompatActivity {
    public  static final String KEY_RES = "res";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        Intent resInt = getIntent();
        if(resInt != null)
        {
            Bundle bundl = resInt.getExtras();
            if(bundl!= null)
            {
                String name = bundl.getString(MainActivity.KEY_COL);
                ((EditText)findViewById(R.id.edtnm)).setText(name);

               // int day = bundl.getInt("day");
               // ((EditText)findViewById(R.id.edtday)).setText(day);
            }
        }
    }

    public void onBack(View view)
    {
        Intent intent = new Intent();
        Bundle bun = new Bundle();
        bun.putString(KEY_RES,((EditText)findViewById(R.id.edtnm)).getText().toString()) ;
        intent.putExtras(bun);

        setResult(RESULT_OK, intent);
        finish();

    }
}
