package functional_reactive_programming_java.section09.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {
    public static void main(String[] args) {

        List<Stock> stockList = new ArrayList<>();

        stockList.add(new Stock("AAPL", 318.65, 10));
        stockList.add(new Stock("MSFT", 166.86, 45));
        stockList.add(new Stock("Google", 99, 12.5));
        stockList.add(new Stock("AMZ", 1866.74, 45));
        stockList.add(new Stock("GOOGL", 1480.20, 3.5));
        stockList.add(new Stock("AAPL", 318.65, 8));
        stockList.add(new Stock("AMZ", 1866.74, 9));

        StockFilter.bySymbol(stockList, "AMZ")
                .forEach(System.out::println);

        System.out.println("************************************");

        StockFilter.byPriceAbove(stockList, 1000)
                .forEach(System.out::println);

        System.out.println("************************************");

        StockFilter.byPriceBelow(stockList, 1000)
                .forEach(System.out::println);

        System.out.println("************************************");

        StockFilter.filter(stockList, stock -> stock.getUnits() > 10)
                .forEach(System.out::println);

    }
}
