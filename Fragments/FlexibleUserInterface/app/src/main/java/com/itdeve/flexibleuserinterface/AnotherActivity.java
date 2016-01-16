package com.itdeve.flexibleuserinterface;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);

        fragmentB.setId(index);
    }
}
