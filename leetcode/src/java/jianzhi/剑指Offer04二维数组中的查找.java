package jianzhi;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/9/2 18:43
 * @Description: 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 现有矩阵 matrix 如下：
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target=5，返回 true。
 * <p>
 * 给定target=20，返回 false。
 */
public class 剑指Offer04二维数组中的查找 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        /*注释
        * matrix.length;       //表示的是4行    行数
        * matrix[0].length;    //表示的是3列    列数
        * */

        //1.找到左下角的位置 [m][n]
        int m = matrix.length-1;
        int n = 0;
        //2。循环控制，判断当前数值是否大于target，大于往右走，小于往上走
        while (m >= 0 && n < matrix[0].length) {
            if (target == matrix[m][n]) {
                return true;
            } else if (target > matrix[m][n]) {
                n++;
            } else if (target < matrix[m][n]) {
                m--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int [][] matrix = new int[][]{{1,5,9},{2,6,10},{3,7,11},{4,8,12}};
//        int [][] matrix = new int[][]{{1,5,9}};
//        int [][] matrix = new int[][]{};
//        System.out.println(findNumberIn2DArray(matrix, 9));
        int [][] matrix = new int[][]{{1,4,7,11,15}, {2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(findNumberIn2DArray(matrix, 20));
    }
}
