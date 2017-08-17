package abstract_factory.step3;

import abstract_factory.step1.Archer;

public class ElfArcher implements Archer {

    @Override
    public void shoot() {
        System.out.println("Shoot ElfArcher");
    }
}