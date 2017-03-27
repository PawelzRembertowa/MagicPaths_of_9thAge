package com.example.kraken.magicpaths.spell_database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Kraken on 2017-03-23.
 */

public class SpellDBHelper extends SQLiteOpenHelper {

    //Nazwa bazy danych
    public static final String DB_NAME = "magicpaths.db";

    //Wersja bazy danych
    public static int DB_VERSION = 2;

    public SpellDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    private static String createTableAlchemy = "CREATE TABLE " + SpellsTableContract.TABLE_ALCHEMY + " (" +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

    private static String createTableCosmology = "CREATE TABLE " + SpellsTableContract.TABLE_COSMOLOGY + " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_COSMOS_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_CHAOS_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_ALL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_COSMOS_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_CHAOS_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_COSMOS_EFFECT + " TEXT, "+
            SpellsTableContract.COL_SPELL_CHAOS_EFFECT + " TEXT)";

    private static String createTableDivination = "CREATE TABLE " + SpellsTableContract.TABLE_DIVINATION + " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

    private static String createTableDruidism = "CREATE TABLE " + SpellsTableContract.TABLE_DRUIDISM + " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

    private static String createTableEvocation = "CREATE TABLE " + SpellsTableContract.TABLE_EVOCATION + " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

    private static String createTableOccultism = "CREATE TABLE " + SpellsTableContract.TABLE_OCCULTISM + " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

    private static String createTablePyromancy = "CREATE TABLE " + SpellsTableContract.TABLE_PYROMANCY + " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

    private static String createTableShamanism = "CREATE TABLE " + SpellsTableContract.TABLE_SHAMANISM+ " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

    private static String createTableThaumaturgy = "CREATE TABLE " + SpellsTableContract.TABLE_THAUMATURGY+ " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

    private static String createTableWitchcraft = "CREATE TABLE " + SpellsTableContract.TABLE_WITCHCRAFT + " ( " +
            SpellsTableContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            SpellsTableContract.COL_SPELL_NUMBER + " TEXT, "+
            SpellsTableContract.COL_SPELL_NAME + " TEXT, "+
            SpellsTableContract.COL_SPELL_VALUE + " TEXT, "+
            SpellsTableContract.COL_SPELL_RANGE + " TEXT, "+
            SpellsTableContract.COL_SPELL_TYPE + " TEXT, "+
            SpellsTableContract.COL_SPELL_DURATION + " TEXT, "+
            SpellsTableContract.COL_SPELL_EFFECT + " TEXT)";

//        WIZARD_MASTER i WIZARD_APRENTICE JESZCZE BEDZIE POTRZEBNY SZABLON

    //w czasie otwierania apki tworzymy nasze tabele z arkanami magii
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(createTableAlchemy);
        db.execSQL(createTableCosmology);
        db.execSQL(createTableDivination);
        db.execSQL(createTableDruidism);
        db.execSQL(createTableEvocation);
        db.execSQL(createTableOccultism);
        db.execSQL(createTablePyromancy);
        db.execSQL(createTableShamanism);
        db.execSQL(createTableThaumaturgy);
        db.execSQL(createTableWitchcraft);

    }

    public Cursor getAllItemAlchemy() {
        Cursor cursorAlchemy = getReadableDatabase().query(SpellsTableContract.TABLE_ALCHEMY,
                new String[]
                        {
                                SpellsTableContract._ID,
                                SpellsTableContract.COL_SPELL_NUMBER,
                                SpellsTableContract.COL_SPELL_NAME,
                                SpellsTableContract.COL_SPELL_VALUE,
                                SpellsTableContract.COL_SPELL_RANGE,
                                SpellsTableContract.COL_SPELL_TYPE,
                                SpellsTableContract.COL_SPELL_EFFECT
                        }, null, null, null, null, null);
        return cursorAlchemy;
    }


//Jesli zajda jakies zmiany w bazie to po to jest ta metoda by wykasowala stara i wstawila nowa
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Narazie musi byc cokolwiek, by sie kompilowalo, TU CZEKA NAS ZMIANA
        db.execSQL("DROP TABLE IF EXISTS " + SpellsTableContract.TABLE_ALCHEMY);
        onCreate(db);
    }
}
//
