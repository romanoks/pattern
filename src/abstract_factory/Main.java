package abstract_factory;

public class Main {

    public void createSquadron (SquardonFactory factory) {
        Mage mage = factory.createMage();
        mage.cast();
        Archer archer = factory.createArcher();
        archer.shoot();
        Warrior warrior = factory.createWarrior();
        warrior.attack();
    }

    public static void main(String [] args){
        Main main = new Main();
        main.createSquadron(new ElfSquardonFactory());
    }
}