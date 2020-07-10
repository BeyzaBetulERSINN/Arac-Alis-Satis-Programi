package mysqlodev;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import mysqlodev.*;


public class ListelemeActivity extends javax.swing.JFrame {
    static Veritabani veritabani;
    static ArrayList<Araba> ArabaAL;
    static ArrayList<Ilan> IlanAL;
    static ArrayList<Renk> RenkAL;
    static ArrayList<Sehir> SehirAL;
    static ArrayList<VitesTuru> VitesTuruAL;
    static ArrayList<YakitTuru> YakitTuruAL;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FiltreliIlanList = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AranacakKelimeTB = new javax.swing.JTextField();
        RenkSecCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SehirSecCB = new javax.swing.JComboBox<>();
        VitesTuruSecCB = new javax.swing.JComboBox<>();
        YakitTuruSecCB = new javax.swing.JComboBox<>();
        ArabaMarkasiTB = new javax.swing.JTextField();
        ArabaModelTB = new javax.swing.JTextField();
        MinimumFiyatTB = new javax.swing.JTextField();
        MaksimumFiyatTB = new javax.swing.JTextField();
        TarihSecCB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        IlanAdiSiralaCB = new javax.swing.JComboBox<>();
        ArabaRengiSiralaCB = new javax.swing.JComboBox<>();
        SehirAdiSiralaCB = new javax.swing.JComboBox<>();
        VitesTuruSiralaCB = new javax.swing.JComboBox<>();
        YakitTuruSiralaCB = new javax.swing.JComboBox<>();
        ArabaMarkasiSiralaCB = new javax.swing.JComboBox<>();
        ArabaModeliSiralaCB = new javax.swing.JComboBox<>();
        FiyatSiralaCB = new javax.swing.JComboBox<>();
        TarihSiralaCB = new javax.swing.JComboBox<>();
        ListeleBtn = new javax.swing.JButton();

        setTitle("Filtreli İlan Listeleme Modülü");

        jSplitPane1.setDividerLocation(300);

        jScrollPane1.setViewportView(FiltreliIlanList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Filtrele");

        jLabel2.setText("Şehir Seçiniz:");

        jLabel3.setText("Vites Türü Seçiniz:");

        jLabel4.setText("Renk Seçiniz:");

        jLabel5.setText("Yakıt Türü Seçiniz:");

        jLabel6.setText("Araba Markasını Giriniz:");

        jLabel7.setText("Araba Modelini Giriniz:");

        jLabel8.setText("Minimum Fiyat:");

        jLabel9.setText("Maksimum Fiyat:");

        jLabel10.setText("Tarih Kıstasını Seçiniz:");

        jLabel11.setText("Aranacak Kelime:");

        TarihSecCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "Son 24 Saat", "Son 1 Hafta", "Son 1 Ay" }));

        jLabel12.setText("İlan Adına Göre Sırala:");

        jLabel13.setText("Araba Rengine Göre Sırala:");

        jLabel14.setText("Şehir Adına Göre Sırala:");

        jLabel15.setText("Vites Türüne Göre Sırala:");

        jLabel16.setText("Yakıt Türüne Göre Sırala:");

        jLabel17.setText("Araba Markasına Göre Sırala:");

        jLabel18.setText("Araba Modeline Göre Sırala:");

        jLabel19.setText("Fiyata Göre Sırala:");

        jLabel20.setText("Tarihe Göre Sırala:");

        IlanAdiSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "A'dan Z'ye", "Z'den A'ya" }));

        ArabaRengiSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "A'dan Z'ye", "Z'den A'ya" }));

        SehirAdiSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "A'dan Z'ye", "Z'den A'ya" }));

        VitesTuruSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "A'dan Z'ye", "Z'den A'ya" }));

        YakitTuruSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "A'dan Z'ye", "Z'den A'ya" }));

        ArabaMarkasiSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "A'dan Z'ye", "Z'den A'ya" }));

        ArabaModeliSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "A'dan Z'ye", "Z'den A'ya" }));

        FiyatSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "Artan Sıralama", "Azalan Sıralama" }));

        TarihSiralaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiçbiri", "Artan Sıralama", "Azalan Sıralama" }));

        ListeleBtn.setText("Listele");
        ListeleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(YakitTuruSecCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VitesTuruSecCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ArabaMarkasiTB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ArabaModelTB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MinimumFiyatTB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaksimumFiyatTB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TarihSecCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AranacakKelimeTB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RenkSecCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SehirSecCB, 0, 185, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IlanAdiSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(YakitTuruSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ArabaModeliSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiyatSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TarihSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VitesTuruSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SehirAdiSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ArabaMarkasiSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ArabaRengiSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(ListeleBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(AranacakKelimeTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(IlanAdiSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RenkSecCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(ArabaRengiSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SehirSecCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(SehirAdiSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VitesTuruSecCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(VitesTuruSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(YakitTuruSecCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(YakitTuruSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ArabaMarkasiTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(ArabaMarkasiSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ArabaModelTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(ArabaModeliSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(MinimumFiyatTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(FiyatSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(MaksimumFiyatTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TarihSecCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(TarihSiralaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ListeleBtn)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListelemeActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListelemeActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListelemeActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListelemeActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListelemeActivity().setVisible(true);
            }
        });
    }
    
    private void ListeleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeleBtnActionPerformed
        try {
            String WhereSartlari="";
            String OrderBySartlari="";
            
            if(!AranacakKelimeTB.getText().trim().isEmpty())
                WhereSartlari+="Ilan_Adi LIKE \"%"+AranacakKelimeTB.getText()+"%\"";

            if(RenkSecCB.getSelectedIndex()!=0){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                WhereSartlari+="Araba_RenkID="+renkIndexiBul(RenkSecCB.getSelectedIndex());
            }

            if(SehirSecCB.getSelectedIndex()!=0){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                WhereSartlari+="Ilan_SehirId="+sehirIndexiBul(SehirSecCB.getSelectedIndex());
            }
            System.out.println(VitesTuruSecCB.getSelectedIndex());
            System.out.println(vitesTuruIndexiBul(VitesTuruSecCB.getSelectedIndex()));
            if(VitesTuruSecCB.getSelectedIndex()!=0){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                WhereSartlari+="Araba_VitesTuruID="+vitesTuruIndexiBul(VitesTuruSecCB.getSelectedIndex());
            }
            if(YakitTuruSecCB.getSelectedIndex()!=0){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                WhereSartlari+="Araba_YakitTuruID="+yakitTuruIndexiBul(YakitTuruSecCB.getSelectedIndex());
            }
            if(!ArabaMarkasiTB.getText().trim().isEmpty()){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                WhereSartlari+="Araba_Marka=\""+ArabaMarkasiTB.getText()+"\"";
            }
            if(!ArabaModelTB.getText().trim().isEmpty()){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                WhereSartlari+="Araba_Model=\""+ArabaModelTB.getText()+"\"";
            }
            if(!MaksimumFiyatTB.getText().trim().isEmpty()){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                WhereSartlari+="Ilan_Fiyat<="+MaksimumFiyatTB.getText();
            }
            if(!MinimumFiyatTB.getText().trim().isEmpty()){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                WhereSartlari+="Ilan_Fiyat>="+MinimumFiyatTB.getText();
            }
            if(TarihSecCB.getSelectedIndex()!=0){
                WhereSartlari=WhereSartlari==""?WhereSartlari:WhereSartlari+" AND ";
                switch(TarihSecCB.getSelectedIndex()){
                    case 1:
                        WhereSartlari+="Ilan_Tarih>=\""+Date.valueOf(LocalDate.now().minusDays(1)).toString()+"\"";
                        break;
                    case 2:
                        WhereSartlari+="Ilan_Tarih>=\""+Date.valueOf(LocalDate.now().minusDays(7)).toString()+"\"";
                        break;
                    case 3:
                        WhereSartlari+="Ilan_Tarih>=\""+Date.valueOf(LocalDate.now().minusDays(30)).toString()+"\"";
                        break;
                    default:
                        System.out.println("Hatalı seçim yaptınız");
                        break;
                }
                
            }
            
            if(IlanAdiSiralaCB.getSelectedIndex()!=0){
                switch(IlanAdiSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Ilan_Adi ASC";
                        break;
                    case 2:
                        OrderBySartlari+="Ilan_Adi DESC";

                        break;
                }
            }
            if(ArabaRengiSiralaCB.getSelectedIndex()!=0){
                OrderBySartlari=OrderBySartlari==""?OrderBySartlari:OrderBySartlari+",";
                switch(ArabaRengiSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Renk ASC";
                        break;
                    case 2:
                        OrderBySartlari+="Renk DESC";
                        break;
                }
            }
            if(SehirAdiSiralaCB.getSelectedIndex()!=0){
                OrderBySartlari=OrderBySartlari==""?OrderBySartlari:OrderBySartlari+",";
                switch(SehirAdiSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Sehir ASC";
                        break;
                    case 2:
                        OrderBySartlari+="Sehir DESC";
                        break;
                }
                
            }
            if(VitesTuruSiralaCB.getSelectedIndex()!=0){
                OrderBySartlari=OrderBySartlari==""?OrderBySartlari:OrderBySartlari+",";
                switch(VitesTuruSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Vites_Turu ASC";
                        break;
                    case 2:
                        OrderBySartlari+="Vites_Turu DESC";
                        break;
                }
                
            }
            if(YakitTuruSiralaCB.getSelectedIndex()!=0){
                OrderBySartlari=OrderBySartlari==""?OrderBySartlari:OrderBySartlari+",";
                switch(YakitTuruSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Yakit_Turu ASC";
                        break;
                    case 2:
                        OrderBySartlari+="Yakit_Turu DESC";
                        break;
                }
                
            }
            if(ArabaMarkasiSiralaCB.getSelectedIndex()!=0){
                OrderBySartlari=OrderBySartlari==""?OrderBySartlari:OrderBySartlari+",";
                switch(ArabaMarkasiSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Araba_Marka ASC";;
                        break;
                    case 2:
                        OrderBySartlari+="Araba_Marka DESC";
                        break;
                }
                
            }
            if(ArabaModeliSiralaCB.getSelectedIndex()!=0){
                OrderBySartlari=OrderBySartlari==""?OrderBySartlari:OrderBySartlari+",";
                switch(ArabaModeliSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Araba_Model ASC";
                        break;
                    case 2:
                        OrderBySartlari+="Araba_Model DESC";
                        break;
                }
                
            }
            if(FiyatSiralaCB.getSelectedIndex()!=0){
                OrderBySartlari=OrderBySartlari==""?OrderBySartlari:OrderBySartlari+",";
                switch(FiyatSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Ilan_Fiyat ASC";
                        break;
                    case 2:
                        OrderBySartlari+="Ilan_Fiyat DESC";
                        break;
                }
                
            }
            if(TarihSiralaCB.getSelectedIndex()!=0){
                OrderBySartlari=OrderBySartlari==""?OrderBySartlari:OrderBySartlari+",";
                switch(TarihSiralaCB.getSelectedIndex()){
                    case 1:
                        OrderBySartlari+="Ilan_Tarih>=\""+Date.valueOf(LocalDate.now().minusDays(1)).toString()+"\"";
                        break;
                    case 2:
                        OrderBySartlari+="Ilan_Tarih>=\""+Date.valueOf(LocalDate.now().minusDays(7)).toString()+"\"";
                        break;
                    case 3:
                        OrderBySartlari+="Ilan_Tarih>=\""+Date.valueOf(LocalDate.now().minusDays(30)).toString()+"\"";
                        break;
                }
                
            }
            if(WhereSartlari!="")WhereSartlari=" WHERE "+WhereSartlari;  //Eğer where koşulu boş değilse başına WHERE anahtar kelimesini ekliyoruz
            if(OrderBySartlari!="")OrderBySartlari=" ORDER BY "+OrderBySartlari; //Eğer orderBy koşulu boş değilse başına ORDER BY anahtar kelimesini ekliyoruz
            
            ArrayList<Ilan> IlanAL=veritabani.getIlanlar(WhereSartlari+OrderBySartlari);
            DefaultListModel<Ilan> IlanLM=new DefaultListModel<>();
            int i=0;
            for(Ilan ilan:IlanAL){
                IlanLM.add(i++,ilan);
            }
            FiltreliIlanList.setModel(IlanLM);
            
        } catch (SQLException ex) {
            Logger.getLogger(ListelemeActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_ListeleBtnActionPerformed


    public ListelemeActivity() {
        try {
            initComponents();
            veritabani=new Veritabani();
            ComboBoxlariDoldur();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListelemeActivity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListelemeActivity.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void ComboBoxlariDoldur() throws SQLException{
        RenkAL=veritabani.getRenkler();
        SehirAL=veritabani.getSehirler();
        VitesTuruAL=veritabani.getVitesTurleri();
        YakitTuruAL=veritabani.getYakitTurleri();
        
        DefaultComboBoxModel<Renk> RenkCM=new DefaultComboBoxModel<>();
        DefaultComboBoxModel<Sehir> SehirCM=new DefaultComboBoxModel<>();
        DefaultComboBoxModel<VitesTuru> VitesTuruCM=new DefaultComboBoxModel<>();
        DefaultComboBoxModel<YakitTuru> YakitTuruCM=new DefaultComboBoxModel<>();
        

        int i=0;
            RenkCM.addElement(new Renk(-1, "Hiçbiri"));
        for(Renk renk:RenkAL){
            RenkCM.addElement(renk);
        }
        i=0;
            SehirCM.addElement(new Sehir(-1, "Hiçbiri"));
        for(Sehir sehir:SehirAL){
            SehirCM.addElement(sehir);
        }
        i=0;
            VitesTuruCM.addElement(new VitesTuru(-1, "Hiçbiri"));
        for(VitesTuru vitesTuru:VitesTuruAL){
            VitesTuruCM.addElement(vitesTuru);
        }
        i=0;
            YakitTuruCM.addElement(new YakitTuru(-1, "Hiçbiri"));
        for(YakitTuru yakitTuru:YakitTuruAL){
            YakitTuruCM.addElement(yakitTuru);
        }
        
        RenkSecCB.setModel(RenkCM);
        SehirSecCB.setModel(SehirCM);
        VitesTuruSecCB.setModel(VitesTuruCM);
        YakitTuruSecCB.setModel(YakitTuruCM);
                
    }
    int sehirIndexiBul(int id){
        int index=1;
        for(Sehir a:SehirAL){
            if(index==id) return a.getID();
            index++;
        }
        return -1;
    }
    int renkIndexiBul(int id){
        int index=1;
        for(Renk a:RenkAL){
            if(index==id) return a.getID();
            index++;
        }
        return -1;
    }
    int yakitTuruIndexiBul(int id){
        int index=1;
        for(YakitTuru a:YakitTuruAL){
            if(index==id) return a.getID();
            index++;
        }
        return -1;
    }
    int vitesTuruIndexiBul(int id){
        int index=1;
        for(VitesTuru a:VitesTuruAL){
            if(index==id) return a.getID();
            index++;
        }
        return -1;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ArabaMarkasiSiralaCB;
    private javax.swing.JTextField ArabaMarkasiTB;
    private javax.swing.JTextField ArabaModelTB;
    private javax.swing.JComboBox<String> ArabaModeliSiralaCB;
    private javax.swing.JComboBox<String> ArabaRengiSiralaCB;
    private javax.swing.JTextField AranacakKelimeTB;
    private javax.swing.JList<Ilan> FiltreliIlanList;
    private javax.swing.JComboBox<String> FiyatSiralaCB;
    private javax.swing.JComboBox<String> IlanAdiSiralaCB;
    private javax.swing.JButton ListeleBtn;
    private javax.swing.JTextField MaksimumFiyatTB;
    private javax.swing.JTextField MinimumFiyatTB;
    private javax.swing.JComboBox<Renk> RenkSecCB;
    private javax.swing.JComboBox<String> SehirAdiSiralaCB;
    private javax.swing.JComboBox<Sehir> SehirSecCB;
    private javax.swing.JComboBox<String> TarihSecCB;
    private javax.swing.JComboBox<String> TarihSiralaCB;
    private javax.swing.JComboBox<VitesTuru> VitesTuruSecCB;
    private javax.swing.JComboBox<String> VitesTuruSiralaCB;
    private javax.swing.JComboBox<YakitTuru> YakitTuruSecCB;
    private javax.swing.JComboBox<String> YakitTuruSiralaCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
