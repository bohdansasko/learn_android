package com.hillarious.bohdansasko.p0091onclickbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    TextView m_tvOut;
    Button m_btnOk;
    Button m_btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find view elements
        m_tvOut = (TextView)findViewById(R.id.tvOut);
        m_btnOk = (Button)findViewById(R.id.btnOk);
        m_btnCancel = (Button)findViewById(R.id.btnCancel);


        OnClickListener btnListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnOk:
                        m_tvOut.setText("Clicked button ok");
                        break;
                    case R.id.btnCancel:
                        m_tvOut.setText("Clicked button cancel");
                        break;
                    default:
                        m_tvOut.setText("Clicked button doesn't known");
                }
            }
        };

        m_btnOk.setOnClickListener(btnListener);
        m_btnCancel.setOnClickListener(btnListener);

    }
}
