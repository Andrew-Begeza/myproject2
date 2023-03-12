package com.mypack;

public class myArrayList {
    public int[] arr;
    public myArrayList(int length) {
        arr = new int[length];
    }
    public int size() {
        return arr.length;
    }
    private int[] extend() {
        int[] newArr = new int[size()+1];
        for(int i = 0; i<arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    private int[] reduce() {
        int[] newArr = new int[size()-1];
        for (int i = 0, z = 0; i<arr.length; i++,z++) {
            if(arr[i] == 0) {
                z--;
                continue;
            }
            newArr[z] = arr[i];
        }
        return newArr;
    }
    public void add(int a) {
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = a;
                break;
            } else if (i == arr.length-1) {
                arr = extend();
                arr[i+1] = a;
                break;
            }
        }
    }
    public void remove(int index) {
        arr[index] = 0;
        arr = reduce();
    }
    public void changeTo(int index, int value) {
        arr[index] = value;
    }
    public void printArr() {
        System.out.print("[");
        for (int i = 0; i<arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }
}