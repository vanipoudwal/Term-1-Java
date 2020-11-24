
package comparatordemo;

import java.util.*;

public class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Guddu",88);
        Student s2 = new Student("Vani",90);
        Student s3 = new Student("Golu",78);
        
        ArrayList<Student> obj = new ArrayList<>();
        obj.add(s1);
        obj.add(s2);
        obj.add(s3);
        
        System.out.println("Student details are : ");
        
        ListIterator li1 = obj.listIterator();
        while(li1.hasNext())
        {
            System.out.println(li1.next());
        }
        
        Collections.sort(obj, new MarkCompare());
        
        System.out.println("Mark wise sort : ");
        
        ListIterator li2 = obj.listIterator();
        while(li2.hasNext())
        {
            System.out.println(li2.next());
        }
       
        Collections.sort(obj, new NameCompare());
        
        System.out.println("Name wise sort : ");
        
        ListIterator li3 = obj.listIterator();
        while(li3.hasNext())
        {
            System.out.println(li3.next());
        }
    }
}