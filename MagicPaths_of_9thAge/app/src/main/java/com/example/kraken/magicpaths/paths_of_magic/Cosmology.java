package com.example.kraken.magicpaths.paths_of_magic;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.kraken.magicpaths.R;
import com.example.kraken.magicpaths.spell_database.SpellDBHelper;
import com.example.kraken.magicpaths.spell_database.SpellsTableContract;


public class Cosmology extends AppCompatActivity {

    private SpellDBHelper dbSpells;

    public ContentValues cosmologyItem1;
    public ContentValues cosmologyItem2;
    public ContentValues cosmologyItem3;
    public ContentValues cosmologyItem4;
    public ContentValues cosmologyItem5;
    public ContentValues cosmologyItem6;
    public ContentValues cosmologyItem7;

    public void addCosmologyToDB() {

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

        cosmologyItem2 = new ContentValues();
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_NUMBER, "1");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_NAME, "Touch the Heart");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_VALUE, "7+ <font color=\"brown\">{5+}</brown>");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_ALL_TYPE, " ");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, "Focused\n<b>Augment</b>");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, "Focused\n<b>Hex\nDirect\nDamage</b>");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, " ");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, " ");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "The target <b>Recovers</b> 1 Wound.");
        cosmologyItem2.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "The target suffers <b>1 hit that automatically wounds</b> with Armour Piercing (6).");

        cosmologyItem3 = new ContentValues();
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_NUMBER, "2");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_NAME, "Mind Games");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_VALUE, "7+ <font color=\"brown\">{5+}</brown>");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_ALL_TYPE, " ");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, "<b>Augment</b>");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, "<b>Hex</b>");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_DURATION, "Remains in Play");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, " ");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, " ");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "The target gains <b>+1</b> Leadership.");
        cosmologyItem3.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "The target suffers <b>-1</b> Leadership.");

        cosmologyItem4 = new ContentValues();
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_NUMBER, "3");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_NAME, "Truth of Time");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_VALUE, "9+ <font color=\"brown\">{7+}</brown>");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_ALL_TYPE, " ");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, "<b>Augment</b>");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, "<b>Hex</b>");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, " ");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, " ");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "When the target rolls a Charge Range, Flee Distance, Pursuit Distance or Overrun Distance, it rolls an additional D6.");
        cosmologyItem4.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "When the target rolls a Charge Range, Flee Distance, Pursuit Distance or Overrun Distance, it rolls one less D6 than normal.");

        cosmologyItem5 = new ContentValues();
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_NUMBER, "4");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_NAME, "Ice and Fire");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_VALUE, "9+ <font color=\"brown\">{7+}</brown>");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_ALL_TYPE, "Hex\nMissile\nDamage");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, " ");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, " ");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_DURATION, "Instant");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, " ");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, " ");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "The target suffers 2D6 Strength 3 hits with <b>Flaming Attacks and Divine Attacks.</b>");
        cosmologyItem5.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "The target suffers 2D6 Strength 3 hits with <b>Armour Piercing (3).</b>");

        cosmologyItem6 = new ContentValues();
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_NUMBER, "5");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_NAME, "Perception of Strength");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_VALUE, "10+ <font color=\"brown\">{8+}</brown>");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_ALL_TYPE, " ");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, "<b>Augment</b>");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, "<b>Hex</b>");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_DURATION, "Last one Turn");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, " ");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, " ");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "The target gains <b>+1</b> Strength.");
        cosmologyItem6.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "The target suffers <b>-1</b> Strength.");

        cosmologyItem7 = new ContentValues();
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_NUMBER, "6");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_NAME, "Unity in Divergence");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_VALUE, "11+ <font color=\"brown\">{9+}</brown>");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_RANGE, "18''");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_ALL_TYPE, " ");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_COSMOS_TYPE, "<b>Augment</b>");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_CHAOS_TYPE, "<b>Hex\nDirect\nDamage</b>");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_DURATION, " ");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_COSMOS_DURATION, "<b>Last one Turn</b>");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_CHAOS_DURATION, "<b>Instant</b>");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_COSMOS_EFFECT, "All models in the target unit <b>gain a Ward Save (5+).</b>");
        cosmologyItem7.put(SpellsTableContract.COL_SPELL_CHAOS_EFFECT, "Each model in the target unit <b>suffers a Strength 3 hit.</b>");

        dbSpells.getAllItemCosmology();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmology);




    }
}
