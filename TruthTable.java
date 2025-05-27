import java.util.ArrayList;
public class TruthTable{
    private ArrayList<String> variables = new ArrayList<String>();
    private ArrayList<Boolean[]> inputs = new ArrayList<Boolean[]>();
    private ArrayList<Boolean> outputs = new ArrayList<Boolean>();

    public TruthTable(Boolean[][] in, boolean[] out, String[] vars){
        if (vars.length != in[0].length){
            System.out.println("Variables and inputs do not match");
            return;
        }
        for (Boolean[] x : in) inputs.add(x);
        for (boolean y : out) outputs.add(y);
        for (String z : vars) variables.add(z);
    }

    public String bExpression(){
        String e = "";
        for (int i = 0; i < outputs.size(); i++){
            if (outputs.get(i)){
                e += " + ";
                for (int k = 0; k < inputs.get(i).length; k++){
                    if (inputs.get(i)[k]) e+= variables.get(k);
                    else e += variables.get(k)+"'";
                }
            }
        }
        return e.substring(3);
    }

    public String simplify(String str){
        return "a";
    }
}