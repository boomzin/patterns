package patterns.behavioral.chainofresponsibility.v2;

public class Application {
    public static void main(String[] args) {
        ColorCheckerChainStarter chainStarter = new ColorCheckerChainStarter();
        ColorChecker chain = new CheckBlue();
        chain.linkWth(new CheckRed()).linkWth(new CheckWhite());
        chainStarter.setColorChecker(chain);
        chainStarter.start(new Balloon(Color.BLUE));
        System.out.println();
        chainStarter.start(new Balloon(Color.RED));
        System.out.println();
        chainStarter.start(new Balloon(Color.WHITE));
        System.out.println();
    }
}
