package patterns.behavioral.chainofresponsibility.v1;

public class Application {

    public static void main(String[] args) {
        String sample = "dfKie_123!34fgH- hyH45@d}";
        System.out.println("Sample string: " + sample);

        System.out.println("Remove digits and special symbols");
        HandlersChainStarter starter = new HandlersChainStarter();
        Handler chain = new RemoveDigitsHandler();
        chain.linkWth(new RemoveSpecialHandler());
        starter.setHandler(chain);
        System.out.println("Result: " + starter.start(sample));

        System.out.println("Remove spaces and special symbols");
        chain = new RemoveSpaceHandler();
        chain.linkWth(new RemoveSpecialHandler());
        starter.setHandler(chain);
        System.out.println("Result: " + starter.start(sample));

        System.out.println("Remove uppercase, digits and special symbols");
        chain = new RemoveDigitsHandler();
        chain.linkWth(new RemoveSpecialHandler()).linkWth(new RemoveUpperCaseHandler());
        starter.setHandler(chain);
        System.out.println("Result: " + starter.start(sample));
    }
}
