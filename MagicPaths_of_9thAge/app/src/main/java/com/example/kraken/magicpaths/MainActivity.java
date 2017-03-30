package com.example.kraken.magicpaths;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CursorAdapter;

import com.example.kraken.magicpaths.paths_of_magic.Alchemy;
import com.example.kraken.magicpaths.spell_database.SpellDBHelper;
import com.example.kraken.magicpaths.spell_database.SpellsTableContract;
import com.facebook.stetho.Stetho;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.BindView;

import static com.example.kraken.magicpaths.spell_database.SpellsTableContract.COL_SPELL_NAME;
import static com.example.kraken.magicpaths.spell_database.SpellsTableContract.COL_SPELL_NUMBER;
import static com.example.kraken.magicpaths.spell_database.SpellsTableContract.COL_SPELL_RANGE;
import static com.example.kraken.magicpaths.spell_database.SpellsTableContract.COL_SPELL_VALUE;


public class MainActivity extends AppCompatActivity {


    private SpellDBHelper dbSpells;
    private ContentValues alchemyItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        dbSpells = new SpellDBHelper(this);



      Alchemy alchemy = new Alchemy();
        alchemy.addAlchemyToDB();

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