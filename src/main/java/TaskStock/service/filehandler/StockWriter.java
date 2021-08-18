package TaskStock.service.filehandler;

import TaskStock.model.Stock;
import TaskStock.service.comparator.StocksComparatorNyProfitability;
import TaskStock.service.format.PrintProfitabilityStocksFormatter;
import TaskStock.service.format.StocksProfitabilityFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class StockWriter {
    public void writeStocksFile(List<Stock> stockList, String filename){
        Comparator<Stock> comparator = new StocksComparatorNyProfitability();
        stockList.sort(comparator);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            PrintProfitabilityStocksFormatter print = new StocksProfitabilityFormat();
            for (Stock st : stockList) {
                writer.write(print.getFormatProfitabilityStocks(st));
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
