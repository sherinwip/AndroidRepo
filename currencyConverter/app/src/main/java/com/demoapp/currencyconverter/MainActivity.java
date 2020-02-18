package com.demoapp.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText dollarText;


    public void Convert(View view) {
        dollarText = findViewById(R.id.dollAmountText);
        Double dollarDouble= new Double(dollarText.getText().toString());
        Double INR = dollarDouble*70.85;
        Toast.makeText(MainActivity.this, INR.toString()+" Rupees", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
