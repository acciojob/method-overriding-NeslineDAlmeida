package com.driver;

public class Main {
    public static void main(String[] args) {

        //B obj = new B();
        B obj1=new B();
        System.out.print(obj1.meth());

       // classA d = new classA();
       // System.out.println(d.meth());
       // System.out.println(c.meth());
    }
    }
     class A {
        public String meth(){
            return "Invoking method from class A";
        }}

         class B extends A {


            public String meth() {
                return "Method is overridden in Extendend class B";
            }}
