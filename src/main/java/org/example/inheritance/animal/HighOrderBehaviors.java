package org.example.inheritance.animal;

public interface HighOrderBehaviors {

    String value = "";

    void breathe();
    void eat();
    void sleep();
    void mate();
    void call();

    default boolean living() {
        return false;
    }
}
