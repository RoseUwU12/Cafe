package Spells;

public class SpellLibrary {
    private int spellCategory; 
    private int spellID; 
    private int spellType;
    
    public SpellLibrary() {

    }
    public void findSpell( int c , int i , int t) { 
        spellCategory = c ; // 7 spell categories 0. Water 1. Fire 2. Earth 3. Wind 4. Ice 5. Light 6. Dark 
        spellID = i; //42 different spell Id's (see SpellReference)
        spellType = t; // 3 spell Types 0. AOE 1. single 2. Status

    }
}
