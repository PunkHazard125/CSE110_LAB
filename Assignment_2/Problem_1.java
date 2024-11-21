import java.util.*;

public class Problem_1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Stock stock_1 = new Stock("ORCL", "Oracle Corporation");
        stock_1.previousClosingPrice = 34.5;
        stock_1.currentPrice = 34.35;

        System.out.printf("Price change in percentage is: %.2f\n", stock_1.getChangePercent());

        scanner.close();
    }
    
}

class Stock {

    private String sybmol;
    private String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol, String name) {

        this.sybmol = symbol;
        this.name = name;

    }

    public double getChangePercent() {

        double result = ((Math.abs(this.currentPrice - this.previousClosingPrice)) / this.previousClosingPrice) * 100.00;
        return result;

    }

}
