package abstract_factory.step3;

import abstract_factory.step1.Warrior;

public class ElfWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Attack ElfWarrior");
    }
}