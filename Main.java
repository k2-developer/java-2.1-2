public class Main {
    public static void main(String[] args) {
        int clientCurrentBalance = 100;
        int depositValue = 5000;
        int totalBonus;
        if (depositValue >= 1000) {
            clientCurrentBalance = clientCurrentBalance + depositValue / 100;
            totalBonus = depositValue / 100;
        } else {
            clientCurrentBalance = 100;
            totalBonus = 0;
        }
        System.out.println("Total bonus: " + totalBonus);


    }
}