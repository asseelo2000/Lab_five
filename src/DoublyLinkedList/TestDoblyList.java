import java.util.Scanner;
/**
 * Created by Asseel Tarish on 9/02/2022.
 */
public class TestDoblyList {
    public static void main(String[] args) {
        DoublyLinkedList<String>list= new DoublyLinkedList<>();
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <6 ; i++) {
            int choice ;
            System.out.print("your choice:");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.print("input Name:");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.print("input Name:");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.print("deleted Name:"+list.removeFirst());
                    break;
                case 4:
                    System.out.print("deleted Name:"+list.removeLast());
                    break;

            }
            System.out.println("\nfirst= "+list.first()+"\t last= "+list.last()
            +"\t size= "+list.size());

        }
    }
}
