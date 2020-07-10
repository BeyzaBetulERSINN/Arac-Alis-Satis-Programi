package mysqlodev;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class Veritabani {
    
    Connection connection;
    String ConnectionString;
    
    public Veritabani() throws ClassNotFoundException {
        //Java'ya JDBC driverını kullanacağımızı belirtiyoruz.
        Class.forName("com.mysql.jdbc.Connection");
    }
    public void connect() throws SQLException{
        //DriverManager sınıfı aracılığıyla bağlantımızı oluşturuyoruz.
        //Alttaki satırın kendi veritabanınıza göre değiştirilmesi gerekiyor
       connection=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sonn","root","");
    }
    
    //Fonksiyonların hepsinde throws SQLException bildirgesi var. Bu sebeple bunları bir yerde kullanırken try-catch ile Bir SQLException olup olmadığını kontrol etmeliyiz.
    
    public void addAraba(Araba eklenecek) throws SQLException{
        connect();
        //Tbl_Araba tablosuna fonksiyona gelen arabayı eklemek için gerekli SQL komutu (Soru işaretleri parametreleri temsil ediyor)
        String sorguString="INSERT INTO Tbl_Araba(Araba_Marka,Araba_Model,Araba_RenkID,Araba_VitesTuruID,Araba_YakitTuruID) VALUES(?,?,?,?,?);";
        //Parametreleri sonradan eklemek için PreparedStatement kullanıyoruz.(Sebebi:sorguString'ini satırlarca uzatmayıp okunabilirliği artırmak.)
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        //Yukarıda '?' olarak verdiğimiz parametrelerin değerlerini sorguya atıyoruz. (ilk parametresi indexi, ikincisi değeri)
        sorgu.setString(1, eklenecek.getMarka());
        sorgu.setString(2, eklenecek.getModel());
        sorgu.setInt(3, eklenecek.getRenkID());
        sorgu.setInt(4, eklenecek.getVitesTuruID());
        sorgu.setInt(5, eklenecek.getYakitTuruID());
        System.out.println(eklenecek.toString());
        //Eğer sorgu başarıyla çalıştıysa veya bir hata olduysa bunu bildiren mesajları ekrana yazdırıyoruz.
        if(sorgu.executeUpdate()>0)        
            System.out.println("Araba başarıyla eklendi.");
        else
            System.out.println("Araba eklerken bir hata oluştu.");
        connection.close();
    }
    
    public void addIlan(Ilan eklenecek) throws SQLException{
        connect();
        //Tbl_Ilan tablosuna fonksiyona gelen ilanı eklemek için gerekli SQL komutu (Soru işaretleri parametreleri temsil ediyor)
        String sorguString="INSERT INTO Tbl_Ilan(Ilan_Adi, Ilan_ArabaID, Ilan_Fiyat, Ilan_Km, Ilan_SehirID, Ilan_Tarih) VALUES(?,?,?,?,?,?);";
        //Parametreleri sonradan eklemek için PreparedStatement kullanıyoruz.(Sebebi:sorguString'ini satırlarca uzatmayıp okunabilirliği artırmak.)
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        //Yukarıda '?' olarak verdiğimiz parametrelerin değerlerini sorguya atıyoruz. (ilk parametresi indexi, ikincisi değeri)
        sorgu.setString(1, eklenecek.getAdi());
        sorgu.setInt(2,eklenecek.getArabaID());
        sorgu.setFloat(3, eklenecek.getFiyat());
        sorgu.setInt(4, eklenecek.getKm());
        sorgu.setInt(5,eklenecek.getSehirID());
        sorgu.setDate(6, eklenecek.getTarih());
        //Eğer sorgu başarıyla çalıştıysa veya bir hata olduysa bunu bildiren mesajları ekrana yazdırıyoruz.
        if(sorgu.executeUpdate()>0)        
            System.out.println("İlan başarıyla eklendi.");
        else
            System.out.println("İlan eklerken bir hata oluştu.");
        connection.close();
    }
    
    
    public void updateAraba(Araba duzenlenecek) throws SQLException{
        connect();
        String sorguString="UPDATE Tbl_Araba SET Araba_Marka=?, Araba_Model=?, Araba_RenkID=?, Araba_VitesTuruID=?, Araba_YakitTuruID=? WHERE ArabaID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        //Yukarıda '?' olarak verdiğimiz parametrelerin değerlerini sorguya atıyoruz. (ilk parametresi indexi, ikincisi değeri)
        sorgu.setString(1, duzenlenecek.getMarka());
        sorgu.setString(2, duzenlenecek.getModel());
        sorgu.setInt(3, duzenlenecek.getRenkID());
        sorgu.setInt(4, duzenlenecek.getVitesTuruID());
        sorgu.setInt(5, duzenlenecek.getYakitTuruID());
        sorgu.setInt(6, duzenlenecek.getID());
        //Eğer sorgu başarıyla çalıştıysa veya bir hata olduysa bunu bildiren mesajları ekrana yazdırıyoruz.
        if(sorgu.executeUpdate()>0)        
            System.out.println("Araba başarıyla düzenlendi.");
        else
            System.out.println("Araba düzenlerken bir hata oluştu.");
        connection.close();
    }
    
    public void updateIlan(Ilan duzenlenecek) throws SQLException{
        connect();
        String sorguString="UPDATE Tbl_Ilan SET Ilan_Adi=?, Ilan_ArabaID=?, Ilan_Fiyat=?, Ilan_Km=?, Ilan_SehirID=?, Ilan_Tarih=? WHERE IlanID=?";
        //Parametreleri sonradan eklemek için PreparedStatement kullanıyoruz.(Sebebi:sorguString'ini satırlarca uzatmayıp okunabilirliği artırmak.)
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        //Yukarıda '?' olarak verdiğimiz parametrelerin değerlerini sorguya atıyoruz. (ilk parametresi indexi, ikincisi değeri)
        sorgu.setString(1, duzenlenecek.getAdi());
        sorgu.setInt(2,duzenlenecek.getArabaID());
        sorgu.setFloat(3, duzenlenecek.getFiyat());
        sorgu.setInt(4, duzenlenecek.getKm());
        sorgu.setInt(5,duzenlenecek.getSehirID());
        sorgu.setDate(6, duzenlenecek.getTarih());
        sorgu.setInt(7, duzenlenecek.getID());
        //Eğer sorgu başarıyla çalıştıysa veya bir hata olduysa bunu bildiren mesajları ekrana yazdırıyoruz.
        if(sorgu.executeUpdate()>0)        
            System.out.println("İlan başarıyla düzenlendi.");
        else
            System.out.println("İlan düzenlerken bir hata oluştu.");
        connection.close();
    }
    
    //Renk,şehir, vites türü ve yakıt türünde yapılan işlemler birebir aynı
    public void addRenk(Renk eklenecek) throws SQLException{
        //Veritabanına bağlanıyoruz
        connect();
        //Ekleme sorgusunu yazıyoruz
        String sorguString="INSERT INTO Tbl_Renk(Renk) VALUES(?)";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        //Metoda gelen eklenecek renk nesnesinden renk değerini çekip sorguya ekliyoruz
        sorgu.setString(1, eklenecek.getRenk());
        if(sorgu.executeUpdate()>0)        
            System.out.println("Renk başarıyla eklendi.");
        else
            System.out.println("Renk eklerken bir hata oluştu.");
        connection.close();

    }
    public void addSehir(Sehir eklenecek) throws SQLException{
        connect();
        String sorguString="INSERT INTO Tbl_Sehir(Sehir) VALUES(?)";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setString(1, eklenecek.getSehir());
                if(sorgu.executeUpdate()>0)        
            System.out.println("Şehir başarıyla eklendi.");
        else
            System.out.println("Şehir eklerken bir hata oluştu.");
        connection.close();
        
    }
    public void addVitesTuru(VitesTuru eklenecek) throws SQLException{
        connect();
        String sorguString="INSERT INTO Tbl_VitesTuru(Vites_Turu) VALUES(?)";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setString(1, eklenecek.getVitesTuru());
        if(sorgu.executeUpdate()>0)        
            System.out.println("Vites Türü başarıyla eklendi.");
        else
            System.out.println("Vites Türü eklerken bir hata oluştu.");
        connection.close();
    }
    public void addYakitTuru(YakitTuru eklenecek) throws SQLException{
        connect();
        String sorguString="INSERT INTO Tbl_YakitTuru(Yakit_Turu) VALUES(?)";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setString(1, eklenecek.getYakitTuru());
        if(sorgu.executeUpdate()>0)        
            System.out.println("Yakıt Türü başarıyla eklendi.");
        else
            System.out.println("Yakıt Türü eklerken bir hata oluştu.");
        connection.close();
    }

    public void updateRenk(Renk eklenecek) throws SQLException{
        connect();
        String sorguString="UPDATE Tbl_Renk SET Renk=? WHERE RenkID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setString(1, eklenecek.getRenk());
        sorgu.setInt(2, eklenecek.getID());
        if(sorgu.executeUpdate()>0)        
            System.out.println("Renk başarıyla güncellendi.");
        else
            System.out.println("Renk güncellerken bir hata oluştu.");
        connection.close();
    }
    public void updateSehir(Sehir eklenecek) throws SQLException{
        connect();
        String sorguString="UPDATE Tbl_Sehir SET Sehir=? WHERE SehirID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setString(1, eklenecek.getSehir());
        sorgu.setInt(2, eklenecek.getID());
        if(sorgu.executeUpdate()>0)        
            System.out.println("Şehir başarıyla güncellendi.");
        else
            System.out.println("Şehir güncellerken bir hata oluştu.");
        connection.close();
    }
    public void updateVitesTuru(VitesTuru eklenecek) throws SQLException{
        connect();
        String sorguString="UPDATE Tbl_VitesTuru SET Vites_Turu=? WHERE VitesTuruID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setString(1, eklenecek.getVitesTuru());
        sorgu.setInt(2, eklenecek.getID());
        if(sorgu.executeUpdate()>0)        
            System.out.println("Vites türü başarıyla güncellendi.");
        else
            System.out.println("Vites türü güncellerken bir hata oluştu.");
        connection.close();
    }
    public void updateYakitTuru(YakitTuru eklenecek) throws SQLException{
        connect();
        String sorguString="UPDATE Tbl_YakitTuru SET Yakit_Turu=? WHERE YakitTuruID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setString(1, eklenecek.getYakitTuru());
        sorgu.setInt(2, eklenecek.getID());
        if(sorgu.executeUpdate()>0)        
            System.out.println("Yakıt türü başarıyla güncellendi.");
        else
            System.out.println("Yakıt türü güncellerken bir hata oluştu.");
        connection.close();
    }
    
    public void deleteIlan(int ID) throws SQLException{
        connect();
        String sorguString="DELETE FROM Tbl_Ilan WHERE IlanID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        if(sorgu.executeUpdate()>0) System.out.println("İlan başarıyla silindi.");
        else System.out.println("Silme işlemi gerçekleştirilirken bir sorun oluştu");
        connection.close();
    }
    public void deleteAraba(int ID) throws SQLException{
        connect();
        String sorguString="DELETE FROM Tbl_Araba WHERE ArabaID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        if(sorgu.executeUpdate()>0) System.out.println("Araba başarıyla silindi.");
        else System.out.println("Silme işlemi gerçekleştirilirken bir sorun oluştu");
        connection.close();
    }
    public void deleteRenk(int ID) throws SQLException{
        connect();
        String sorguString="DELETE FROM Tbl_Renk WHERE RenkID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        if(sorgu.executeUpdate()>0) System.out.println("Renk başarıyla silindi.");
        else System.out.println("Silme işlemi gerçekleştirilirken bir sorun oluştu");
        connection.close();
    }
    public void deleteSehir(int ID) throws SQLException{
        connect();
        String sorguString="DELETE FROM Tbl_Sehir WHERE SehirID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        if(sorgu.executeUpdate()>0) System.out.println("Şehir başarıyla silindi.");
        else System.out.println("Silme işlemi gerçekleştirilirken bir sorun oluştu");
        connection.close();
    }
    public void deleteVitesTuru(int ID) throws SQLException{
        connect();
        String sorguString="DELETE FROM Tbl_VitesTuru WHERE VitesTuruID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        if(sorgu.executeUpdate()>0) System.out.println("Vites Türü başarıyla silindi.");
        else System.out.println("Silme işlemi gerçekleştirilirken bir sorun oluştu");
        connection.close();
    }
    public void deleteYakitTuru(int ID) throws SQLException{
        connect();
        String sorguString="DELETE FROM Tbl_YakitTuru WHERE YakitTuruID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        if(sorgu.executeUpdate()>0) System.out.println("Yakıt Türü başarıyla silindi.");
        else System.out.println("Silme işlemi gerçekleştirilirken bir sorun oluştu");
        connection.close();
    }
    
   
    public ArrayList<Renk> getRenkler() throws SQLException{
       ArrayList<Renk> renkler=new ArrayList<>();
       connect();
       String sorguString="SELECT * FROM Tbl_Renk";
       PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
       ResultSet sonuc=sorgu.executeQuery();
       if(sonuc.first()){
           do{
               Renk renk=new Renk(sonuc.getInt(1), sonuc.getString(2));
               renkler.add(renk);
           }while(sonuc.next());
           
       }
       connection.close();
       return renkler;
    }
    public ArrayList<Sehir> getSehirler() throws SQLException{
       ArrayList<Sehir> sehirler=new ArrayList<>();
       connect();
       String sorguString="SELECT * FROM Tbl_Sehir";
       PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
       ResultSet sonuc=sorgu.executeQuery();
       if(sonuc.first()){
           do{
               Sehir sehir=new Sehir(sonuc.getInt(1), sonuc.getString(2));
               sehirler.add(sehir);
           }while(sonuc.next());
           
       }
       connection.close();
       return sehirler;
    }
    public ArrayList<VitesTuru> getVitesTurleri() throws SQLException{
       ArrayList<VitesTuru> vitesTurleri=new ArrayList<>();
       connect();
       String sorguString="SELECT * FROM Tbl_VitesTuru";
       PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
       ResultSet sonuc=sorgu.executeQuery();
       if(sonuc.first()){
           do{
               VitesTuru vitesTuru=new VitesTuru(sonuc.getInt(1), sonuc.getString(2));
               vitesTurleri.add(vitesTuru);
           }while(sonuc.next());
           
       }
       connection.close();
       return vitesTurleri;
    }
    public ArrayList<YakitTuru> getYakitTurleri() throws SQLException{
       ArrayList<YakitTuru> yakitTurleri=new ArrayList<>();
       connect();
       String sorguString="SELECT * FROM Tbl_YakitTuru";
       PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
       ResultSet sonuc=sorgu.executeQuery();
       if(sonuc.first()){
           do{
               YakitTuru yakitTuru=new YakitTuru(sonuc.getInt(1), sonuc.getString(2));
               yakitTurleri.add(yakitTuru);
           }while(sonuc.next());
           
       }
       connection.close();
       return yakitTurleri;
    }
    public ArrayList<Araba> getArabalar() throws SQLException{
       ArrayList<Araba> arabalar=new ArrayList<>();
       connect();
       String sorguString="SELECT * FROM Tbl_Araba";
       PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
       ResultSet sonuc=sorgu.executeQuery();
       if(sonuc.first()){
           do{
               Araba araba=new Araba(sonuc.getInt(1), sonuc.getString(2),sonuc.getString(3),sonuc.getInt(4),sonuc.getInt(5),sonuc.getInt(6));
               arabalar.add(araba);
           }while(sonuc.next());
           
       }
       connection.close();
       return arabalar;
    }
    public ArrayList<Ilan> getIlanlar(String filtre) throws SQLException{
       ArrayList<Ilan> ilanlar=new ArrayList<>();
       connect();
       String sorguString="SELECT * FROM Tbl_Ilan "
               + "LEFT JOIN Tbl_Araba ON Ilan_ArabaID=ArabaID "
               + "LEFT JOIN Tbl_Renk ON Araba_RenkID=RenkID "
               + "LEFT JOIN Tbl_Sehir ON Ilan_SehirID=SehirID "
               + "LEFT JOIN Tbl_VitesTuru ON Araba_VitesTuruID=VitesTuruID "
               + "LEFT JOIN Tbl_YakitTuru ON Araba_YakitTuruID=YakitTuruID "+filtre;
       PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        //System.out.println(sorguString);
       ResultSet sonuc=sorgu.executeQuery();
       if(sonuc.first()){
           do{
               Ilan ilan=new Ilan(sonuc.getInt(1), sonuc.getString(2),sonuc.getFloat(3),sonuc.getInt(4),sonuc.getDate(5),sonuc.getInt(6),sonuc.getInt(7));
               ilanlar.add(ilan);
           }while(sonuc.next());
           
       }
       connection.close();
       return ilanlar;
    }

    public Renk getRenk(int ID) throws SQLException{
       Renk renk=new Renk();
       connect();
       String sorguString="SELECT * FROM Tbl_Renk WHERE RenkID=?";
       PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
       sorgu.setInt(1, ID);
       ResultSet sonuc=sorgu.executeQuery();
       if(sonuc.first()){
        renk=new Renk(sonuc.getInt(1), sonuc.getString(2));
       }
       else renk=new Renk(-1,"Renk Bulunamadı");
       connection.close();
       return renk;    
    }
    public Sehir getSehir(int ID) throws SQLException{
        Sehir sehir=new Sehir(-1, "Hata");
        connect();
        String sorguString="SELECT * FROM Tbl_Sehir WHERE SehirID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        ResultSet sonuc=sorgu.executeQuery();
        if(sonuc.first()){
         sehir=new Sehir(sonuc.getInt(1), sonuc.getString(2));
        }
        else sehir= new Sehir(-1,"Bulunamadı");
        connection.close();
        return sehir;   
    }
    public VitesTuru getVitesTuru(int ID) throws SQLException{
        VitesTuru vitesTuru=new VitesTuru(-1, "Hata");
        connect();
        String sorguString="SELECT * FROM Tbl_VitesTuru WHERE VitesTuruID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        ResultSet sonuc=sorgu.executeQuery();
        if(sonuc.first()){
         vitesTuru=new VitesTuru(sonuc.getInt(1), sonuc.getString(2));
        }
        else vitesTuru=new VitesTuru("Vites Türü Bulunamadı");
        connection.close();
        return vitesTuru;   
    }
    public YakitTuru getYakitTuru(int ID) throws SQLException{
        YakitTuru yakitTuru=new YakitTuru(-1, "Hata");
        connect();
        String sorguString="SELECT * FROM Tbl_YakitTuru WHERE YakitTuruID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        ResultSet sonuc=sorgu.executeQuery();
        if(sonuc.first()){
         yakitTuru=new YakitTuru(sonuc.getInt(1), sonuc.getString(2));
        }
        else yakitTuru=new YakitTuru("Yakıt Türü Bulunamadı");
        connection.close();
        return yakitTuru;   
    }
    public Araba getAraba(int ID) throws SQLException{
        Araba araba=new Araba();
        connect();
        String sorguString="SELECT * FROM Tbl_Araba WHERE ArabaID=?";
        PreparedStatement sorgu=connection.clientPrepareStatement(sorguString);
        sorgu.setInt(1, ID);
        ResultSet sonuc=sorgu.executeQuery();
        if(sonuc.first()){
            araba=new Araba(sonuc.getInt(1), sonuc.getString(2),sonuc.getString(3),sonuc.getInt(4),sonuc.getInt(5),sonuc.getInt(6));
        }
        else araba=new Araba(-1, "Bulunamadı", "Bulunamadı", -1, -1, -1);
        connection.close();
        return araba;
    }
}

    

