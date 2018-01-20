package com.example.student.db2018012002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button)
        {
            Toast.makeText(this, "Click1", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.button2)
        {
            Toast.makeText(this, "Click222222", Toast.LENGTH_SHORT).show();
        }
    }
    public void click3(View v)
    {
        ToggleButton tb = findViewById(R.id.toggleButton);
        if (tb.isChecked())
        {
            Toast.makeText(this, "開關有開", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "開關關閉", Toast.LENGTH_SHORT).show();
        }
    }
    public void click4(View v)
    {
        Switch sw = findViewById(R.id.switch1);
        if (sw.isChecked())
        {
            Toast.makeText(this, "開關有開", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "開關關閉", Toast.LENGTH_SHORT).show();
        }
    }
}
