package Chapter_12;

import java.text.NumberFormat;
import java.util.ArrayList;

public class TallySales {

    public static void main(String[] args) {
        ArrayList<Sale> sales = new ArrayList<>();
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        fillTheList(sales);

        // Функциональное программирование
        System.out.println(currency.format(
                sales.parallelStream()
                        .filter(sale -> sale.item.equals("DVD"))
                        .map(sale -> sale.price)
                        //        .reduce(0.0, (price1, price2) -> price1 + price2)
                        .reduce(0.0, Double::sum)
        ));


        // Императивное программирование
        /*double total = 0;
        for (Sale sale : sales) {
            if (sale.item.equals("DVD")){
                total += sale.price;
            }
        }

        System.out.println(currency.format(total));*/
    }

    static void fillTheList(ArrayList<Sale> sales) {
        sales.add(new Sale("DVD", 15.00));
        sales.add(new Sale("Книга", 12.00));
        sales.add(new Sale("DVD", 21.00));
        sales.add(new Sale("CD", 5.25));
    }
}
