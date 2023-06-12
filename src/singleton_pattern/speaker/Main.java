package singleton_pattern.speaker;

public class Main {
    public static void main(String[] args){
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();
        //동일한 인스턴스를 가지기 때문에 speaker1의 값을 바꾸면 speaker2의 값도 바뀐다.

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(11);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolume(22);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }
}
