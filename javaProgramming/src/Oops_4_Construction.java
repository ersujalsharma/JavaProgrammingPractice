public class Oops_4_Construction {
    public static class Person{
        String name;
        int age;
        void sayHi(){
            System.out.println(name+age+"SayHI");
        }
        Person(){

        }
        Person(int age , String name){
            this.age = age;
            this.name = name;
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
        Person person3 = new Person(25,"Deepak");
        person3.sayHi();
    }
    public static void swap(Person psn1,Person psn2){
        Person temp = new Person();
        temp = psn1;
        psn1 = psn2;
        psn2 = temp;
        psn1.sayHi(); //    swapper refrence occur in the funciotn only.
        psn2.sayHi(); // 
    }
}
