public class Whistle {
    private String sound;
    public String W(String whistleS){
        this.sound=whistleS;
        return sound;
    }
    public void sound(){
        System.out.println(W(sound));
    }
}
