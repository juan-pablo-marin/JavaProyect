package proyectoJava.proyecto1.model;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public String getGreeting() {
        return "Hello";
    }

    public int[] getNumbers() {
        return new int[]{1, 2, 3};
    }

}
