class Traps{
    private String trapName;
    private int trapDamage;
    private int trapFireRate;
    public Traps( String trapName,int trapDamage, int trapFireRate ){
        this.trapName = trapName;
        this.trapDamage = trapDamage;
        this.trapFireRate = trapFireRate;
    }
    public String getTrapname()  {
        return this.trapName;
    }
    public int getTrapdamage(){
        return this.trapDamage;
    }
    public int getTrapfirerate(){
        return this.trapFireRate;
    }
}