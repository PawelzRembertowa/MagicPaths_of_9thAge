package com.example.kraken.magicpaths.spell_database;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by Kraken on 2017-04-13.
 */

public class SpellDataAdapter extends ArrayAdapter {
    public SpellDataAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }
}
