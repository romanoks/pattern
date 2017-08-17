package abstract_factory;

import abstract_factory.step1.Archer;
import abstract_factory.step1.Mage;
import abstract_factory.step1.SquardonFactory;
import abstract_factory.step1.Warrior;
import abstract_factory.step2.ElfSquardonFactory;

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