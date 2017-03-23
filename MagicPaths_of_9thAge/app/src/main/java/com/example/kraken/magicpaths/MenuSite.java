package com.example.kraken.magicpaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSite extends AppCompatActivity {

    public Button button_paths;
    public Button button_miscast;
    public Button button_chosenspells;
    public Button button_checkupdates;

    public void goToPaths(){
        button_paths = (Button) findViewById(R.id.button_paths);
        button_paths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pathsStep = new Intent(MenuSite.this, Paths.class);
                startActivity(pathsStep);
            }
        });

    }
    public void goToMiscast() {
        button_miscast = (Button) findViewById(R.id.button_miscast);
        button_miscast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miscastStep = new Intent(MenuSite.this, MiscastTable.class);
                startActivity(miscastStep);
            }
        });
    }
    public void goToChosenSpells() {
        button_chosenspells = (Button) findViewById(R.id.button_chosenspells);
        button_chosenspells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chosenSpellsStep = new Intent(MenuSite.this, Paths.class);
                startActivity(chosenSpellsStep);
            }
        });
    }
    public void goToUpdate () {
        button_checkupdates = (Button) findViewById(R.id.button_checkupdates);
        //tu bedzie metoda odsylajaca gdzies do stronki po aktualizacje
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_site);

        goToPaths();
        goToMiscast();
        goToChosenSpells();
        goToUpdate();
    }
}
