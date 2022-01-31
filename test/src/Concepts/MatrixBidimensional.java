package Concepts;

public class MatrixBidimensional {
    public static void main(String[] args) {

        // int [][] matrixBi = new int [4][5];

        // matrixBi[0][0] = 15;
        // matrixBi[0][1] = 21;
        // matrixBi[0][2] = 18;
        // matrixBi[0][3] = 9;
        // matrixBi[0][4] = 15;

        // matrixBi[1][0] = 10;
        // matrixBi[1][1] = 52;
        // matrixBi[1][2] = 17;
        // matrixBi[1][3] = 19;
        // matrixBi[1][4] = 7;

        // matrixBi[2][0] = 19;
        // matrixBi[2][1] = 43;
        // matrixBi[2][2] = 91;
        // matrixBi[2][3] = 13;
        // matrixBi[2][4] = 3;

        // matrixBi[3][0] = 70;
        // matrixBi[3][1] = 12;
        // matrixBi[3][2] = 27;
        // matrixBi[3][3] = 49;
        // matrixBi[3][4] = 74;

        // for ( int i = 0; i < 4; i++){

        //     System.out.println();

        //     for (int j = 0 ; j < 5; j++){

        //         System.out.print(matrixBi[i][j] + " ");
        //     }
        // }


        double acumulado;
        double interes = 0.10;

        double [][] saldo = new double[6][5];

        for ( int i = 0; i < 6 ; i++){
            saldo[i][0] = 10000;
            acumulado = 10000;

            for (int j = 1 ; j < 5 ; j++ ){
                acumulado = acumulado + (acumulado*interes);

                saldo[i][j] = acumulado;
            }

            interes = interes + 0.01;

        } 

        for (int z = 0 ; z < 6; z++){

            System.out.println();

            for ( int h = 0; h < 5; h++){
                System.out.printf("%1.2f", saldo[z][h]);

                System.out.print(" ");
            }
        }

    }
}
