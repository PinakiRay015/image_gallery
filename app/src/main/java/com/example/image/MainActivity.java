package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button imageChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageChange = (Button) findViewById(R.id.start);
        imageChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeImage();
            }
        });
    }

    private void changeImage()
    {
        Intent intent = new Intent(MainActivity.this , Second.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Button Clicked!!", Toast.LENGTH_SHORT).show();
    }
}