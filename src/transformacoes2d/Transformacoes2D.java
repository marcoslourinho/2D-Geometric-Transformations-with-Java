package transformacoes2d;

import java.awt.Graphics;

/**
 *
 * @author Marcos Pereira Lourinho 10/2015
 * facebook.com/marcospereira22
 * instagram: @marcospereira_7
 * github.com/marcospereira7
 * 
 * 
 */
public class Transformacoes2D extends javax.swing.JFrame {
   
    private int xPoly;
    private int yPoly;
    private int largura;
    private int altura;
    private int flag;
    private Graphics g;

   
    public Transformacoes2D() {
        initComponents();
               
        largura = 140;
        altura = 60;
        xPoly = 120;
        yPoly = 120;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_TranslacaoDir = new javax.swing.JButton();
        button_escalaMaior = new javax.swing.JButton();
        button_EscalaMenor = new javax.swing.JButton();
        button_TranslacaoCima = new javax.swing.JButton();
        button_TranslacaoEsq = new javax.swing.JButton();
        button_TranslacaoBaixo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel.setBackground(new java.awt.Color(255, 255, 255));
        Painel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setText("X");

        jLabel2.setText("Y");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        button_TranslacaoDir.setText("Translação Direita");
        button_TranslacaoDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TranslacaoDirActionPerformed(evt);
            }
        });

        button_escalaMaior.setText("Escala Maior");
        button_escalaMaior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_escalaMaiorActionPerformed(evt);
            }
        });

        button_EscalaMenor.setText("Escala Menor");
        button_EscalaMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EscalaMenorActionPerformed(evt);
            }
        });

        button_TranslacaoCima.setText("Translação Cima");
        button_TranslacaoCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TranslacaoCimaActionPerformed(evt);
            }
        });

        button_TranslacaoEsq.setText("Translação Esquerda");
        button_TranslacaoEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TranslacaoEsqActionPerformed(evt);
            }
        });

        button_TranslacaoBaixo.setText("Translação Baixo");
        button_TranslacaoBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TranslacaoBaixoActionPerformed(evt);
            }
        });

        jButton1.setText("Gerar Poligono");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_TranslacaoCima, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_TranslacaoBaixo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_escalaMaior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_TranslacaoEsq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_TranslacaoDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_EscalaMenor, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                    .addComponent(Painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1)
                        .addGap(82, 82, 82)
                        .addComponent(button_TranslacaoCima)
                        .addGap(18, 18, 18)
                        .addComponent(button_TranslacaoBaixo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_TranslacaoEsq)
                    .addComponent(button_TranslacaoDir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_escalaMaior)
                    .addComponent(button_EscalaMenor))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void paintComponent( Graphics g ){
                g.drawRect( xPoly, yPoly, largura, altura );
                g.drawRect( xPoly, yPoly, largura, altura );
                flag++;
        }
               
    private void button_TranslacaoDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TranslacaoDirActionPerformed
        xPoly += 10;
        limpaFrame(); 
        paintComponent(Painel.getGraphics());

    }//GEN-LAST:event_button_TranslacaoDirActionPerformed
    
    private void button_TranslacaoCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TranslacaoCimaActionPerformed
        yPoly -=10;       
        limpaFrame();
        paintComponent(Painel.getGraphics());
        
    }//GEN-LAST:event_button_TranslacaoCimaActionPerformed

    private void button_TranslacaoBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TranslacaoBaixoActionPerformed
        yPoly +=10;
        limpaFrame();
        paintComponent(Painel.getGraphics());      
    }//GEN-LAST:event_button_TranslacaoBaixoActionPerformed

    private void button_TranslacaoEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TranslacaoEsqActionPerformed
        xPoly -= 10;
        limpaFrame();
        paintComponent(Painel.getGraphics());        }//GEN-LAST:event_button_TranslacaoEsqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        paintComponent(Painel.getGraphics());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_escalaMaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_escalaMaiorActionPerformed
        largura += 10;
        altura += 10;
        limpaFrame();
        paintComponent(Painel.getGraphics()); 
    }//GEN-LAST:event_button_escalaMaiorActionPerformed

    private void button_EscalaMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EscalaMenorActionPerformed
        largura -= 10;
        altura -= 10;
        limpaFrame();
        paintComponent(Painel.getGraphics()); 
    }//GEN-LAST:event_button_EscalaMenorActionPerformed

     private void limpaFrame() {
         Painel.update(Painel.getGraphics());
     }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transformacoes2D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton button_EscalaMenor;
    private javax.swing.JButton button_TranslacaoBaixo;
    private javax.swing.JButton button_TranslacaoCima;
    private javax.swing.JButton button_TranslacaoDir;
    private javax.swing.JButton button_TranslacaoEsq;
    private javax.swing.JButton button_escalaMaior;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
