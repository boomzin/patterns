package patterns.behavioral.chainofresponsibility.v1;

public class RemoveUpperCaseHandler extends Handler {

    @Override
    public String remove(String string) {
        return removeNext(string.replaceAll("\\p{Lu}", ""));
    }
}
