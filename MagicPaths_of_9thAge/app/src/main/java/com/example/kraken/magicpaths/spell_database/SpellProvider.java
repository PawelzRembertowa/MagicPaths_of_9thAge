package com.example.kraken.magicpaths.spell_database;

/**
 * Created by Kraken on 2017-04-13.
 */

public class SpellProvider {
    private String spellNumber;
    private String spellName;
    private String spellValue;
    private String spellRange;
    private String spellType;
    private String spellDuration;
    private String spellEffect;

    public SpellProvider(String spellNumber, String spellName, String spellValue, String spellRange, String spellType, String spellDuration, String spellEffect) {
        this.spellNumber = spellNumber;
        this.spellName = spellName;
        this.spellValue = spellValue;
        this.spellRange = spellRange;
        this.spellType = spellType;
        this.spellDuration = spellDuration;
        this.spellEffect = spellEffect;
    }

    public String getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(String spellNumber) {
        this.spellNumber = spellNumber;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getSpellValue() {
        return spellValue;
    }

    public void setSpellValue(String spellValue) {
        this.spellValue = spellValue;
    }

    public String getSpellRange() {
        return spellRange;
    }

    public void setSpellRange(String spellRange) {
        this.spellRange = spellRange;
    }

    public String getSpellType() {
        return spellType;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    public String getSpellDuration() {
        return spellDuration;
    }

    public void setSpellDuration(String spellDuration) {
        this.spellDuration = spellDuration;
    }

    public String getSpellEffect() {
        return spellEffect;
    }

    public void setSpellEffect(String spellEffect) {
        this.spellEffect = spellEffect;
    }
}
