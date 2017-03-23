package com.example.kraken.magicpaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button button_start;
    public Button button_info;

    public void init() {
        button_start = (Button) findViewById(R.id.button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstStep = new Intent(MainActivity.this, MenuSite.class);
                startActivity(firstStep);

            }
        });
    }

    public void informationSite() {
        button_info = (Button) findViewById(R.id.button_info);
        button_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent informationStep = new Intent(MainActivity.this, AppInfo.class);
                startActivity(informationStep);
            }


        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        informationSite();
    }
}
