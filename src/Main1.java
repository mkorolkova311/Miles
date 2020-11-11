public class Main1 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int bonus = service.calculate(price);
        System.out.println(bonus);
    }
}
