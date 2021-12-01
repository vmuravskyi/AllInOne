package enumexample;

public enum MusicType {
    ROCK("Rock"), JAZZ("Jazz"), CLASSIC("Classic");
    private String realName;

    MusicType(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String info() {
        switch (this) {
            case JAZZ:
            case ROCK:
            case CLASSIC:
                return "This is " + getRealName();
            default:
                throw new IllegalArgumentException();
        }
    }
}
