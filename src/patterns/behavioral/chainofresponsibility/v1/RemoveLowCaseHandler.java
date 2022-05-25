package patterns.behavioral.chainofresponsibility.v1;

public class RemoveLowCaseHandler extends Handler {

    @Override
    public String remove(String string) {
        return removeNext(string.replaceAll("\\p{Ll}", ""));
    }
}
