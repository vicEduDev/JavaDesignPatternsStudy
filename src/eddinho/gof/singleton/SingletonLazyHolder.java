package eddinho.gof.singleton;

public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    //Criar um construtor privado para garantir que ninguém instancie essa classe
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
