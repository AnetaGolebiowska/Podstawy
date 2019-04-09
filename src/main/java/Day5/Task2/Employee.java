package Day5.Task2;

import Dzien4.User;

public class  Employee extends User {
    private float workload;

    public Employee(String username, String email, float workload) {
        super(username, email); // zawsze musi być wywołanie konstruktora bazwowego
        this.workload = workload; // zapisanie argumentu do zmiennej klasy, zawsze po super
    }

    public float getWorkload() {
        return workload;
    }
}
