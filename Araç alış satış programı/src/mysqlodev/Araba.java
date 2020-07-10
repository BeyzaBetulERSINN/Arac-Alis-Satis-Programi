package mysqlodev;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Araba {
    private int ID;
    private String Marka;
    private String Model;
    private int VitesTuruID;
    private int YakitTuruID;
    private int RenkID;
    
    public Araba(){}
    
    public Araba(int ID, String Marka, String Model, int VitesTuruID, int YakitTuruID, int RenkID) {
        this.ID = ID;
        this.Marka = Marka;
        this.Model = Model;
        this.VitesTuruID = VitesTuruID;
        this.YakitTuruID = YakitTuruID;
        this.RenkID = RenkID;
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
     * @return the Marka
     */
    public String getMarka() {
        return Marka;
    }

    /**
     * @param Marka the Marka to set
     */
    public void setMarka(String Marka) {
        this.Marka = Marka;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the VitesTuruID
     */
    public int getVitesTuruID() {
        return VitesTuruID;
    }

    /**
     * @param VitesTuruID the VitesTuruID to set
     */
    public void setVitesTuruID(int VitesTuruID) {
        this.VitesTuruID = VitesTuruID;
    }

    /**
     * @return the YakitTuruID
     */
    public int getYakitTuruID() {
        return YakitTuruID;
    }

    /**
     * @param YakitTuruID the YakitTuruID to set
     */
    public void setYakitTuruID(int YakitTuruID) {
        this.YakitTuruID = YakitTuruID;
    }

    /**
     * @return the RenkID
     */
    public int getRenkID() {
        return RenkID;
    }

    /**
     * @param RenkID the RenkID to set
     */
    public void setRenkID(int RenkID) {
        this.RenkID = RenkID;
    }

    @Override
    public String toString() {
        try {
            Veritabani vt=new Veritabani();
            return Marka + "-" + Model + "-"+vt.getRenk(RenkID)+"-"+vt.getVitesTuru(VitesTuruID)+"-"+vt.getYakitTuru(YakitTuruID);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Araba.class.getName()).log(Level.SEVERE, null, ex);
            return "Hata";
        } catch (SQLException ex) {
            Logger.getLogger(Araba.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Hata";
    }
    
}
