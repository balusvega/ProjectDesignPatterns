package com.modules;

public class SingletonCls  {

    /* Problem Given:
     Suppose you want to create a class for which only a single instance (or object)
     should be created and that single object can be used by all other classes.


     Solution:
     Singleton design pattern is the best solution of above specific problem.
     Singleton Pattern says that just
     "define a class that has only one instance and provides a global point of access to it".
     Saves memory because object is not created at each request. Only single instance is reused again and again.

     Early Instantiation: creation of instance at load time.
     Lazy Instantiation: creation of instance when required.

     To create the singleton class, we need to have static member of class, private constructor and static factory method.

     Static member: It gets memory only once because of static, it contains the instance of the Singleton class.
     Private constructor: It will prevent to instantiate the Singleton class from outside the class.
     Static factory method: This provides the global point of access to the Singleton object and
     returns the instance to the caller.

     */

        // static variable of type Singleton
        private static SingletonCls single_inst= null;

        // variable of type String
        public String obj;

    // private constructor restricted to this class itself
    private SingletonCls() {
        obj = "Demoing singleton design pattern";
    }

    // static method to create instance of Singleton class
        public static SingletonCls getInstance()
        {
            if (single_inst == null)
                single_inst = new SingletonCls(); // lazy initialization
            return single_inst;
        }
}