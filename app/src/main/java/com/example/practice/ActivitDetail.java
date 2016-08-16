package com.example.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivitDetail extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activit_detail);

        mTextView = (TextView) findViewById(R.id.activity_txt1);

        String str = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        StringBuilder strB = new StringBuilder(str);

        mTextView.setText(strB.reverse());

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
