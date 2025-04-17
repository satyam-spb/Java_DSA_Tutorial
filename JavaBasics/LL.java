public class LL {

    public static void main(String[] args) {
        System.out.println(fnc());
    }
    static int fnc(){
        try{
            return 10;
        }
        finally{
            return 20;
        }
    }
}