package patterns.behavioral.chainofresponsibility.v1;

public class HandlersChainStarter {
    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public String start(String string) {
        return handler.remove(string);
    }
}
