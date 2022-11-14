package JugGameProject;

public class JugGameVessel extends Vessel {
    private int capacity;
    public JugGameVessel(int c, int v)throws Exception{
        super(v);
        setCapacity(c);
    }
    //Creates the sizes of the jugs used in the game, if it does not match the size it throws exception
    public void setCapacity(int c) throws Exception{
        if (c == 3 || c==5 || c==8){
            this.capacity = c;
        } else {
            throw new Exception();
        }
    }
    public int getCapacity() {
        return this.capacity;
    }
    // Turns the information into a string for printing
    public String toString() { return super.toString() + "Capacity = " + capacity; }


}