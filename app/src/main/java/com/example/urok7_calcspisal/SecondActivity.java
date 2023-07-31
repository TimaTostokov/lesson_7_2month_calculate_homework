package com.example.urok7_calcspisal;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getWindow().setStatusBarColor(ContextCompat.getColor(SecondActivity.this, R.color.gray));

        String open = getIntent().getStringExtra("Vlastelin");
        TextView text_CP = findViewById(R.id.text_CP);
        text_CP.setText(open);

        MaterialButton btn_destroy = findViewById(R.id.btn_destroy);
        btn_destroy.setOnClickListener(v ->
                finishAffinity()
        );

    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        finishAffinity();
//    }
}
