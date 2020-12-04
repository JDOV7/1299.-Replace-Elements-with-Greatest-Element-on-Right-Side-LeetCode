package leetcode;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide1299 {

    public void ReplaceElementswithGreatestElementonRightSide1299() {
        int[] arr = {17, 18, 5, 4, 6, 1};
        for (int i = 0; i < arr.length; i++) {
            int iTemporal = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > iTemporal) {
                    iTemporal = arr[j];
                }
            }
            arr[i] = iTemporal;
        }
        arr[arr.length - 1] = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
