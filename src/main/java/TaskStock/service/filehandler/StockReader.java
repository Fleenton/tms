package TaskStock.service.filehandler;

import TaskStock.model.Stock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StockReader {
    public List<Stock> getStocksFile(String filename){
        List<Stock> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null){
                String[] arrStocks = line.split(" - ");
                Stock stock = new Stock();
                stock.setNameStock(arrStocks[0]);
                stock.setPriceStock(Double.parseDouble(arrStocks[1]));
                stock.setPercentageProjectedGrowth(Double.parseDouble(arrStocks[2]));
                stock.setPurchaseVotes(Integer.parseInt(arrStocks[3]));
                stock.setOverseeingVotes(Integer.parseInt(arrStocks[4]));
                stock.setKeepVotes(Integer.parseInt(arrStocks[5]));
                stock.setSaleVotes(Integer.parseInt(arrStocks[6]));
                result.add(stock);
                for (Stock st: result) {
                    st.getStockList().add(stock);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
