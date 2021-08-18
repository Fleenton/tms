package TaskStock.service.comparator;

import TaskStock.model.Stock;

import java.util.Comparator;

public class StocksComparatorNyProfitability implements Comparator<Stock> {
    @Override
    public int compare(Stock o1, Stock o2) {
        return (int) (o2.getProfitabilityStocks() - o1.getProfitabilityStocks());
    }
}
