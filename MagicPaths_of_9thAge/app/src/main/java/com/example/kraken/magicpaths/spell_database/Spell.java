package com.example.kraken.magicpaths.spell_database;

/**
 * Created by Kraken on 2017-03-26.
 */

public class Spell {

    private int spellId;
    public String spellNumber;
    public String spellName;
    public String spellValue;
    public String spellRange;
    public String spellType;
    public String spellDuration;
    public String spellEffect;

    public int getSpellId() { return spellId;}

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

    public void setSpellNumber(String spellNumber) {
        this.spellNumber = spellNumber;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public void setSpellValue(String spellValue) {
        this.spellValue = spellValue;
    }

    public void setSpellRange(String spellRange) {
        this.spellRange = spellRange;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    public void setSpellDuration(String spellDuration) {
        this.spellDuration = spellDuration;
    }

    public void setSpellEffect(String spellEffect) {
        this.spellEffect = spellEffect;
    }

    public Spell(String spellNumber, String spellName,
                 String spellValue, String spellRange,
                 String spellType, String spellDuration,
                 String spellEffect) {

        this.spellId = getSpellId();
        this.spellNumber = spellNumber;
        this.spellName = spellName;
        this.spellValue = spellValue;
        this.spellRange = spellRange;
        this.spellType = spellType;
        this.spellDuration = spellDuration;
        this.spellEffect = spellEffect;
    }
}


