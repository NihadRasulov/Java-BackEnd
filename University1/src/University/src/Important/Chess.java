package University.src.Important;


public class Chess {

    public static void main(String[] args) {

        char [][]chess = new char[8][8];

        for (int i = 0; i < 8; i++) {
            System.out.println();

            for (int j = 0; j < 8; j++) {

                if ((i+j)%2 == 1) {
                    chess[i][j] = 'Q';
                }
                else {
                    chess[i][j] = 'A';
                }
                System.out.print(chess[i][j] + "  ");
            }
        }
    }
}
