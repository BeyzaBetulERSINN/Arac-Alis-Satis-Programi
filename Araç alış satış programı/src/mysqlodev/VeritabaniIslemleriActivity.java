package mysqlodev;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import mysqlodev.*;

public class VeritabaniIslemleriActivity extends javax.swing.JFrame {
    static Veritabani veritabani;
    static ArrayList<Araba> ArabaAL;
    static ArrayList<Ilan> IlanAL;
    static ArrayList<Renk> RenkAL;
    static ArrayList<Sehir> SehirAL;
    static ArrayList<VitesTuru> VitesTuruAL;
    static ArrayList<YakitTuru> YakitTuruAL;
    Araba DuzenleSeciliAraba,SilSeciliAraba;
    Ilan DuzenleSeciliIlan,SilSeciliIlan;
    Renk DuzenleSeciliRenk,SilSeciliRenk;
    Sehir DuzenleSeciliSehir,SilSeciliSehir;
    VitesTuru DuzenleSeciliVitesTuru,SilSeciliVitesTuru;
    YakitTuru DuzenleSeciliYakitTuru,SilSeciliYakitTuru;
    
    
    public VeritabaniIslemleriActivity() {
        try {
            initComponents();
            veritabani=new Veritabani();
            ListeComboBoxDoldur();
            ClickEventlariEkle();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VeritabaniIslemleriActivity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleriActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ekle_Renk_List = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ekle_Renk_TextField = new javax.swing.JTextField();
        Ekle_Renk_Btn = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Ekle_Sehir_List = new javax.swing.JList<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Ekle_Sehir_TextField = new javax.swing.JTextField();
        Ekle_Sehir_Btn = new javax.swing.JButton();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Ekle_VitesTuru_TextField = new javax.swing.JTextField();
        Ekle_VitesTuru_Btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Ekle_YakitTuru_TextField = new javax.swing.JTextField();
        Ekle_YakitTuru_Btn = new javax.swing.JButton();
        jSplitPane16 = new javax.swing.JSplitPane();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Ekle_VitesTuru_List = new javax.swing.JList<>();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Ekle_YakitTuru_List = new javax.swing.JList<>();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Ekle_Araba_List = new javax.swing.JList<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Ekle_Araba_Marka_Text = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Ekle_Araba_Model_Text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ekle_Araba_VitesTuru_CB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Ekle_Araba_YakitTuru_CB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Ekle_Araba_Renk_CB = new javax.swing.JComboBox<>();
        Ekle_Araba_Btn = new javax.swing.JButton();
        jSplitPane5 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Ekle_Ilan_Adi_Txt = new javax.swing.JTextField();
        Ekle_Ilan_Fiyat_Txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Ekle_Ilan_Km_Txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Ekle_Ilan_Araba_CB = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Ekle_Ilan_Sehir_CB = new javax.swing.JComboBox<>();
        Ekle_Ilan_Btn = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Ekle_Ilan_List = new javax.swing.JList<>();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jSplitPane6 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Duzenle_Renk_List = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        Duzenle_Renk_TextField = new javax.swing.JTextField();
        Duzenle_Renk_Btn = new javax.swing.JButton();
        jSplitPane7 = new javax.swing.JSplitPane();
        jPanel18 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        Duzenle_Sehir_TextField = new javax.swing.JTextField();
        Ekle_Sehir_Btn1 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Duzenle_Sehir_List = new javax.swing.JList<>();
        jSplitPane8 = new javax.swing.JSplitPane();
        jSplitPane17 = new javax.swing.JSplitPane();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Duzenle_VitesTuru_List = new javax.swing.JList<>();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Duzenle_YakitTuru_List = new javax.swing.JList<>();
        jPanel20 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Duzenle_VitesTuru_TextField = new javax.swing.JTextField();
        Duzenle_VitesTuru_Btn = new javax.swing.JButton();
        Duzenle_YakitTuru_Btn = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        Duzenle_YakitTuru_TextField = new javax.swing.JTextField();
        jSplitPane9 = new javax.swing.JSplitPane();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        Duzenle_Araba_List = new javax.swing.JList<>();
        jPanel24 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        Duzenle_Araba_Marka_Text = new javax.swing.JTextField();
        Duzenle_Araba_Model_Text = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Duzenle_Araba_VitesTuru_CB = new javax.swing.JComboBox<>();
        Duzenle_Araba_YakitTuru_CB = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Duzenle_Araba_Renk_CB = new javax.swing.JComboBox<>();
        Duzenle_Araba_Btn = new javax.swing.JButton();
        jSplitPane10 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Duzenle_Ilan_Sehir_CB = new javax.swing.JComboBox<>();
        Duzenle_Ilan_Adi_Txt = new javax.swing.JTextField();
        Duzenle_Ilan_Btn = new javax.swing.JButton();
        Duzenle_Ilan_Fiyat_Txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Duzenle_Ilan_Km_Txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Duzenle_Ilan_Araba_CB = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Duzenle_Ilan_List = new javax.swing.JList<>();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jSplitPane11 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Sil_Renk_List = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        Sil_Renk_Secili = new javax.swing.JLabel();
        Sil_Renk_Btn = new javax.swing.JButton();
        jSplitPane12 = new javax.swing.JSplitPane();
        jPanel26 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        Sil_Sehir_Secili = new javax.swing.JLabel();
        Sil_Sehir_Btn = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        Sil_Sehir_List = new javax.swing.JList<>();
        jSplitPane13 = new javax.swing.JSplitPane();
        jSplitPane18 = new javax.swing.JSplitPane();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        Sil_VitesTuru_List = new javax.swing.JList<>();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        Sil_YakitTuru_List = new javax.swing.JList<>();
        jPanel28 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        Sil_VitesTuru_Secili = new javax.swing.JLabel();
        Sil_VitesTuru_Btn = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        Sil_YakitTuru_Secili = new javax.swing.JLabel();
        Sil_YakitTuru_Btn = new javax.swing.JButton();
        jSplitPane14 = new javax.swing.JSplitPane();
        jPanel31 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        Sil_Araba_Secili = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        Sil_Araba_List = new javax.swing.JList<>();
        jSplitPane15 = new javax.swing.JSplitPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        Sil_Ilan_Secili = new javax.swing.JLabel();
        Sil_Ilan_Btn = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        Sil_Ilan_List = new javax.swing.JList<>();

        setTitle("Veritabanı İşlemleri Modülü");

        jSplitPane1.setDividerLocation(200);

        jScrollPane1.setViewportView(Ekle_Renk_List);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel1.setText("Renk Adı:");

        Ekle_Renk_Btn.setText("Renk Ekle");
        Ekle_Renk_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ekle_Renk_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Renk_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Ekle_Renk_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ekle_Renk_Btn)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        jTabbedPane2.addTab("Renk", jSplitPane1);

        jSplitPane2.setDividerLocation(200);

        jScrollPane4.setViewportView(Ekle_Sehir_List);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel10);

        jLabel2.setText("Şehir Adı:");

        Ekle_Sehir_Btn.setText("Şehir Ekle");
        Ekle_Sehir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ekle_Sehir_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Sehir_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Ekle_Sehir_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ekle_Sehir_Btn)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel11);

        jTabbedPane2.addTab("Şehir", jSplitPane2);

        jSplitPane3.setDividerLocation(200);

        jLabel3.setText("Vites Türü");

        Ekle_VitesTuru_Btn.setText("Vites Türü Ekle");
        Ekle_VitesTuru_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleButonlariHandler(evt);
            }
        });

        jLabel4.setText("Yakır Türü");

        Ekle_YakitTuru_Btn.setText("Yakıt Türü Ekle");
        Ekle_YakitTuru_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ekle_VitesTuru_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_VitesTuru_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_YakitTuru_TextField))
                    .addComponent(Ekle_YakitTuru_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Ekle_VitesTuru_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ekle_VitesTuru_Btn)
                .addGap(134, 134, 134)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Ekle_YakitTuru_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ekle_YakitTuru_Btn)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jSplitPane3.setRightComponent(jPanel13);

        jSplitPane16.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jScrollPane5.setViewportView(Ekle_VitesTuru_List);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane16.setTopComponent(jPanel12);

        jScrollPane6.setViewportView(Ekle_YakitTuru_List);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane16.setRightComponent(jPanel14);

        jSplitPane3.setLeftComponent(jSplitPane16);

        jTabbedPane2.addTab("Vites/Yakıt Türü", jSplitPane3);

        jSplitPane4.setDividerLocation(200);

        jScrollPane7.setViewportView(Ekle_Araba_List);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane4.setLeftComponent(jPanel15);

        jLabel5.setText("Marka");

        jLabel6.setText("Model");

        jLabel7.setText("Vites Türü");

        jLabel8.setText("Yakıt Türü");

        jLabel9.setText("Renk");

        Ekle_Araba_Btn.setText("Araba Ekle");
        Ekle_Araba_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Araba_Marka_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Araba_Model_Text))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Araba_VitesTuru_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Araba_YakitTuru_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Araba_Renk_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Ekle_Araba_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Ekle_Araba_Marka_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Ekle_Araba_Model_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Ekle_Araba_VitesTuru_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Ekle_Araba_YakitTuru_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Ekle_Araba_Renk_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ekle_Araba_Btn)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jSplitPane4.setRightComponent(jPanel16);

        jTabbedPane2.addTab("Araba", jSplitPane4);

        jSplitPane5.setDividerLocation(200);

        jLabel10.setText("İlan Adı:");

        jLabel11.setText("İlan Fiyatı:");

        jLabel12.setText("İlan Kilometresi:");

        jLabel14.setText("Araba:");

        jLabel15.setText("Şehir:");

        Ekle_Ilan_Btn.setText("İlanı Ekle");
        Ekle_Ilan_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Ilan_Fiyat_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ekle_Ilan_Araba_CB, 0, 317, Short.MAX_VALUE)
                            .addComponent(Ekle_Ilan_Sehir_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Ilan_Km_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ekle_Ilan_Adi_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ekle_Ilan_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Ekle_Ilan_Adi_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Ekle_Ilan_Fiyat_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Ekle_Ilan_Km_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Ekle_Ilan_Araba_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Ekle_Ilan_Sehir_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ekle_Ilan_Btn)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jSplitPane5.setRightComponent(jPanel3);

        jScrollPane8.setViewportView(Ekle_Ilan_List);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane5.setLeftComponent(jPanel17);

        jTabbedPane2.addTab("İlan", jSplitPane5);

        jTabbedPane1.addTab("Ekle", jTabbedPane2);

        jSplitPane6.setDividerLocation(200);

        jScrollPane2.setViewportView(Duzenle_Renk_List);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane6.setLeftComponent(jPanel4);

        jLabel30.setText("Renk Adı:");

        Duzenle_Renk_Btn.setText("Renk Düzenle");
        Duzenle_Renk_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuzenleButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Duzenle_Renk_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Renk_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(Duzenle_Renk_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Duzenle_Renk_Btn)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jSplitPane6.setRightComponent(jPanel5);

        jTabbedPane4.addTab("Renk", jSplitPane6);

        jSplitPane7.setDividerLocation(200);

        jLabel29.setText("Şehir Adı:");

        Ekle_Sehir_Btn1.setText("Şehir Düzenle");
        Ekle_Sehir_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuzenleButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ekle_Sehir_Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Sehir_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(Duzenle_Sehir_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ekle_Sehir_Btn1)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jSplitPane7.setRightComponent(jPanel18);

        jScrollPane9.setViewportView(Duzenle_Sehir_List);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane7.setLeftComponent(jPanel19);

        jTabbedPane4.addTab("Şehir", jSplitPane7);

        jSplitPane8.setDividerLocation(200);

        jSplitPane17.setDividerLocation(150);
        jSplitPane17.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jScrollPane10.setViewportView(Duzenle_VitesTuru_List);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane17.setTopComponent(jPanel21);

        jScrollPane11.setViewportView(Duzenle_YakitTuru_List);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane17.setRightComponent(jPanel22);

        jSplitPane8.setLeftComponent(jSplitPane17);

        jLabel27.setText("Vites Türü");

        Duzenle_VitesTuru_Btn.setText("Vites Türü Düzenle");
        Duzenle_VitesTuru_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuzenleButonlariHandler(evt);
            }
        });

        Duzenle_YakitTuru_Btn.setText("Yakıt Türü Düzenle");
        Duzenle_YakitTuru_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuzenleButonlariHandler(evt);
            }
        });

        jLabel28.setText("Yakır Türü");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Duzenle_VitesTuru_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_VitesTuru_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_YakitTuru_TextField))
                    .addComponent(Duzenle_YakitTuru_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(Duzenle_VitesTuru_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duzenle_VitesTuru_Btn)
                .addGap(134, 134, 134)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(Duzenle_YakitTuru_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duzenle_YakitTuru_Btn)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jSplitPane8.setRightComponent(jPanel20);

        jTabbedPane4.addTab("Vites/Yakıt Türü", jSplitPane8);

        jSplitPane9.setDividerLocation(200);

        jScrollPane12.setViewportView(Duzenle_Araba_List);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane9.setLeftComponent(jPanel23);

        jLabel22.setText("Marka");

        jLabel23.setText("Model");

        jLabel24.setText("Vites Türü");

        jLabel25.setText("Yakıt Türü");

        jLabel26.setText("Renk");

        Duzenle_Araba_Btn.setText("Araba Düzenle");
        Duzenle_Araba_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuzenleButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Araba_Marka_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Araba_Model_Text))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Araba_VitesTuru_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Araba_YakitTuru_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Araba_Renk_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Duzenle_Araba_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Duzenle_Araba_Marka_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Duzenle_Araba_Model_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Duzenle_Araba_VitesTuru_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(Duzenle_Araba_YakitTuru_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(Duzenle_Araba_Renk_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duzenle_Araba_Btn)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jSplitPane9.setRightComponent(jPanel24);

        jTabbedPane4.addTab("Araba", jSplitPane9);

        jSplitPane10.setDividerLocation(200);

        jLabel16.setText("Şehir:");

        jLabel17.setText("İlan Fiyatı:");

        Duzenle_Ilan_Btn.setText("İlanı Düzenle");
        Duzenle_Ilan_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuzenleButonlariHandler(evt);
            }
        });

        jLabel18.setText("İlan Kilometresi:");

        jLabel20.setText("Araba:");

        jLabel21.setText("İlan Adı:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Duzenle_Ilan_Araba_CB, 0, 155, Short.MAX_VALUE)
                            .addComponent(Duzenle_Ilan_Sehir_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Ilan_Km_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Ilan_Fiyat_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Duzenle_Ilan_Adi_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Duzenle_Ilan_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Duzenle_Ilan_Adi_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Duzenle_Ilan_Fiyat_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Duzenle_Ilan_Km_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Duzenle_Ilan_Araba_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Duzenle_Ilan_Sehir_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duzenle_Ilan_Btn)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jSplitPane10.setRightComponent(jPanel6);

        jScrollPane13.setViewportView(Duzenle_Ilan_List);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane10.setLeftComponent(jPanel25);

        jTabbedPane4.addTab("İlan", jSplitPane10);

        jTabbedPane1.addTab("Düzenle", jTabbedPane4);

        jSplitPane11.setDividerLocation(200);

        jScrollPane3.setViewportView(Sil_Renk_List);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane11.setLeftComponent(jPanel7);

        jLabel31.setText("Seçili Renk");

        Sil_Renk_Secili.setText("   ");

        Sil_Renk_Btn.setText("Renk Sil");
        Sil_Renk_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sil_Renk_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sil_Renk_Secili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_Renk_Secili, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_Renk_Btn)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jSplitPane11.setRightComponent(jPanel8);

        jTabbedPane5.addTab("Renk", jSplitPane11);

        jSplitPane12.setDividerLocation(200);

        jLabel32.setText("Seçili Şehir");

        Sil_Sehir_Secili.setText("           ");

        Sil_Sehir_Btn.setText("Şehir Sil");
        Sil_Sehir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sil_Sehir_Secili)
                    .addComponent(Sil_Sehir_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_Sehir_Secili)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_Sehir_Btn)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jSplitPane12.setRightComponent(jPanel26);

        jScrollPane14.setViewportView(Sil_Sehir_List);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane12.setLeftComponent(jPanel27);

        jTabbedPane5.addTab("Şehir", jSplitPane12);

        jSplitPane13.setDividerLocation(200);

        jSplitPane18.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jScrollPane16.setViewportView(Sil_VitesTuru_List);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane18.setTopComponent(jPanel29);

        jScrollPane15.setViewportView(Sil_YakitTuru_List);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane18.setRightComponent(jPanel30);

        jSplitPane13.setLeftComponent(jSplitPane18);

        jLabel33.setText("Seçili Vites Türü");

        Sil_VitesTuru_Secili.setText("                           ");

        Sil_VitesTuru_Btn.setText("Vites Türü Sil");
        Sil_VitesTuru_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilButonlariHandler(evt);
            }
        });

        jLabel34.setText("Seçili Yakıt Türü");

        Sil_YakitTuru_Secili.setText("               ");

        Sil_YakitTuru_Btn.setText("Yakıt Türü Sil");
        Sil_YakitTuru_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Sil_VitesTuru_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sil_VitesTuru_Secili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel34)
                    .addComponent(Sil_YakitTuru_Secili)
                    .addComponent(Sil_YakitTuru_Btn))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_VitesTuru_Secili)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_VitesTuru_Btn)
                .addGap(90, 90, 90)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_YakitTuru_Secili)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_YakitTuru_Btn)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jSplitPane13.setRightComponent(jPanel28);

        jTabbedPane5.addTab("Vites/Yakıt Türü", jSplitPane13);

        jSplitPane14.setDividerLocation(200);

        jLabel35.setText("Seçili Araba");

        Sil_Araba_Secili.setText("    ");

        jButton1.setText("Araba Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(Sil_Araba_Secili)
                    .addComponent(jButton1))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_Araba_Secili)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jSplitPane14.setRightComponent(jPanel31);

        jScrollPane17.setViewportView(Sil_Araba_List);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane14.setLeftComponent(jPanel32);

        jTabbedPane5.addTab("Araba", jSplitPane14);

        jSplitPane15.setDividerLocation(200);

        jLabel36.setText("Seçili İlan");

        Sil_Ilan_Secili.setText("        ");

        Sil_Ilan_Btn.setText("İlanı Sil");
        Sil_Ilan_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilButonlariHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(Sil_Ilan_Secili)
                    .addComponent(Sil_Ilan_Btn))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_Ilan_Secili)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sil_Ilan_Btn)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jSplitPane15.setRightComponent(jPanel9);

        jScrollPane18.setViewportView(Sil_Ilan_List);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane15.setLeftComponent(jPanel33);

        jTabbedPane5.addTab("İlan", jSplitPane15);

        jTabbedPane1.addTab("Sil", jTabbedPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EkleButonlariHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleButonlariHandler
        try {
            JButton btn=(JButton)evt.getSource();
            String TiklananButonAdi=btn.getText();
            switch(TiklananButonAdi){
                case "Renk Ekle":
                    veritabani.addRenk(new Renk(Ekle_Renk_TextField.getText()));
                    break;
                case "Şehir Ekle":
                    veritabani.addSehir(new Sehir(Ekle_Sehir_TextField.getText()));
                    break;
                case "Vites Türü Ekle":
                    veritabani.addVitesTuru(new VitesTuru(Ekle_VitesTuru_TextField.getText()));
                    break;
                case "Yakıt Türü Ekle":
                    veritabani.addYakitTuru(new YakitTuru(Ekle_YakitTuru_TextField.getText()));
                    break;
                case "Araba Ekle":
                    Araba eklenecekAraba=new Araba();
                    eklenecekAraba.setMarka(Ekle_Araba_Marka_Text.getText());
                    eklenecekAraba.setModel(Ekle_Araba_Model_Text.getText());
                    eklenecekAraba.setRenkID(RenkAL.get(Ekle_Araba_Renk_CB.getSelectedIndex()).getID());
                    eklenecekAraba.setVitesTuruID(VitesTuruAL.get(Ekle_Araba_VitesTuru_CB.getSelectedIndex()).getID());
                    eklenecekAraba.setYakitTuruID(YakitTuruAL.get(Ekle_Araba_YakitTuru_CB.getSelectedIndex()).getID());
                    veritabani.addAraba(eklenecekAraba);
                    break;
                case "İlanı Ekle":
                    Ilan eklenecekIlan=new Ilan();
                    eklenecekIlan.setAdi(Ekle_Ilan_Adi_Txt.getText());
                    eklenecekIlan.setFiyat(Integer.parseInt(Ekle_Ilan_Fiyat_Txt.getText()));
                    eklenecekIlan.setKm(Integer.parseInt(Ekle_Ilan_Km_Txt.getText()));
                    eklenecekIlan.setArabaID(ArabaAL.get(Ekle_Ilan_Araba_CB.getSelectedIndex()).getID());
                    eklenecekIlan.setSehirID(SehirAL.get(Ekle_Ilan_Sehir_CB.getSelectedIndex()).getID());
                    eklenecekIlan.setTarih(Date.valueOf(LocalDate.now()));
                    veritabani.addIlan(eklenecekIlan);
                    break;
            }
            ListeComboBoxDoldur();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleriActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EkleButonlariHandler

    private void DuzenleButonlariHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuzenleButonlariHandler
        try {
            JButton btn=(JButton)evt.getSource();
            String TiklananButonAdi=btn.getText();
            switch(TiklananButonAdi){
                case "Renk Düzenle":
                    veritabani.updateRenk(new Renk(DuzenleSeciliRenk.getID(),Duzenle_Renk_TextField.getText()));
                    break;
                case "Şehir Düzenle":
                    veritabani.updateSehir(new Sehir(DuzenleSeciliSehir.getID(), Duzenle_Sehir_TextField.getText()));
                    break;
                case "Vites Türü Düzenle":
                    veritabani.updateVitesTuru(new VitesTuru(DuzenleSeciliVitesTuru.getID(), Duzenle_VitesTuru_TextField.getText()));
                    break;
                case "Yakıt Türü Düzenle":
                    veritabani.updateYakitTuru(new YakitTuru(DuzenleSeciliYakitTuru.getID(), Duzenle_YakitTuru_TextField.getText()));
                    break;
                case "Araba Düzenle":
                    Araba duzenlenecekAraba=new Araba();
                    duzenlenecekAraba.setID(DuzenleSeciliAraba.getID());
                    duzenlenecekAraba.setMarka(Duzenle_Araba_Marka_Text.getText());
                    duzenlenecekAraba.setModel(Duzenle_Araba_Model_Text.getText());
                    duzenlenecekAraba.setRenkID(RenkAL.get(Duzenle_Araba_Renk_CB.getSelectedIndex()).getID());
                    duzenlenecekAraba.setVitesTuruID(VitesTuruAL.get(Duzenle_Araba_VitesTuru_CB.getSelectedIndex()).getID());
                    duzenlenecekAraba.setYakitTuruID(YakitTuruAL.get(Duzenle_Araba_YakitTuru_CB.getSelectedIndex()).getID());
                    veritabani.updateAraba(duzenlenecekAraba);
                    break;
                case "İlanı Düzenle":
                    Ilan duzenlenecekIlan=new Ilan();
                    duzenlenecekIlan.setID(DuzenleSeciliIlan.getID());
                    duzenlenecekIlan.setAdi(Duzenle_Ilan_Adi_Txt.getText());
                    duzenlenecekIlan.setFiyat(Float.parseFloat(Duzenle_Ilan_Fiyat_Txt.getText()));
                    duzenlenecekIlan.setKm(Integer.parseInt(Duzenle_Ilan_Km_Txt.getText()));
                    duzenlenecekIlan.setArabaID(ArabaAL.get(Duzenle_Ilan_Araba_CB.getSelectedIndex()).getID());
                    duzenlenecekIlan.setSehirID(SehirAL.get(Duzenle_Ilan_Sehir_CB.getSelectedIndex()).getID());
                    duzenlenecekIlan.setTarih(Date.valueOf(LocalDate.now()));
                    veritabani.updateIlan(duzenlenecekIlan);
                    break;
            }
            ListeComboBoxDoldur();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleriActivity.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_DuzenleButonlariHandler

    private void SilButonlariHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilButonlariHandler
        try {
            JButton btn=(JButton)evt.getSource();
            String TiklananButonAdi=btn.getText();
            switch(TiklananButonAdi){
                case "Renk Sil":
                    veritabani.deleteRenk(SilSeciliRenk.getID());
                    break;
                case "Şehir Sil":
                    veritabani.deleteSehir(SilSeciliSehir.getID());
                    break;
                case "Vites Türü Sil":
                    veritabani.deleteVitesTuru(SilSeciliVitesTuru.getID());
                    break;
                case "Yakıt Türü Sil":
                    veritabani.deleteYakitTuru(SilSeciliYakitTuru.getID());
                    break;
                case "Araba Sil":
                    veritabani.deleteAraba(SilSeciliAraba.getID());
                    break;
                case "İlanı Sil":
                    veritabani.deleteIlan(SilSeciliIlan.getID());
                    break;
            }
            ListeComboBoxDoldur();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleriActivity.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_SilButonlariHandler

 
    
    
    
        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeritabaniIslemleriActivity().setVisible(true);
            }
        });
    }
    
    public void ListeComboBoxDoldur() throws SQLException{
        ArabaAL=veritabani.getArabalar();
        IlanAL=veritabani.getIlanlar("");
        RenkAL=veritabani.getRenkler();
        SehirAL=veritabani.getSehirler();
        VitesTuruAL=veritabani.getVitesTurleri();
        YakitTuruAL=veritabani.getYakitTurleri();
        
        DefaultListModel<Araba> ArabaLM=new DefaultListModel<>();
        DefaultListModel<Ilan> IlanLM=new DefaultListModel<>();
        DefaultListModel<Renk> RenkLM=new DefaultListModel<>();
        DefaultListModel<Sehir> SehirLM=new DefaultListModel<>();
        DefaultListModel<VitesTuru> VitesTuruLM=new DefaultListModel<>();
        DefaultListModel<YakitTuru> YakitTuruLM=new DefaultListModel<>();

        DefaultComboBoxModel<Araba> ArabaCM=new DefaultComboBoxModel<>();
        DefaultComboBoxModel<Renk> RenkCM=new DefaultComboBoxModel<>();
        DefaultComboBoxModel<Sehir> SehirCM=new DefaultComboBoxModel<>();
        DefaultComboBoxModel<VitesTuru> VitesTuruCM=new DefaultComboBoxModel<>();
        DefaultComboBoxModel<YakitTuru> YakitTuruCM=new DefaultComboBoxModel<>();
        
        
        
        int i=0;
        for(Araba araba:ArabaAL){
            ArabaLM.add(i++,araba);
            ArabaCM.addElement(araba);
        }
        i=0;
        for(Ilan ilan:IlanAL){
            IlanLM.add(i++,ilan);
        }
        i=0;
        for(Renk renk:RenkAL){
            RenkLM.add(i++,renk);
            RenkCM.addElement(renk);
        }
        i=0;
        for(Sehir sehir:SehirAL){
            SehirLM.add(i++,sehir);
            SehirCM.addElement(sehir);
        }
        i=0;
        for(VitesTuru vitesTuru:VitesTuruAL){
            VitesTuruLM.add(i++,vitesTuru);
            VitesTuruCM.addElement(vitesTuru);
        }
        i=0;
        for(YakitTuru yakitTuru:YakitTuruAL){
            YakitTuruLM.add(i++,yakitTuru);
            YakitTuruCM.addElement(yakitTuru);
        }
                    
        Ekle_Araba_List.setModel(ArabaLM);
        Ekle_Ilan_List.setModel(IlanLM);
        Ekle_Renk_List.setModel(RenkLM);
        Ekle_Sehir_List.setModel(SehirLM);
        Ekle_VitesTuru_List.setModel(VitesTuruLM);
        Ekle_YakitTuru_List.setModel(YakitTuruLM);
                            
        Duzenle_Araba_List.setModel(ArabaLM);
        Duzenle_Ilan_List.setModel(IlanLM);
        Duzenle_Renk_List.setModel(RenkLM);
        Duzenle_Sehir_List.setModel(SehirLM);
        Duzenle_VitesTuru_List.setModel(VitesTuruLM);
        Duzenle_YakitTuru_List.setModel(YakitTuruLM);
                            
        Sil_Araba_List.setModel(ArabaLM);
        Sil_Ilan_List.setModel(IlanLM);
        Sil_Renk_List.setModel(RenkLM);
        Sil_Sehir_List.setModel(SehirLM);
        Sil_VitesTuru_List.setModel(VitesTuruLM);
        Sil_YakitTuru_List.setModel(YakitTuruLM);
        
        Ekle_Araba_Renk_CB.setModel(RenkCM);
        Ekle_Araba_VitesTuru_CB.setModel(VitesTuruCM);
        Ekle_Araba_YakitTuru_CB.setModel(YakitTuruCM);
        Ekle_Ilan_Araba_CB.setModel(ArabaCM);
        Ekle_Ilan_Sehir_CB.setModel(SehirCM);
        
        Duzenle_Araba_Renk_CB.setModel(RenkCM);
        Duzenle_Araba_VitesTuru_CB.setModel(VitesTuruCM);
        Duzenle_Araba_YakitTuru_CB.setModel(YakitTuruCM);
        Duzenle_Ilan_Araba_CB.setModel(ArabaCM);
        Duzenle_Ilan_Sehir_CB.setModel(SehirCM);
        
        DuzenleSeciliAraba=ArabaAL.get(0);
        DuzenleSeciliIlan=IlanAL.get(0);
        DuzenleSeciliRenk=RenkAL.get(0);
        DuzenleSeciliSehir=SehirAL.get(0);
        DuzenleSeciliVitesTuru=VitesTuruAL.get(0);
        DuzenleSeciliYakitTuru=YakitTuruAL.get(0);
        
        
    }
    
    public void ClickEventlariEkle(){
        Duzenle_Araba_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Duzenle_Araba_List.getSelectedIndex()!=-1){
                DuzenleSeciliAraba=ArabaAL.get(Duzenle_Araba_List.getSelectedIndex());
                Duzenle_Araba_Marka_Text.setText(DuzenleSeciliAraba.getMarka());
                Duzenle_Araba_Model_Text.setText(DuzenleSeciliAraba.getModel());
                Duzenle_Araba_Renk_CB.setSelectedIndex( renkIndexiBul( DuzenleSeciliAraba.getRenkID()));
                Duzenle_Araba_VitesTuru_CB.setSelectedIndex( vitesTuruIndexiBul( DuzenleSeciliAraba.getVitesTuruID()));
                Duzenle_Araba_YakitTuru_CB.setSelectedIndex( yakitTuruIndexiBul( DuzenleSeciliAraba.getYakitTuruID()));
            }
        });
        Duzenle_Ilan_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Duzenle_Ilan_List.getSelectedIndex()!=-1){
                DuzenleSeciliIlan=IlanAL.get(Duzenle_Ilan_List.getSelectedIndex());
                Duzenle_Ilan_Adi_Txt.setText( DuzenleSeciliIlan.getAdi());
                Duzenle_Ilan_Fiyat_Txt.setText(DuzenleSeciliIlan.getFiyat()+"");
                Duzenle_Ilan_Km_Txt.setText( DuzenleSeciliIlan.getKm()+"");
                Duzenle_Ilan_Araba_CB.setSelectedIndex( arabaIndexiBul(DuzenleSeciliIlan.getArabaID()));
                Duzenle_Ilan_Sehir_CB.setSelectedIndex( sehirIndexiBul( DuzenleSeciliIlan.getSehirID()));
            }
        });
        Duzenle_Renk_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Duzenle_Renk_List.getSelectedIndex()!=-1){
            DuzenleSeciliRenk=RenkAL.get(Duzenle_Renk_List.getSelectedIndex());
            Duzenle_Renk_TextField.setText(DuzenleSeciliRenk.getRenk());
            }
        });
        Duzenle_Sehir_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Duzenle_Sehir_List.getSelectedIndex()!=-1){
            DuzenleSeciliSehir=SehirAL.get(Duzenle_Sehir_List.getSelectedIndex());
            Duzenle_Sehir_TextField.setText(DuzenleSeciliSehir.getSehir());
            }
        });
        Duzenle_YakitTuru_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Duzenle_YakitTuru_List.getSelectedIndex()!=-1){
            DuzenleSeciliYakitTuru=YakitTuruAL.get(Duzenle_YakitTuru_List.getSelectedIndex());
            Duzenle_YakitTuru_TextField.setText(DuzenleSeciliYakitTuru.getYakitTuru());
            }

        });
        Duzenle_VitesTuru_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Duzenle_VitesTuru_List.getSelectedIndex()!=-1){
            DuzenleSeciliVitesTuru=VitesTuruAL.get(Duzenle_VitesTuru_List.getSelectedIndex());
            Duzenle_VitesTuru_TextField.setText(DuzenleSeciliVitesTuru.getVitesTuru());
            }
        });
    
        Sil_Araba_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Sil_Araba_List.getSelectedIndex()!=-1){
                SilSeciliAraba=ArabaAL.get(Sil_Araba_List.getSelectedIndex());
                Sil_Araba_Secili.setText(SilSeciliAraba.toString());
            }
        });
        Sil_Ilan_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Sil_Ilan_List.getSelectedIndex()!=-1){
                SilSeciliIlan=IlanAL.get(Sil_Ilan_List.getSelectedIndex());
                Sil_Ilan_Secili.setText(SilSeciliIlan.toString());
            }
        });
        Sil_Renk_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Sil_Renk_List.getSelectedIndex()!=-1){
            SilSeciliRenk=RenkAL.get(Sil_Renk_List.getSelectedIndex());
            Sil_Renk_Secili.setText(SilSeciliRenk.toString());
            }
        });
        Sil_Sehir_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Sil_Sehir_List.getSelectedIndex()!=-1){
            SilSeciliSehir=SehirAL.get(Sil_Sehir_List.getSelectedIndex());
            Sil_Sehir_Secili.setText(SilSeciliSehir.toString());
            }
        });
        Sil_YakitTuru_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Sil_YakitTuru_List.getSelectedIndex()!=-1){
            SilSeciliYakitTuru=YakitTuruAL.get(Sil_YakitTuru_List.getSelectedIndex());
            Sil_YakitTuru_Secili.setText(SilSeciliYakitTuru.toString());
            }

        });
        Sil_VitesTuru_List.getSelectionModel().addListSelectionListener((lse) -> {
            if(Sil_VitesTuru_List.getSelectedIndex()!=-1){
            SilSeciliVitesTuru=VitesTuruAL.get(Sil_VitesTuru_List.getSelectedIndex());
            Sil_VitesTuru_Secili.setText(SilSeciliVitesTuru.toString());
        }
        });
    }
    
    int arabaIndexiBul(int id){
        int index=0;
        for(Araba a:ArabaAL){
            if(a.getID()==id) return index;
            index++;
        }
        return -1;
    }
    int sehirIndexiBul(int id){
        int index=0;
        for(Sehir a:SehirAL){
            if(a.getID()==id) return index;
            index++;
        }
        return -1;
    }
    int renkIndexiBul(int id){
        int index=0;
        for(Renk a:RenkAL){
            if(a.getID()==id) return index;
            index++;
        }
        return -1;
    }
    int yakitTuruIndexiBul(int id){
        int index=0;
        for(YakitTuru a:YakitTuruAL){
            if(a.getID()==id) return index;
            index++;
        }
        return -1;
    }
    int vitesTuruIndexiBul(int id){
        int index=0;
        for(VitesTuru a:VitesTuruAL){
            if(a.getID()==id) return index;
            index++;
        }
        return -1;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Duzenle_Araba_Btn;
    private javax.swing.JList<Araba> Duzenle_Araba_List;
    private javax.swing.JTextField Duzenle_Araba_Marka_Text;
    private javax.swing.JTextField Duzenle_Araba_Model_Text;
    private javax.swing.JComboBox<Renk> Duzenle_Araba_Renk_CB;
    private javax.swing.JComboBox<VitesTuru> Duzenle_Araba_VitesTuru_CB;
    private javax.swing.JComboBox<YakitTuru> Duzenle_Araba_YakitTuru_CB;
    private javax.swing.JTextField Duzenle_Ilan_Adi_Txt;
    private javax.swing.JComboBox<Araba> Duzenle_Ilan_Araba_CB;
    private javax.swing.JButton Duzenle_Ilan_Btn;
    private javax.swing.JTextField Duzenle_Ilan_Fiyat_Txt;
    private javax.swing.JTextField Duzenle_Ilan_Km_Txt;
    private javax.swing.JList<Ilan> Duzenle_Ilan_List;
    private javax.swing.JComboBox<Sehir> Duzenle_Ilan_Sehir_CB;
    private javax.swing.JButton Duzenle_Renk_Btn;
    private javax.swing.JList<Renk> Duzenle_Renk_List;
    private javax.swing.JTextField Duzenle_Renk_TextField;
    private javax.swing.JList<Sehir> Duzenle_Sehir_List;
    private javax.swing.JTextField Duzenle_Sehir_TextField;
    private javax.swing.JButton Duzenle_VitesTuru_Btn;
    private javax.swing.JList<VitesTuru> Duzenle_VitesTuru_List;
    private javax.swing.JTextField Duzenle_VitesTuru_TextField;
    private javax.swing.JButton Duzenle_YakitTuru_Btn;
    private javax.swing.JList<YakitTuru> Duzenle_YakitTuru_List;
    private javax.swing.JTextField Duzenle_YakitTuru_TextField;
    private javax.swing.JButton Ekle_Araba_Btn;
    private javax.swing.JList<Araba> Ekle_Araba_List;
    private javax.swing.JTextField Ekle_Araba_Marka_Text;
    private javax.swing.JTextField Ekle_Araba_Model_Text;
    private javax.swing.JComboBox<Renk> Ekle_Araba_Renk_CB;
    private javax.swing.JComboBox<VitesTuru> Ekle_Araba_VitesTuru_CB;
    private javax.swing.JComboBox<YakitTuru> Ekle_Araba_YakitTuru_CB;
    private javax.swing.JTextField Ekle_Ilan_Adi_Txt;
    private javax.swing.JComboBox<Araba> Ekle_Ilan_Araba_CB;
    private javax.swing.JButton Ekle_Ilan_Btn;
    private javax.swing.JTextField Ekle_Ilan_Fiyat_Txt;
    private javax.swing.JTextField Ekle_Ilan_Km_Txt;
    private javax.swing.JList<Ilan> Ekle_Ilan_List;
    private javax.swing.JComboBox<Sehir> Ekle_Ilan_Sehir_CB;
    private javax.swing.JButton Ekle_Renk_Btn;
    private javax.swing.JList<Renk> Ekle_Renk_List;
    private javax.swing.JTextField Ekle_Renk_TextField;
    private javax.swing.JButton Ekle_Sehir_Btn;
    private javax.swing.JButton Ekle_Sehir_Btn1;
    private javax.swing.JList<Sehir> Ekle_Sehir_List;
    private javax.swing.JTextField Ekle_Sehir_TextField;
    private javax.swing.JButton Ekle_VitesTuru_Btn;
    private javax.swing.JList<VitesTuru> Ekle_VitesTuru_List;
    private javax.swing.JTextField Ekle_VitesTuru_TextField;
    private javax.swing.JButton Ekle_YakitTuru_Btn;
    private javax.swing.JList<YakitTuru> Ekle_YakitTuru_List;
    private javax.swing.JTextField Ekle_YakitTuru_TextField;
    private javax.swing.JList<Araba> Sil_Araba_List;
    private javax.swing.JLabel Sil_Araba_Secili;
    private javax.swing.JButton Sil_Ilan_Btn;
    private javax.swing.JList<Ilan> Sil_Ilan_List;
    private javax.swing.JLabel Sil_Ilan_Secili;
    private javax.swing.JButton Sil_Renk_Btn;
    private javax.swing.JList<Renk> Sil_Renk_List;
    private javax.swing.JLabel Sil_Renk_Secili;
    private javax.swing.JButton Sil_Sehir_Btn;
    private javax.swing.JList<Sehir> Sil_Sehir_List;
    private javax.swing.JLabel Sil_Sehir_Secili;
    private javax.swing.JButton Sil_VitesTuru_Btn;
    private javax.swing.JList<VitesTuru> Sil_VitesTuru_List;
    private javax.swing.JLabel Sil_VitesTuru_Secili;
    private javax.swing.JButton Sil_YakitTuru_Btn;
    private javax.swing.JList<YakitTuru> Sil_YakitTuru_List;
    private javax.swing.JLabel Sil_YakitTuru_Secili;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane10;
    private javax.swing.JSplitPane jSplitPane11;
    private javax.swing.JSplitPane jSplitPane12;
    private javax.swing.JSplitPane jSplitPane13;
    private javax.swing.JSplitPane jSplitPane14;
    private javax.swing.JSplitPane jSplitPane15;
    private javax.swing.JSplitPane jSplitPane16;
    private javax.swing.JSplitPane jSplitPane17;
    private javax.swing.JSplitPane jSplitPane18;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JSplitPane jSplitPane7;
    private javax.swing.JSplitPane jSplitPane8;
    private javax.swing.JSplitPane jSplitPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables
}
