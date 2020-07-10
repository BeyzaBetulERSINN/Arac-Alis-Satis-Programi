package mysqlodev;


public class YakitTuru {
    private int ID;
    private String YakitTuru;

    public YakitTuru(int ID, String YakitTuru) {
        this.ID = ID;
        this.YakitTuru = YakitTuru;
    }

    public YakitTuru(String YakitTuru) {
        this.YakitTuru = YakitTuru;
    }
    public YakitTuru() {}

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
     * @return the YakitTuru
     */
    public String getYakitTuru() {
        return YakitTuru;
    }

    /**
     * @param YakitTuru the YakitTuru to set
     */
    public void setYakitTuru(String YakitTuru) {
        this.YakitTuru = YakitTuru;
    }

    @Override
    public String toString() {
        return YakitTuru;
    }
}
