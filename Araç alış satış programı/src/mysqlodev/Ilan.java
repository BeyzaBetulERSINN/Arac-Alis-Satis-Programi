package mysqlodev;

import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ilan {
    private int ID;
    private String Adi;
    private float Fiyat;
    private int Km;
    private Date Tarih;
    private int ArabaID;
    private int SehirID;

    public Ilan(){}
    
    public Ilan(int ID, String Adi, float Fiyat, int Km, Date Tarih, int ArabaID, int SehirID) {
        this.ID = ID;
        this.Adi = Adi;
        this.Fiyat = Fiyat;
        this.Km = Km;
        this.Tarih = Tarih;
        this.ArabaID = ArabaID;
        this.SehirID = SehirID;
    }

    public Ilan(String Adi, float Fiyat, int Km, Date Tarih, int ArabaID, int SehirID) {
        this.Adi = Adi;
        this.Fiyat = Fiyat;
        this.Km = Km;
        this.Tarih = Tarih;
        this.ArabaID = ArabaID;
        this.SehirID = SehirID;
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
     * @return the Adi
     */
    public String getAdi() {
        return Adi;
    }

    /**
     * @param Adi the Adi to set
     */
    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

    /**
     * @return the Fiyat
     */
    public float getFiyat() {
        return Fiyat;
    }

    /**
     * @param Fiyat the Fiyat to set
     */
    public void setFiyat(float Fiyat) {
        this.Fiyat = Fiyat;
    }

    /**
     * @return the Km
     */
    public int getKm() {
        return Km;
    }

    /**
     * @param Km the Km to set
     */
    public void setKm(int Km) {
        this.Km = Km;
    }

    /**
     * @return the Tarih
     */
    public Date getTarih() {
        return Tarih;
    }

    /**
     * @param Tarih the Tarih to set
     */
    public void setTarih(Date Tarih) {
        this.Tarih = Tarih;
    }

    /**
     * @return the ArabaID
     */
    public int getArabaID() {
        return ArabaID;
    }

    /**
     * @param ArabaID the ArabaID to set
     */
    public void setArabaID(int ArabaID) {
        this.ArabaID = ArabaID;
    }

    /**
     * @return the SehirID
     */
    public int getSehirID() {
        return SehirID;
    }

    /**
     * @param SehirID the SehirID to set
     */
    public void setSehirID(int SehirID) {
        this.SehirID = SehirID;
    }

    @Override
    public String toString() {
        try {
            Veritabani vt=new Veritabani();
            return "\"" + Adi + "\" - Fiyat:" + Fiyat + " - " + Km + "KM - " + Tarih + " - Araba(" + vt.getAraba(ArabaID).toString() + ") - "+vt.getSehir(SehirID).toString();
        } catch (SQLException ex) {
            Logger.getLogger(Ilan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ilan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Hata";
    }
    
    
}
