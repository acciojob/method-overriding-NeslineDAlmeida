package com.driver;

public class Main {
    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }}


   public static class B extends A {

        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {

        //B obj = new B();


        B obj1=new B();
        obj1.meth();
        B obj = new B();
        obj.meth();


       // classA d = new classA();
       // System.out.println(d.meth());
       // System.out.println(c.meth());
    }


}