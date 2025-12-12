public class Counter{
    private int value;

    public Counter(int startValue){
        this.value = startValue;
    }
    public Counter(){
        this.value = 0;
    }
    public int value(){
        return this.value;
    }
    public void increase(){
        this.value += 1;
    }
    public void decrease(){
        this.value -= 1;
    }
    public void increase(int Increaseby){
        if (Increaseby > 0) {
            this.value += Increaseby;
        }
        
    } 
    public void decrease(int Decreaeby){
        if (Decreaeby < 0) {
            this.value -= Decreaeby;
        }
        
    }


}