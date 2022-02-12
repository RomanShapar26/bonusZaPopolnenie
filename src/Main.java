public class Main {

    public static void main(String[] args) {

        int balance = 100;
        int amount = 1350;

        int percent;
        if (amount >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = amount / 100 * percent;
        int generalBalance = balance + amount + bonus;
        System.out.println("Бонус за пополнение:" + bonus);
        System.out.println("Бонус за пополнение:" + generalBalance);


    }

}