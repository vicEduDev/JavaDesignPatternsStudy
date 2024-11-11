package eddinho.gof.strategy;

public class NormalBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("The robot is moving normally");
    }

}
