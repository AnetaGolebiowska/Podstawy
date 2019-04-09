package Dzien4;

public abstract class User {
    private long id; // ewentualnie long, jeśli bedzie dużo liczb, niestatyczne, bo dla każdego inne
    private static long maxId; // dana metoda znajduje się w jednym wspólnym miejscu w pamięci. określa
//    osatnie maxymalne ID
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.id = maxId++; // przydzielenie i modyfikacja - inkrementacja (zwiększenie ID)
//        wpłynie ona na wszystkie obiekty, które dziedziczą
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    } // dodajemy to string po to, żeby nie wyświetlało nam adresu, tylko ciąg znaków - użytkowników
//    w toString nie robimy nowych linii
}
