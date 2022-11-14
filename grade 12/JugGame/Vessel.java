package JugGameProject;

public class Vessel {
    private int volume;

    public Vessel(int v) throws Exception {
        setVolume(v);
        getVolume();
    }
    //Creates the volume for the jug, as it has to be greater than 0
    //If it is less than zero an exception is thrown
    public void setVolume(int s) throws Exception {
        if (this.volume < 0) {
            throw new Exception();

        } else {
            this.volume = s;
        }
    }
    public int getVolume() {
        return this.volume;
    }
    // Turns the information into a string for printing
    public String toString() {
        return "Volume = " + volume +" | " ;
    }
}

