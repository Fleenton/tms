package TaskStock.service.format;

import TaskStock.model.Stock;

import java.util.List;

public class StocksProfitabilityFormat implements PrintProfitabilityStocksFormatter {
    @Override
    public String getFormatProfitabilityStocks(Stock stock) {
        return stock.getNameStock() + " - " + stock.getProfitabilityStocks() + "\n";
    }
}
