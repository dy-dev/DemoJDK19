package com.arcreane.demojdk19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Exo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo1);
        Button b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Exo1.this, "Toto via on click listener", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Exo1.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void Toto(View view) {
        Toast.makeText(Exo1.this, "Toto via XML", Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_item1:
                Toast.makeText(Exo1.this, item.getTitle(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.menu_item2:
                Toast.makeText(Exo1.this, item.getTitle(), Toast.LENGTH_LONG).show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}