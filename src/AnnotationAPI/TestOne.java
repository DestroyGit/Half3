package AnnotationAPI;

public class TestOne {
    @Test(description = 3)
    public static void Test1(){
        System.out.println("3: test1");
    }
    @AfterSuite
    public static void Test2(){
        System.out.println("AFTER: test2");
    }
    @Test(description = 1)
    public static void Test3(){
        System.out.println("1: test3");
    }
    @BeforeSuite
    public static void Test4(){
        System.out.println("BEFORE: test4");
    }
    @Test(description = 2)
    public static void Test5(){
        System.out.println("2: test5");
    }
}
