package patterns.structural.proxy;

public class Application {
    public static void main(String[] args) {
        User user1 = new User(1);
        User user2 = new User(2);
        BankAccount bankAccount = new BankAccountProxy();
        System.out.println(bankAccount.put(user1, 100));
        System.out.println(bankAccount.put(user1, 200));
        System.out.println(bankAccount.put(user1, 200));
        System.out.println(bankAccount.get(user2, 200));
        System.out.println(bankAccount.get(user1, 200));
    }
}
