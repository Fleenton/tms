package TaskStock.main;

import TaskStock.model.Stock;
import TaskStock.service.filehandler.StockReader;
import TaskStock.service.filehandler.StockWriter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        StockReader stockReader = new StockReader();
        StockWriter stockWriter = new StockWriter();
        List<Stock> stockList = stockReader.getStocksFile("C://Users/Admin Admin/Desktop/stocks.txt");
        stockWriter.writeStocksFile(stockList, "C://Users/Admin Admin/Desktop/report.txt");
    }
}
