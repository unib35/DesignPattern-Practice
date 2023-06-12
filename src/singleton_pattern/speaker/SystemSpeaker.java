package singleton_pattern.speaker;

public class SystemSpeaker {
    static private SystemSpeaker speaker;
    private int volume;
    private SystemSpeaker(){
        this.volume = 5;
    }
    public static SystemSpeaker getInstance() {
        if (speaker == null) speaker = new SystemSpeaker();

        return speaker;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
