public class Oops_1 {
    public static class Person{
        String name;
        int age;
        void sayHi(){
            System.out.println(name+" "+age+" "+"SayHi");
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Sujal";
        p1.age = 21;
        p1.sayHi();
        Person p2 = new Person();
        p2.name = "Dharmendra";
        p2.age = 29;
        p2.sayHi();
    }
}
