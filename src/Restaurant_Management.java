
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class Restaurant_Management extends javax.swing.JFrame {
    double firstnum;
    double secondnum;
    double result;
    String operations;
    double i ;
    double chillycheese = 250;
    double frenchfries = 50;
    double stuffedChap = 150;
    
    public Restaurant_Management() {
        initComponents();
        showDate();
        showTime();
    }
    void showDate(){
    Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
    datelbl.setText(s.format(d));
    
    }
    
    void showTime(){
    new Timer(0, new ActionListener(){
    public void actionPerformed(ActionEvent e){
        Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
    timelbl.setText(s.format(d));
    }
    }).start();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ccchk = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        scchk = new javax.swing.JCheckBox();
        ffchk = new javax.swing.JCheckBox();
        hdchk = new javax.swing.JCheckBox();
        taxchk = new javax.swing.JCheckBox();
        dcb = new javax.swing.JComboBox<>();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        q4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cdtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        codtf = new javax.swing.JTextField();
        cmtf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sttf = new javax.swing.JTextField();
        ttf = new javax.swing.JTextField();
        taxtf = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        ccb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cutf = new javax.swing.JTextField();
        cuatf = new javax.swing.JTextField();
        ConvertBtn = new javax.swing.JToggleButton();
        closeBtn = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        CtBtn = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        TotalBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        ReceiptBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        ctf = new javax.swing.JTextField();
        datelbl = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(332, 181));

        ccchk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ccchk.setText("Chilly Cheese (₹ 250)");
        ccchk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccchkMouseClicked(evt);
            }
        });
        ccchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccchkActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DRINKS:");

        scchk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        scchk.setText("Stuffed Chap (₹ 150)");
        scchk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scchkMouseClicked(evt);
            }
        });
        scchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scchkActionPerformed(evt);
            }
        });

        ffchk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ffchk.setText("French Fries (₹ 50)");
        ffchk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ffchkMouseClicked(evt);
            }
        });
        ffchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffchkActionPerformed(evt);
            }
        });

        hdchk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hdchk.setText("Home Delievery");
        hdchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdchkActionPerformed(evt);
            }
        });

        taxchk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        taxchk.setText("TAX");
        taxchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxchkActionPerformed(evt);
            }
        });

        dcb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Drink", "Apple Juice (₹ 40)", "Tea (₹ 30)", "Catch Cola (₹ 20)", "Coffee (₹ 30)", "Lemonade(₹ 30)", "Masala Soda(₹ 20)", "Cold Coffee (₹ 40)", "Ice Tea (₹ 30)" }));
        dcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcbActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        q1.setText("0");

        q2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        q2.setText("0");

        q3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        q3.setText("0");

        q4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        q4.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(taxchk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hdchk))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcb, 0, 185, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(scchk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ccchk, javax.swing.GroupLayout.PREFERRED_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(ffchk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q1)
                            .addComponent(q2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccchk)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ffchk)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scchk)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dcb)
                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxchk)
                    .addComponent(hdchk)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<HTML><U><I>Parjanay's Restaurant Billing System</I></U><HTML>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(306, 181));

        cdtf.setEditable(false);
        cdtf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cdtf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        cdtf.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Cost of Meals");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Cost of Drinks");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Cost of Delivery");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("₹");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("₹");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("₹");

        codtf.setEditable(false);
        codtf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        codtf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        codtf.setText("0");

        cmtf.setEditable(false);
        cmtf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmtf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        cmtf.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cdtf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codtf, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(cmtf, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Sub Total");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("TAX");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Total");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("₹");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("₹");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("₹");

        sttf.setEditable(false);
        sttf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sttf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        sttf.setText("0");

        ttf.setEditable(false);
        ttf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        ttf.setText("0");

        taxtf.setEditable(false);
        taxtf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        taxtf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        taxtf.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttf)
                    .addComponent(taxtf)
                    .addComponent(sttf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(taxtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        ccb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ccb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose the Currency", "USA", "Nigeria", "Kenya", "Canada ", "Thailand", "Brazil", "Indonesia", "Philippines", "China", "Japan" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Currency Convertor");

        cutf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cutf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        cutf.setText("0");

        cuatf.setEditable(false);
        cuatf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cuatf.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        cuatf.setText("0");

        ConvertBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ConvertBtn.setText("Convert");
        ConvertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertBtnActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("₹");

        CtBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CtBtn.setMnemonic('c');
        CtBtn.setText("<HTML><U>C</U>hange Total</HTML>");
        CtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ccb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cuatf)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cutf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ConvertBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBtn)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ccb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cutf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cuatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConvertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        TotalBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalBtn.setText("TOTAL");
        TotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBtnActionPerformed(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        ReceiptBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ReceiptBtn.setText("Receipt");
        ReceiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptBtnActionPerformed(evt);
            }
        });

        ExitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TotalBtn)
                .addGap(131, 131, 131)
                .addComponent(ReceiptBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ResetBtn)
                .addGap(113, 113, 113)
                .addComponent(ExitBtn)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReceiptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TotalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel6.setMaximumSize(new java.awt.Dimension(1300, 700));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ta.setColumns(20);
        ta.setRows(5);
        ta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt Here:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(ta);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Receipt", jPanel7);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("1");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.setText("←");
        jButton21.setBorder(null);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setText("+");
        jButton13.setBorder(null);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setText("-");
        jButton12.setBorder(null);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setText("X");
        jButton14.setBorder(null);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setText(".");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton19.setText("/");
        jButton19.setBorder(null);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton20.setText("00");
        jButton20.setActionCommand("o");
        jButton20.setBorder(null);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17.setText("+/-");
        jButton17.setBorder(null);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setText("CLEAR");
        jButton16.setBorder(null);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(204, 204, 204));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setText("=");
        jButton18.setBorder(null);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel3.setText("A Parjanay Company Product");

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.setText("5");
        jButton22.setBorder(null);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setText("4");
        jButton23.setBorder(null);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setText("8");
        jButton24.setBorder(null);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton25.setText("7");
        jButton25.setBorder(null);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton26.setText("3");
        jButton26.setBorder(null);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton27.setText("2");
        jButton27.setBorder(null);
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton28.setText("6");
        jButton28.setBorder(null);
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton29.setText("9");
        jButton29.setBorder(null);
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton30.setText("0");
        jButton30.setBorder(null);
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncommon(evt);
            }
        });

        ctf.setFont(new java.awt.Font("Digital-7", 1, 18)); // NOI18N
        ctf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctf)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(97, 97, 97))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(ctf, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton27)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton22)
                    .addComponent(jButton28)
                    .addComponent(jButton12))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton30)
                    .addComponent(jButton20)
                    .addComponent(jButton19))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16)))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(372, 372, 372))
        );

        jTabbedPane1.addTab("Calculator", jPanel8);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, Short.MAX_VALUE))
        );

        datelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        datelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        timelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcbActionPerformed
int num = dcb.getSelectedIndex();
float q = Float.parseFloat(q4.getText());
int r;
switch(num){
    case 0 : cdtf.setText("0"); break;
    case 1 : i = 40; break;
    case 2 : i = 30; break;
    case 3 : i = 20; break;
    case 4 : i = 30; break;
    case 5 : i = 30; break;
    case 6 : i = 20; break;
    case 7 : i = 40; break;
    case 8 : i = 30; break;   
}
double a =  i*q;
cdtf.setText(""+ a);
    }//GEN-LAST:event_dcbActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
if(ctf.getText().length()>0){
StringBuilder strB = new StringBuilder(ctf.getText());
strB.deleteCharAt(ctf.getText().length()-1);
ctf.setText(""+strB);
}
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
firstnum = Double.parseDouble(ctf.getText());
ctf.setText("");
operations = "+";
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
firstnum = Double.parseDouble(ctf.getText());
ctf.setText("");
operations = "-";
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
firstnum = Double.parseDouble(ctf.getText());
ctf.setText("");
operations = "*";
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
firstnum = Double.parseDouble(ctf.getText());
ctf.setText("");
operations = "/";
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
double ops = Double.parseDouble(String.valueOf(ctf.getText()));
ops = ops * (-1);
ctf.setText(String.valueOf(ops));

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
ctf.setText("");      
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
secondnum = Double.parseDouble(ctf.getText());
switch(operations){
    case "+": ctf.setText(Double.toString(firstnum + secondnum));
              break;
    case "-": ctf.setText(Double.toString(firstnum - secondnum));
              break;
    case "*": ctf.setText(Double.toString(firstnum * secondnum));
              break;
    case "/": ctf.setText(Double.toString(firstnum / secondnum));
              break;
}
    }//GEN-LAST:event_jButton18ActionPerformed

    private void Btncommon(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btncommon
String num = evt.getActionCommand();
String s = ctf.getText();
switch(num){
    case "0": ctf.setText(s+"0");
              break;
    case "o": ctf.setText(s+"00");
              break;
    case "1": ctf.setText(s+"1");
              break;
    case "2": ctf.setText(s+"2");
              break;
    case "3": ctf.setText(s+"3");
              break;
    case "4": ctf.setText(s+"4");
              break;
    case "5": ctf.setText(s+"5");
              break;
    case "6": ctf.setText(s+"6");
              break;
    case "7": ctf.setText(s+"7");
              break;
    case "8": ctf.setText(s+"8");
              break;
    case "9": ctf.setText(s+"9");
              break;
    case ".":ctf.setText(s+".");
              break;
}
    }//GEN-LAST:event_Btncommon

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void ConvertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertBtnActionPerformed
int num = ccb.getSelectedIndex();
switch(num){
    case 0 : cutf.setText("0"); cuatf.setText("0"); 
             break;
    case 1 : cuatf.setText((Double.parseDouble(cutf.getText())*0.015)+"$"); 
             break;
    case 2 : cuatf.setText((Double.parseDouble(cutf.getText())*4.72)+"₦"); 
             break;
    case 3 : cuatf.setText((Double.parseDouble(cutf.getText())*1.54)+"KSh"); 
             break;
    case 4 : cuatf.setText((Double.parseDouble(cutf.getText())*0.020)+"C$"); 
             break;
    case 5 : cuatf.setText((Double.parseDouble(cutf.getText())*0.53)+"฿"); 
             break;
    case 6 : cuatf.setText((Double.parseDouble(cutf.getText())*0.048)+"R$"); 
             break;
    case 7 : cuatf.setText((Double.parseDouble(cutf.getText())*200.85)+"Rp"); 
             break;
    case 8 : cuatf.setText((Double.parseDouble(cutf.getText())*0.75)+"₱"); 
             break;
    case 9 : cuatf.setText((Double.parseDouble(cutf.getText())*0.10)+"¥"); 
             break;
    case 10 : cuatf.setText((Double.parseDouble(cutf.getText())*1.72)+"¥"); 
             break;
}
        
    }//GEN-LAST:event_ConvertBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
cutf.setText("0");
cuatf.setText("0");
ccb.setSelectedIndex(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void taxchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxchkActionPerformed
if(taxchk.isSelected()==false)
    taxtf.setText("0");
if(taxchk.isSelected()==true)
    taxtf.setText("65");
    }//GEN-LAST:event_taxchkActionPerformed

    private void hdchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hdchkActionPerformed
if(hdchk.isSelected()==false)
    codtf.setText("0");
if(hdchk.isSelected()==true)
    codtf.setText("150");
    }//GEN-LAST:event_hdchkActionPerformed

    private void ReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptBtnActionPerformed
String date = datelbl.getText();
String time = timelbl.getText();
double n1 = Double.parseDouble(q1.getText());
double n2 = Double.parseDouble(q2.getText());
double n3 = Double.parseDouble(q3.getText());
String drink = "Drink Selected";
double n7=0;
if(dcb.getSelectedIndex()>0){
drink = (String)dcb.getSelectedItem();
n7 = Double.parseDouble(q4.getText());
}

double n4 = Double.parseDouble(taxtf.getText());
double n5 = Double.parseDouble(codtf.getText());
double n6 = Double.parseDouble(ttf.getText());


ta.append("\n              PARJANAY'S RESTAURANT \n\n" 
        + "Item\t\tQuantity\n" + "Chilly Cheese:\t\t"
        + n1+ "\n French Fries:\t\t"
        + n2 + "\n Stuffed Chap:\t\t"
        +n3+"\n"+drink+"\t\t"+n7
        + "\n TAX \t\t"+n4+"\n Home Delivery \t\t"+ 
        n5+ "\n--------------------------------------------------------------"+"\n Total Payment \t\t"+ n6+
        "\n--------------------------------------------------------------"+
        "\n         Hope You Have a nice Day Ahead" 
        +"\n                           "+ date 
        +"\n                           "+ time
        + "\n--------------------------------------------------------------" );
    }//GEN-LAST:event_ReceiptBtnActionPerformed

    private void ccchkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccchkMouseClicked
double cMeal = Double.parseDouble(cmtf.getText());
double n = Double.parseDouble(q1.getText());
double a;
if(ccchk.isSelected()){
i = (chillycheese * n) + cMeal;
cmtf.setText(""+i);
}
    }//GEN-LAST:event_ccchkMouseClicked

    private void TotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBtnActionPerformed
double n1 = Double.parseDouble(cdtf.getText());
double n2 = Double.parseDouble(cmtf.getText());
double n3 = Double.parseDouble(codtf.getText());
double n4 = Double.parseDouble(taxtf.getText());
double total = n1+n2+n3;
sttf.setText(""+total);
double all_total = total + n4;
ttf.setText(""+all_total);
    }//GEN-LAST:event_TotalBtnActionPerformed

    private void ffchkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ffchkMouseClicked
double cMeal = Double.parseDouble(cmtf.getText());
double n = Double.parseDouble(q2.getText());

double a;
if(ffchk.isSelected()){
i= (frenchfries * n) + cMeal;
cmtf.setText(""+i);
}
    }//GEN-LAST:event_ffchkMouseClicked

    private void scchkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scchkMouseClicked
double cMeal = Double.parseDouble(cmtf.getText());
double n = Double.parseDouble(q3.getText());

double a;
if(scchk.isSelected()){
i= (stuffedChap * n) + cMeal;
cmtf.setText(""+i);
}
    }//GEN-LAST:event_scchkMouseClicked

    private void ccchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccchkActionPerformed
double n = Double.parseDouble(q1.getText());
double n1 = Double.parseDouble(cmtf.getText());
double r;
if(ccchk.isSelected()== false){
r = n1 - (chillycheese*n);
cmtf.setText(""+r);
}
if(ccchk.isSelected()== false && n1==0){
cmtf.setText("0");
}
    }//GEN-LAST:event_ccchkActionPerformed

    private void ffchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ffchkActionPerformed
double n = Double.parseDouble(q2.getText());
double n1 = Double.parseDouble(cmtf.getText());
double r;
if(ffchk.isSelected()== false){
r = n1 - (frenchfries*n);
cmtf.setText(""+r);
}
if(ffchk.isSelected()== false && n1==0){
cmtf.setText("0");
}
    }//GEN-LAST:event_ffchkActionPerformed

    private void scchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scchkActionPerformed
double n = Double.parseDouble(q3.getText());
double n1 = Double.parseDouble(cmtf.getText());
double r;
if(scchk.isSelected()== false){
r = n1 - (stuffedChap*n);
cmtf.setText(""+r);
}
if(scchk.isSelected()== false && n1==0){
cmtf.setText("0");
}
    }//GEN-LAST:event_scchkActionPerformed

    private void CtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtBtnActionPerformed
cutf.setText(ttf.getText());
int num = ccb.getSelectedIndex();
switch(num){
    case 0 : cutf.setText("0"); cuatf.setText("0"); 
             break;
    case 1 : cuatf.setText((Double.parseDouble(cutf.getText())*0.015)+"$"); 
             break;
    case 2 : cuatf.setText((Double.parseDouble(cutf.getText())*4.72)+"₦"); 
             break;
    case 3 : cuatf.setText((Double.parseDouble(cutf.getText())*1.54)+"KSh"); 
             break;
    case 4 : cuatf.setText((Double.parseDouble(cutf.getText())*0.020)+"C$"); 
             break;
    case 5 : cuatf.setText((Double.parseDouble(cutf.getText())*0.53)+"฿"); 
             break;
    case 6 : cuatf.setText((Double.parseDouble(cutf.getText())*0.048)+"R$"); 
             break;
    case 7 : cuatf.setText((Double.parseDouble(cutf.getText())*200.85)+"Rp"); 
             break;
    case 8 : cuatf.setText((Double.parseDouble(cutf.getText())*0.75)+"₱"); 
             break;
    case 9 : cuatf.setText((Double.parseDouble(cutf.getText())*0.10)+"¥"); 
             break;
    case 10 : cuatf.setText((Double.parseDouble(cutf.getText())*1.72)+"¥"); 
             break;
}
    }//GEN-LAST:event_CtBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
ccchk.setSelected(false);
ffchk.setSelected(false);
scchk.setSelected(false);
q1.setText("0");
q2.setText("0");
q3.setText("0");
q4.setText("0");
dcb.setSelectedIndex(0);
taxchk.setSelected(false);
hdchk.setSelected(false);
cdtf.setText("0");
cmtf.setText("0");
codtf.setText("0");
sttf.setText("0");
taxtf.setText("0");
ttf.setText("0");
ta.setText("");
closeBtn.doClick(0);
jButton16.doClick(0);
    }//GEN-LAST:event_ResetBtnActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Restaurant_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ConvertBtn;
    private javax.swing.JToggleButton CtBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton ReceiptBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton TotalBtn;
    private javax.swing.JComboBox<String> ccb;
    private javax.swing.JCheckBox ccchk;
    private javax.swing.JTextField cdtf;
    private javax.swing.JToggleButton closeBtn;
    private javax.swing.JTextField cmtf;
    private javax.swing.JTextField codtf;
    private javax.swing.JTextField ctf;
    private javax.swing.JTextField cuatf;
    private javax.swing.JTextField cutf;
    private javax.swing.JLabel datelbl;
    private javax.swing.JComboBox<String> dcb;
    private javax.swing.JCheckBox ffchk;
    private javax.swing.JCheckBox hdchk;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JCheckBox scchk;
    private javax.swing.JTextField sttf;
    private javax.swing.JTextArea ta;
    private javax.swing.JCheckBox taxchk;
    private javax.swing.JTextField taxtf;
    private javax.swing.JLabel timelbl;
    private javax.swing.JTextField ttf;
    // End of variables declaration//GEN-END:variables
}
