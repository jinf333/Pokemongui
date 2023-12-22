package Assignment;

public class Player {
    private String username;
    private int score;

    // Constructor
    public Player() {
    }

    public Player(String username, int score) {
        this.username = username;
        this.score = score;

    }
    
    // Getters and Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }



    // Other methods
    
    // toString
    @Override
    public String toString() {
        return String.format("Username: %s, Score: %d", username, score);
    }
}
