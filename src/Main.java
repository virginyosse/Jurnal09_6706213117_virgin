import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //creating object of BT
        BinaryTree2 <Integer> bt = new BinaryTree2<>();
        //perform tree operations
        System.out.println("Binary Tree Test\n ");
        char ch;
        do{
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search ");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");

            int choice = in.nextInt();
            in.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter integer element to insert");
                    bt.insert(in.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to search");
                    System.out.println("Serch result : "+bt.search(in.nextInt()));
                    break;
                case 3:
                    System.out.println("Nodes = " + bt.countNodes());
                    break;
                case 4:
                    System.out.println("Empty status = "+ bt.isEmpty());
                    break;
                default:
                    System.out.println("Wrong Entry \n" );
                    break;

            }
            //display tree
            System.out.println("\nPost order: ");
            bt.postorder();
            System.out.println("\nPre order: " );
            bt.preorder();
            System.out.println("\nIn order: ");
            bt.inorder();

            System.out.println("\n \n do you want to continue?(type y or n)");
            ch = in.next().charAt(0);
        }while (ch == 'Y' || ch == 'y');
    }
}
