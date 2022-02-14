/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh211;

/**
 *
 * @author dinhnam_ddn
 */
public class ArrayIntList {

    private int[] elementData;
    private int size;

    public ArrayIntList() {
    }

    public ArrayIntList(int[] elementData, int size) {
        this.elementData = elementData;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int[] getElementData() {
        return elementData;
    }

    public ArrayIntList fromCounts(int n) {
        int[] arr = new int[n];
        int index = 0;
        for (int i = 0; i < size; i += 2) {
            for (int j = 1; j <= elementData[i]; j++) {
                arr[index] = elementData[i + 1];
                index++;
            }
        }
        ArrayIntList list = new ArrayIntList(arr, n);
        return list;
    }
}
