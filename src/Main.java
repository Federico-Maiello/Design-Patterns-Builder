public class Main {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder("John", "Doe")
                .age(30)
                .address("123 Main Street")
                .build();

        Person person2 = new PersonBuilder("Jane", "Smith")
                .age(25)
                .build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
