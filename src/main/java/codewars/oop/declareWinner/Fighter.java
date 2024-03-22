package codewars.oop.declareWinner;
public class Fighter {
    public String name;
    public int health;

    public int damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public void receiveDamage(int enemyDamagePerAttack){
        this.health -= enemyDamagePerAttack;
    }

    public int getHealth(){

        return health;
    }

    public String getName(){

        return name;
    }


}
