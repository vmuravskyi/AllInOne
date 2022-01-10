package functional_reactive_programming_java.section09.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class StockFilter {

    public static List<Stock> bySymbol(List<Stock> list, String symbol) {
        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock : list) {
            if (Objects.equals(stock.getSymbol(), symbol)) {
                filteredData.add(stock);
            }
        }
        return filteredData;
    }

    public static List<Stock> byPriceAbove(List<Stock> list, double price) {
        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock : list) {
            if (stock.getPrice() >= price) {
                filteredData.add(stock);
            }
        }
        return filteredData;
    }

    public static List<Stock> byPriceBelow(List<Stock> list, double price) {
        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock : list) {
            if (stock.getPrice() <= price) {
                filteredData.add(stock);
            }
        }
        return filteredData;
    }

    public static List<Stock> filter(List<Stock> list, Predicate<Stock> predicate) {
        List<Stock> filtered = new ArrayList<>();
        for (Stock stock : list) {
            if (predicate.test(stock)) {
                filtered.add(stock);
            }
        }
        return filtered;
    }

}
