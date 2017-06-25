package com.hillarious.bohdansasko.p0081viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setText("Clicked!");
        btnOk.setEnabled(false);
    }
}
