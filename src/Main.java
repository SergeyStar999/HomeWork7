import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " +   fullName.toUpperCase());

        //Задание 3
        String fullName_2 = "Иванов Семён Семёнович";
        String fullName_3 = fullName_2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName_3);
    }
}