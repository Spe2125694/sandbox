package org.example.inheritance.animal;

public class Reptile extends Animal {

    public void setAge(int age) {
        this.age = age + 10;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reptile {");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
