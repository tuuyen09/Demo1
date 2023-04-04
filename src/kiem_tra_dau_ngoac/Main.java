package kiem_tra_dau_ngoac;

import java.util.Stack;

public class Main {
    public boolean main(){
        Stack<String> stack = new Stack<>();
        String sym = null;
        if (sym.equals("(")){
            stack.push(sym);
        }if (sym.equals(")")){
            if (stack.isEmpty())
                return false;
        }
        String left = "(";
        if (sym.equals(left)){
            return true;}
        return false;
    }
}
