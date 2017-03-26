package com.example.kraken.magicpaths.spell_database;

/**
 * Created by Kraken on 2017-03-26.
 */

public class Spell {

    private String spellNumber;
    private String spellName;
    private String spellValue;
    private String spellRange;
    private String spellType;
    private String spellDuration;
    private String spellEffect;

    public String getSpellNumber() {
        return spellNumber;
    }

    public String getSpellName() {
        return spellName;
    }

    public String getSpellValue() {
        return spellValue;
    }

    public String getSpellRange() {
        return spellRange;
    }

    public String getSpellType() {
        return spellType;
    }

    public String getSpellDuration() {
        return spellDuration;
    }

    public String getSpellEffect() {
        return spellEffect;
    }

    public Spell(String spellNumber, String spellName,
                 String spellValue, String spellRange,
                 String spellType, String spellDuration,
                 String spellEffect) {

        this.spellNumber = spellNumber;
        this.spellName = spellName;
        this.spellValue = spellValue;
        this.spellRange = spellRange;
        this.spellType = spellType;
        this.spellDuration = spellDuration;
        this.spellEffect = spellEffect;
    }
}


