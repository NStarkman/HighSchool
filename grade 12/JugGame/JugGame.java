package JugGameProject;

import JugGameProject.JugGameVessel;

public class JugGame {
    JugGameVessel jg3;
    JugGameVessel jg5;
    JugGameVessel jg8;
    boolean Wins = false;
    // Move counter begins, keeping track of the amount of moves completed
    int moves = 0;

    // calls the jugs with their proper volumes and capacities for the game to start
    public JugGame() throws Exception {
        jg3 = new JugGameVessel(3, 0);
        jg5 = new JugGameVessel(5, 0);
        jg8 = new JugGameVessel(8, 8);
        // Calls the Wins method, making sure that the method is used in the code
        setWins();


    }

    public void pour(int from, int to) throws Exception{
        JugGameVessel jFrom = new JugGameVessel(5, 8);
        JugGameVessel jTo= new JugGameVessel(5, 8);
        // Makes the vessels accurate to the numbers the player inputs for 'from' and 'to'
            if (from == 3) {
                jFrom = jg3;
            } else if (from == 5) {
                jFrom = jg5;
            } else if (from == 8) {
                jFrom = jg8;
            }
            if (to == 3) {
                jTo = jg3;
            } else if (to == 5) {
                jTo = jg5;
            } else if (to == 8) {
                jTo = jg8;
        }
            // adds 1 to the moves counter each time this method is called upon
        moves++;
        int VesselSpace = jTo.getCapacity()-jTo.getVolume();
        // Makes sure that the jugs do not overflow, but max out instead
        if (jFrom.getVolume() >= VesselSpace){
            jTo.setVolume(jTo.getCapacity()) ;
            jFrom.setVolume(jFrom.getVolume()-VesselSpace);
            setWins();
            // Makes sure that only the proper amount of water is put into the jug, without accidentally maxing it out
        }else if (jFrom.getVolume()<=VesselSpace){
            jTo.setVolume(jFrom.getVolume()+jTo.getVolume());
            jFrom.setVolume(0);
            setWins();
        }

    }
    // Makes sure that the win conditions are met
    public void setWins(){
        if (jg5.getVolume() == 4 && jg8.getVolume()==4){
            Wins = true;
        }
    }

    public int getMoves() {
        return moves;
    }

    // Turns the information into a string for printing
    public String toString() {
        return  "Jug 3=("+jg3+")"+
                "\nJug 5=("+jg5+")\n"+
                "Jug 8=("+jg8+")";
    }
}

