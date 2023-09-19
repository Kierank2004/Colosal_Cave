class Weapons{
    private String weaponName;
    private int attackDamage;
    private int attackSpeed;
    public Weapons(String weaponName, int attackDamage, int attackSpeed){
        this.weaponName = weaponName;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }
    public String getWeaponName(){
        return weaponName;
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public int getAttackSpeed(){
        return attackSpeed;
    }
}

class vampireknife extends Weapons{
    public vampireknife(String weaponName, int attackDamage, int attackSpeed){
        super(weaponName, attackDamage, attackSpeed);
        weaponName = "Vampire Knife";
        attackDamage = 15;
        attackSpeed = 3;
    }
}