package com.android.sonali.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private String col;
    public static final String KEY_COL = "col";
    public static final int KEY_REQ = 4589;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((CheckBox) findViewById(R.id.chkRed)).setOnCheckedChangeListener(
                (compoundButton, b) -> {
                    if (b) col = "red";
                    else col = "blue";
                    ((TextView) findViewById(R.id.edtTxt)).setText(col);
                }
        );

        ((CheckBox)findViewById(R.id.chkBlue)).setOnCheckedChangeListener(this::checked);
    }

    private void checked(CompoundButton btn, boolean st)
    {
        if(btn.getId()== R.id.chkBlue)
        {
            if(st) col = "blue";
            else col = "red";
            ((TextView)findViewById(R.id.edtTxt)).setText(col);
        }
    }

    public void onNext(View view)
    {
        Intent intent = new Intent(this, SportsActivity.class); //clear your intent. From current activity to sports activity
        Bundle bundle = new Bundle();
        bundle.putString(KEY_COL, col);
        //bundle.putInt("day", 13);

        intent.putExtras(bundle);
        startActivityForResult(intent, KEY_REQ);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == KEY_REQ)
        {
            if(resultCode==RESULT_OK)
            {
                if(data != null)
                {
                    Bundle bndl = data.getExtras();
                    if(bndl != null)
                    {
                        String resCol = bndl.getString(SportsActivity.KEY_RES);
                        ((TextView)findViewById(R.id.edtTxt)).setText(resCol);
                    }
                }
            }
        }
    }
}
