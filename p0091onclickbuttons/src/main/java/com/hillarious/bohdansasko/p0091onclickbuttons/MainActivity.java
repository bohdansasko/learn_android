package com.hillarious.bohdansasko.p0091onclickbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView m_tvOut;
    Button m_btnOk;
    Button m_btnCancel;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find view elements
        m_tvOut = (TextView)findViewById(R.id.tvOut);
        m_btnOk = (Button)findViewById(R.id.btnOk);
        m_btnCancel = (Button)findViewById(R.id.btnCancel);
    }


    public void onClickButton(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                m_tvOut.setText("Clicked button ok");
                Log.d(TAG, "Button ok");
                Toast.makeText(this, "Clicked button ok", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCancel:
                m_tvOut.setText("Clicked button cancel");
                Log.d(TAG, "Button Cancel");
                Toast.makeText(this, "Clicked button cancel", Toast.LENGTH_SHORT).show();
                break;
            default:
                m_tvOut.setText("Clicked button doesn't known");
                Log.d(TAG, "Button doesn't known");
        }
    }
}
