package patterns.structural.proxy;

public class BankAccountProxy implements BankAccount{
    private final BankAccount bankAccount = new BankAccountImpl();

    @Override
    public Integer put(User user, int amount) {
        Integer currentAmount = bankAccount.get(user, amount);
        if (currentAmount == null) {
            currentAmount = 0;
        }
        currentAmount += amount;
        bankAccount.put(user, currentAmount);
        return currentAmount;
    }

    @Override
    public Integer get(User user, int amount) {
        Integer currentAmount = bankAccount.get(user, amount);
        if (currentAmount == null || currentAmount < amount) {
            System.out.println("Not enough money");
            return currentAmount;
        }
        currentAmount -= amount;
        bankAccount.put(user, currentAmount);
        return currentAmount;
    }
}
