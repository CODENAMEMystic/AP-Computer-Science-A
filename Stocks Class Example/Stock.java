public class Stock {

    private String symbol;
    private String name;

    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String isymbol, String iname) {
        symbol = isymbol;
        name = iname;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}