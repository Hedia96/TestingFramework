package example;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Stack;

public class examples {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.printf("Heeee");
        String[] arr= new String[3];
        int [] intarr= new int[9];
        boolean [] boolarr= new boolean[2];
        System.out.println(Arrays.toString(intarr));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(boolarr));
        Stack games = new Stack();
//Inner inner =new Inner();
//Inner.Private o= inner. new Private();
//       o.method(3  );
//        Object o;
//        Class cn= null;
//       List<Class<?>> clasess = List.of(Inner.class.getDeclaredClasses());
//        for (Class c : clasess)
//       {
//           if (c.getName().contains("Private"))
//           {
//               cn=c;
//               break;
//           };
//       }
//        Constructor<?> constructor = cn.getDeclaredConstructor(examples.Inner.class);
//
//        constructor.setAccessible(true);
//        o=constructor.newInstance(inner);
//        Method m= cn.getDeclaredMethod("method",new Class[]{int.class});
//        m.setAccessible(true);
//        System.out.println(m.invoke(o,3));
//
//    }
//     static class Inner{
//        private class Private {
//
//
//            private String method(int d)
//            {
//               return ("the number is 0"+d );
//            }
//
//        }
//        class trtrt{
//            public void method2()
//            {
//                System.out.println("ssss");
//            }
//        }
    }
}
