package Demo;// 给定一个具有以下两个属性的 m x n 整数矩阵：
// ● 每行按非递减顺序排序。
// ● 每行的第一个整数大于前一行的最后一个整数。
// 给定一个整数目标，如果目标在矩阵中，则返回 true，否则返回 false。
// 您必须在 O(log(m * n)) 时间复杂度内编写解决方案。
//
// 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// 输出：true
// 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// 输出：false
//
// 约束：
// ● m == matrix.length
// ● n == matrix[i].length
// ● 1 <= m, n <= 100
// ● -10^4 <= matrix[i][j], target <= 10^4

class Matrix {
    public static boolean search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] m = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        int[][] m2 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target2 = 3;
        System.out.println(search(m,target));
        System.out.println(search(m2,target2));
    }

}
