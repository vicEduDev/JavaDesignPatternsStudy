package eddinho.gof.strategy;

public class DefensiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("The robot is moving defensivelly");
    }
}
