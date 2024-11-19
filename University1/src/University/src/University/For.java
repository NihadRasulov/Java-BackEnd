package University.src.University;

public class For {

    public static void main(String[] args) {

        for( int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==j){
                    System.out.println("X");
                }
                else if(i+j == 4){
                    System.out.println("O");
                }
                else{
                    System.out.println("*");
                }
            }
        }
    }
}
