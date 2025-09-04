import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.moneyRUB = 0.0;
            user.flagScoreRUB = 1;
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyUSD = 0.0;
            user.flagScoreUSD = 1;
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyEUR = 0.0;
            user.flagScoreEUR = 1;
        }


        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.flagScoreRUB == 1)
            System.out.println("- RUB");

        if (user.flagScoreUSD == 1)
            System.out.println("- USD");

        if (user.flagScoreEUR == 1)
            System.out.println("- EUR");
    }
}

class PersonAccount {
    String name;      // имя и фамилия
    double moneyRUB; // счёт в рублях
    short flagScoreRUB;
    double moneyUSD; // счёт в долларах
    short flagScoreUSD;
    double moneyEUR; // счёт в евро
    short flagScoreEUR;


    PersonAccount(String userName) {
        name = userName;
    }
}