public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Кол-во бонусных миль: " + miles);
        System.out.println();
        System.out.println("Кол-во бонусных миль: " + service.calculate(20_000));
        System.out.println();
        System.out.println("Кол-во бонусных миль: " + service.calculate(40_000));
        System.out.println();
        System.out.println("Кол-во бонусных миль: " + service.calculate(80_000));
    }

}