package dev.nartov;

class Main {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 1) {
            nums[0] = nums[0] * nums[0];
            return nums;
        } else {
            int[] result = new int[nums.length];
            int right = nums.length - 1;
            int left = 0;
            int i = nums.length - 1;
            while (left < right) {
                int sqrL = nums[left] * nums[left];
                int sqrR = nums[right] * nums[right];
                if (sqrL > sqrR) {
                    result[i--] = sqrL;
                    left++;
                } else {
                    result[i--] = sqrR;
                    right--;
                }
            }
            return result;
        }
    }

    public int[] sortedSquaresInsane(int[] nums) {
               /*
        1.ищем где меняется знак
        2.проходимся по обеим частям параллельно
        3.как в сортировке слиянием делаем новый массив
         */

        //1.ищем где меняется знак
        if (nums.length==1) {
            nums[0]=nums[0]*nums[0];
            return nums;
        }
        else
        {
            int left = 0;
            int right = nums.length - 1;

            while (right - left > 0) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > 0&&mid!=0) {
                    //если число положительное, то справа знак не поменяется
                    if (nums[mid - 1] <= 0) {
                        //нашли, где меняется знак, можно бить на два массива
                        int leftStart = mid - 1;
                        int rightStart = mid;
                        return fillArrays(nums, leftStart, rightStart);
                    } else {
                        //если не нашли, где меняется знак,
                        // то при положительном числе знак поменяется только слева
                        right = mid - 1;
                    }
                } else if (nums[mid] < 0) {
                    //если число отрицательное, то слева знак не поменяется
                    if (nums[mid + 1] >= 0) {
                        //нашли, где меняется знак, можно бить на два массива
                        int leftStart = mid;
                        int rightStart = mid + 1;
                        return fillArrays(nums, leftStart, rightStart);
                    } else {
                        //если не нашли, то ищем правее
                        left = mid + 1;
                    }
                } else {
                    //тут нашли ноль, бьём на два массива
                    int leftStart = mid - 1;
                    int rightStart = mid;
                    return fillArrays(nums, leftStart, rightStart);
                }
            }

        }
        if (nums[0]>0){
            for (int i = 0; i < nums.length; i++) {
                nums[i]=nums[i]*nums[i];
            }
            return nums;
        }
        else {
            int[] nums2 = new int[nums.length];
            for (int i = nums.length-1; i >= 0; i--) {
                nums2[nums.length-1-i]=nums[i]*nums[i];
            }
            return nums2;
        }

    }

    private  int[] fillArrays(int[] nums, int leftStart, int rightStart) {
        int[] out = new int[nums.length];
        int k = 0;
        //i=left j=right k=source
        while (leftStart >= 0 && rightStart < nums.length) {
            if (Math.abs(nums[leftStart]) < Math.abs(nums[rightStart])) { //если модуль левой меньше, то записываем квадрат из левой части, увеличивая счётчик нового массива и уменьшая для левой части
                out[k++] = nums[leftStart] * nums[leftStart--];
            } else {
                out[k++] = nums[rightStart] * nums[rightStart++];
            }
        }

        if (leftStart < 0) {
            for (; rightStart < nums.length; rightStart++) {
                out[k++] = nums[rightStart] * nums[rightStart];
            }
        } else if (rightStart <= nums.length + 1) {
            for (; leftStart >= 0; leftStart--) {
                out[k++] = nums[leftStart] * nums[leftStart];
            }
        }
        return out;

    }
}