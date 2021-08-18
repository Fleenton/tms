package TaskStock.model;

import java.util.*;

public class Stock {
    private String nameStock;
    private double priceStock;
    private double percentageProjectedGrowth;
    private int purchaseVotes;
    private int overseeingVotes;
    private int keepVotes;
    private int saleVotes;
    private List<Stock> stockList = new ArrayList<>();

    public Stock() {
    }

    public Stock(String nameStock, double priceStock, double percentageProjectedGrowth, int purchaseVotes, int overseeingVotes, int keepVotes, int saleVotes) {
        this.nameStock = nameStock;
        this.priceStock = priceStock;
        this.percentageProjectedGrowth = percentageProjectedGrowth;
        this.purchaseVotes = purchaseVotes;
        this.overseeingVotes = overseeingVotes;
        this.keepVotes = keepVotes;
        this.saleVotes = saleVotes;
    }

    public String getNameStock() {
        return nameStock;
    }

    public void setNameStock(String nameStock) {
        this.nameStock = nameStock;
    }

    public double getPriceStock() {
        return priceStock;
    }

    public void setPriceStock(double priceStock) {
        this.priceStock = priceStock;
    }

    public double getPercentageProjectedGrowth() {
        return percentageProjectedGrowth;
    }

    public void setPercentageProjectedGrowth(double percentageProjectedGrowth) {
        this.percentageProjectedGrowth = percentageProjectedGrowth;
    }

    public int getPurchaseVotes() {
        return purchaseVotes;
    }

    public void setPurchaseVotes(int purchaseVotes) {
        this.purchaseVotes = purchaseVotes;
    }

    public int getOverseeingVotes() {
        return overseeingVotes;
    }

    public void setOverseeingVotes(int overseeingVotes) {
        this.overseeingVotes = overseeingVotes;
    }

    public int getKeepVotes() {
        return keepVotes;
    }

    public void setKeepVotes(int keepVotes) {
        this.keepVotes = keepVotes;
    }

    public int getSaleVotes() {
        return saleVotes;
    }

    public void setSaleVotes(int saleVotes) {
        this.saleVotes = saleVotes;
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    public double getProfitabilityStocks(){
        double expectedProfit = 0.0;
        int analystsSum = 0;
        double percentSaleVotes = 0.0;
        double correctionPercentageProfitability = 0.0;
        double profit = 0.0;
        for (Stock stock: stockList){
            expectedProfit = stock.getPriceStock() * (stock.getPercentageProjectedGrowth() / 100);
            analystsSum = stock.getPurchaseVotes() + stock.getOverseeingVotes() + stock.getKeepVotes() + stock.getSaleVotes();
            percentSaleVotes = analystsSum / 100 * stock.getSaleVotes();
            correctionPercentageProfitability = 100 - percentSaleVotes;
            profit = expectedProfit * (correctionPercentageProfitability / 100);
            break;
        }
        return Math.round(profit*100)/100D;
    }

    public Map<String, Integer> purchaseStocks(){
        Map<String, Integer> buyStocks = new HashMap<>();
        int money = 10000;
        int limitPurchaseStocks = 50;
        double count = 0.0;
        for (Stock st: stockList) {
            count = st.getProfitabilityStocks();
            if (count < st.getProfitabilityStocks()){
                count = st.getProfitabilityStocks();
            }
        }

        return buyStocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.priceStock, priceStock) == 0 && percentageProjectedGrowth == stock.percentageProjectedGrowth && purchaseVotes == stock.purchaseVotes && overseeingVotes == stock.overseeingVotes && keepVotes == stock.keepVotes && saleVotes == stock.saleVotes && Objects.equals(nameStock, stock.nameStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStock, priceStock, percentageProjectedGrowth, purchaseVotes, overseeingVotes, keepVotes, saleVotes);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "nameStock='" + nameStock + '\'' +
                ", priceStock=" + priceStock +
                ", percentageProjectedGrowth=" + percentageProjectedGrowth +
                ", purchaseVotes=" + purchaseVotes +
                ", overseeingVotes=" + overseeingVotes +
                ", keepVotes=" + keepVotes +
                ", saleVotes=" + saleVotes +
                ", stockList=" + stockList +
                '}';
    }
}
