package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class third extends AppCompatActivity {

    Button imageChange;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        exit = (Button) findViewById(R.id.home);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnPage();
            }
        });

        imageChange = (Button) findViewById(R.id.changeButton);
        imageChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeImage();
            }
        });
    }

    private void changeImage()
    {
        Intent intent = new Intent(third.this , Fourth.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Image Changed!!", Toast.LENGTH_SHORT).show();
    }

    private void returnPage()
    {
            Intent intent = new Intent(third.this , MainActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Exited!!", Toast.LENGTH_SHORT).show();
    }
}