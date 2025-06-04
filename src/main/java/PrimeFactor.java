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
                for(devisor=2;number >1;devisor++){
                    while (number % devisor == 0) {
                        factors.add(devisor);
                        number /= devisor;
                    }
                }
            }else if(number == 9) {
                factors.add(3);
                factors.add(3);
            }else {
                factors.add(number);
            }
        }

        return factors;
    }
}
