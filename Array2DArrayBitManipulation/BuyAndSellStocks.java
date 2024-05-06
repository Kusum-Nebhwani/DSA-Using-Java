package Array2DArrayBitManipulation;

public class BuyAndSellStocks {
    public static int buyAndSellStocks(int [] prices){
        int n = prices.length;
        int buy_price = Integer.MAX_VALUE; //buying price
        int max_profit = 0;                //maximum profit

        for(int i = 0;i<n;i++){
            int sell_price = prices[i];   //selling price
            if(buy_price < sell_price){
                int profit = sell_price - buy_price;
                max_profit = Math.max(profit,max_profit);

            }
            else{
                buy_price = sell_price;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        if(buyAndSellStocks(prices) == 0){
            System.out.println("we don't get any profit");
        }
        else{
            System.out.println("maximum profit: " + buyAndSellStocks(prices));
        }
    }
}
