package org.example.inheritance.animal;

public abstract class Animal implements HighOrderBehaviors {

    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    /*  annotation '@Override' is a marker. Tells the compiler this method overrides the
        object class (parent class). The object class is the parent class of all classes.
     */
    @Override
    public void breathe() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void mate() {

    }

    @Override
    public void call() {

    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal {");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
