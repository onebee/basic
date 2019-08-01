package day27;

public interface test {


    default void hello() {

        System.out.println("hello this is a interface with method body");
    }

    static void world() {
        System.out.println("this is static method from interface");
    }



}
