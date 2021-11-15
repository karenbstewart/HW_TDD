public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int newVolume){
        this.volume = newVolume;
    }

    public int drink(){
        int currentVolume = this.volume;
        int newVolume = currentVolume - 10;
        setVolume(newVolume);
        return newVolume;
    }

    public void empty() {
        setVolume(0);
    }

    public void fillBottle() {
        setVolume(100);
    }
}
