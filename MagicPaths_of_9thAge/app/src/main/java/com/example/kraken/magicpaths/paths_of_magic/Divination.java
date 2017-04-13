package com.example.kraken.magicpaths.paths_of_magic;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.kraken.magicpaths.R;
import com.example.kraken.magicpaths.spell_database.SpellDBHelper;
import com.example.kraken.magicpaths.spell_database.SpellsTableContract;


public class Divination extends AppCompatActivity {




        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divination);
    }


    public static void addDivinationToDB(SpellDBHelper dbSpells) {

        ContentValues divinationItem1 = new ContentValues();
        divinationItem1.put(SpellsTableContract.COL_SPELL_NUMBER, "A");
        divinationItem1.put(SpellsTableContract.COL_SPELL_NAME, "Guiding Light");
        divinationItem1.put(SpellsTableContract.COL_SPELL_VALUE, " ");
        divinationItem1.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        divinationItem1.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        divinationItem1.put(SpellsTableContract.COL_SPELL_DURATION, "Lasts one Turn");
        divinationItem1.put(SpellsTableContract.COL_SPELL_EFFECT, "When the target takes a Leadership Test, roll an additional D6 and remove the highest D6 rolled. " +
                "A unit cannot be affected by this spell more than once per Magic Phase.");

        ContentValues divinationItem2 = new ContentValues();
        divinationItem2.put(SpellsTableContract.COL_SPELL_NUMBER, "0");
        divinationItem2.put(SpellsTableContract.COL_SPELL_NAME, "Scrying");
        divinationItem2.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">7+</font>\n<font color=\"blue\">[10+]</font>");
        divinationItem2.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">18''</font><br><font color=\"blue\">[6''Aura]</font>");
        divinationItem2.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        divinationItem2.put(SpellsTableContract.COL_SPELL_DURATION, "Lasts one Turn");
        divinationItem2.put(SpellsTableContract.COL_SPELL_EFFECT, "The target gains Distracting and Hard Target.");

        ContentValues divinationItem3 = new ContentValues();
        divinationItem3.put(SpellsTableContract.COL_SPELL_NUMBER, "1");
        divinationItem3.put(SpellsTableContract.COL_SPELL_NAME, "Fate's Judgement");
        divinationItem3.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">7+</font>\n<font color=\"blue\">[10+]</font>");
        divinationItem3.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        divinationItem3.put(SpellsTableContract.COL_SPELL_TYPE, "Hex\nMissile\nDamage");
        divinationItem3.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        divinationItem3.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers <font color=\"red\">D3</font> <font color=\"blue\">[D6]</font> hits that wound automatically, with no Ward or Regeneration Saves allowed.");

        ContentValues divinationItem4 = new ContentValues();
        divinationItem4.put(SpellsTableContract.COL_SPELL_NUMBER, "2");
        divinationItem4.put(SpellsTableContract.COL_SPELL_NAME, "Know Thy Enemy");
        divinationItem4.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">8+</font>\n<font color=\"blue\">[12+]</font>");
        divinationItem4.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">18''</font><br><font color=\"blue\">[6''Aura]</font>");
        divinationItem4.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        divinationItem4.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        divinationItem4.put(SpellsTableContract.COL_SPELL_EFFECT, "The target gains +2 Weapon Skill and +2 Initiative.");

        ContentValues divinationItem5 = new ContentValues();
        divinationItem5.put(SpellsTableContract.COL_SPELL_NUMBER, "3");
        divinationItem5.put(SpellsTableContract.COL_SPELL_NAME, "The Stars Align");
        divinationItem5.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">9+</font>\n<font color=\"blue\">[12+]</font>");
        divinationItem5.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">18''</font><br><font color=\"blue\">[6''Aura]</font>");
        divinationItem5.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        divinationItem5.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        divinationItem5.put(SpellsTableContract.COL_SPELL_EFFECT, "The target gains Divine Attacks, and must reroll failed to-hit rolls with Close Combat <font color=\"red\">and Shooting</font> Attacks.");

        ContentValues divinationItem6 = new ContentValues();
        divinationItem6.put(SpellsTableContract.COL_SPELL_NUMBER, "4");
        divinationItem6.put(SpellsTableContract.COL_SPELL_NAME, "Look to the West");
        divinationItem6.put(SpellsTableContract.COL_SPELL_VALUE, "9+");
        divinationItem6.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        divinationItem6.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        divinationItem6.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        divinationItem6.put(SpellsTableContract.COL_SPELL_EFFECT, "The target gains Stubborn and Immune to Psychology.");

        ContentValues divinationItem7 = new ContentValues();
        divinationItem7.put(SpellsTableContract.COL_SPELL_NUMBER, "5");
        divinationItem7.put(SpellsTableContract.COL_SPELL_NAME, "Unerring Strike");
        divinationItem7.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">9+</font>\n<font color=\"blue\">[13+]</font>");
        divinationItem7.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        divinationItem7.put(SpellsTableContract.COL_SPELL_TYPE, "Hex\nMissile\nDamage");
        divinationItem7.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        divinationItem7.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers <font color=\"red\">2D6</font> <font color=\"blue\">[3D6]</font> hits that wound on 4+, have Armour Piercing (2) and Divine Attacks.");

        ContentValues divinationItem8 = new ContentValues();
        divinationItem8.put(SpellsTableContract.COL_SPELL_NUMBER, "6");
        divinationItem8.put(SpellsTableContract.COL_SPELL_NAME, "Portent of Doom");
        divinationItem8.put(SpellsTableContract.COL_SPELL_VALUE, "10+");
        divinationItem8.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        divinationItem8.put(SpellsTableContract.COL_SPELL_TYPE, "Hex");
        divinationItem8.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        divinationItem8.put(SpellsTableContract.COL_SPELL_EFFECT, "At the start of the following phases, roll a D6, plus one extra D6 for each Character in the unit. " +
                "If one or more dice result in a '6', the target cannot perform the corresponding action this Phase. " +
                "<br><b>Declare Charges sub-phase</b>: Declare Charges. " +
                "<br><b>Remaining Moves sub-phase</b>: March Move. " +
                "<br><b>Magic Phase</b>: Cast Spells. " +
                "<br><b>Shooting Phase</b>: Shoot.");


        SQLiteDatabase writableDatabase = dbSpells.getWritableDatabase();
//        writableDatabase.beginTransaction();
//        writableDatabase.insert("cosmology_spells", null, divinationItem1);
//        writableDatabase.insert("cosmology_spells", null, divinationItem2);
//        writableDatabase.insert("cosmology_spells", null, divinationItem3);
//        writableDatabase.insert("cosmology_spells", null, divinationItem4);
//        writableDatabase.insert("cosmology_spells", null, divinationItem5);
//        writableDatabase.insert("cosmology_spells", null, divinationItem6);
//        writableDatabase.insert("cosmology_spells", null, divinationItem7);
//        writableDatabase.insert("cosmology_spells", null, divinationItem8);
//        writableDatabase.setTransactionSuccessful();
//        writableDatabase.endTransaction();
       // dbSpells.getAllItemDivination();


        //SQLiteDatabase writableDatabase = dbSpells.getWritableDatabase();
        writableDatabase.beginTransaction();

        writableDatabase.insert("divination_spells", null, divinationItem1);
        writableDatabase.insert("divination_spells", null, divinationItem2);
        writableDatabase.insert("divination_spells", null, divinationItem3);
        writableDatabase.insert("divination_spells", null, divinationItem4);
        writableDatabase.insert("divination_spells", null, divinationItem5);
        writableDatabase.insert("divination_spells", null, divinationItem6);
        writableDatabase.insert("divination_spells", null, divinationItem7);
        writableDatabase.insert("divination_spells", null, divinationItem8);
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();

//        dbSpells.getAllItemDivination();


    }
}








