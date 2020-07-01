package com.apps;

import com.modules.SingletonCls;

public class SingletonDemo {

   public static void main(String args[])
   {
       // instantiating Singleton class with variable x
       SingletonCls obj1 = SingletonCls.getInstance();

       // instantiating Singleton class with variable y
       SingletonCls obj2 = SingletonCls.getInstance();

       // instantiating Singleton class with variable z
       SingletonCls obj3 = SingletonCls.getInstance();

       // changing variable of instance
       obj1.obj = (obj1.obj).toUpperCase();

       System.out.println("String from obj1 is " + obj1.obj);
       System.out.println("String from obj2 is " + obj2.obj);
       System.out.println("String from obj3 is " + obj3.obj);
       System.out.println("\n");

       // changing variable of instance z
       obj3.obj = (obj3.obj).toLowerCase();

       System.out.println("String from obj1 is " + obj1.obj);
       System.out.println("String from obj2 is " + obj2.obj);
       System.out.println("String from obj3 is " + obj3.obj);
   }

}

