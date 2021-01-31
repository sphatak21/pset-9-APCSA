import java.util.*;

public class ProblemSet9 {
    public static void main(String[] args){
        System.out.println("");
    }
    public int[] evenOdd(int[] arr) {
        if(arr == null || arr.length == 0){
            return null;
        }
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            }else {
                odd.add(i);
            }
        }
        even.addAll(odd);
        return even.stream().mapToInt(i -> i).toArray();
    }

    public int[] notAlone(int[] arr, int alone) {
        if(arr == null || arr.length == 0){
            return null;
        }
        for(int i = 1; i < arr.length-1; i ++){
            if(arr[i] == alone){
                if(arr[i-1] != alone && arr[i+1] != alone){
                    arr[i] = Math.max(arr[i - 1], arr[i + 1]);
                }
            }
        }
        return arr;
    }

    public int[] shiftLeft(int[] arr) {
        if(arr == null){
            return null;
        }else if(arr.length == 0){
            return arr;
        }
        int[] returnarr = new int[arr.length];
        for(int i = 1; i < arr.length; i ++){
            returnarr[i-1] = arr[i];
        }
        returnarr[returnarr.length - 1] = arr[0];
        return returnarr;
    }

    public int[] fillIn(int start, int end) {
        if(start > end){
            return null;
        }
        int[] arr = new int[end - start];
        for(int i = 0; i < arr.length; i ++){
            arr[i] = start+i;
        }
        return arr;
    }

    public boolean triple(int[] arr) {
        if(arr == null){
            return false;
        }
        int threeCounter = 0;
        for(int i : arr){
            if(i == 3){
                threeCounter++;
            }
        }
        return threeCounter == 3;
    }

    public int pairs(int[] a, int[] b) {
        if(a == null || b == null || a.length != b.length){
            return -1;
        }
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(Math.abs(a[i] - b[i]) < 3){
                count++;
            }
        }
        return count;
    }

    public boolean twentyFour(int[] arr) {
        if(arr== null) {
            return false;
        }
        boolean twos = false;
        boolean fours = false;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == 2 || arr[i] == 4){
                if(arr[i + 1] == arr[i]){
                    if(arr[i] == 2){
                        twos = true;
                    }else{
                        fours = true;
                    }
                }
            }
        }
        return (!twos || !fours) && (twos || fours);
    }

    public boolean fourteen(int[] arr) {
        if(arr == null){
            return false;
        }
        for(int i : arr){
            if(i != 1 && i != 4){
                return false;
            }
        }
        return true;
    }

    public int centeredAverage(int[] arr) {
        if(arr == null || arr.length < 3){
            return -1;
        }
        List<Integer> avg = new ArrayList<>();
        for(int i : arr){
            avg.add(i);
        }
        avg.remove(Collections.max(avg));
        avg.remove(Collections.min(avg));
        int sum = 0;
        for(int i : avg){
            sum+=i;
        }
        return sum;
    }

    public int outliers(int[] arr) {
        if(arr == null || arr.length < 3){
            return -1;
        }
        List<Integer> avg = new ArrayList<>();
        for(int i : arr){
            avg.add(i);
        }
        return Collections.max(avg) - Collections.min(avg);
    }
}