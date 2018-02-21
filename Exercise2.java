package Chapter11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercise2
{
    /*

   Write a method called alternate that accepts two Lists as its parameters and returns a new List
    containing alter- nating elements from the two lists, in the following order:
• First element from first list
• First element from second list
• Second element from first list
• Second element from second list • Third element from first list
• Third element from second list •...
If the lists do not contain the same number of elements, the remaining elements from the longer list
should be placed consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list
 of [6, 7, 8, 9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing
  [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].
     */



    public static void main(String[] args)
    {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        for (int i = 1; i < 6; i++)
        {
            list1.add(i);
        }

        for (int i = 6; i < 13; i++)
        {
            list2.add(i);
        }

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        System.out.println("Combined: ");
        alternate(list1, list2);


    }

    public static void alternate(List<Integer> list1, List<Integer> list2)
    {
        Iterator<Integer> i1 = list1.iterator();
        Iterator<Integer> i2 = list2.iterator();

        List<Integer> list3 = new LinkedList<Integer>();

        while(i1.hasNext() || i2.hasNext())
        {
            if(i1.hasNext())
            {
                list3.add(i1.next());
            }

            if(i2.hasNext())
            {
                list3.add(i2.next());
            }

        }

        System.out.println(list3);
    }
}

