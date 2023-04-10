public class Hero {
    WeaponController wc = new WeaponController();
    ArmorController ac = new ArmorController();
    private int HeroHP;
    private int HeroWeapon;

    public Hero() { 
        ac.getArmorStats( 0 );
        HeroHP = 50 + ac.getArmorHPBoost();
        HeroWeapon = 0; 
        wc.getWeaponStats(HeroWeapon);

    }
    public int getHeroHP() { 
        return HeroHP;
    }
}
