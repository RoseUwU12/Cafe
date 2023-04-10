package Upgrades;


public class DashUpgrades {
    private double upgradeCost; 
    private int dashAmountInc;
    private int DashRechargeDec;
    
    public DashUpgrades() { 
        upgradeCost = 0; 
        dashAmountInc =0; 
        DashRechargeDec = 0; 
    }
    public void UpgradeDash( double m , Double c , int d , int i, int t) { 
        if ( t == 1 ) { 
            upgradeCost = 2; 
            dashAmountInc = 1; 
            DashRechargeDec = 0; 
        }
        c = upgradeCost;
        d = DashRechargeDec;
        i = dashAmountInc;
        m = m - c;
         
    }
    public double getUpgradeCost(){ 
        return upgradeCost;
    }
    public double getDashRechargeDec() { 
        return DashRechargeDec;
    }
    public int getDashAmountInc() { 
        return dashAmountInc;
    }
}