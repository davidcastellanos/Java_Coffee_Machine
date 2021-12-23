
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        Person temporary = new Person();
        temporary.name = p1.name;
        temporary.age = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = temporary.name;
        p2.age = temporary.age;


    }
}