package com.example.kraken.magicpaths;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kraken.magicpaths.spell_database.SpellDBHelper;
import com.facebook.stetho.Stetho;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.BindView;


public class MainActivity extends AppCompatActivity {


    private SpellDBHelper dbSpells;
    private ContentValues alchemyItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        dbSpells = new SpellDBHelper(this);

        alchemyItem = new ContentValues();
        alchemyItem.put("COL_SPELL_NUMBER", "A");
        alchemyItem.put("COL_SPELL_NAME", "Alchemical Fire");
        alchemyItem.put("COL_SPELL_VALUE", " ");
        alchemyItem.put("COL_SPELL_RANGE", "18''");
        alchemyItem.put("COL_SPELL_TYPE", "Hex");
        alchemyItem.put("COL_SPELL_DURATION", "Lasts one Turn");
        alchemyItem.put("COL_SPELL_EFFECT", "The target gains Flammable against Close Combat Attacks and Spells.");
    }

    @OnClick (R.id.button_start)
    public void onButtonStartClick () {
        Intent firstStep = new Intent(this, MenuSite.class);
        startActivity(firstStep);
    }

    @OnClick (R.id.button_info)
    public void  onButtonInfoClick () {
        Intent informationStep = new Intent(this, AppInfo.class);
        startActivity(informationStep);
    }


}
//this.spellNumber = spellNumber;
//        this.spellName = spellName;
//        this.spellValue = spellValue;
//        this.spellRange = spellRange;
//        this.spellType = spellType;
//        this.spellDuration = spellDuration;
//        this.spellEffect = spellEffect;