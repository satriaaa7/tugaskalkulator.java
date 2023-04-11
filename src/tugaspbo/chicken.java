package tugaspbo;

import java.util.Scanner;

public class chicken {
    private int mondayEggs;
    private int tuesdayEggs;
    private int wednesdayEggs;
    private int totalEggs;
    private double eggPrice;

    public chicken(int mondayEggs, int tuesdayEggs, int wednesdayEggs, double eggPrice) {
        this.mondayEggs = mondayEggs;
        this.tuesdayEggs = tuesdayEggs;
        this.wednesdayEggs = wednesdayEggs;
        this.totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        this.eggPrice = eggPrice;
    }

    public double getAverageDailyCollect() {
        return (double) totalEggs / 3;
    }

    public int getExpectedEggsIn30Days() {
        return totalEggs * 10;
    }

    public double getMoneyCollected() {
        return totalEggs * eggPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of eggs collected on Monday: ");
        int mondayEggs = scanner.nextInt();
        System.out.print("Enter the number of eggs collected on Tuesday: ");
        int tuesdayEggs = scanner.nextInt();
        System.out.print("Enter the number of eggs collected on Wednesday: ");
        int wednesdayEggs = scanner.nextInt();
        System.out.print("Enter the price of each egg: ");
        double eggPrice = scanner.nextDouble();

        chicken chickens = new chicken(mondayEggs, tuesdayEggs, wednesdayEggs, eggPrice);

        System.out.println("Average daily egg collection: " + chickens.getAverageDailyCollect());
        System.out.println("Expected eggs in 30 days: " + chickens.getExpectedEggsIn30Days());
        System.out.println("Money collected: $" + chickens.getMoneyCollected());
    }
}
