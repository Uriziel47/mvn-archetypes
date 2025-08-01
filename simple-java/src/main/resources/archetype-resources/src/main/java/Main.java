package ${package};

public class Main {

    public static void main(String... args) throws Exception {
        System.out.println("Hello World!");
        var human = SimpleEntity.builder()
                .givenName("John")
                .familyName("Doe")
                .build();

        System.out.println("And shout out to '" + human.name() + "'.");
    }
}
