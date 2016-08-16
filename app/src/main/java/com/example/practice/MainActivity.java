package com.example.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.txt1);
    }

    public void doMagic(View view) {

        String str = mEditText.getText().toString();

        Intent intent = new Intent(this, ActivitDetail.class);

        intent.putExtra(Intent.EXTRA_TEXT, str);

        startActivity(intent);

    }
}
