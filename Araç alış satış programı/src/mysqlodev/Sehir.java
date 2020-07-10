package mysqlodev;

public class Sehir {
    private int ID;
    private String Sehir;

    public Sehir(int ID, String Sehir) {
        this.ID = ID;
        this.Sehir = Sehir;
    }

    public Sehir(String Sehir) {
        this.Sehir = Sehir;
    }
    
    public Sehir() {}

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
     * @return the Sehir
     */
    public String getSehir() {
        return Sehir;
    }

    /**
     * @param Sehir the Sehir to set
     */
    public void setSehir(String Sehir) {
        this.Sehir = Sehir;
    }

    @Override
    public String toString() {
        return Sehir; //To change body of generated methods, choose Tools | Templates.
    }
    
}
