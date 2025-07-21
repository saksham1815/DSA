class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(matrix[0][0]);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(i == 0 && j == 0) {
                    continue;
                }
                if(i == 0) {
                    matrix[i][j] ^= matrix[i][j-1]; 
                } else if(j == 0) {
                    matrix[i][j] ^= matrix[i-1][j];
                } else {
                    matrix[i][j] ^= matrix[i][j-1] ^ matrix[i-1][j] ^ matrix[i-1][j-1];
                }
                maxHeap.offer(matrix[i][j]);
            }
        }
        int answer = maxHeap.poll();
        for(int i=1;i<k;i++) {
            answer = maxHeap.poll();
        }
        return answer;
    }
}