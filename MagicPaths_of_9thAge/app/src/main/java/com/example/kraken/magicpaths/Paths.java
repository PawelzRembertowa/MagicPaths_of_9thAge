package com.example.kraken.magicpaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Paths extends AppCompatActivity {

    public Button button_alchemy;
    public Button button_cosmology;
    public Button button_divination;
    public Button button_druidism;
    public Button button_evocation;
    public Button button_occultism;
    public Button button_pyromancy;
    public Button button_shamanism;
    public Button button_thaumaturgy;
    public Button button_witchcraft;

    public void goToAlchemy() {
        button_alchemy = (Button) findViewById(R.id.button_alchemy);
        button_alchemy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToAlchemy = new Intent(Paths.this, Alchemy.class);
                startActivity(stepToAlchemy);
            }
        });

    }

    public void goToCosmology() {
        button_cosmology = (Button) findViewById(R.id.button_cosmology);
        button_cosmology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToCosmology = new Intent(Paths.this, Cosmology.class);
                startActivity(stepToCosmology);
            }
        });

    }

    public void goToDivination() {
        button_divination = (Button) findViewById(R.id.button_divination);
        button_divination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToDivination = new Intent(Paths.this, Divination.class);
                startActivity(stepToDivination);
            }
        });

    }

    public void goToDruidism() {
        button_druidism = (Button) findViewById(R.id.button_druidism);
        button_druidism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToDruidism = new Intent(Paths.this, Druidism.class);
                startActivity(stepToDruidism);
            }
        });

    }

    public void goToEvocation() {
        button_evocation = (Button) findViewById(R.id.button_evocation);
        button_evocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToEvocation = new Intent(Paths.this, Evocation.class);
                startActivity(stepToEvocation);
            }
        });

    }

    public void goToOccultism() {
        button_occultism = (Button) findViewById(R.id.button_occultism);
        button_occultism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToOccultism = new Intent(Paths.this, Occultism.class);
                startActivity(stepToOccultism);
            }
        });

    }

    public void goToPyromancy() {
        button_pyromancy = (Button) findViewById(R.id.button_pyromancy);
        button_pyromancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToPyromancy = new Intent(Paths.this, Pyromancy.class);
                startActivity(stepToPyromancy);
            }
        });

    }

    public void goToShamanism() {
        button_shamanism = (Button) findViewById(R.id.button_shamanism);
        button_shamanism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToShamanism = new Intent(Paths.this, Shamanism.class);
                startActivity(stepToShamanism);
            }
        });

    }

    public void goToThaumaturgy() {
        button_thaumaturgy = (Button) findViewById(R.id.button_thaumaturgy);
        button_thaumaturgy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToThaumaturgy = new Intent(Paths.this, Thaumaturgy.class);
                startActivity(stepToThaumaturgy);
            }
        });

    }

    public void goToWitchcraft() {
        button_witchcraft = (Button) findViewById(R.id.button_witchcraft);
        button_witchcraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepToWitchcraft = new Intent(Paths.this, Witchcraft.class);
                startActivity(stepToWitchcraft);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paths);

        goToAlchemy();
        goToCosmology();
        goToDivination();
        goToDruidism();
        goToEvocation();
        goToOccultism();
        goToPyromancy();
        goToShamanism();
        goToThaumaturgy();
        goToWitchcraft();
    }
}
