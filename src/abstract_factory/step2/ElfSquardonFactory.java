package abstract_factory.step2;

import abstract_factory.step3.ElfArcher;
import abstract_factory.step3.ElfMage;
import abstract_factory.step3.ElfWarrior;
import abstract_factory.step1.Archer;
import abstract_factory.step1.Mage;
import abstract_factory.step1.SquardonFactory;
import abstract_factory.step1.Warrior;

public class ElfSquardonFactory extends SquardonFactory {
    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}