public class WeaponController { 
    ArmorController Ac = new ArmorController();
    private int weaponType; 
    private int weaponDMG; 
    private double critChance; 
    private double critMul; 
    private int magicType; 
    private int magicDMG;

    public WeaponController() { 

    }

    public void getWeaponStats(int w ) { 
        Ac.getArmorStats( 1 );
        if ( w == 0 ){ //! weapon = fists
            weaponDMG = 1 + Ac.getArmorDMGBoost(); 
            critChance = 0.3;
            critMul = 0.5;
            magicType = 0; 
            magicDMG = 0; 
        }
        else if ( w == 1) { 
            weaponDMG = 3 + Ac.getArmorDMGBoost();
            critChance = 0.5;
            critMul = 1 ; 
            magicType = 0; 
            magicDMG = 0; 
        }
        else if ( w == 2) { 
            weaponDMG = 5 + Ac.getArmorDMGBoost();
            critChance = 0.23;
            critMul = 1.25 ; 
            magicType = 1; 
            magicDMG = 3;
        }
        else { 
            weaponDMG = 1 + Ac.getArmorDMGBoost();
            critChance =  0.99; 
            critMul = 1;
            magicType = 0; 
            magicDMG = 0;
        }
    }
    public int getWeaponDMG() { 
        return weaponDMG;
    }
    public double getCritChance() { 
        return critChance;
    }
    public double getCritMul() { 
        return critMul;
    }
    public int getMagicType() { 
        return magicType;
    }
    public int getMagicDMG() { 
        return magicDMG;
    }
}