package com.example.mid_work5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    Button button;
    TextView txv;
    TextView txv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        button = findViewById(R.id.button);
        txv = findViewById(R.id.txv);
        txv2 = findViewById(R.id.txv2);
    }

    public void transfer(View v) {
        String A = (editText.getText().toString());
        String B = (editText2.getText().toString());
        String C = (editText3.getText().toString());
        String D = (editText4.getText().toString());
        String E = (editText5.getText().toString());
        String F = (editText6.getText().toString());
        txv.setText(A + "/" + B + "/" + C );
        txv2.setText(D + ":" + E + ":" + F);
    }
}