package eddinho.gof.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;

    //Criar um construtor privado para garantir que ninguém instancie essa classe
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
