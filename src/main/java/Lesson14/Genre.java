package Lesson14;

public enum Genre {
    CLASSIC(7), COMEDY(9), DOCUMENT(5);

    Genre(int rating) {
        this.rating = rating;
    }

    int rating;

    public int getRating() {
        return rating;
    }
}
