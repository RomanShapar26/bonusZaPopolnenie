public class Main {

    public static void main(String[] args) {

        // Входные данные
        // На момент пополнения у клиента на счету 100 рублей

        int amount = 1500;
        boolean isRegistered = true;

        // Логика

        int percent;
        if (amount >= 1000) {
            percent = 1;    // за каждые 100 рублей
        } else {
            percent = 0;
        }

        int bonus = amount / 100 * percent;

        if (amount > 1000) {
            bonus = amount / 100 * 1;
        }

        int generalBalance = 100 + amount + bonus;


        System.out.println("Бонус за пополнение:" + bonus);
        System.out.println("Бонус за пополнение:" + generalBalance);


    }

}