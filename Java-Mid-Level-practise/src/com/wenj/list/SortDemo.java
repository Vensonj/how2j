package com.wenj.list;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 20 9:31 星期三
 * @description: 创建4万个随机数，然后用分别用冒泡法，选择法，二叉树3种排序算法进行排序，比较哪种更快——二叉树秒杀
 */
public class SortDemo {


    public static int[] createRandom(int capacity) {
        int[] arr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000 + 1);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = createRandom(40000);
//        bubbleSort(arr);
//        selectSort(arr);
        binaryTreeSort(arr);
    }

    //冒泡排序法,每次排序中的最大值就排在最后
    public static void bubbleSort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("花费了" + (end - start));
//        System.out.println("冒泡排序后：" + Arrays.toString(arr));
    }

    //选择排序法
    public static void selectSort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("花费了" + (end - start));
//        System.out.println("选择排序后：" + Arrays.toString(arr));
    }

    //二叉树排序法
    public static void binaryTreeSort(int[] arr) {
        long start = System.currentTimeMillis();
        Node node = new Node();
        for (int num:arr) {
            node.add(num);
        }
        long end = System.currentTimeMillis();
        node.midValues();
        System.out.println("花费了" + (end - start));
//        System.out.println("二叉树排序："+node.midValues());
    }
}

