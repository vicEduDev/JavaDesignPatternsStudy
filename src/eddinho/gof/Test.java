package eddinho.gof;

import eddinho.gof.facade.Facade;
import eddinho.gof.singleton.*;
import eddinho.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao Desing Pattern Singleton
        SingletonLazy sLazy = SingletonLazy.getInstance();
        System.out.println(sLazy);

        SingletonEager sEager = SingletonEager.getInstance();
        System.out.println(sEager);

        SingletonLazyHolder sHolder = SingletonLazyHolder.getInstance();
        System.out.println(sHolder);


        //Testes relacionados ao Desing Pattern Strategy
        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setStrategy(normal);
        robot.move();
        robot.setStrategy(aggressive);
        robot.move();
        robot.setStrategy(defensive);
        robot.move();
        

        //Testes relacionados ao Desing Pattern Facade
        Facade facade = new Facade();
        facade.migrateClient("Victor", "12345678");
    }
}
