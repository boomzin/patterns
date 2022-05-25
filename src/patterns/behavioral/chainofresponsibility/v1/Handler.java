package patterns.behavioral.chainofresponsibility.v1;

public abstract class Handler {
    private Handler handlerNext;

    public Handler linkWth(Handler handlerNext) {
        this.handlerNext = handlerNext;
        return handlerNext;
    }

    public abstract String remove(String string);

    protected String removeNext(String string) {
        if (handlerNext == null) {
            return string;
        }
        return handlerNext.remove(string);
    }
}
