package org.example.inheritance.animal;

public abstract class Animal {

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
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal {");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}
