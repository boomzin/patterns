package patterns.creational.fabricMethod;

public class createJavaProgram extends createProgram{

    @Override
    Developer getDeveloper() {
        return new javaDeveloper();
    }
}
