package com.wenj.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 14 17:04 星期四
 * @description: 把二叉树中的Node类，改造成支持泛型,并使用Comparable进行比较
 */
public class BinaryTreeDemo {

    public static void main(String[] args) {
        int[] randoms = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        double[] random1 = new double[]{6.7, 0.7, 3.0, 7.3, 1.0, 0, 7.8, 8.1, 1.0, 7.4};
        Node<Double> roots = new Node<>();
        /*for (int number : randoms) {
            roots.add(number);
        }*/
        for (double number : random1) {
            roots.add(number);
        }
        System.out.println(roots.midValues());
    }
}

class Node<T extends Comparable<T>> {
    // 左子节点
    public Node<T> leftNode;
    // 右子节点
    public Node<T> rightNode;
    // 值
    public T value;

    // 插入 数据
    public void add(T value) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == this.value) {
            this.value = value;
        }
        // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同放左边,未添加泛型前
            /*if ((Double) this.value >= (Double) value) {
                if (null == leftNode) {
                    leftNode = new Node<T>();
                }
                leftNode.add(value);
            }*/
            if (this.value.compareTo(value) >= 0) {
                if (null == leftNode) {
                    leftNode = new Node<T>();
                }
                leftNode.add(value);
            }
            // 新增的值，比当前值大放右边
            else {
                if (null == rightNode)
                    rightNode = new Node<>();
                rightNode.add(value);
            }
        }
    }

    /*
    左序即： 中间的数遍历后放在左边
    中序即： 中间的数遍历后放在中间
    右序即： 中间的数遍历后放在右边
     */
    // 中序遍历所有的节点
    public List<T> midValues() {
        List<T> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.midValues());

        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != rightNode)

            values.addAll(rightNode.midValues());

        return values;
    }

    // 左序遍历所有的节点
    public List<T> lefValues() {
        List<T> values = new ArrayList<>();
        // 当前节点
        values.add(value);

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.lefValues());

        // 右节点的遍历结果
        if (null != rightNode)
            values.addAll(rightNode.lefValues());

        return values;

    }
}