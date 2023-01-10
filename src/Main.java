public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +age+ ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " +age+ ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature >= 5) {
            System.out.println("На улице " +temperature+ " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " +temperature+ " градусов, нужно надеть шапку");;
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " +speed+ ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " +speed+ ", то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 18;
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        else {if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 4;
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        else {
            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            }
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            }
         }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int capasity = 120;
        int sittingPlace = 60;
        int ticketNumber = 121;
        if (ticketNumber > capasity)        {
            System.out.println("Мест нет");
        }
            else {
        if (ticketNumber <= sittingPlace) {
            System.out.println("Номер билета " + ticketNumber + ", сидячее место");
        }
        else  {
            System.out.println("Номер билета " + ticketNumber + ", стоячее место");
         }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 10;
        int two = 15;
        int three = 8;
        boolean oneLessTwo = one < two;
        if (oneLessTwo) {
            System.out.println("Первое число " +one+ " меньше второго " +two);
        }
        else  {
            System.out.println("Первое число " +one+ " больше второго " +two);
        }
        boolean twoLessThree = two < three;
        if (twoLessThree) {
            System.out.println("Второе число " +two+ " меньше третьего " +three);
        }
        else  {
            System.out.println("Второе число " +two+ " больше третьего " +three);
        }
        boolean oneLessThree = one < three;
        if (oneLessThree) {
            System.out.println("Первое число " +one+ " меньше третьего " +three);
        }
        else  {
            System.out.println("Первое число " +one+ " больше третьего " +three);
        }
    }
}