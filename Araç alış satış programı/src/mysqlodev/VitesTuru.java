package mysqlodev;

public class VitesTuru {
    private int ID;
    private String VitesTuru;

    
    public VitesTuru(String VitesTuru) {
        this.VitesTuru = VitesTuru;
    }
    public VitesTuru() {}

    public VitesTuru(int ID, String VitesTuru) {
        this.ID = ID;
        this.VitesTuru = VitesTuru;
    }

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
     * @return the VitesTuru
     */
    public String getVitesTuru() {
        return VitesTuru;
    }

    /**
     * @param VitesTuru the VitesTuru to set
     */
    public void setVitesTuru(String VitesTuru) {
        this.VitesTuru = VitesTuru;
    }

    @Override
    public String toString() {
        return VitesTuru;
    }
    
    
}
