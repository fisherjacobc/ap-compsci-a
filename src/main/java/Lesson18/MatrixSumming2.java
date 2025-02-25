/**
 * @author Jacob Fisher
 * @created 25 Feb 2025
 */
public class MatrixSumming2
{
    private int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1}};   //load in the matrix values

    public int sum( int r, int c )
    {
        int _sum = m[r][c];

        // Closest
        if (r < m.length - 1)
            _sum += m[r + 1][c];
        if (r > 0)
            _sum += m[r - 1][c];
        if (c < m[r].length - 1)
            _sum += m[r][c + 1];
        if (c > 0)
            _sum += m[r][c - 1];

        // Diagonals
        if (r < m.length - 1 && c < m[r].length - 1)
            _sum += m[r + 1][c + 1];
        if (r > 0 && c > 0)
            _sum += m[r - 1][c - 1];
        if (r < m.length - 1 && c > 0)
            _sum += m[r + 1][c - 1];
        if (r > 0 && c < m[r].length - 1)
            _sum += m[r - 1][c + 1];
        
        

    	return _sum;
    }

    public String toString()
    {
    	return "";
    }
}
