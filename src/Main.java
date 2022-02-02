public class Main {

    public static void main(String[] args) {
        // вводные данные
        int amount = 1100;
        int balance = 100;
        int amount2 = 100;
        int balance2 = 100;
        boolean payment = true;

        // Логика
        int percent;
        if (payment) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = amount  / 100 * percent;
        if (bonus > 100) {
            bonus = 0;
        }
        int generalBalance = amount + balance;

        int bonus2 = amount2 / 100 * percent;
        if (bonus2 <= 100) {
            bonus2 = 0;
        }
        int generalBalance2 = amount2 + balance2;

        System.out.println("Бонус за пополнение счета: " + bonus);
        System.out.println("Баланс клиента вместе с пополнением: " + (generalBalance + bonus));
        System.out.println("Бонус за пополнение счета клиента 2: " + bonus2);
        System.out.println("Баланс клиента вместе с пополнением клиента 2: " + (generalBalance2 + bonus2));
    }
}