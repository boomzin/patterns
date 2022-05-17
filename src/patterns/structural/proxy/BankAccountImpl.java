package patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class BankAccountImpl implements BankAccount {
    private final Map<User, Integer> accouts = new HashMap<>();

    @Override
    public Integer put(User user, int amount) {
        return accouts.put(user, amount);
    }

    @Override
    public Integer get(User user, int amount) {
        return accouts.get(user);
    }
}
