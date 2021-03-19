package utilities;

public enum SkinSpaceShip {
    STANDARD("spaceShip.png"),
    DELUXE("starShip.png"),
    PRIME("maxShip.png");

    private String path;

    private SkinSpaceShip(final String path){
        this.path = path;
    }

    public String getPath(){
        return this.path;
    }
}
