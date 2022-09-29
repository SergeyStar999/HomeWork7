public class Main {
    public static void main(String[] args) {

        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //Задание 2
        System.out.println(fullName.toUpperCase());

        //Задание 3
        String fullName_2 = "Иванов Семён Семёнович";
        String fullName_3 = fullName_2.replace("ё", "е");
        System.out.println(fullName_3);
    }
}