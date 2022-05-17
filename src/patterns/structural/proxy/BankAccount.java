package patterns.structural.proxy;

public interface BankAccount {
    Integer put(User user, int amount);
    Integer get(User user, int amount);
}
