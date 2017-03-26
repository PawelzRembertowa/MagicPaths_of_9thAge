package com.example.kraken.magicpaths.spell_database;

import android.provider.BaseColumns;

/**
 * Created by Kraken on 2017-03-23.
 */

public class SpellsTableContract implements BaseColumns{



        //Nazwa tablicy
        public static final String TABLE_ALCHEMY = "alchemy_spells";
        public static final String TABLE_COSMOLOGY = "alchemy_spells";
        public static final String TABLE_DIVINATION = "alchemy_spells";
        public static final String TABLE_DRUIDISM = "alchemy_spells";
        public static final String TABLE_EVOCATION = "alchemy_spells";
        public static final String TABLE_OCCULTISM = "alchemy_spells";
        public static final String TABLE_PYROMANCY = "alchemy_spells";
        public static final String TABLE_SHAMANISM = "alchemy_spells";
        public static final String TABLE_THAUMATURGY = "alchemy_spells";
        public static final String TABLE_WITCHCRAFT = "alchemy_spells";

        //Teraz kolumny
        public static final String COL_SPELL_NUMBER = "number";
        public static final String COL_SPELL_NAME = "name";
        public static final String COL_SPELL_VALUE = "value";
        public static final String COL_SPELL_RANGE = "range";
        public static final String COL_SPELL_TYPE = "type";
        public static final String COL_SPELL_DURATION = "duration";
        public static final String COL_SPELL_EFFECT = "number";

        //kolumna Tabeli Cosmology

        public static final String COL_SPELL_COSMOS_TYPE = "spellComosType";
        public static final String COL_SPELL_CHAOS_TYPE = "spellChaosType";
        public static final String COL_SPELL_ALL_TYPE = "spellAllType";
        //public static final String COL_SPELL_DURATION = "spellDuration";
        public static final String COL_SPELL_COSMOS_DURATION = "spellCosmosDuration";
        public static final String COL_SPELL_CHAOS_DURATION = "spellChaosDuration";
        public static final String COL_SPELL_COSMOS_EFFECT = "spellCosmosEffect";
        public static final String COL_SPELL_CHAOS_EFFECT = "spellChaosEffect";

//        //Create tables statements
//        private static final String CREATE_TABLE_ALCHEMY = "CREATE ALCHEMY" +
//                TABLE



}
// String[] spellNumber = {};
//String[] spellName = {};
//    String[] spellValue = {};
//    String[] spellRange = {};
//    String[] spellType = {};
//    String[] spellDuration = {};
//    String[] spellEffect = {};
//
//    public Button button_alchemy;
//    public Button button_cosmology;
//    public Button button_divination;
//    public Button button_druidism;
//    public Button button_evocation;
//    public Button button_occultism;
//    public Button button_pyromancy;
//    public Button button_shamanism;
//    public Button button_thaumaturgy;
//    public Button button_witchcraft;