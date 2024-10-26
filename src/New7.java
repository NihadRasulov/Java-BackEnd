public class New7 {
    public static void main(String[] args){
        int x=10;
        if(x++ < 12){
            if(x++ == 11){
                System.out.println("First");
            }
            else{
             System.out.println("Second");
            }
        }
        else{
            System.out.println("Third");
        }
    }
}
