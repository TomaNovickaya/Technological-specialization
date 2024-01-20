import java.util.List;

public class Hot_Drinks_Vending_Machine implements Vending_Machine{

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Hot_Drinks_Vending_Machine(List<Product> productList){
        Main.productList = productList;
    }

    public Hot_Drinks_Vending_Machine(String string, int i, int j) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : Main.productList){
            if (product.getName().equals(name)){
                money += product.getPrice();
                return product;
            }
        }
       return null;
    }

    /**
     * @param name
     * @param volume
     * @param temperature
     * @return
     */
    public static Hot_Drink getProduct(String name, int volume, int temperature){
        for (Product product : Main.productList){
            if (product instanceof Hot_Drink){
                if (product.getName().equals(name) && ((Hot_Drink) product).getTemperature() == temperature){
                    return (Hot_Drink) product;
                }
            }
        }
        return null;
    }

    public void initProduct(List<Hot_Drink> hotDrinkList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initProduct'");
    }
    
}
