package Day5.Task2;

import Dzien4.User;

public class Contractor extends User {
    private String company;

    public Contractor(String username, String email, String company) {
        super(username, email);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}
