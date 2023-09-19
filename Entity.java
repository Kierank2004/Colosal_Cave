class Entity{
    private String name;
    public int health;
    private int attackDamage;
    private int attackSpeed;
    private int armour;    
    private int expereince;
    
    public Entity(String name, int health, int attackDamage, int attackSpeed, int armour, int expereince){
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.armour = armour;
        this.expereince = expereince;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public int getAttackSpeed(){
        return attackSpeed;
    }
    public int getArmour(){
        return armour;
    }
    public int getExpereince(){
        return expereince;
    }

    public int attackMonster(){
        return attackDamage;
    }
}
class Monster extends Entity {
    private String type;
    private int gainedExpereince;

    public Monster(String name, String type, int health, int attackDamage, int attackSpeed, int armour, int expereince) {
        super(name, health, attackDamage, attackSpeed, armour, expereince); 
        this.type = type;
        this.gainedExpereince = 0;
    }
    public String getType(){
        return type;
    }
    public int getExpereince(){
        return gainedExpereince;
    }
}