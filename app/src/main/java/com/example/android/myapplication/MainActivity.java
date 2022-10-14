package com.example.android.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView click;
    EditText name;
    EditText branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.button);
        name = findViewById(R.id.name);
        branch = findViewById(R.id.branch);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,happy.class);
                String msg = name.getText().toString();
                intent.putExtra("arsh",msg);
                startActivity(intent);
            }
        });
    }
}