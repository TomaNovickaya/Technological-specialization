import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println("--------- ПОИСК ГОРЯЧИХ НАПИТКОВ ---------");
        Hot_Drinks_Vending_Machine vmHotDrink = new Hot_Drinks_Vending_Machine(null);
        List<Hot_Drink> hotDrinkList = new ArrayList<>(Arrays.asList(
                new Hot_Drink("Coffee", 150, 90),
                new Hot_Drink("Tea", 300, 80),
                new Hot_Drink("Cocao", 300, 60)));
        vmHotDrink.initProduct(hotDrinkList);
        System.out.println("Поиск по названию: " + vmHotDrink.getProduct("Coffee"));
        
    }


    
}
