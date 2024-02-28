package org.example;

import java.util.Objects;

public class Test {
    String name;
    int roll;

    public Test(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Test test = (Test) o;
//        return roll == test.roll && Objects.equals(name, test.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, roll);
//    }

    public static void main(String[] args) {
        
        Test test1 =new Test("sreeja",1);
        Test test2=new Test("sreeja",1);
        if(test1==test2)
        {
            System.out.println("true == ");
        }
        else{
            System.out.println(" flase ==");
            System.out.println(test1.hashCode());
            System.out.println(test2.hashCode());
        }
        if(test1.equals(test2))
        {
            System.out.println("true equalls");
            System.out.println(test1.hashCode());
            System.out.println(test2.hashCode());
        }
        else {
            System.out.println(" false equalls");
        }
        
    }

   
}
