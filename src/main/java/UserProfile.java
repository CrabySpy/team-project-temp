import java.time.LocalDateTime;

public class UserProfile {
    private String name;
    private int userID;
    private String currency;
    private final LocalDateTime createdAt;

    public UserProfile(int userID, String name,
                       String email, String currency) {
        this.userID = userID;
        this.name = name;
        this.currency = currency;
        this.createdAt = LocalDateTime.now();
    }

    //  Getters
    public int getId() {
        return userID;
    }
    public String getName() {
        return name;
    }
    public String getCurrency() {return currency;}
    public LocalDateTime getCreatedAt() {return createdAt;}


    //  Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}