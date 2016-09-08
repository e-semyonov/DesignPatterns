package com.design.patterns;

/**
 * Created by eliezers on 9/8/2016.
 */
public class Singleton {



    private static Singleton instance;


    //make the constructor private so that this class cannot be
    //instantiated
    private Singleton(){}


    public static Singleton getInstance(){
        return instance;
    }
}
