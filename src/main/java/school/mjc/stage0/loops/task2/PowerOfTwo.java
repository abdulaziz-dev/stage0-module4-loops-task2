package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0){
            int i = 0;
            int daraja = 1;
            while (i <= power){
                System.out.println(daraja);
                daraja *= 2;
                i += 1;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
