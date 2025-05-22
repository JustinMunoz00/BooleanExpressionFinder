import java.util.ArrayList;
public class TruthTable{
    private ArrayList<String> variables = new ArrayList<String>();
    private ArrayList<boolean[]> inputs = new ArrayList<boolean[]>();
    private ArrayList<Boolean> outputs = new ArrayList<Boolean>();

    public TruthTable(boolean[][] in, boolean[] out, String[] vars){
        if (vars.length != in[0].length){
            System.out.println("Variables and inputs do not match");
            return;
        }
        for (boolean[] x : in) inputs.add(x);
        for (boolean y : in) inputs.add(y);
        for (String z : in) inputs.add(z);
    }

    public String booleanExpression(){
        String e = "";
        for (int i = 0; i < outputs.size(); i++){
            if (i != 0) e += " + ";
            if (outputs.get(i)){
                for (int k = 0; k < inputs.get(i).length; i++){
                    if (outputs.get(k)) e+= variables.get(k);
                    else e += variables.get(k)+"'";
                }
            }
        }
    }
}