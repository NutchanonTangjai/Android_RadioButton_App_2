package com.example.radiobuttonapp2;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class MainActivity extends AppCompatActivity implements
        RadioGroup.OnCheckedChangeListener {
    private RadioButton radioRed, radioGreen, radioBlue, radioWhite;
    private RadioGroup radioGrp;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioRed = (RadioButton) findViewById(R.id.radioRed);
        radioGreen = (RadioButton) findViewById(R.id.radioGreen);
        radioBlue = (RadioButton) findViewById(R.id.radioBlue);
        radioWhite = (RadioButton) findViewById(R.id.whiteRadio);
        radioGrp = (RadioGroup) findViewById(R.id.radioGrp);
        radioGrp.setOnCheckedChangeListener(this);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
    }
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.radioRed)
            linearLayout.setBackgroundColor(Color.RED);
        else if (checkedId == R.id.radioGreen)
            linearLayout.setBackgroundColor(Color.GREEN);
        else if (checkedId == R.id.radioBlue)
            linearLayout.setBackgroundColor(Color.BLUE);
        else if (checkedId == R.id.whiteRadio)
            linearLayout.setBackgroundColor(Color.WHITE);
    }
}