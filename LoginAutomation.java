package com.github.login;



/**
 * 25/09/2018
 * @author adarshpunj
 */
public class LoginAutomation extends javax.swing.JFrame {

    public LoginAutomation() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        loginID = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        connectionState = new javax.swing.JLabel();
        tryAgain = new javax.swing.JButton();
        askUser = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sourceCode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(51, 0, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Automation - The LNMIIT Login Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        loginLabel.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        loginLabel.setText("Login ID: ");

        loginID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIDActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        passwordLabel.setText("Password:");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        connectionState.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        connectionState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tryAgain.setText("Try Again");
        tryAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainActionPerformed(evt);
            }
        });

        askUser.setText("Login Failed?");

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setForeground(new java.awt.Color(255, 102, 102));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel3.setText("Want to change login credentials? ");

        sourceCode.setBackground(new java.awt.Color(0, 0, 0));
        sourceCode.setForeground(new java.awt.Color(51, 255, 0));
        sourceCode.setText("</>");
        sourceCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(askUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tryAgain)
                        .addGap(161, 161, 161))
                    .addComponent(connectionState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(361, 361, 361))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sourceCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(reset)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginLabel)
                            .addComponent(passwordLabel))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginID)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(connectionState, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(jLabel3)
                            .addComponent(sourceCode))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tryAgain)
                            .addComponent(askUser))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(status)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIDActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String username = loginID.getText();
        String pass = password.getText();
        
        try {
            startProcess(username,pass);
            if(success==true){
                try {
                String credentials = username+","+pass;
                Files.write(Paths.get("/Users/adarshpunj/Desktop/LoginAutomation/login.dat"), credentials.getBytes(), StandardOpenOption.CREATE);
                
                }catch (IOException ex) {
                    Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                status.setText("Login Failed. Please enter your login credentials, and try again.");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        connectionState.setText("ACCOUNT SET FOR AUTOMATIC LOGIN");
        askUser.setVisible(true);
        askUser.setText("TRY AGAIN IF THE LOGIN WASN'T SUCCESSFUL");
        
    }//GEN-LAST:event_loginActionPerformed

    private void tryAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainActionPerformed

        try {
            List lines = Files.readAllLines(new File("/Users/adarshpunj/Desktop/LoginAutomation/login.dat").toPath());
            String username = lines.get(0).toString().split(",")[0];
            String password = lines.get(0).toString().split(",")[1];
            startProcess(username,password);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tryAgainActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       
        try {
            Files.write(Paths.get("/Users/adarshpunj/Desktop/LoginAutomation/login.dat"), "".getBytes(), StandardOpenOption.CREATE);
        } catch (IOException ex) {
            Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        loginLabel.setVisible(true);
        loginID.setVisible(true);
        passwordLabel.setVisible(true);
        password.setVisible(true);
        login.setVisible(true);
        
        connectionState.setVisible(false);
        askUser.setVisible(false);
        tryAgain.setVisible(false);
        status.setVisible(false);
    }//GEN-LAST:event_resetActionPerformed

    private void sourceCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceCodeActionPerformed
       if (Desktop.isDesktopSupported()) {
           try {
               Desktop.getDesktop().browse(new URI("https://github.com/adarshpunj"));
           } catch (URISyntaxException ex) {
               Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_sourceCodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAutomation().setVisible(true);
                askUser.setVisible(false);
                tryAgain.setVisible(false);
                try {
                    List lines = Files.readAllLines(new File("/Users/adarshpunj/Desktop/LoginAutomation/login.dat").toPath());
                    if (lines.get(0).toString().split(",")[0]!=null && lines.get(0).toString().split(",")[1]!=null){
                        loginLabel.setVisible(false);
                        loginID.setVisible(false);
                        passwordLabel.setVisible(false);
                        password.setVisible(false);
                        login.setVisible(false);
   
                        String username = lines.get(0).toString().split(",")[0];
                        String password = lines.get(0).toString().split(",")[1];
                        startProcess(username,password);   
                    }
                } catch (IOException ex) {
                    Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(LoginAutomation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        if(success==false){
            askUser.setVisible(true);
            tryAgain.setVisible(true);
            driver.quit();
        }
    }
    
    public static void startProcess(String username, String password) throws InterruptedException{
                
        System.setProperty("webdriver.chrome.driver", "/Users/adarshpunj/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
    
        try{
            driver.get("https://172.22.2.6/connect/PortalMain");  
            WebElement usernameField = driver.findElement(By.id("LoginUserPassword_auth_username"));
            WebElement passwordField = driver.findElement(By.id("LoginUserPassword_auth_password"));
            WebElement LogIn = driver.findElement(By.id("UserCheck_Login_Button_span"));
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            LogIn.click();
            success = true;
            Thread.sleep(1000);
            driver.quit();
            connectionState.setText("YOU ARE NOW CONNECTED TO THE INTERNET");
        }catch(Exception e){
            driver.quit();
            askUser.setVisible(true);
            tryAgain.setVisible(true);
        }
    }
    
    public static int code;
    public static WebDriver driver;
    public static boolean success = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel askUser;
    private static javax.swing.JLabel connectionState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JButton login;
    private static javax.swing.JTextField loginID;
    public static javax.swing.JLabel loginLabel;
    private static javax.swing.JPasswordField password;
    private static javax.swing.JLabel passwordLabel;
    private static javax.swing.JButton reset;
    private javax.swing.JButton sourceCode;
    private static javax.swing.JLabel status;
    private static javax.swing.JButton tryAgain;
    // End of variables declaration//GEN-END:variables
}
