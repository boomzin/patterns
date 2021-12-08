package patterns.creational.fabricMethod;

import java.time.LocalTime;

public class Application {
    private static createProgram createProgram;
    public static void main(String[] args) {
        if ((LocalTime.now().getSecond() % 2) > 0) {
            createProgram = new createCppProgram();
        } else {
            createProgram = new createJavaProgram();
        }

        Developer code = createProgram.getDeveloper();
        code.code();
    }
}
