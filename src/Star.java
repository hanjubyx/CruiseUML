public class Star {
    private String name;
    private String character;

    public Star(String name, String character) {
        this.name = name;
        this.character = character;
    }

    // returns the name of the star
    public String getName() {
        return name;
    }

    // returns the character played by the star
    public String getCharacter() {
        return character;
    }
}