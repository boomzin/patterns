package patterns.creational.fabricMethod;

public class createCppProgram extends createProgram{
    @Override
    Developer getDeveloper() {
        return new cppDeveloper();
    }
}
