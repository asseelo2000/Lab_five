import java.util.Scanner;

/**
 * Created by Asseel Tarish on 9/02/2022.
 */
public class ListOfObjects {
    public static void main(String[] args) {
        DoublyLinkedList<Student>list= new DoublyLinkedList<>();
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("id\tname\t major");
            Student s= new Student(in.nextInt(),in.next(),in.next());
            list.addLast(s);

        }
        while (!list.isEmpty())
        {
            System.out.println(list.removeFirst());
        }
    }
}
