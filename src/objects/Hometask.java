package objects;


public class Hometask {
    private String theme;
    private int number;
    private String header;
    private String textOfHometask;

    public Hometask(String theme, int number, String header, String textOfHometask) {
        this.theme = theme;
        this.number = number;
        this.header = header;
        this.textOfHometask = textOfHometask;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTextOfHometask() {
        return textOfHometask;
    }

    public void setTextOfHometask(String textOfHometask) {
        this.textOfHometask = textOfHometask;
    }
}
