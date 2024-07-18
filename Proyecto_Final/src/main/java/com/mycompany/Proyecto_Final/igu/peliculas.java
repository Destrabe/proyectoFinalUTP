package com.mycompany.Proyecto_Final.igu;

import java.awt.Color;

public class peliculas extends javax.swing.JFrame {

     int xMouse, yMouse;
     
    public peliculas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        princ = new javax.swing.JPanel();
        movie01Pnl = new javax.swing.JPanel();
        poster01 = new javax.swing.JLabel();
        title01Txt = new javax.swing.JLabel();
        disponibilidad01Txt = new javax.swing.JLabel();
        datos01Pnl = new javax.swing.JPanel();
        genero01Txt = new javax.swing.JLabel();
        duracion01Txt = new javax.swing.JLabel();
        clasificacion01Txt = new javax.swing.JLabel();
        idioma01Txt = new javax.swing.JLabel();
        movie02Pnl = new javax.swing.JPanel();
        poster02 = new javax.swing.JLabel();
        title02Txt = new javax.swing.JLabel();
        disponibilidad02Txt = new javax.swing.JLabel();
        datos02Pnl = new javax.swing.JPanel();
        genero02Txt = new javax.swing.JLabel();
        duracion02Txt = new javax.swing.JLabel();
        clasificacion02Txt = new javax.swing.JLabel();
        idioma02Txt = new javax.swing.JLabel();
        movie03Pnl = new javax.swing.JPanel();
        poster03 = new javax.swing.JLabel();
        title03Txt = new javax.swing.JLabel();
        disponibilidad03Txt = new javax.swing.JLabel();
        datos03Pnl = new javax.swing.JPanel();
        genero03Txt = new javax.swing.JLabel();
        duracion03Txt = new javax.swing.JLabel();
        clasificacion03Txt = new javax.swing.JLabel();
        idioma03Txt = new javax.swing.JLabel();
        movie04Pnl = new javax.swing.JPanel();
        poster04 = new javax.swing.JLabel();
        title04Txt = new javax.swing.JLabel();
        disponibilidad04Txt = new javax.swing.JLabel();
        datos04Pnl = new javax.swing.JPanel();
        genero04Txt = new javax.swing.JLabel();
        duracion04Txt = new javax.swing.JLabel();
        clasificacion04Txt = new javax.swing.JLabel();
        idioma04Txt = new javax.swing.JLabel();
        movieTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(814, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 60));

        princ.setBackground(new java.awt.Color(255, 255, 255));

        poster01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InsideOut.jpg"))); // NOI18N
        poster01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        poster01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poster01MouseClicked(evt);
            }
        });

        title01Txt.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        title01Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title01Txt.setText("Intensamente 2");

        disponibilidad01Txt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        disponibilidad01Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disponibilidad01Txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoVerde.png"))); // NOI18N
        disponibilidad01Txt.setText("Disponible");

        genero01Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        genero01Txt.setText("Género: Animación");

        duracion01Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        duracion01Txt.setText("Duración: 1h 40min");

        clasificacion01Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        clasificacion01Txt.setText("Clasificacion: APT");

        idioma01Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        idioma01Txt.setText("Idioma: Doblada");

        javax.swing.GroupLayout datos01PnlLayout = new javax.swing.GroupLayout(datos01Pnl);
        datos01Pnl.setLayout(datos01PnlLayout);
        datos01PnlLayout.setHorizontalGroup(
            datos01PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos01PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos01PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duracion01Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(genero01Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clasificacion01Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idioma01Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        datos01PnlLayout.setVerticalGroup(
            datos01PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos01PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genero01Txt)
                .addGap(18, 18, 18)
                .addComponent(duracion01Txt)
                .addGap(18, 18, 18)
                .addComponent(clasificacion01Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idioma01Txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout movie01PnlLayout = new javax.swing.GroupLayout(movie01Pnl);
        movie01Pnl.setLayout(movie01PnlLayout);
        movie01PnlLayout.setHorizontalGroup(
            movie01PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie01PnlLayout.createSequentialGroup()
                .addComponent(poster01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movie01PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title01Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disponibilidad01Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datos01Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        movie01PnlLayout.setVerticalGroup(
            movie01PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(poster01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(movie01PnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title01Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datos01Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disponibilidad01Txt)
                .addContainerGap())
        );

        poster02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Deadpool.jpg"))); // NOI18N
        poster02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        poster02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poster02MouseClicked(evt);
            }
        });

        title02Txt.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        title02Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title02Txt.setText("Deadpool & Wolverine");

        disponibilidad02Txt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        disponibilidad02Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disponibilidad02Txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoVerde.png"))); // NOI18N
        disponibilidad02Txt.setText("Disponible");

        genero02Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        genero02Txt.setText("Género: Acción");

        duracion02Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        duracion02Txt.setText("Duración: 2h 10min");

        clasificacion02Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        clasificacion02Txt.setText("Clasificacion: +14");

        idioma02Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        idioma02Txt.setText("Idioma: Doblada , Subtitulada");

        javax.swing.GroupLayout datos02PnlLayout = new javax.swing.GroupLayout(datos02Pnl);
        datos02Pnl.setLayout(datos02PnlLayout);
        datos02PnlLayout.setHorizontalGroup(
            datos02PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos02PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos02PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duracion02Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genero02Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clasificacion02Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idioma02Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        datos02PnlLayout.setVerticalGroup(
            datos02PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos02PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genero02Txt)
                .addGap(18, 18, 18)
                .addComponent(duracion02Txt)
                .addGap(18, 18, 18)
                .addComponent(clasificacion02Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idioma02Txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout movie02PnlLayout = new javax.swing.GroupLayout(movie02Pnl);
        movie02Pnl.setLayout(movie02PnlLayout);
        movie02PnlLayout.setHorizontalGroup(
            movie02PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie02PnlLayout.createSequentialGroup()
                .addComponent(poster02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movie02PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title02Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disponibilidad02Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datos02Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        movie02PnlLayout.setVerticalGroup(
            movie02PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(poster02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(movie02PnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title02Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datos02Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disponibilidad02Txt)
                .addContainerGap())
        );

        poster03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/badBoys.jpg"))); // NOI18N
        poster03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        title03Txt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        title03Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title03Txt.setText("Bad Boys: Hasta la Muerte");

        disponibilidad03Txt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        disponibilidad03Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disponibilidad03Txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Punto_Rojo.png"))); // NOI18N
        disponibilidad03Txt.setText("En mantenimiento");

        genero03Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        genero03Txt.setText("Género: Acción");

        duracion03Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        duracion03Txt.setText("Duración: 1h 40min");

        clasificacion03Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        clasificacion03Txt.setText("Clasificacion: +14");

        idioma03Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        idioma03Txt.setText("Idioma: Doblada , Subtitulada");

        javax.swing.GroupLayout datos03PnlLayout = new javax.swing.GroupLayout(datos03Pnl);
        datos03Pnl.setLayout(datos03PnlLayout);
        datos03PnlLayout.setHorizontalGroup(
            datos03PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos03PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos03PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duracion03Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genero03Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clasificacion03Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idioma03Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        datos03PnlLayout.setVerticalGroup(
            datos03PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos03PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genero03Txt)
                .addGap(18, 18, 18)
                .addComponent(duracion03Txt)
                .addGap(18, 18, 18)
                .addComponent(clasificacion03Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idioma03Txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout movie03PnlLayout = new javax.swing.GroupLayout(movie03Pnl);
        movie03Pnl.setLayout(movie03PnlLayout);
        movie03PnlLayout.setHorizontalGroup(
            movie03PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie03PnlLayout.createSequentialGroup()
                .addComponent(poster03)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movie03PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disponibilidad03Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datos03Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(movie03PnlLayout.createSequentialGroup()
                        .addComponent(title03Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        movie03PnlLayout.setVerticalGroup(
            movie03PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie03PnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title03Txt)
                .addGap(8, 8, 8)
                .addComponent(datos03Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disponibilidad03Txt)
                .addContainerGap())
            .addComponent(poster03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        poster04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MVF.jpg"))); // NOI18N
        poster04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        title04Txt.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        title04Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title04Txt.setText("Mi Villano Favorito 4");

        disponibilidad04Txt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        disponibilidad04Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disponibilidad04Txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoVerde.png"))); // NOI18N
        disponibilidad04Txt.setText("Disponible");

        genero04Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        genero04Txt.setText("Género: Animación");

        duracion04Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        duracion04Txt.setText("Duración: 1h 40min");

        clasificacion04Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        clasificacion04Txt.setText("Clasificacion: APT");

        idioma04Txt.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        idioma04Txt.setText("Idioma: Doblada");

        javax.swing.GroupLayout datos04PnlLayout = new javax.swing.GroupLayout(datos04Pnl);
        datos04Pnl.setLayout(datos04PnlLayout);
        datos04PnlLayout.setHorizontalGroup(
            datos04PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos04PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos04PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genero04Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(duracion04Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(clasificacion04Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idioma04Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        datos04PnlLayout.setVerticalGroup(
            datos04PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos04PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genero04Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(duracion04Txt)
                .addGap(18, 18, 18)
                .addComponent(clasificacion04Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idioma04Txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout movie04PnlLayout = new javax.swing.GroupLayout(movie04Pnl);
        movie04Pnl.setLayout(movie04PnlLayout);
        movie04PnlLayout.setHorizontalGroup(
            movie04PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie04PnlLayout.createSequentialGroup()
                .addComponent(poster04)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movie04PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title04Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disponibilidad04Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datos04Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        movie04PnlLayout.setVerticalGroup(
            movie04PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie04PnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title04Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datos04Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disponibilidad04Txt)
                .addContainerGap())
            .addComponent(poster04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        movieTxt.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        movieTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movieTxt.setText("Peliculas");

        javax.swing.GroupLayout princLayout = new javax.swing.GroupLayout(princ);
        princ.setLayout(princLayout);
        princLayout.setHorizontalGroup(
            princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(princLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movie01Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movie03Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movie02Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movie04Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(princLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(movieTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        princLayout.setVerticalGroup(
            princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, princLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(movieTxt)
                .addGap(18, 18, 18)
                .addGroup(princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movie01Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movie02Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(movie03Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movie04Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        background.add(princ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 870, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation( x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
      System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(new Color(196,43,28,255));
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
       exitBtn.setBackground(new Color(242,242,242,255));
       exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void poster01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poster01MouseClicked
       insideOut io = new insideOut();
       io.setVisible(true);
       this.setVisible(false);
       io.setLocationRelativeTo(null);
    }//GEN-LAST:event_poster01MouseClicked

    private void poster02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poster02MouseClicked
       deadpool dp = new deadpool();
       dp.setVisible(true);
       this.setVisible(false);
       dp.setLocationRelativeTo(null);
    }//GEN-LAST:event_poster02MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel clasificacion01Txt;
    private javax.swing.JLabel clasificacion02Txt;
    private javax.swing.JLabel clasificacion03Txt;
    private javax.swing.JLabel clasificacion04Txt;
    private javax.swing.JPanel datos01Pnl;
    private javax.swing.JPanel datos02Pnl;
    private javax.swing.JPanel datos03Pnl;
    private javax.swing.JPanel datos04Pnl;
    private javax.swing.JLabel disponibilidad01Txt;
    private javax.swing.JLabel disponibilidad02Txt;
    private javax.swing.JLabel disponibilidad03Txt;
    private javax.swing.JLabel disponibilidad04Txt;
    private javax.swing.JLabel duracion01Txt;
    private javax.swing.JLabel duracion02Txt;
    private javax.swing.JLabel duracion03Txt;
    private javax.swing.JLabel duracion04Txt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel genero01Txt;
    private javax.swing.JLabel genero02Txt;
    private javax.swing.JLabel genero03Txt;
    private javax.swing.JLabel genero04Txt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel idioma01Txt;
    private javax.swing.JLabel idioma02Txt;
    private javax.swing.JLabel idioma03Txt;
    private javax.swing.JLabel idioma04Txt;
    private javax.swing.JPanel movie01Pnl;
    private javax.swing.JPanel movie02Pnl;
    private javax.swing.JPanel movie03Pnl;
    private javax.swing.JPanel movie04Pnl;
    private javax.swing.JLabel movieTxt;
    private javax.swing.JLabel poster01;
    private javax.swing.JLabel poster02;
    private javax.swing.JLabel poster03;
    private javax.swing.JLabel poster04;
    private javax.swing.JPanel princ;
    private javax.swing.JLabel title01Txt;
    private javax.swing.JLabel title02Txt;
    private javax.swing.JLabel title03Txt;
    private javax.swing.JLabel title04Txt;
    // End of variables declaration//GEN-END:variables
}
