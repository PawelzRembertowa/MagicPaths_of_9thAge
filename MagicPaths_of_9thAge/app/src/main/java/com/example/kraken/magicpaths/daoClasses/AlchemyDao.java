package com.example.kraken.magicpaths.daoClasses;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.kraken.magicpaths.spell_database.Spell;
import com.example.kraken.magicpaths.spell_database.SpellsTableContract;

import java.util.List;

/**
 * Created by Kraken on 2017-04-12.
 */

public class AlchemyDao {

    public static final String ALCHEMY_SPELLS = "alchemy_spells";

    private SQLiteDatabase database;

    public AlchemyDao (SQLiteDatabase database) {
        this.database = database;
    }

    public void addSpell(List<Spell> spells){
        database.beginTransaction();

        for(Spell spell:spells){
            ContentValues alchemyItem1 = new ContentValues();

            alchemyItem1.put(SpellsTableContract.COL_SPELL_NUMBER, spell.getSpellNumber());
            alchemyItem1.put(SpellsTableContract.COL_SPELL_NAME, spell.getSpellName());
            alchemyItem1.put(SpellsTableContract.COL_SPELL_VALUE, spell.getSpellValue());
            alchemyItem1.put(SpellsTableContract.COL_SPELL_RANGE, spell.getSpellRange());
            alchemyItem1.put(SpellsTableContract.COL_SPELL_TYPE, spell.getSpellType());
            alchemyItem1.put(SpellsTableContract.COL_SPELL_DURATION, spell.getSpellDuration());
            alchemyItem1.put(SpellsTableContract.COL_SPELL_EFFECT, spell.getSpellEffect());

            //        pozostaĹ‚e kolumny teĹĽ uzupeĹ‚niÄ‡ z klasy spell
            //        cosmologyItem1.put(SpellsTableContract.COL_SPELL_ALL_TYPE, ??);
//        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, );
//        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, "<b>Hex</b>");
//        cosmologyItem1.put(SpellsTableContract.COL_SPELL_DURATION, "Lasts one Turn");
//        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, " ");
//        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, " ");
//        cosmologyItem1.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "The target gains <b>+1</b> Weapon Skill and <b>+1</b> Ballistic Skill.");
//        cosmologyItem1.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "The target suffers <b>-1</b> Weapon Skill, to a minimum of 1, and <b>-1</b> Ballistic Skill.");



            database.insert(ALCHEMY_SPELLS, null, alchemyItem1);
        }


        database.setTransactionSuccessful();
        database.endTransaction();

    }
}
