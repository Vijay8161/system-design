package com.pm.systemdesign.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is instantiated");
    }

    // lazy initialisation (instance created only when it is requested)
    // not thread safe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // this could handle multi threads
//    public static synchronized Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //Eager initialisation
    // public class Singleton{
    // THREAD SAFE because JVM handles static initialization.
//    private static Singleton obj = new Singleton();
//}

//    Double-Checked Locking (Most Efficient)
//    class Singleton {
//        private static volatile Singleton obj = null;
//        private Singleton() {}
//
//        public static Singleton getInstance()
//        {
//            if (obj == null) {
//                // To make thread safe
//                synchronized (Singleton.class)
//                {
//                    // check again as multiple threads can reach above step
//                    if (obj == null)
//                        obj = new Singleton();
//                }
//            }
//            return obj;
//        }
//    }

    public static void doSomething(){
        System.out.println("Something is done");
    }
}
