package com.example.kraken.magicpaths.daoClasses;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.kraken.magicpaths.spell_database.Spell;
import com.example.kraken.magicpaths.spell_database.SpellDBHelper;
import com.example.kraken.magicpaths.spell_database.SpellsTableContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kraken on 2017-04-12.
 */

public class AlchemyDao {

    public static final String ALCHEMY_SPELLS = "alchemy_spells";

    private SQLiteDatabase database;
    private SpellDBHelper dbHelper;

    private String[] alchemyColumns = {SpellsTableContract.COL_SPELL_NUMBER,
                        SpellsTableContract.COL_SPELL_NAME,
                        SpellsTableContract.COL_SPELL_VALUE,
                        SpellsTableContract.COL_SPELL_RANGE,
                        SpellsTableContract.COL_SPELL_TYPE,
                        SpellsTableContract.COL_SPELL_DURATION,
                        SpellsTableContract.COL_SPELL_EFFECT};

    public AlchemyDao (Context context) {
        dbHelper = new SpellDBHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }
    //NIE WIEM PO CO TO, ALE NA RAZIE MUSI BYC
//    public Spell createSpell(String spell) {
//        ContentValues values = new ContentValues();
//        values.put(SpellsTableContract.TABLE_ALCHEMY, spell);
//        int spellId = (int) database.insert(SpellsTableContract.TABLE_ALCHEMY, null, values);
//        Cursor cursor = database.query(SpellsTableContract.TABLE_ALCHEMY, alchemyColumns,
//                SpellsTableContract.COL_SPELL_NAME + " = " + spellId, null, null, null, null);
//        cursor.moveToFirst();
//        Spell newSpell = cursorToSpell(cursor);
//        cursor.close();
//        return newSpell;
//    }

    private Spell cursorToSpell(Cursor cursor) {
        Spell spell = new Spell();
        spell.setSpellNumber(cursor.getString(0));
        spell.setSpellName(cursor.getString(1));
        spell.setSpellValue(cursor.getString(2));
        spell.setSpellRange(cursor.getString(3));
        spell.setSpellType(cursor.getString(4));
        spell.setSpellDuration(cursor.getString(5));
        spell.setSpellEffect(cursor.getString(6));
        return spell;
    }

    public List<Spell> getAllAlchemySpells() {
        List<Spell> spells = new ArrayList<Spell>();

        Cursor cursor = database.query(SpellsTableContract.TABLE_ALCHEMY,
                alchemyColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Spell spell = cursorToSpell(cursor);
            spells.add(spell);
            cursor.moveToNext();
        }
        cursor.close();
        return spells;
    }



}
