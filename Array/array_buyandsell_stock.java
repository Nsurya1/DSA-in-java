public class array_buyandsell_stock {
    public static int profit(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprice = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprice = Math.max(maxprice, profit);
            } else {
                buyprice = price[i];
            }
        }
        return maxprice;
    }

    public static void main(String arg[]) {
        int price[] = { 2, 6, 4, 1, 3, 7 };
        System.out.println(profit(price));
    }
}
