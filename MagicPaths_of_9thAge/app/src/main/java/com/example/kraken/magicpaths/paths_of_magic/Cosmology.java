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
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_NUMBER, "0");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_NAME, "Altered Sight");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_VALUE, "7+ <font color=#802000>{5+}</font>");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_RANGE, "24''");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_ALL_TYPE, " ");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, "<b>Augment</b>");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, "<b>Hex</b>");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_DURATION, "Lasts one Turn");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, " ");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, " ");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "The target gains <b>+1</b> Weapon Skill and <b>+1</b> Ballistic Skill.");
        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "The target suffers <b>-1</b> Weapon Skill, to a minimum of 1, and <b>-1</b> Ballistic Skill.");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmology);




    }
}
