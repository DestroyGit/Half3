package AnnotationAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class t1 = TestOne.class;
        start(t1);
        Class t2 = TestTwo.class;
        start(t2);
        Class t3 = TestThree.class;
        start(t3);
    }

    public static void start(Class t){
        Method [] methods = t.getDeclaredMethods();

        // RuntimeExceptions for BeforeSuite and AfterSuite
        int countBS = 0;
        int countAS = 0;
        for (Method m : methods) {
            if(m.isAnnotationPresent(BeforeSuite.class)){
                countBS++;
                if (countBS > 1){
                    throw new RuntimeException();
                }
            }
            if(m.isAnnotationPresent(AfterSuite.class)){
                countAS++;
                if (countAS > 1){
                    throw new RuntimeException();
                }
            }
        }


        //BeforeSuite
        for (Method m : methods) {
            if(m.isAnnotationPresent(BeforeSuite.class)){
                try {
                    m.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        //Test
        Method [] methodsNew = new Method[methods.length - countAS - countBS];
        int count = 0;
        for (int i = 1; i <= 10; i++) {
             for (Method m : methods){
                 if(m.isAnnotationPresent(Test.class)){
                     if (m.getAnnotation(Test.class).description() == i){
                         methodsNew[count] = m;
                         count++;
                     }
                 }

            }
        }
        for (int i = 0; i < methodsNew.length; i++) {
            if(methodsNew[i].isAnnotationPresent(Test.class)){
                try {
                    methodsNew[i].invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        //AfterSuite
        for (Method m : methods) {
            if(m.isAnnotationPresent(AfterSuite.class)){
                try {
                    m.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
}
