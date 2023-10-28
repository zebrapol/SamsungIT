public class Wizard extends Unit{

    protected int mana = 100;

    public Wizard(String name) {
        super(name);
        Power = 25;
        health = 80;
    }

    @Override
    public void attack(Unit unit) {
        if(mana >= 0)
            super.attack(unit);
        mana -= 10;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", Defence=" + Defence +
                ", Power=" + Power +
                '}';
    }

    public void print(){
        System.out.println(this);
    }

    public void print(String str){
        System.out.println(str + " " +this);
    }
    public void print(int str){
        System.out.println(str + " " +this);
    }
}
