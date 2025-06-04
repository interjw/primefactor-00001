import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number){
        List<Integer> factors = new ArrayList<>();
        for (int devisor = 2; number > 1; devisor++) {
            while (number % devisor == 0) {
                factors.add(devisor);
                number /= devisor;
            }
        }

        return factors;
    }
}
