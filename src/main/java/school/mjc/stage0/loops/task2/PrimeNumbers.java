package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        boolean tub;
        while(i<=printToInclusive){
            tub = true;
            int k = 2;
            while(k < i){
                if(i % k == 0){
                    tub = false;
                    break;
                }
                k += 1;
            }
            if (tub) {
                System.out.println(i);
            }
            i += 1;
        }
    }
}
