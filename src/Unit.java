public class Unit {
    protected String name;
//    protected String surname = "Jibolla";
    public Unit(String name) {
        Game.countOfUnits++;
        this.name = name;
    }
//    public Unit(String name, String surname){
//        this.name = name;
//        this.name = surname;
//    }

    protected int health = 100;
    protected int Defence = 100;
    protected int Power = 10;

    protected float CriticalChance = 0.1f;
    protected float ParryChance = 0.1f;

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public int getDefence() {
        return Defence;
    }

    public void setDefence(int defence) {
        Defence = defence;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public float getCriticalChance() {
        return CriticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        CriticalChance = criticalChance;
    }

    public float getParryChance() {
        return ParryChance;
    }

    public void setParryChance(float parryChance) {
        ParryChance = parryChance;
    }
    //Damage////////////////////////////////////////////////////
    public void attack(Unit unit){
        unit.GetDamage(Power);
    }
    public void GetDamage(int damage){
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", Defence=" + Defence +
                ", Power=" + Power +
                '}';
    }
}
