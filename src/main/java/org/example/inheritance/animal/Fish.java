package org.example.inheritance.animal;

public class Fish extends Animal {

    public void swim() {

        System.out.println("Just keep swimming.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fish {");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
