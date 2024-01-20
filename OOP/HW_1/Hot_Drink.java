public class Hot_Drink extends Product{
    private int temperature;
    
   public Hot_Drink(String name, int price){
    super(name, price);
   } 

   public Hot_Drink(String name, int price, int temperature){
    super(name, price);
    this.temperature = temperature;
   }

   public int getTemperature(){
    return temperature;
   }

   public void setTemperature(int temperature){
    this.temperature = temperature;
   }

   public String toString(){
    return "Hot_Drink{" +
            "temperature='" + temperature + "\'" +
            ", name=" + getName() +
            '}';
   }
}
