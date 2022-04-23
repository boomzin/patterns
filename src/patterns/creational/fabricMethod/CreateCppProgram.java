package patterns.creational.fabricMethod;

public class CreateCppProgram extends CreateProgram {
    @Override
    Developer getDeveloper() {
        return new CppDeveloper();
    }
}
