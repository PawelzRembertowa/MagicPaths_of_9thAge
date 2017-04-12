package com.example.kraken.magicpaths.paths_of_magic;

import android.content.ContentValues;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kraken.magicpaths.R;
import com.example.kraken.magicpaths.spell_database.Spell;
import com.example.kraken.magicpaths.spell_database.SpellCursorAdapter;
import com.example.kraken.magicpaths.spell_database.SpellDBHelper;
import com.example.kraken.magicpaths.spell_database.SpellsTableContract;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class Alchemy extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alchemy);

        SpellDBHelper alchemyHandler = new SpellDBHelper(this);
        alchemyHandler.getAllItemAlchemy();

        ListView lvItems = (ListView) findViewById(R.id.listViewAlchemyItems);
        SpellCursorAdapter adapterAlchemy = new SpellCursorAdapter(this, cursorAlchemy);
        lvItems.setAdapter(adapterAlchemy);

    }

    public static void addAlchemyToDB(SpellDBHelper dbSpells) {


        ContentValues alchemyItem1 = new ContentValues();
        alchemyItem1.put(SpellsTableContract.COL_SPELL_NUMBER, "A");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_NAME, "Alchemical Fire");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_VALUE, " ");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_TYPE, "Hex");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_DURATION, "Lasts one Turn");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_EFFECT, "The target gains Flammable against Close Combat Attacks and Spells.");

        ContentValues alchemyItem2 = new ContentValues();
        alchemyItem2.put(SpellsTableContract.COL_SPELL_NUMBER, "0");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_NAME, "Quicksilver Lash");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_VALUE, "8+");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_RANGE, "24''");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_TYPE, "Hex Missile Damage");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers D3+1 hits with Metalshifting.");

        ContentValues alchemyItem3 = new ContentValues();
        alchemyItem3.put(SpellsTableContract.COL_SPELL_NUMBER, "1");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_NAME, "Word of Iron");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">6+</font><font color=\"blue\">\n" +
                "[9+]</font>");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_RANGE, "24''");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers <font color=\"red\">2D6</font> <font color=\"blue\">[3D6]</font> Strength 2 hits with Armour Piercing (3) and Flaming Attacks.");

        ContentValues alchemyItem4 = new ContentValues();
        alchemyItem4.put(SpellsTableContract.COL_SPELL_NUMBER, "2");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_NAME, "Molten Copper");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">7+</font><font color=\"blue\">\n" +
                "[10+]</font>");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_RANGE, "24''");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_TYPE, "Hex Missile Damage");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers <font color=\"red\">2D6</font> <font color=\"blue\">[3D6]</font> Strength 2 hits with Armour Piercing (3) and Flaming Attacks.");

        ContentValues alchemyItem5 = new ContentValues();
        alchemyItem5.put(SpellsTableContract.COL_SPELL_NUMBER, "3");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_NAME, "Silver Spike");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">7+</font><font color=\"blue\">\n" +
                "[10+]</font>");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">18''</font><br><font color=\"blue\">\n" +
                "[36'']</font>");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_TYPE, "Hex Missile Damage");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers one hit with Strength 3[6], Armour Piercing (6), Multiple Wounds (D3), and Penetrating.");

        ContentValues alchemyItem6 = new ContentValues();
        alchemyItem6.put(SpellsTableContract.COL_SPELL_NUMBER, "4");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_NAME, "Corruption of Tin");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">8+</font>\n" +
                "<font color=\"blue\">[11+]</font>");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">24''</font><br><font color=\"blue\">\n" +
                "[48'']</font>");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_TYPE, "Hex");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_DURATION, "Permanent");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers -1 to its Armour Save.");

        ContentValues alchemyItem7 = new ContentValues();
        alchemyItem7.put(SpellsTableContract.COL_SPELL_NUMBER, "5");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_NAME, "Transmutation to Lead");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">9+</font>\n" +
                "<font color=\"blue\">[12+]</font>");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">24''</font><br><font color=\"blue\">\n" +
                "[48'']</font>");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_TYPE, "Hex");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_EFFECT, "The target's attacks cannot receive Strength bonuses from its Close Combat Weapons. Mundane Shooting Weapons wielded by the target unit suffer -1 Strength. Note that this spell only affects a model’s equipment and its Strength, not any special rules.");

        ContentValues alchemyItem8 = new ContentValues();
        alchemyItem8.put(SpellsTableContract.COL_SPELL_NUMBER, "6");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_NAME, "Silver Spike");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_VALUE, "10+");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_EFFECT, "The target gains Magical Attacks, Flaming Attacks, and Armour Piercing (+1).");

        SQLiteDatabase writableDatabase = dbSpells.getWritableDatabase();
        writableDatabase.beginTransaction();
        writableDatabase.insert("alchemy_spells", null, alchemyItem1);
        writableDatabase.insert("alchemy_spells", null, alchemyItem2);
        writableDatabase.insert("alchemy_spells", null, alchemyItem3);
        writableDatabase.insert("alchemy_spells", null, alchemyItem4);
        writableDatabase.insert("alchemy_spells", null, alchemyItem5);
        writableDatabase.insert("alchemy_spells", null, alchemyItem6);
        writableDatabase.insert("alchemy_spells", null, alchemyItem7);
        writableDatabase.insert("alchemy_spells", null, alchemyItem8);
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();


    }

//        //SpellDBHelper handler = new SpellDBHelper(this);
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursorAlchemy = db.rawQuery(SpellsTableContract.TABLE_ALCHEMY, null);
//    }

    //Cursor cursorDivination = db.rawQuery("magicpaths.db", new String[]{SpellsTableContract.TABLE_DIVINATION});

//STARA METODA
//    public Cursor getAllItemAlchemy(SQLiteDatabase db) {
//        Cursor cursorAlchemy = getReadableDatabase().query(SpellsTableContract.TABLE_ALCHEMY,
//                new String[]
//                        {
//                                SpellsTableContract._ID,
//                                SpellsTableContract.COL_SPELL_NUMBER,
//                                SpellsTableContract.COL_SPELL_NAME,
//                                SpellsTableContract.COL_SPELL_VALUE,
//                                SpellsTableContract.COL_SPELL_RANGE,
//                                SpellsTableContract.COL_SPELL_TYPE,
//                                SpellsTableContract.COL_SPELL_EFFECT
//                        }, null, null, null, null, null);
//        return cursorAlchemy;
//    }


}
