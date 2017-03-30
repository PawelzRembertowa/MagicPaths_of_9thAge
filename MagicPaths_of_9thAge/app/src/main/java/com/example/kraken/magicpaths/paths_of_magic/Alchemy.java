package com.example.kraken.magicpaths.paths_of_magic;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kraken.magicpaths.R;
import com.example.kraken.magicpaths.spell_database.SpellDBHelper;
import com.example.kraken.magicpaths.spell_database.SpellsTableContract;


public class Alchemy extends AppCompatActivity {

    private SpellDBHelper dbSpells;

    public ContentValues alchemyItem1;
    public ContentValues alchemyItem2;
    public ContentValues alchemyItem3;
    public ContentValues alchemyItem4;
    public ContentValues alchemyItem5;
    public ContentValues alchemyItem6;
    public ContentValues alchemyItem7;
    public ContentValues alchemyItem8;

    public void addAlchemyToDB() {

        alchemyItem1 = new ContentValues();
        alchemyItem1.put(SpellsTableContract.COL_SPELL_NUMBER, "A");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_NAME, "Alchemical Fire");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_VALUE, " ");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_TYPE, "Hex");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_DURATION, "Lasts one Turn");
        alchemyItem1.put(SpellsTableContract.COL_SPELL_EFFECT, "The target gains Flammable against Close Combat Attacks and Spells.");

        alchemyItem2 = new ContentValues();
        alchemyItem2.put(SpellsTableContract.COL_SPELL_NUMBER, "0");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_NAME, "Quicksilver Lash");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_VALUE, "8+");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_RANGE, "24''");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_TYPE, "Hex Missile Damage");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        alchemyItem2.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers D3+1 hits with Metalshifting.");

        alchemyItem3 = new ContentValues();
        alchemyItem3.put(SpellsTableContract.COL_SPELL_NUMBER, "1");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_NAME, "Word of Iron");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">6+</font><font color=\"blue\">\n" +
                "[9+]</font>");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_RANGE, "24''");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        alchemyItem3.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers <font color=\"red\">2D6</font> <font color=\"blue\">[3D6]</font> Strength 2 hits with Armour Piercing (3) and Flaming Attacks.");

        alchemyItem4 = new ContentValues();
        alchemyItem4.put(SpellsTableContract.COL_SPELL_NUMBER, "2");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_NAME, "Molten Copper");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">7+</font><font color=\"blue\">\n" +
                "[10+]</font>");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_RANGE, "24''");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_TYPE, "Hex Missile Damage");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        alchemyItem4.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers <font color=\"red\">2D6</font> <font color=\"blue\">[3D6]</font> Strength 2 hits with Armour Piercing (3) and Flaming Attacks.");

        alchemyItem5 = new ContentValues();
        alchemyItem5.put(SpellsTableContract.COL_SPELL_NUMBER, "3");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_NAME, "Silver Spike");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">7+</font><font color=\"blue\">\n" +
                "[10+]</font>");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">18''</font><br><font color=\"blue\">\n" +
                "[36'']</font>");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_TYPE, "Hex Missile Damage");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        alchemyItem5.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers one hit with Strength 3[6], Armour Piercing (6), Multiple Wounds (D3), and Penetrating.");

        alchemyItem6 = new ContentValues();
        alchemyItem6.put(SpellsTableContract.COL_SPELL_NUMBER, "4");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_NAME, "Corruption of Tin");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">8+</font>\n" +
                "<font color=\"blue\">[11+]</font>");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">24''</font><br><font color=\"blue\">\n" +
                "[48'']</font>");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_TYPE, "Hex");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_DURATION, "Permanent");
        alchemyItem6.put(SpellsTableContract.COL_SPELL_EFFECT, "The target suffers -1 to its Armour Save.");

        alchemyItem7 = new ContentValues();
        alchemyItem7.put(SpellsTableContract.COL_SPELL_NUMBER, "5");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_NAME, "Transmutation to Lead");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_VALUE, "<font color=\"red\">9+</font>\n" +
                "<font color=\"blue\">[12+]</font>");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_RANGE, "<font color=\"red\">24''</font><br><font color=\"blue\">\n" +
                "[48'']</font>");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_TYPE, "Hex");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        alchemyItem7.put(SpellsTableContract.COL_SPELL_EFFECT, "The target's attacks cannot receive Strength bonuses from its Close Combat Weapons. Mundane Shooting Weapons wielded by the target unit suffer -1 Strength. Note that this spell only affects a model’s equipment and its Strength, not any special rules.");

        alchemyItem8 = new ContentValues();
        alchemyItem8.put(SpellsTableContract.COL_SPELL_NUMBER, "6");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_NAME, "Silver Spike");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_VALUE, "10+");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_TYPE, "Augment");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        alchemyItem8.put(SpellsTableContract.COL_SPELL_EFFECT, "The target gains Magical Attacks, Flaming Attacks, and Armour Piercing (+1).");


        dbSpells.getWritableDatabase().insert("alchemy_spells", null, alchemyItem1);
        dbSpells.getWritableDatabase().insert("alchemy_spells", null, alchemyItem2);
        dbSpells.getWritableDatabase().insert("alchemy_spells", null, alchemyItem3);
        dbSpells.getWritableDatabase().insert("alchemy_spells", null, alchemyItem4);
        dbSpells.getWritableDatabase().insert("alchemy_spells", null, alchemyItem5);
        dbSpells.getWritableDatabase().insert("alchemy_spells", null, alchemyItem6);
        dbSpells.getWritableDatabase().insert("alchemy_spells", null, alchemyItem7);
        dbSpells.getWritableDatabase().insert("alchemy_spells", null, alchemyItem8);

        dbSpells.getAllItemAlchemy();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alchemy);



    }


}
