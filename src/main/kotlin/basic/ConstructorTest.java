package basic;

public class ConstructorTest {

    private String first;
    private String second;
    private String third;

    public ConstructorTest(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public ConstructorTest(String first, String second, String third) {
        this(first, second);
        this.third = third;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }

    public static void main(String[] args) {

        ConstructorTest constructorTest = new ConstructorTest("1", "2", "3");
        ConstructorTest constructorTest2 = new ConstructorTest("1", "2");

        System.out.println(constructorTest2.third);
        System.out.println(constructorTest.first);

    }
}
