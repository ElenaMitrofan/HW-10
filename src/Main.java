public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Задание 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
        System.out.println("Задание 3");
        String fullName3 = "Иванов Семён Семёнович";
        String fullName4 = fullName3.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName4);



    }
}