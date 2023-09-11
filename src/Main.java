
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> linkl =new LinkedList<Integer>();
        ArrayList <Integer> arrList= new ArrayList<Integer>();
        AddElementsLinkedlist(linkl);
        AddElementsArraylist(arrList);
        getElementsLinkedList(linkl);
        getElementsArrayList(arrList);
    }
    public static void AddElementsLinkedlist(LinkedList a)
    {
        Date curTime = new Date();
        for (int i=0; i<500000;i++) {
            a.add((int) (Math.random() * 10));
        }
        Date ntime= new Date();
        long startTime = ntime.getTime()- curTime.getTime();
        System.out.println("Добавление элементов в Linked List " + startTime);
    }
    public static void AddElementsArraylist(ArrayList a)
    {
        Date curTime = new Date();
        for (int i=0; i<500000;i++) {
            a.add((int) (Math.random() * 10));
        }
        Date ntime= new Date();
        long startTime = ntime.getTime()- curTime.getTime();
        System.out.println("Добавление элементов в Array List " + startTime);
    }
    public static void getElementsLinkedList(LinkedList a)
    {
        Date curTime = new Date();
        int ind = 0;
        int el=0;
        for (int i=0; i<50000;i++) {
            ind=(int) (Math.random() * 500000)-1;
            el=(int)a.get(ind);
        }
        Date ntime= new Date();
        long startTime = ntime.getTime()- curTime.getTime();
        System.out.println("Выбор 50000 элементов в Linked List " + startTime);
    }
    public static void getElementsArrayList(ArrayList a)
    {
        Date curTime = new Date();
        int ind = 0;
        int el=0;
        for (int i=0; i<50000;i++) {
            ind=(int) (Math.random() * 500000)-1;
            el=(int)a.get(ind);
        }
        Date ntime= new Date();
        long startTime = ntime.getTime()- curTime.getTime();
        System.out.println("Выбор 50000 элементов в Array List " + startTime);
    }
}