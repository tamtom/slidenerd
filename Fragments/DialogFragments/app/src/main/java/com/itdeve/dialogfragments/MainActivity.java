package com.itdeve.dialogfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDialog myDialog = new MyDialog();
        myDialog.setListenerobj(this);
        myDialog.show(getFragmentManager(),"name");


    }

    @Override
    public void settexxt(String x) {
        Toast.makeText(this,"ya kbeer",Toast.LENGTH_SHORT).show();
    }
}
