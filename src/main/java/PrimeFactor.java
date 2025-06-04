import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number){
        List<Integer> factors = new ArrayList<>();
        if( number > 1  ) {
            int devisor = 2;
            if (number == 4) {
                while (number % devisor == 0) {
                    factors.add(devisor);
                    number /= devisor;
                }
            }else if(number == 6){
                while (number % devisor == 0) {
                    factors.add(devisor);
                    number /= devisor;
                }
                while (number % 3 == 0) {
                    factors.add(3);
                    number /= 3;
                }

            }else {
                factors.add(number);
            }
        }

        return factors;
    }
}
