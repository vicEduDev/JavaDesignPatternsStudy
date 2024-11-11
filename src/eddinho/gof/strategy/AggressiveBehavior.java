package eddinho.gof.strategy;

public class AggressiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("The robot is moving aggressivelly");
    }
}
