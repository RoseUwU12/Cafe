public class ArmorController {
    private int armorType; 
    private int armorHPBoost; 
    private int armorDMGBoost; 
    private int armorMPBoost;
    private int armorDEF;

    public ArmorController() { 
        
    }

    public void getArmorStats(int a){
        if( a == 0) { 
            armorDEF = 0; 
            armorDMGBoost = 1; 
            armorMPBoost = 0; 
            armorHPBoost = 0; 
        }
        else if ( a == 1) { 
            armorDEF = 1; 
            armorDMGBoost = 2; 
            armorHPBoost = 10;
            armorMPBoost = 3; 
        }
        else { 
            armorDEF = 1; 
            armorDMGBoost = 3; 
            armorHPBoost = 30; 
            armorMPBoost = 5;
        }
    }
    
    public int getArmorType(){
        return armorType;
    }

    public int getArmorHPBoost(){ 
        return armorHPBoost;
    } 

    public int getArmorDMGBoost(){
        return armorDMGBoost;
    }
    
    public int getArmorMPBoost(){
        return  armorMPBoost;
    }

    public int getArmorDEF(){
        return armorDEF;
    }
}
