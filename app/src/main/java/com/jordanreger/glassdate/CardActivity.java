package com.jordanreger.glassdate;

import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;

public class CardActivity extends Activity {

    TextView DateTextView = (TextView)findViewById(R.id.DateTextView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DateTextView.setText("@string/data_fallback");

        setContentView(R.layout.card);
    }
}