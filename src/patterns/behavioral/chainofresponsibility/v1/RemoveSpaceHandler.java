package patterns.behavioral.chainofresponsibility.v1;

public class RemoveSpaceHandler extends Handler {

    @Override
    public String remove(String string) {
        return removeNext(string.replaceAll("\\s", ""));
    }
}
