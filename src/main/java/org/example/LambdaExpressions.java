package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<Person> studentList = new ArrayList<>();
        studentList.add(new Person("sreeja",21,220));
        studentList.add(new Person("liddu",23,23));

        //1  comparator class
        Collections.sort(studentList,new NameComparator());
       studentList.sort(new NameComparator());
        //2  //anonymous class
        Collections.sort(studentList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        studentList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });

        //3 lambda exprssion
        Collections.sort(studentList, ( o1,  o2)->
                 o1.getName().compareTo(o2.getName()));

        System.out.println(studentList);

        studentList.sort(( o1,  o2)->
                o1.getName().compareTo(o2.getName()));

    }
}
//1 st approach
class NameComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
