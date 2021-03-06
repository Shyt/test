package MyQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue(); //Отсортированная
        Queue queue1 = new LinkedList();

        //Добавление
        queue.add("1");
        queue.offer("2");
        queue.offer("3");

        //Вывод
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){ //queue.size
            //System.out.println(queue.peek());
            //System.out.println(queue.poll());
            System.out.println(iterator.next());
        }
        System.out.println("Number: " + queue.size());
    }
}
