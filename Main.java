import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        while(!str.equals("done")){
            System.out.println("Input variable names 1 at a time. When done please type done");
        }
        Boolean[][] i = {{false, false}, {false, true}, {true, false}, {true, true}};
        boolean[] o = {false, false, true, true};
        String[] v = {"x", "y"};
        TruthTable t = new TruthTable(i, o, v);
        System.out.println(t.bExpression());
    }
}