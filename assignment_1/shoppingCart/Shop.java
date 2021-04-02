public class Shop {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item meat = new Item("123", 120);
        Item milk = new Item("345", 20);

        shoppingCart.addItem(meat);
        shoppingCart.addItem(milk);

        PaymentStrategy creditCardStrategy = new CreditCardStrategy("John Doe", "123123123", "123", "2022-01-01");
        PaymentStrategy paypalStrategy = new PaypalStrategy("example@example.com", "123123123");

        shoppingCart.pay(creditCardStrategy);
        shoppingCart.pay(paypalStrategy);
    }
}