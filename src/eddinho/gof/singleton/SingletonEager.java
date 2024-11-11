package eddinho.gof.singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    //Criar um construtor privado para garantir que ninguém instancie essa classe
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        if(instance == null){
            instance = new SingletonEager();
        }
        return instance;
    }
}