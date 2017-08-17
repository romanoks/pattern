package abstract_factory.step3;

import abstract_factory.step1.Mage;

public class ElfMage implements Mage {
    @Override
    public void cast() {
        System.out.println("Cast ElfMage!");
    }
}