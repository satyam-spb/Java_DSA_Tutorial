public class O2scoping {
    int a = 5;
    public static void main(String[] args) {
        int a;
        // System.out.println(a); //Error : The local variable a may not have been initialized
        
        // NOTE : the shadowing doesn't happen until the variable is initialized
        {
            // int a = 20; //can't make a new 'a' even within the scope(java doesn't allow variable shadowing here)
            int b = 30;
        }
        // b = 50; //can't access 'b' here 

        //Java allows instance variable shadowing with local variable cuz we can easily distinct em by their scope("this" keyword) but java considers a local variable in a fnc and another variable in the same fnc to be in the same scope and it would not maintain java's aim to maintain 'readability' and 'simplicity' so java doesn't allow it
    }
}
