public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Человек совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Человек не достиг совершеннолетия, нужно немного подождать");
        }
    }
}