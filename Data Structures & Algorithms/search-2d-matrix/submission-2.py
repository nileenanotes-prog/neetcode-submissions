class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range(len(matrix)):
            if (i == len(matrix)-1) or (target >= matrix[i][0] and target < matrix[i+1][0]):
                top, rear = 0, len(matrix[i])-1
                while (top<=rear):
                    mid = int((top + rear) /2)
                    if (matrix[i][mid] == target):
                        return True
                    elif (matrix[i][mid] > target):
                        rear = mid -1
                    else:
                        top = mid +1
        return False

