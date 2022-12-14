public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задание 1");
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("ФИО сотрудника " + fullName);

    }

    public static void task2() {
        System.out.println("\nЗадание 2");
        String fullName = "Иванов Иван Иванович";
        System.out.println("ФИО сотрудника " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("\nЗадание 3");
        String fullName = "Иванов Семён Семёнович";
        String repFullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника " + repFullName);

    }
}