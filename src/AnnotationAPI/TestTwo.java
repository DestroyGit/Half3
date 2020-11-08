package AnnotationAPI;

/*
Without AfterSuite
 */

public class TestTwo {
    @Test(description = 3)
    public static void Test1(){
        System.out.println("3: test1");
    }
    @Test(description = 4)
    public static void Test2(){
        System.out.println("4: test2");
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
