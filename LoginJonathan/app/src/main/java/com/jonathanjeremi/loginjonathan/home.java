package com.jonathanjeremi.loginjonathan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class home extends AppCompatActivity {
    ListView listView;
    Button btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Context context = getApplicationContext();
        CharSequence text = "Selamat datang - Toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();

        //Making a listview button
        btnList = (Button) findViewById(R.id.inventoryButton);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, ListInventory.class));
                finish();
            }
        });
    }
}