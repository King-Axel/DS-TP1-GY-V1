/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Paises;
import modelo.Especies;
import modelo.Sectores;
/**
 *
 * @author Dilan
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private Paises listaPaises;
    private Especies listaEspecies;
    private Sectores listaSectores;
    
    /**
     * Creates new form Vista_Principal
     * @param listaPaises
     * @param listaEspecies
     * @param listaSectores
     */
    // Constructor
    public VistaPrincipal(Paises listaPaises, Especies listaEspecies, Sectores listaSectores) {
        this.listaPaises = listaPaises;
        this.listaEspecies = listaEspecies;
        this.listaSectores = listaSectores;
        initComponents();
        mostrarElementos(listaSectores);
        setVisible(true);
    }

    // Setters
    public void setListaPaises(Paises listaPaises){
        this.listaPaises = listaPaises;
    }
    
    public void setListaEspecies(Especies listaEspecies){
        this.listaEspecies = listaEspecies;
    }
    
    public void setListaSectores(Sectores listaSectores){
        this.listaSectores = listaSectores;
    }
    
    // Getters
    public Paises getListaPaises(){
        return listaPaises;
    }
    
    public Especies getListaEspecies(){
        return listaEspecies;
    }
    
    public Sectores getListaSectores(){
        return listaSectores;
    }
    
    public void mostrarElementos(Sectores listaSectores){
        
//        labelSector1.setText(listaSectores.getSectores().get(1).toString());
        JOptionPane.showMessageDialog(null,listaSectores.getSectores().get(1).toString() );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sectorPanel1 = new javax.swing.JPanel();
        labelSector3 = new javax.swing.JLabel();
        labelEspecies3 = new javax.swing.JLabel();
        labelCantAnimales3 = new javax.swing.JLabel();
        labelLatLong3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        labelEncargado3 = new javax.swing.JLabel();
        sectorPanel2 = new javax.swing.JPanel();
        labelSector1 = new javax.swing.JLabel();
        labelEspecies1 = new javax.swing.JLabel();
        labelCantAnimales1 = new javax.swing.JLabel();
        labelLatLong1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelEncargado1 = new javax.swing.JLabel();
        sectorPanel3 = new javax.swing.JPanel();
        labelSector2 = new javax.swing.JLabel();
        labelEspecies2 = new javax.swing.JLabel();
        labelCantAnimales2 = new javax.swing.JLabel();
        labelLatLong2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labelEncargado2 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        botonNuevoAnimal = new javax.swing.JButton();
        botonCalcularComida = new javax.swing.JButton();
        kilosCarnivorosLabel = new javax.swing.JLabel();
        kilosCarnivoros = new javax.swing.JLabel();
        kilosHerbivorosLabel = new javax.swing.JLabel();
        kilosHerbivoros = new javax.swing.JLabel();
        kilosTotalLabel = new javax.swing.JLabel();
        kilosTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        labelSector3.setText("Nro Sector");

        labelEspecies3.setText("Especies");

        labelCantAnimales3.setText("Cantidad de Animales");

        labelLatLong3.setText("\"Latitud, Longitud\"");

        jButton3.setText("Ver detalles");

        labelEncargado3.setText("Encargado:");

        javax.swing.GroupLayout sectorPanel1Layout = new javax.swing.GroupLayout(sectorPanel1);
        sectorPanel1.setLayout(sectorPanel1Layout);
        sectorPanel1Layout.setHorizontalGroup(
            sectorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectorPanel1Layout.createSequentialGroup()
                .addGroup(sectorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sectorPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelLatLong3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sectorPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelEspecies3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sectorPanel1Layout.createSequentialGroup()
                        .addGroup(sectorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sectorPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(labelSector3))
                            .addGroup(sectorPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton3))
                            .addGroup(sectorPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelCantAnimales3))
                            .addGroup(sectorPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelEncargado3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sectorPanel1Layout.setVerticalGroup(
            sectorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectorPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSector3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEspecies3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCantAnimales3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLatLong3)
                .addGap(18, 18, 18)
                .addComponent(labelEncargado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        labelSector1.setText("Nro Sector");

        labelEspecies1.setText("Especies");

        labelCantAnimales1.setText("Cantidad de Animales");

        labelLatLong1.setText("\"Latitud, Longitud\"");

        jButton1.setText("Ver detalles");

        labelEncargado1.setText("Encargado:");

        javax.swing.GroupLayout sectorPanel2Layout = new javax.swing.GroupLayout(sectorPanel2);
        sectorPanel2.setLayout(sectorPanel2Layout);
        sectorPanel2Layout.setHorizontalGroup(
            sectorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectorPanel2Layout.createSequentialGroup()
                .addGroup(sectorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sectorPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sectorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEspecies1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLatLong1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                    .addGroup(sectorPanel2Layout.createSequentialGroup()
                        .addGroup(sectorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sectorPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(labelSector1))
                            .addGroup(sectorPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelCantAnimales1))
                            .addGroup(sectorPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(sectorPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEncargado1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sectorPanel2Layout.setVerticalGroup(
            sectorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectorPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSector1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEspecies1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCantAnimales1)
                .addGap(18, 18, 18)
                .addComponent(labelLatLong1)
                .addGap(18, 18, 18)
                .addComponent(labelEncargado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        labelSector2.setText("Nro Sector");

        labelEspecies2.setText("Especies");

        labelCantAnimales2.setText("Cantidad de Animales");

        labelLatLong2.setText("\"Latitud, Longitud\"");

        jButton2.setText("Ver detalles");

        labelEncargado2.setText("Encargado:");

        javax.swing.GroupLayout sectorPanel3Layout = new javax.swing.GroupLayout(sectorPanel3);
        sectorPanel3.setLayout(sectorPanel3Layout);
        sectorPanel3Layout.setHorizontalGroup(
            sectorPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectorPanel3Layout.createSequentialGroup()
                .addGroup(sectorPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sectorPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelSector2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(sectorPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelLatLong2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(sectorPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sectorPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEspecies2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sectorPanel3Layout.createSequentialGroup()
                                .addComponent(labelCantAnimales2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sectorPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(55, 55, 55))
            .addGroup(sectorPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEncargado2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sectorPanel3Layout.setVerticalGroup(
            sectorPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectorPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSector2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEspecies2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCantAnimales2)
                .addGap(18, 18, 18)
                .addComponent(labelLatLong2)
                .addGap(18, 18, 18)
                .addComponent(labelEncargado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        panelMenu.setBackground(new java.awt.Color(0, 0, 0));

        botonNuevoAnimal.setBackground(new java.awt.Color(0, 0, 0));
        botonNuevoAnimal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonNuevoAnimal.setForeground(new java.awt.Color(255, 255, 255));
        botonNuevoAnimal.setText("Agregar Animal");
        botonNuevoAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNuevoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoAnimalActionPerformed(evt);
            }
        });

        botonCalcularComida.setBackground(new java.awt.Color(0, 0, 0));
        botonCalcularComida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCalcularComida.setForeground(new java.awt.Color(255, 255, 255));
        botonCalcularComida.setText("Calcular Comida");
        botonCalcularComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCalcularComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularComidaActionPerformed(evt);
            }
        });

        kilosCarnivorosLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kilosCarnivorosLabel.setForeground(new java.awt.Color(255, 255, 255));
        kilosCarnivorosLabel.setText("Kgs Carnivoros");

        kilosCarnivoros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kilosCarnivoros.setForeground(new java.awt.Color(255, 255, 255));
        kilosCarnivoros.setText("0");
        kilosCarnivoros.setToolTipText("");

        kilosHerbivorosLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kilosHerbivorosLabel.setForeground(new java.awt.Color(255, 255, 255));
        kilosHerbivorosLabel.setText("Kgs Herbivoros");

        kilosHerbivoros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kilosHerbivoros.setForeground(new java.awt.Color(255, 255, 255));
        kilosHerbivoros.setText("0");
        kilosHerbivoros.setToolTipText("");

        kilosTotalLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kilosTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        kilosTotalLabel.setText("Kgs Total");

        kilosTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kilosTotal.setForeground(new java.awt.Color(255, 255, 255));
        kilosTotal.setText("0");
        kilosTotal.setToolTipText("");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCalcularComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonNuevoAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kilosHerbivorosLabel)
                    .addComponent(kilosCarnivorosLabel))
                .addGap(46, 46, 46))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(kilosTotalLabel))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(kilosCarnivoros))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(kilosHerbivoros))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(kilosTotal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botonNuevoAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCalcularComida)
                .addGap(18, 18, 18)
                .addComponent(kilosCarnivorosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kilosCarnivoros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kilosHerbivorosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kilosHerbivoros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kilosTotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kilosTotal)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sectorPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sectorPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sectorPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172)
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(sectorPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(sectorPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sectorPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoAnimalActionPerformed
        AgregarAnimal agregarAnimal = new AgregarAnimal(this.listaPaises, this.listaEspecies, this.listaSectores);
        agregarAnimal.setVisible(true);
    }//GEN-LAST:event_botonNuevoAnimalActionPerformed

    private void botonCalcularComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCalcularComidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcularComida;
    private javax.swing.JButton botonNuevoAnimal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kilosCarnivoros;
    private javax.swing.JLabel kilosCarnivorosLabel;
    private javax.swing.JLabel kilosHerbivoros;
    private javax.swing.JLabel kilosHerbivorosLabel;
    private javax.swing.JLabel kilosTotal;
    private javax.swing.JLabel kilosTotalLabel;
    private javax.swing.JLabel labelCantAnimales1;
    private javax.swing.JLabel labelCantAnimales2;
    private javax.swing.JLabel labelCantAnimales3;
    private javax.swing.JLabel labelEncargado1;
    private javax.swing.JLabel labelEncargado2;
    private javax.swing.JLabel labelEncargado3;
    private javax.swing.JLabel labelEspecies1;
    private javax.swing.JLabel labelEspecies2;
    private javax.swing.JLabel labelEspecies3;
    private javax.swing.JLabel labelLatLong1;
    private javax.swing.JLabel labelLatLong2;
    private javax.swing.JLabel labelLatLong3;
    private javax.swing.JLabel labelSector1;
    private javax.swing.JLabel labelSector2;
    private javax.swing.JLabel labelSector3;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel sectorPanel1;
    private javax.swing.JPanel sectorPanel2;
    private javax.swing.JPanel sectorPanel3;
    // End of variables declaration//GEN-END:variables
}
