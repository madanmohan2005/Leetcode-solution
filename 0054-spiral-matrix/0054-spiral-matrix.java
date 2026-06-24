class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int startRow = 0;
        int startCol = 0;
        int endRow = m - 1;
        int endCol = n - 1;

        while(startRow <= endRow && startCol <= endCol)
        {

            // top row
            for(int col = startCol; col <= endCol; col++)
            {
                result.add(matrix[startRow][col]);
            }
            startRow++;

            // right column
            for(int row = startRow; row <= endRow; row++)
            {
                result.add(matrix[row][endCol]);
            }
            endCol--;

            // bottom row
            if(startRow <= endRow)
            {
                for(int col = endCol; col >= startCol; col--)
                {
                    result.add(matrix[endRow][col]);
                }
                endRow--;
            }

            // left column
            if(startCol <= endCol)
            {
                for(int row = endRow; row >= startRow; row--)
                {
                    result.add(matrix[row][startCol]);
                }
                startCol++;
            }
        }

        return result;
    }
}