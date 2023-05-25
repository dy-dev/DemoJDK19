package com.example.demojdk19;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = getResources().getString(R.string.hello_world);
        Color c = Color.valueOf(getResources().getColor(R.color.black, getTheme()));

        TextView t = findViewById(R.id.my_text);
        t.setText(android.R.string.paste);
//        text.setText("Toto");
//        setContentView(text);

    }
}