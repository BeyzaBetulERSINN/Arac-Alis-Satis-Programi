package mysqlodev;

import com.mysql.jdbc.StringUtils;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlOdev {
 //Tüm classta kullanılacak veritabanı işlemlerini gerçekleştirecek veritabanı değişkenini oluşturuyoruz.
    static Veritabani veritabani;
    //Tüm classta kullanılacak kullanıcıdan veri alma işlemlerini gerçekleştirecek scanner değişkenini oluşturuyoruz
    static Scanner scanner;
    //Kullanıcının menülerdeki seçimini atayacağımız secim değişkeni (Scanner aracılığıla alınacak)
    static int secim;
    //Programımızın çalıştırılacağı ana fonksiyon
    public static void main(String[] args) {
        try {
            //Hazırlamış olduğumuz veritabanı değişkenine yarattığımız veritabanını atıyoruz.
            veritabani=new Veritabani();
            //Hazırlamış olduğumuz scanner değişkenine yarattığımız scanner nesnesini atıyoruz.
            scanner=new Scanner(System.in);
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1)Ekleme\n2)Listeleme\n3)Düzenleme\n4)Silme");
            
            //Menüdeki kullanıcı seçimini alıyoruz
            secim=scanner.nextInt();
            
            //Seçime uygun menüyü switch-case yöntemiyle gösteriyoruz
            switch(secim){
                case 1:
                    EklemeMenu();
                    break;
                case 2:
                    ListeleMenu();
                    break;
                case 3:
                    DuzenleMenu();
                    break;
                case 4:
                    SilMenu();
                    break;
                default:
                    System.out.println("Hatalı Seçim Yaptınız.");
                    break;
            }
            //Olası bir hata durumunda ekrana verilmesi için try catch kullanmak zorundayız
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlOdev.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MysqlOdev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //İstediğimiz Tabloya veri eklemek için gösterilecek menü
    public static void EklemeMenu() throws SQLException{
        System.out.println("Eklemek istediğiniz tabloyu seçiniz:");
                System.out.println("1)İlan");
                System.out.println("2)Araba");
                System.out.println("3)Renk");
                System.out.println("4)Şehir");
                System.out.println("5)Vites Türü");
                System.out.println("6)Yakıt Türü");
                String eklenecek;
                //Kullanıcının seçimini alıyoruz.
                secim=scanner.nextInt();
                switch(secim){
                    case 1:
                        //Eklenecek ilana göre özelliklerini doldurmak için boş bir ilan nesnesi oluşturuyoruz.
                        Ilan eklenecekIlan=new Ilan();
                        System.out.println("İlanınızın adı:");
                        //https://stackoverflow.com/questions/23450524/java-scanner-doesnt-wait-for-user-input
                        //scanner sınıfının NextInt metodu yeni satır komutunu göndermediği için nextInt metodundan sonra nextLine metodunu her kullandığımızda fazladan bir nextLine kullanmamız gerekiyor
                        scanner.nextLine();
                        //İlan adını kullanıcıdan alıyourz
                        String ilanAdi=scanner.nextLine();
                        //eklenecekIlan nesnemizin adını aldığımız değişken ile set ediyoruz.
                        //Aynı işlemi ilan nesnesinin her parametresi için ayrı ayrı yapıyoruz. 
                        eklenecekIlan.setAdi(ilanAdi);
                        System.out.println("İlanınız için araba seçiniz:");
                        ArabalariListele();
                        eklenecekIlan.setArabaID(scanner.nextInt());                        
                        System.out.println("İlanınızın Fiyatı:");
                        eklenecekIlan.setFiyat(scanner.nextFloat());    
                        System.out.println("Arabanız kaç kilometrede:");
                        eklenecekIlan.setKm(scanner.nextInt());
                        System.out.println("Lütfen bir şehir seçiniz:");
                        SehirleriListele();
                        eklenecekIlan.setSehirID(scanner.nextInt());
                        //İlan bugün eklendiği için bugünün tarihini set ediyoruz.
                        eklenecekIlan.setTarih(Date.valueOf(LocalDate.now()));
                        //Veritabanı sınıfının addIlan metoduyla içini doldurmulş olduğumuz ilanı veritabanına ekliyoruz.
                        veritabani.addIlan(eklenecekIlan);
                        break;
                    case 2:
                        Araba eklenecekAraba=new Araba();
                        System.out.println("Arabanızın markası:");
                        eklenecekAraba.setMarka(scanner.next());
                        System.out.println("Arabanızın modeli:");
                        eklenecekAraba.setModel(scanner.next());
                        System.out.println("Arabanızın rengini seçiniz:");
                        //Kullanıcının Renkleri seçebilmesi için tüm renkleri ekrana yazdırıyoruz.(Aynısını vites ve yakıt türleri için ayrıca şehir için de yapıyoruz.
                        RenkleriListele();
                        eklenecekAraba.setRenkID(scanner.nextInt());
                        System.out.println("Arabanızın vites türünü seçiniz:");
                        VitesTurleriniListele();
                        eklenecekAraba.setVitesTuruID(scanner.nextInt());
                        System.out.println("Arabanızın yakıt türünü seçiniz:");
                        YakitTurleriniListele();
                        eklenecekAraba.setYakitTuruID(scanner.nextInt());    
                        veritabani.addAraba(eklenecekAraba);
                        break;
                    case 3:
                        System.out.println("Eklemek istediğiniz rengin adını yazınız:");
                        eklenecek=scanner.next();
                        //ID kısmına -1 yazdık çünkü ekleme işleminde ID otomatik arttığı için bir etkisi olmayacak(10009123 yazmak ile -1 yazman arasında bir fark yok yani)
                        veritabani.addRenk(new Renk(-1, eklenecek));
                        break;
                    case 4:
                        System.out.println("Eklemek istediğiniz şehrin adını yazınız:");
                        eklenecek=scanner.next();
                        veritabani.addSehir(new Sehir(-1, eklenecek));
                        break;
                    case 5:
                        System.out.println("Eklemek istediğiniz vites türünü yazınız:");
                        eklenecek=scanner.next();
                        veritabani.addVitesTuru(new VitesTuru(-1, eklenecek));                        
                        break;
                    case 6:
                        System.out.println("Eklemek istediğiniz yakıt türünü yazınız:");
                        eklenecek=scanner.next();
                        veritabani.addYakitTuru(new YakitTuru(-1,eklenecek));                        
                        break;
                }
    }
    
    //İstediğimiz Tablodaki verileri listelemek için gösterilecek menü
    public static void ListeleMenu() throws SQLException{
        System.out.println("Listelemek istediğiniz tabloyu seçiniz:");
        System.out.println("1)İlan\n2)Araba\n3)Sehir\n4)Renk\n5)Vites Türleri\n6)Yakıt Türleri");
        int secim=scanner.nextInt();
        switch(secim){
            case 1:
                FiltreliIlanListele();
                break;
            case 2:
                ArabalariListele();
                break;
            case 3:
                SehirleriListele();
                break;
            case 4:
                RenkleriListele();
                break;
            case 5:
                VitesTurleriniListele();
                break;
            case 6:
                YakitTurleriniListele();
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
                break;
        }
    }
    
    //Düzenleme yapmak için gösterilecek menü
    public static void DuzenleMenu() throws SQLException{
        System.out.println("Düzenlemek istediğiniz tabloyu seçiniz:");
        System.out.println("1)İlan");
        System.out.println("2)Araba");
        System.out.println("3)Renk");
        System.out.println("4)Şehir");
        System.out.println("5)Vites Türü");
        System.out.println("6)Yakıt Türü");
        secim=scanner.nextInt();
        switch(secim){
            case 1:
                Ilan guncellenecek=new Ilan();
                TumIlanlariListele();
                System.out.println("Güncellemek istediğiniz ilanın ID'sini giriniz:");
                guncellenecek.setID(scanner.nextInt());
                System.out.println("İlanın yeni adını giriniz:");
                scanner.nextLine();
                guncellenecek.setAdi(scanner.nextLine());
                System.out.println("İlan için yeni araba seçiniz:");
                ArabalariListele();
                guncellenecek.setArabaID(scanner.nextInt());
                System.out.println("İlan için yeni fiyatı giriniz:");
                guncellenecek.setFiyat(scanner.nextInt());
                System.out.println("İlan için yeni kilometre değerini giriniz:");
                guncellenecek.setKm(scanner.nextInt());
                System.out.println("İlan için yeni şehir seçiniz");
                SehirleriListele();
                guncellenecek.setSehirID(scanner.nextInt());
                guncellenecek.setTarih(Date.valueOf(LocalDate.now()));
                veritabani.updateIlan(guncellenecek);
                break;
            case 2:
                Araba guncellenecekAraba=new Araba();
                ArabalariListele();
                System.out.println("Guncellenecek Arabanın ID'sini giriniz:");
                guncellenecekAraba.setID(scanner.nextInt());
                System.out.println("Guncellenecek Arabanın yeni markasını giriniz:");
                scanner.nextLine();
                guncellenecekAraba.setMarka(scanner.nextLine());
                System.out.println("Guncellenecek Arabanın yeni modelini giriniz:");
                guncellenecekAraba.setModel(scanner.nextLine());
                System.out.println("Guncellenecek Arabanın vites türünü seçiniz:");
                VitesTurleriniListele();
                guncellenecekAraba.setVitesTuruID(scanner.nextInt());
                System.out.println("Guncellenecek Arabanın yakıt türünü seçiniz:");
                YakitTurleriniListele();
                guncellenecekAraba.setYakitTuruID(scanner.nextInt());
                System.out.println("Guncellenecek Arabanın rengini seçiniz:");
                RenkleriListele();
                guncellenecekAraba.setRenkID(scanner.nextInt());
                
                veritabani.updateAraba(guncellenecekAraba);
                break;
            case 3:
                Renk guncellenecekRenk=new Renk();
                RenkleriListele();
                System.out.println("Guncellenecek Rengin ID'sini giriniz:");
                guncellenecekRenk.setID(scanner.nextInt());
                System.out.println("Guncellenecek Rengin değerini giriniz:");
                scanner.nextLine();
                guncellenecekRenk.setRenk(scanner.nextLine());
                veritabani.updateRenk(guncellenecekRenk);
                break;
            case 4:
                Sehir guncellenecekSehir=new Sehir();
                SehirleriListele();
                System.out.println("Guncellenecek Şehrin ID'sini giriniz:");
                guncellenecekSehir.setID(scanner.nextInt());
                System.out.println("Guncellenecek Şehrin değerini giriniz:");
                scanner.nextLine();
                guncellenecekSehir.setSehir(scanner.nextLine());
                veritabani.updateSehir(guncellenecekSehir);
                break;
            case 5:
                VitesTuru guncellenecekVitesTuru=new VitesTuru();
                VitesTurleriniListele();
                System.out.println("Guncellenecek Vites türünün ID'sini giriniz:");
                guncellenecekVitesTuru.setID(scanner.nextInt());
                System.out.println("Guncellenecek Vites türünün değerini giriniz:");
                scanner.nextLine();
                guncellenecekVitesTuru.setVitesTuru(scanner.nextLine());
                veritabani.updateVitesTuru(guncellenecekVitesTuru);
                break;
            case 6:
                YakitTuru guncellenecekYakitTuru=new YakitTuru();
                YakitTurleriniListele();
                System.out.println("Guncellenecek Yakit türünün ID'sini giriniz:");
                guncellenecekYakitTuru.setID(scanner.nextInt());
                System.out.println("Guncellenecek Yakit türünün değerini giriniz:");
                scanner.nextLine();
                guncellenecekYakitTuru.setYakitTuru(scanner.nextLine());
                veritabani.updateYakitTuru(guncellenecekYakitTuru);               
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
                break;
        }
        
    }
    
    //Silme işlemi için gösterilecek menü
    public static void SilMenu() throws SQLException{
        System.out.println("Silme işlemini yapmak istediğiniz tabloyu seçiniz:");
        System.out.println("1)İlan\n2)Araba\n3)Sehir\n4)Renk\n5)Vites Türleri\n6)Yakıt Türleri");
        int secim=scanner.nextInt();
        switch(secim){
            case 1:
                TumIlanlariListele();
                System.out.println("Silmek istediğiniz ilanın ID'sini giriniz");
                veritabani.deleteIlan(scanner.nextInt());
                break;
            case 2:
                ArabalariListele();
                System.out.println("Silmek istediğiniz arabanın ID'sini giriniz");
                veritabani.deleteAraba(scanner.nextInt());
                break;
            case 3:
                SehirleriListele();
                System.out.println("Silmek istediğiniz şehrin ID'sini giriniz");
                veritabani.deleteSehir(scanner.nextInt());
                break;
            case 4:
                RenkleriListele();
                System.out.println("Silmek istediğiniz rengin ID'sini giriniz");
                veritabani.deleteRenk(scanner.nextInt());
                break;
            case 5:
                VitesTurleriniListele();
                System.out.println("Silmek istediğiniz vites türünün ID'sini giriniz");
                veritabani.deleteVitesTuru(scanner.nextInt());
                break;
            case 6:
                YakitTurleriniListele();
                System.out.println("Silmek istediğiniz yakıt türünün ID'sini giriniz");
                veritabani.deleteYakitTuru(scanner.nextInt());
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
                break;
        }
    }
    
    //Bir stringin sayı olup olmadığını kontrol eden fonksiyon
    public static boolean isNumeric(String str){
        //Alıntı: https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
      return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    
    //İlanları yaptığımız seçimlere göre filtreleyip gösteren menü
    public static void FiltreliIlanListele() throws SQLException{
        //Filtrelemek için gerekli where ve sıralamak için gerekli orderBy sorgularının değişkenlerini hazırlıyoruz. 
        String whereCondition="";
        String orderByCondition="";
        String secim;
        //Kullanıcıya seçimlerini yaptırıyoruz. Eğer o konuda filtrelemek istemiyorsa enter'a basıyor.
        System.out.println("Şehir seçiniz (Seçmek istemiyorsanız Enter'a basınız)");
        SehirleriListele();
        scanner.nextLine();
        secim=scanner.nextLine();
        //Yapılan seçim boş değilse ve sayısalsa where koşuluna bunu ekliyoruz.
        if(secim!=null && isNumeric(secim)){
            whereCondition+="Ilan_SehirId="+secim;
        }
        //Aynı sütun için sıralama türünü seçtiriyoruz. Ve bunu her sütun için yapıyoruz
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            if(Integer.parseInt(secim)==1) orderByCondition+="Sehir ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="Sehir DESC";
        }
        
        System.out.println("Renk seçiniz (Seçmek istemiyorsanız Enter'a basınız)");
        RenkleriListele();
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            whereCondition=whereCondition==""?whereCondition:whereCondition+" AND "; //Eğer where koşulunda daha önce eklenmiş bir koşul var ise araya AND kelimesini ekliyoruz. - Tek satırda if kullanma yöntemi
            whereCondition+="Araba_RenkID="+Integer.parseInt(secim);
        }
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            orderByCondition=orderByCondition==""?orderByCondition:orderByCondition+","; //eğer orderBy koşulunda daha önce değer eklendiyse araya virgül ekliyoruz.
            if(Integer.parseInt(secim)==1) orderByCondition+="Renk ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="Renk DESC";
        }
        
        System.out.println("Vites Türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)");
        VitesTurleriniListele();
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            whereCondition=whereCondition==""?whereCondition:whereCondition+" AND ";
            whereCondition+="Araba_VitesTuruID="+secim;
        }    
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            orderByCondition=orderByCondition==""?orderByCondition:orderByCondition+",";
            if(Integer.parseInt(secim)==1) orderByCondition+="VitesTuru ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="VitesTuru DESC";
        }
        
        System.out.println("Yakıt Türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)");
        YakitTurleriniListele();
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            whereCondition=whereCondition==""?whereCondition:whereCondition+" AND ";
            whereCondition+="Araba_YakitTuruID="+secim;
        }
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            orderByCondition=orderByCondition==""?orderByCondition:orderByCondition+",";
            if(Integer.parseInt(secim)==1) orderByCondition+="YakitTuru ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="YakitTuru DESC";
        }
        
        System.out.println("Aradığınız araba markasını giriniz:");
        secim=scanner.nextLine();
        if(!StringUtils.isNullOrEmpty(secim)){
            whereCondition=whereCondition==""?whereCondition:whereCondition+" AND ";
            whereCondition+="Araba_Marka="+secim;
        }
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            orderByCondition=orderByCondition==""?orderByCondition:orderByCondition+",";
            if(Integer.parseInt(secim)==1) orderByCondition+="Araba_Marka ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="Araba_Marka DESC";
        }

        System.out.println("Aradığınız araba modelini giriniz:");
        secim=scanner.nextLine();
        if(!StringUtils.isNullOrEmpty(secim)){
            whereCondition=whereCondition==""?whereCondition:whereCondition+" AND ";
            whereCondition+="Araba_Model="+secim;
        }
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            orderByCondition=orderByCondition==""?orderByCondition:orderByCondition+",";
            if(Integer.parseInt(secim)==1) orderByCondition+="Araba_Model ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="Araba_Model DESC";
        }        
        
        System.out.println("Minimum fiyatı giriniz:");
        secim=scanner.nextLine();
        if(!StringUtils.isNullOrEmpty(secim)){
            whereCondition=whereCondition==""?whereCondition:whereCondition+" AND ";
            whereCondition+="Ilan_Fiyat>="+secim;
        }
        
        System.out.println("Maksimum fiyatı giriniz:");
        secim=scanner.nextLine();
        if(!StringUtils.isNullOrEmpty(secim)){
            whereCondition=whereCondition==""?whereCondition:whereCondition+" AND ";
            whereCondition+="Ilan_Fiyat<="+secim;
        }
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            orderByCondition=orderByCondition==""?orderByCondition:orderByCondition+",";
            if(Integer.parseInt(secim)==1) orderByCondition+="Ilan_Fiyat ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="Ilan_Fiyat DESC";
        }
        
        System.out.println("Listelenecek ilanlar için tarih kıstasını belirleyiniz\n1)Son 24 saat\n2)Son 1 hafta\n3)Son 1 Ay");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
             whereCondition=whereCondition==""?whereCondition:whereCondition+" AND ";
            switch(Integer.parseInt(secim)){
                case 1:
                    whereCondition+="Ilan_Tarih>="+Date.valueOf(LocalDate.now().minusDays(1)).toString();
                    break;
                case 2:
                    whereCondition+="Ilan_Tarih>="+Date.valueOf(LocalDate.now().minusDays(7)).toString();
                    break;
                case 3:
                    whereCondition+="Ilan_Tarih>="+Date.valueOf(LocalDate.now().minusDays(30)).toString();
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız");
                    break;
            }
        }
        
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            orderByCondition=orderByCondition==""?orderByCondition:orderByCondition+",";
            if(Integer.parseInt(secim)==1) orderByCondition+="Ilan_Tarih ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="Ilan_Tarih DESC";
        }
        
        System.out.println("İlan adında olmasını istediğiniz kelimeyi giriniz:");
        secim=scanner.nextLine();
        if(!StringUtils.isNullOrEmpty(secim)){
            whereCondition=whereCondition==""?whereCondition:whereCondition+" AND ";
            whereCondition+="Ilan_Adi=%"+secim+"%";
        }
        System.out.println("Sıralama türünü seçiniz (Seçmek istemiyorsanız Enter'a basınız)\n 1)Artan Sıralama\n2)Azalan sıralama");
        secim=scanner.nextLine();
        if(secim!=null && isNumeric(secim)){
            orderByCondition=orderByCondition==""?orderByCondition:orderByCondition+",";
            if(Integer.parseInt(secim)==1) orderByCondition+="Ilan_Adi ASC";
            else if(Integer.parseInt(secim)==2) orderByCondition+="Ilan_Adi DESC";
        }
        
        if(whereCondition!="")whereCondition=" WHERE "+whereCondition;  //Eğer where koşulu boş değilse başına WHERE anahtar kelimesini ekliyoruz
        if(orderByCondition!="")orderByCondition=" ORDER BY "+orderByCondition; //Eğer orderBy koşulu boş değilse başına ORDER BY anahtar kelimesini ekliyoruz
        
        System.out.println("İlanlar:");
        
        ArrayList<Ilan> tumIlanlar = veritabani.getIlanlar(whereCondition+orderByCondition); //İstediğimiz koşullara uyan ilanları ArrayListe atıyoruz.
        for(Ilan ilan:tumIlanlar){//Gelen tüm ilanları Ekrana anlaşılır biçimde yazdırıyoruz.
            System.out.println(ilan.getID()+")"
                    +ilan.getAdi()+" "
                    +"Araba Bilgileri("+ArabaBilgileri(ilan.getArabaID())+") " //ID olarak girilen sütunları tekrar veritabanında sorgulayıp String değerlerini yazdırıyoruz
                    +"Fiyat:"+ilan.getFiyat()+" "
                    +"KM:"+ilan.getKm()+" "
                    +"Şehir:"+veritabani.getSehir(ilan.getSehirID()).getSehir()+" "
                    +"İlan Tarihi:"+ilan.getTarih().toString());
        } 
        
        
    }
    
    //Verilen idye sahip arabanın tüm bilgilerini anlaşılır halde String olarak döndüren fonksiyon
    public static String ArabaBilgileri(int ID) throws SQLException{
        Araba araba=veritabani.getAraba(ID); //Veritabanından araba bilgilerini çekip ekrana yazdırıyoruz.
        String bilgi=araba.getID()+" "
                +araba.getMarka()+" "
                +araba.getModel()+" "
                +veritabani.getRenk(araba.getRenkID()).getRenk()+" "
                +veritabani.getVitesTuru(araba.getVitesTuruID()).getVitesTuru()+" "
                +veritabani.getYakitTuru(araba.getYakitTuruID()).getYakitTuru();
        return bilgi;
    }
    
    //Filtreleme işlemine sokmaksızın tüm ilanları gösteren fonksiyon
    public static void TumIlanlariListele() throws SQLException{
        System.out.println("İlanlar:");
        ArrayList<Ilan> tumIlanlar = veritabani.getIlanlar("");
        for(Ilan ilan:tumIlanlar){
            System.out.println(ilan.getID()+")"
                    +ilan.getAdi()+" "
                    +"Araba Bilgileri("+ArabaBilgileri(ilan.getArabaID())+") "
                    +"Fiyat:"+ilan.getFiyat()+" "
                    +"KM:"+ilan.getKm()+" "
                    +"Şehir:"+veritabani.getSehir(ilan.getSehirID()).getSehir()+" "
                    +"İlan Tarihi:"+ilan.getTarih().toString());
        } 

    }
    
    //Tüm arabaları Listeleyen fonksiyon
    public static void ArabalariListele() throws SQLException{
        System.out.println("Arabalar:");
        ArrayList<Araba> arabalar=veritabani.getArabalar();
        for(Araba araba:arabalar)
                System.out.println(araba.getID()+")"+araba.getMarka()+" "
                        +araba.getModel()+" "
                        +veritabani.getRenk(araba.getRenkID()).getRenk()+" "
                        +veritabani.getVitesTuru(araba.getVitesTuruID()).getVitesTuru()+" "
                        +veritabani.getYakitTuru(araba.getYakitTuruID()).getYakitTuru());

    }    
    
    //Tüm şehirleri Listeleyen fonksiyon
    public static void SehirleriListele() throws SQLException{
        System.out.println("Sehirler:");
        ArrayList<Sehir> sehirler=veritabani.getSehirler();
        for(Sehir sehir:sehirler)
                System.out.println(sehir.getID()+")"+sehir.getSehir());

    }
    
    //Tüm renkleri Listeleyen fonksiyon
    public static void RenkleriListele() throws SQLException{
        System.out.println("Renkler:");
        ArrayList<Renk> renkler = veritabani.getRenkler();
        for(Renk renk : renkler)
               System.out.println(renk.getID()+")"+renk.getRenk());

    }
    
    //Tüm vites türlerini Listeleyen fonksiyon
    public static void VitesTurleriniListele() throws SQLException{
        System.out.println("Vites Türleri:");
        ArrayList<VitesTuru> vitesTurleri = veritabani.getVitesTurleri();
        for(VitesTuru vitesTuru : vitesTurleri)
               System.out.println(vitesTuru.getID()+")"+vitesTuru.getVitesTuru());

    }
    
    //Tüm yakıt türlerini Listeleyen fonksiyon
    public static void YakitTurleriniListele() throws SQLException{
        System.out.println("Yakıt Türleri:");
        ArrayList<YakitTuru> yakitTurleri= veritabani.getYakitTurleri();
        for(YakitTuru yakitTuru:yakitTurleri)
                System.out.println(yakitTuru.getID()+")"+yakitTuru.getYakitTuru());
        
    }
 
    
}
