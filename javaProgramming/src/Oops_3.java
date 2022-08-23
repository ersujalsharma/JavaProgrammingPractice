public class Oops_3 {
    public static class Person{
        String name;
        int age;
        void sayHi(){
            System.out.println(name+age+"SayHI");
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "Sujal";
        person2.name = "Dharmendra";
        person1.age = 21;
        person2.age = 29;
        person1.sayHi();
        person2.sayHi();
        swap(person1, person2);
        person1.sayHi();
        person2.sayHi();
    }
    public static void swap(Person psn1,Person psn2){
       int age = psn1.age; // 
        psn1.age = psn2.age;
        psn2.age = age;
    }
}
