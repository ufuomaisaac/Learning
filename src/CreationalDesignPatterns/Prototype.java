package DesignPatterns;
class Person implements Cloneable {
    public String FirstName;
    public String LastName;

    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
public class Prototype {
    public static void main (String[] args) {
        Person p1 = new Person();
        p1.FirstName = "John";
        p1.LastName = "Smith";

        try {
            Person p2 = p1.clone();
            System.out.println(p2.FirstName + " " + p2.LastName);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
