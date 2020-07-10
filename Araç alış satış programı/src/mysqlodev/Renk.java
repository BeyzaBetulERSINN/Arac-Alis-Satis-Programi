package mysqlodev;

public class Renk {
    private int ID;
    private String renk;

    public Renk(int ID, String renk) {
        this.ID = ID;
        this.renk = renk;
    } 
    public Renk(String renk) {
    this.renk = renk;
    } 
    public Renk() { }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return renk;
    }
    
    
}
