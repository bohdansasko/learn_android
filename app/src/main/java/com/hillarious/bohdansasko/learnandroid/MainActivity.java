package com.hillarious.bohdansasko.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llBottom = (LinearLayout) findViewById(R.id.llBottom);
        llBottom.setBackgroundResource(R.color.llBottomColor);

        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        tvBottom.setText(R.string.tvBottomText);

        Button btnBottom = (Button) findViewById(R.id.btnBottom);
        btnBottom.setText(R.string.btnBottomText);
    }
}
