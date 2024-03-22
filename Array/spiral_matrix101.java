public class spiral_matrix101 {
    public static void spiral(int matrix[][]){
        int StartRow=0;
        int Startcolumn=0;
        int EndRow=matrix.length-1;
        int Endcolumn=matrix[0].length-1;
        while(StartRow <= EndRow && Startcolumn <= Endcolumn){
            // Top
            for(int j=Startcolumn; j<=Endcolumn; j++){
                System.out.print(matrix[StartRow][j]+" ");
            }
            // Right
            for(int i=StartRow+1; i<=EndRow; i++){
                System.out.print(matrix[i][Endcolumn]+" ");
            }
            // Bottom
            for(int j=Endcolumn-1; j>=Startcolumn; j--){
                System.out.print(matrix[EndRow][j]+" ");
                if(StartRow==EndRow){
                    break;
                }
            }
            // Left
            for(int i=EndRow-1; i>=StartRow+1;i--){
                System.out.print(matrix[i][Startcolumn]+" ");
                if(Startcolumn == Endcolumn){
                    break;
                }
            }
            StartRow++;
            Startcolumn++;
            EndRow--;
            Endcolumn--;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
            spiral(matrix);
    }
}
