package patterns.creational.fabricMethod;

public class CreateJavaProgram extends CreateProgram {

    @Override
    Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
