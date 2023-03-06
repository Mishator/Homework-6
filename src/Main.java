public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

}