package patterns.behavioral.chainofresponsibility.v1;

public class RemoveSpecialHandler extends Handler {

    @Override
    public String remove(String string) {
        return removeNext(string.replaceAll("[^ \\s\\w]|_", ""));
    }
}
