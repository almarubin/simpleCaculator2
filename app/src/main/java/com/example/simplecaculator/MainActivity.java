package com.example.simplecaculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    String et1Text;
    Integer num1;
    EditText et2;
    String et2Text;
    Integer num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void onBtnClick(View view) {
        et1 = findViewById(R.id.Num1);
        et1Text = et1.getText().toString();
        num1 = Integer.valueOf(et1Text);
        et2 = findViewById(R.id.Num2);
        et2Text = et2.getText().toString();
        num2 = Integer.valueOf(et2Text);

        Integer result = null;
        if (view.getId() == R.id.btnPlus)
            result = num1 + num2;
        if (view.getId() == R.id.btnMin)
            result = num1 - num2;
        if (view.getId() == R.id.btnMult)
            result = num1 * num2;
        if (view.getId() == R.id.btnDiv)
            result = num1 / num2;
        if (result != null)
        {
            TextView tvRes = findViewById(R.id.tvResult);
            tvRes.setText(result.toString());
        }
    }
}