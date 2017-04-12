package com.example.kraken.magicpaths.spell_database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.kraken.magicpaths.R;

/**
 * Created by Kraken on 2017-04-03.
 */

public class SpellCursorAdapter extends CursorAdapter {

    Context context;

    public SpellCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
        this.context=context;
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.row, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView spellNumberRow = (TextView) view.findViewById(R.id.spell_number_row);
        TextView spellNameRow = (TextView) view.findViewById(R.id.spell_list_row);
        TextView spellCastingValue = (TextView) view.findViewById(R.id.casting_value_row);
        TextView spellRange = (TextView) view.findViewById(R.id.range_row);
        TextView spellType = (TextView) view.findViewById(R.id.type_row);
        TextView spellDuration = (TextView) view.findViewById(R.id.type_row);
        TextView spellEffect = (TextView) view.findViewById(R.id.effect_row);

        String numerCzaru = cursor.getString(cursor.getColumnIndexOrThrow(SpellsTableContract.COL_SPELL_NUMBER));
        String nazwaCzaru = cursor.getString(cursor.getColumnIndexOrThrow(SpellsTableContract.COL_SPELL_NAME));
        String wartoscCzaru = cursor.getString(cursor.getColumnIndexOrThrow(SpellsTableContract.COL_SPELL_VALUE));
        String zasiegCzaru = cursor.getString(cursor.getColumnIndexOrThrow(SpellsTableContract.COL_SPELL_RANGE));
        String typCzaru = cursor.getString(cursor.getColumnIndexOrThrow(SpellsTableContract.COL_SPELL_TYPE));
        String trwanieCzaru = cursor.getString(cursor.getColumnIndexOrThrow(SpellsTableContract.COL_SPELL_DURATION));
        String efektCzaru = cursor.getString(cursor.getColumnIndexOrThrow(SpellsTableContract.COL_SPELL_EFFECT));

        spellNumberRow.setText(numerCzaru);
        spellNameRow.setText(nazwaCzaru);
        spellCastingValue.setText(wartoscCzaru);
        spellRange.setText(zasiegCzaru);
        spellType.setText(typCzaru);
        spellDuration.setText(trwanieCzaru);
        spellEffect.setText(efektCzaru);

    }
}
