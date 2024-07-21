package entities;

public class Movie {

    private Integer id;
    private String title;
    private Integer year;
    private String director;
    private String gender;
    private Integer score;
    private static int counterId = 0;

    public Movie() {
        this.id = ++counterId;
    }

    public Movie(String title, Integer year, String director, String gender, Integer score) {
        this();
        this.title = title;
        this.year = year;
        this.director = director;
        this.gender = gender;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", year=").append(year);
        sb.append(", director='").append(director).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}
