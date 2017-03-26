package com.example.kraken.magicpaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kraken.magicpaths.paths_of_magic.Alchemy;
import com.example.kraken.magicpaths.paths_of_magic.Cosmology;
import com.example.kraken.magicpaths.paths_of_magic.Divination;
import com.example.kraken.magicpaths.paths_of_magic.Druidism;
import com.example.kraken.magicpaths.paths_of_magic.Evocation;
import com.example.kraken.magicpaths.paths_of_magic.Occultism;
import com.example.kraken.magicpaths.paths_of_magic.Pyromancy;
import com.example.kraken.magicpaths.paths_of_magic.Shamanism;
import com.example.kraken.magicpaths.paths_of_magic.Thaumaturgy;
import com.example.kraken.magicpaths.paths_of_magic.Witchcraft;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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



    @OnClick (R.id.button_alchemy)
    void onAlchemyButton () {
        Intent stepToAlchemy = new Intent(this, Alchemy.class);
        startActivity(stepToAlchemy);
    }


    @OnClick (R.id.button_cosmology)
    void onCosmologyButton () {
        Intent stepToCosmology = new Intent(this, Cosmology.class);
        startActivity(stepToCosmology);

    }

    @OnClick (R.id.button_divination)
    void onDivinationButton () {
        Intent stepToDivination = new Intent(this, Divination.class);
        startActivity(stepToDivination);

    }

    @OnClick (R.id.button_druidism)
    void onDruidismButton () {
        Intent stepToDruidism = new Intent(this, Druidism.class);
        startActivity(stepToDruidism);

    }

    @OnClick (R.id.button_evocation)
    void onEvocationButton () {
        Intent stepToEvocation = new Intent(this, Evocation.class);
        startActivity(stepToEvocation);

    }

    @OnClick (R.id.button_occultism)
    void onOccultismButton () {
        Intent stepToOccultism = new Intent(this, Occultism.class);
        startActivity(stepToOccultism);

    }

    @OnClick (R.id.button_pyromancy)
    void onPyromancyButton () {
        Intent stepToPyromancy = new Intent(this, Pyromancy.class);
        startActivity(stepToPyromancy);

    }

    @OnClick (R.id.button_shamanism)
    void onShamanismButton () {
        Intent stepToShamanism = new Intent(this, Shamanism.class);
        startActivity(stepToShamanism);

    }

    @OnClick (R.id.button_thaumaturgy)
    void onThaumaturgyButton () {
        Intent stepToThaumaturgy = new Intent(this, Thaumaturgy.class);
        startActivity(stepToThaumaturgy);

    }

    @OnClick (R.id.button_witchcraft)
    void onWitchcraftButton () {
        Intent stepToWitchcraft = new Intent(this, Witchcraft.class);
        startActivity(stepToWitchcraft);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paths);
        ButterKnife.bind(this);


    }
}
