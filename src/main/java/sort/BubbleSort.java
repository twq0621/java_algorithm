package sort;
import java.util.Arrays;

/**
 * 冒泡排序
 *1比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *
 *2对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 *
 *3针对所有的元素重复以上的步骤，除了最后一个。
 *
 *4.持续每次对越来越少的元素重复上面的步骤①~③，直到没有任何一对数字需要比较。
 * 冒泡排序是稳定的排序算法，最容易实现的排序, 最坏的情况是每次都需要交换, 共需 遍历 并交换将近n²/2次,
 * 时间 复杂度为O(n²). 最佳的情况是内循环遍历一次后发现排序是对的,
 * 因此退出循环, 时间复杂度为O(n). 平均来讲, 时间复杂度为O(n²).
 * 由于冒泡排序中只有 缓存 的temp变量需要内存 空间 , 因此空间复杂度为常量O(1)。
 */
public class BubbleSort {
    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int length = array.length;
        //外层：需要length-1次循环比较
        for (int i = 0; i < length - 1; i++) {
            //内层：每次循环需要两两比较的次数，每次比较后，都会将当前最大的数放到最后位置，所以每次比较次数递减一次
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    //交换数组array的j和j+1位置的数据
                    swap(array, j, j+1);
                }
            }
        }
    }

    /*
     * 交换数组array的i和j位置的数据
     * @param array 数组
     * @param i 下标i
     * @param j 下标j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
       public static void main(String[] args){
        int[] arr = {14,8833,10,7,2,4,11,12,7,62,3,4,2,1,8,9,19};
           sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}