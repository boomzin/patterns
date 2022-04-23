package patterns.creational.fabricMethod;

import java.time.LocalTime;

public class Application {
    private static CreateProgram createProgram;
    public static void main(String[] args) {
        if ((LocalTime.now().getSecond() % 2) > 0) {
            createProgram = new CreateCppProgram();
        } else {
            createProgram = new CreateJavaProgram();
        }

        Developer developer = createProgram.getDeveloper();
        developer.code();
    }
}
