package com.example.kraken.magicpaths.paths_of_magic;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.kraken.magicpaths.R;
import com.example.kraken.magicpaths.spell_database.SpellsTableContract;


public class Cosmology extends AppCompatActivity {

    public ContentValues cosmologyItem1;
    public ContentValues cosmologyItem2;
    public ContentValues cosmologyItem3;
    public ContentValues cosmologyItem4;
    public ContentValues cosmologyItem5;
    public ContentValues cosmologyItem6;
    public ContentValues cosmologyItem7;

    public void addAlchemyToDB() {

        cosmologyItem1 = new ContentValues();
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_NUMBER, "A");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_NAME, "Alchemical Fire");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_VALUE, " ");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_ALL_TYPE, "Hex");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, "Hex");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, "Hex");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, "Lasts one Turn");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, "Hex");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "The target gains Flammable against Close Combat Attacks and Spells.");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "The target gains Flammable against Close Combat Attacks and Spells.");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmology);




    }
}
