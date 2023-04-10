package Spells;
public class StatusEffects {
    private int effectDMG ; 
    private int effectDuration; 
    private int effectID ; 

    public StatusEffects() { 

    }
    public void getStatusEffectStats( int i ) { 
        if (i == 0) { 
            effectDMG = 1; 
            effectDuration = 3;
        }
    }
}
