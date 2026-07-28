
package July;


public class MainPizzaDecorator {
 
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println("Decription : " + pizza.getDescription());
        System.out.println("Cost : " + pizza.getCost());
        
        pizza = new Cheese(pizza);
        System.out.println("Decription : " + pizza.getDescription());
        System.out.println("Cost : " + pizza.getCost());
        
        pizza = new Mushroom(pizza);
        System.out.println("Decription : " + pizza.getDescription());
        System.out.println("Cost : " + pizza.getCost());
        
        pizza = new Olive(pizza);
        System.out.println("Decription : " + pizza.getDescription());
        System.out.println("Cost : " + pizza.getCost());
    }
}
