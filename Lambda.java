interface InnerLambda {
    void show();
}

public class Lambda {
    public static void main(String[] args) {
        InnerLambda obj = () -> System.out.print("hello");

        obj.show();
    }
}
