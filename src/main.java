/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author a-berger.1
 */
public class main extends javax.swing.JFrame {

    boolean isLocked = false;
    int level = 1;

    /**
     * Creates new form main
     */
    public main() throws IOException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();

        this.setExtendedState(main.MAXIMIZED_BOTH);
        this.setUpLevel();
        currentLevel.setText("Current Level: " + level);
        //create the source and ground gates
        Gate t = new sourceGate();
        Workspace.add(t);
        t.setSize(Workspace.getWidth() / 3, 50);
        t.setLocation(new Point(Workspace.getX() + Workspace.getWidth() / 4, 0));
        Workspace.gates.add(t);
        t.addNodes();
        Gate w = new sourceGate();
        Workspace.add(w);
        w.setSize(Workspace.getWidth() / 3, 50);
        w.setLocation(new Point(Workspace.getWidth() / 4 * 3, 0));
        Workspace.gates.add(w);
        w.addNodes();
        Gate g = new groundGate();
        Workspace.add(g);
        g.setSize(Workspace.getWidth() / 6 * 5, 50);
        g.setLocation(new Point(Workspace.getX() + Workspace.getWidth() / 7 * 2, Workspace.getWidth()));
        Workspace.gates.add(g);
        g.addNodes();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        WireColor = new javax.swing.ButtonGroup();
        Workspace = new Workspace();
        toolbar = new javax.swing.JPanel();
        toolbarLabel = new javax.swing.JLabel();
        toolPanel = new javax.swing.JPanel();
        WirePanel = new javax.swing.JPanel();
        WireColorPanel = new javax.swing.JPanel();
        Red = new javax.swing.JRadioButton();
        Gray = new javax.swing.JRadioButton();
        Pink = new javax.swing.JRadioButton();
        Black = new javax.swing.JRadioButton();
        removeWiresPanel = new javax.swing.JPanel();
        undoLastWireBtn = new javax.swing.JButton();
        clearCurrentColorBtn = new javax.swing.JButton();
        clearWiresBtn = new javax.swing.JButton();
        gatesPanel = new javax.swing.JPanel();
        LockPanel = new javax.swing.JPanel();
        lockBtn = new javax.swing.JButton();
        TransistorBtn = new javax.swing.JButton();
        AndBtn = new javax.swing.JButton();
        ORBtn = new javax.swing.JButton();
        XOrBtn = new javax.swing.JButton();
        HABtn = new javax.swing.JButton();
        FABtn = new javax.swing.JButton();
        Sidebar = new javax.swing.JPanel();
        textPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        navBox = new javax.swing.JPanel();
        nextLevel = new javax.swing.JButton();
        previousLevel = new javax.swing.JButton();
        currentLevel = new javax.swing.JLabel();
        jumpTo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        toolbar.setBackground(new java.awt.Color(255, 255, 255));
        toolbar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        toolbarLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        toolbarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toolbarLabel.setText("Toolbar");
        toolbarLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        toolPanel.setBackground(new java.awt.Color(255, 255, 255));
        toolPanel.setLayout(new java.awt.GridLayout(0, 1));

        WirePanel.setBackground(new java.awt.Color(255, 255, 255));
        WirePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Wires", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24))); // NOI18N
        WirePanel.setLayout(new java.awt.GridLayout(0, 1));

        WireColorPanel.setBackground(new java.awt.Color(255, 255, 255));
        WireColorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Color", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14))); // NOI18N
        WireColorPanel.setLayout(new java.awt.GridLayout(0, 1, 5, 0));

        Red.setBackground(java.awt.Color.white);
        WireColor.add(Red);
        Red.setText("Red");
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });
        WireColorPanel.add(Red);

        Gray.setBackground(java.awt.Color.white);
        WireColor.add(Gray);
        Gray.setText("Gray");
        Gray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrayActionPerformed(evt);
            }
        });
        WireColorPanel.add(Gray);

        Pink.setBackground(java.awt.Color.white);
        WireColor.add(Pink);
        Pink.setText("Pink");
        Pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinkActionPerformed(evt);
            }
        });
        WireColorPanel.add(Pink);

        Black.setBackground(java.awt.Color.white);
        WireColor.add(Black);
        Black.setText("Black");
        Black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackActionPerformed(evt);
            }
        });
        WireColorPanel.add(Black);

        WirePanel.add(WireColorPanel);

        removeWiresPanel.setBackground(new java.awt.Color(255, 255, 255));
        removeWiresPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Remove", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14))); // NOI18N
        removeWiresPanel.setLayout(new java.awt.GridLayout(0, 1));

        undoLastWireBtn.setBackground(new java.awt.Color(255, 255, 255));
        undoLastWireBtn.setText("Last Placed");
        undoLastWireBtn.setFocusPainted(false);
        undoLastWireBtn.setFocusable(false);
        undoLastWireBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        undoLastWireBtn.setOpaque(false);
        undoLastWireBtn.setRequestFocusEnabled(false);
        undoLastWireBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoLastWireBtnActionPerformed(evt);
            }
        });
        removeWiresPanel.add(undoLastWireBtn);

        clearCurrentColorBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearCurrentColorBtn.setText("Current Color");
        clearCurrentColorBtn.setFocusPainted(false);
        clearCurrentColorBtn.setFocusable(false);
        clearCurrentColorBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearCurrentColorBtn.setOpaque(false);
        clearCurrentColorBtn.setRequestFocusEnabled(false);
        clearCurrentColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCurrentColorBtnActionPerformed(evt);
            }
        });
        removeWiresPanel.add(clearCurrentColorBtn);

        clearWiresBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearWiresBtn.setText("All Wires");
        clearWiresBtn.setFocusPainted(false);
        clearWiresBtn.setFocusable(false);
        clearWiresBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearWiresBtn.setOpaque(false);
        clearWiresBtn.setRequestFocusEnabled(false);
        clearWiresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearWiresBtnActionPerformed(evt);
            }
        });
        removeWiresPanel.add(clearWiresBtn);

        WirePanel.add(removeWiresPanel);

        toolPanel.add(WirePanel);

        gatesPanel.setBackground(java.awt.Color.white);
        gatesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gates", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24))); // NOI18N
        gatesPanel.setLayout(new java.awt.GridLayout(0, 1));

        LockPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Lock"));
        LockPanel.setLayout(new java.awt.GridLayout(1, 0));

        lockBtn.setText("Lock Gates");
        lockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockBtnActionPerformed(evt);
            }
        });
        LockPanel.add(lockBtn);

        gatesPanel.add(LockPanel);

        TransistorBtn.setText("Add Transistor");
        TransistorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransistorBtnActionPerformed(evt);
            }
        });
        gatesPanel.add(TransistorBtn);

        AndBtn.setText("Add \"And\" Gate");
        AndBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndBtnActionPerformed(evt);
            }
        });
        gatesPanel.add(AndBtn);

        ORBtn.setText("Add \"Or\" Gate");
        ORBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORBtnActionPerformed(evt);
            }
        });
        gatesPanel.add(ORBtn);

        XOrBtn.setText("Add \"XOr\" Gate");
        XOrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XOrBtnActionPerformed(evt);
            }
        });
        gatesPanel.add(XOrBtn);

        HABtn.setText("Add Half Adder");
        HABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HABtnActionPerformed(evt);
            }
        });
        gatesPanel.add(HABtn);

        FABtn.setText("Add Full Adder");
        FABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FABtnActionPerformed(evt);
            }
        });
        gatesPanel.add(FABtn);

        toolPanel.add(gatesPanel);

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addComponent(toolbarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout WorkspaceLayout = new javax.swing.GroupLayout(Workspace);
        Workspace.setLayout(WorkspaceLayout);
        WorkspaceLayout.setHorizontalGroup(
            WorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkspaceLayout.createSequentialGroup()
                .addContainerGap(553, Short.MAX_VALUE)
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        WorkspaceLayout.setVerticalGroup(
            WorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkspaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.85;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(Workspace, gridBagConstraints);

        Sidebar.setBackground(new java.awt.Color(0, 0, 0));
        Sidebar.setLayout(new java.awt.GridBagLayout());

        textPanel.setBackground(new java.awt.Color(204, 204, 204));
        textPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        textPanel.setFocusable(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setDoubleBuffered(true);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis efficitur augue nec libero pharetra faucibus quis vel enim. Phasellus semper ultrices tempus. Sed malesuada venenatis consequat. Donec nec tortor bibendum, consectetur nunc nec, convallis massa. Nunc semper tristique vehicula. Nam ac mauris accumsan, tincidunt mi eu, mollis purus. In commodo non odio tincidunt rhoncus. Fusce dignissim risus nec nisl finibus, id vehicula mi tincidunt. Nunc vitae sapien id enim finibus congue.\n\nCum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin ullamcorper est eu massa posuere auctor. Quisque aliquam vehicula hendrerit. In mauris risus, pellentesque nec laoreet a, vulputate in sapien. Nunc at auctor eros. Quisque pellentesque suscipit ante non tincidunt. Vestibulum eget euismod magna, nec scelerisque quam. Pellentesque et semper sem, non lobortis diam.\n\nCurabitur nec massa a augue varius egestas a eget elit. Suspendisse potenti. Ut pulvinar cursus metus, et convallis nibh consequat consequat. Ut sagittis diam ut nulla ornare, convallis vestibulum tortor pellentesque. Cras laoreet augue ut mi scelerisque, sit amet blandit diam ullamcorper. Sed a velit in odio dapibus ultricies id quis sem. Donec quis congue quam, ac efficitur purus. Maecenas id est sed mauris luctus congue. Cras malesuada nec dolor sed ullamcorper.\n\nMaecenas malesuada pharetra aliquet. Ut non sollicitudin libero. Suspendisse quis suscipit diam. Nulla dapibus enim laoreet tellus convallis, a faucibus risus condimentum. Nulla suscipit magna suscipit consequat luctus. Nunc dapibus ipsum tristique imperdiet commodo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vestibulum finibus tincidunt arcu. Sed eros nisl, dictum vel auctor eu, rhoncus at lacus. Mauris dictum libero eget laoreet iaculis.\n\nPraesent nec volutpat velit. Duis libero mi, placerat nec risus eu, ultrices ultrices tellus. Fusce est lacus, molestie eu lobortis id, egestas quis nulla. Nam molestie elit id lectus pharetra consequat. Mauris erat quam, interdum sed fringilla eu, tincidunt in ex. Morbi vel semper turpis, eget accumsan lacus. Nam eu efficitur erat.\n\nGenerated 5 paragraphs, 318 words, 2184 bytes of Lorem Ipsum");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 10));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setDoubleBuffered(true);
        jTextArea1.setDragEnabled(true);
        jTextArea1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jTextArea1.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.7;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        Sidebar.add(textPanel, gridBagConstraints);

        navBox.setBackground(new java.awt.Color(204, 204, 204));
        navBox.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        nextLevel.setText("Next Level");
        nextLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextLevelActionPerformed(evt);
            }
        });

        previousLevel.setText("Previous Level");
        previousLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousLevelActionPerformed(evt);
            }
        });

        currentLevel.setText("Current Level: ");

        jumpTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumpToActionPerformed(evt);
            }
        });

        jLabel1.setText("Jump To Level: ");

        javax.swing.GroupLayout navBoxLayout = new javax.swing.GroupLayout(navBox);
        navBox.setLayout(navBoxLayout);
        navBoxLayout.setHorizontalGroup(
            navBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previousLevel)
                    .addComponent(nextLevel)
                    .addComponent(currentLevel)
                    .addComponent(jLabel1)
                    .addComponent(jumpTo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        navBoxLayout.setVerticalGroup(
            navBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBoxLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(currentLevel)
                .addGap(18, 18, 18)
                .addComponent(nextLevel)
                .addGap(18, 18, 18)
                .addComponent(previousLevel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumpTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        Sidebar.add(navBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.15;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(Sidebar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearWiresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearWiresBtnActionPerformed
        // TODO add your handling code here:
        int i;

        while (!Workspace.wires.isEmpty()) {
            i = Workspace.wires.size() - 1;
            Workspace.wires.remove(i);
        }
        repaint();

    }//GEN-LAST:event_clearWiresBtnActionPerformed

    private void undoLastWireBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoLastWireBtnActionPerformed
        // TODO add your handling code here:
        if (!Workspace.wires.isEmpty()) {
            Workspace.wires.remove(Workspace.wires.size() - 1);
            Workspace.undoWire = true;
            Workspace.checkDisconnects();
            Workspace.repaint();
        }

    }//GEN-LAST:event_undoLastWireBtnActionPerformed

    private void BlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackActionPerformed
        // TODO add your handling code here:
        //changes the wire color to black
        Workspace.wireColor = Color.BLACK;
    }//GEN-LAST:event_BlackActionPerformed

    private void RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
        // TODO add your handling code here:
        //changes the wire color to red
        Workspace.wireColor = Color.RED;
    }//GEN-LAST:event_RedActionPerformed

    private void GrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrayActionPerformed
        // TODO add your handling code here:
        //changes the wire color to gray
        Workspace.wireColor = Color.GRAY;
    }//GEN-LAST:event_GrayActionPerformed

    private void PinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinkActionPerformed
        // TODO add your handling code here:
        //changes the wire color to pink
        Workspace.wireColor = Color.PINK;
    }//GEN-LAST:event_PinkActionPerformed

    private void clearCurrentColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCurrentColorBtnActionPerformed
        Workspace.clearCurrentColorWires();
    }//GEN-LAST:event_clearCurrentColorBtnActionPerformed

    private void TransistorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransistorBtnActionPerformed
        if (Workspace.currentNumTransistors < Workspace.maxTransistors) {
            Gate t = new Transistor();
            Workspace.add(t);
            t.setSize(100, 100);
            t.setLocation(new Point(t.getParent().getWidth() - 240, t.getParent().getHeight() - 200));
            Workspace.gates.add(t);
            t.addNodes();
            Workspace.currentNumTransistors++;
        }
    }//GEN-LAST:event_TransistorBtnActionPerformed

    private void AndBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndBtnActionPerformed
        if (Workspace.currentNumAndGates < Workspace.maxAndGates) {
            Gate t = new AndGate();
            Workspace.add(t);
            t.setSize(100, 100);
            t.setLocation(new Point(t.getParent().getWidth() - 240, t.getParent().getHeight() - 200));
            Workspace.gates.add(t);
            t.addNodes();
            Workspace.currentNumAndGates++;
        }
    }//GEN-LAST:event_AndBtnActionPerformed

    private void ORBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORBtnActionPerformed
        if (Workspace.currentNumOrGates < Workspace.maxOrGates) {
            Gate t = new OrGate();
            Workspace.add(t);
            t.setSize(100, 100);
            t.setLocation(new Point(t.getParent().getWidth() - 240, t.getParent().getHeight() - 200));
            Workspace.gates.add(t);
            t.addNodes();
            Workspace.currentNumOrGates++;
        }
    }//GEN-LAST:event_ORBtnActionPerformed

    private void lockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockBtnActionPerformed

        if (isLocked) {
            lockBtn.setText("Lock Gates");
            Workspace.lockGates = false;
            isLocked = false;
        } else if (!isLocked) {
            lockBtn.setText("Unlock Gates");
            Workspace.lockGates = true;
            isLocked = true;
        }
    }//GEN-LAST:event_lockBtnActionPerformed

    private void XOrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XOrBtnActionPerformed
        if (Workspace.currentNumXOrGates < Workspace.maxXOrGates) {
            Gate t = new XOrGate();
            Workspace.add(t);
            t.setSize(100, 100);
            t.setLocation(new Point(t.getParent().getWidth() - 240, t.getParent().getHeight() - 200));
            Workspace.gates.add(t);
            t.addNodes();
            Workspace.currentNumXOrGates++;
        }
    }//GEN-LAST:event_XOrBtnActionPerformed

    private void HABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HABtnActionPerformed
        if (Workspace.currentNumHalfAdder < Workspace.maxHalfAdder) {
            Gate t = new halfAdder();
            Workspace.add(t);
            t.setSize(100, 100);
            t.setLocation(new Point(t.getParent().getWidth() - 240, t.getParent().getHeight() - 200));
            Workspace.gates.add(t);
            t.addNodes();
            Workspace.currentNumHalfAdder++;
        }
    }//GEN-LAST:event_HABtnActionPerformed

    private void FABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FABtnActionPerformed
        if (Workspace.currentNumFullAdder < Workspace.maxFullAdder) {
            Gate t = new fullAdder();
            Workspace.add(t);
            t.setSize(100, 100);
            t.setLocation(new Point(t.getParent().getWidth() - 240, t.getParent().getHeight() - 200));
            Workspace.gates.add(t);
            t.addNodes();
            Workspace.currentNumFullAdder++;
        }
    }//GEN-LAST:event_FABtnActionPerformed

    private void jumpToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumpToActionPerformed

        level = Integer.parseInt(jumpTo.getText());
        try {
            setUpLevel();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (isLocked) {
            lockBtn.setText("Lock Gates");
            Workspace.lockGates = false;
            isLocked = false;
        } 
        currentLevel.setText("Current Level: " + level);
    }//GEN-LAST:event_jumpToActionPerformed

    private void nextLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextLevelActionPerformed
        level++;
        try {
            setUpLevel();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (isLocked) {
            lockBtn.setText("Lock Gates");
            Workspace.lockGates = false;
            isLocked = false;
        } 
        currentLevel.setText("Current Level: " + level);

    }//GEN-LAST:event_nextLevelActionPerformed

    private void previousLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousLevelActionPerformed
        level--;
        try {
            setUpLevel();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (isLocked) {
            lockBtn.setText("Lock Gates");
            Workspace.lockGates = false;
            isLocked = false;
        } 
        currentLevel.setText("Current Level: " + level);
    }//GEN-LAST:event_previousLevelActionPerformed

    public void setUpLevel() throws FileNotFoundException, IOException {
        int j;
        while (Workspace.gates.size() > 3) {
            Workspace.remove(Workspace.gates.get(3));
            Workspace.gates.remove(3);
            repaint();
        }
        while (!Workspace.wires.isEmpty()) {
            j = Workspace.wires.size() - 1;
            Workspace.wires.remove(j);
        }
        repaint();
        Workspace.currentGates();

        Workspace.repaint();

        FileReader fr = new FileReader("src\\Text Documents\\A.txt");
        BufferedReader br = new BufferedReader(fr);
        int temp;
        String input = "f";
        for (int i = 0; i < level; i++) {
            input = br.readLine();
        }
// 
        temp = input.indexOf("-");
        Workspace.maxTransistors = Integer.parseInt(input.substring(0, temp));
        input = input.substring(temp + 2);
//
        temp = input.indexOf("-");
        Workspace.maxAndGates = Integer.parseInt(input.substring(0, temp));
        input = input.substring(temp + 2);
//
        temp = input.indexOf("-");
        Workspace.maxOrGates = Integer.parseInt(input.substring(0, temp));
        input = input.substring(temp + 2);
//
        temp = input.indexOf("-");
        Workspace.maxXOrGates = Integer.parseInt(input.substring(0, temp));
        input = input.substring(temp + 2);
//
        temp = input.indexOf("-");
        Workspace.maxHalfAdder = Integer.parseInt(input.substring(0, temp));
        input = input.substring(temp + 2);
//
        temp = input.indexOf("-");
        Workspace.maxFullAdder = Integer.parseInt(input.substring(0, temp));
        input = input.substring(temp + 2);

        jTextArea1.setText(input);
        br.close();
        fr.close();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AndBtn;
    private javax.swing.JRadioButton Black;
    private javax.swing.JButton FABtn;
    private javax.swing.JRadioButton Gray;
    private javax.swing.JButton HABtn;
    private javax.swing.JPanel LockPanel;
    private javax.swing.JButton ORBtn;
    private javax.swing.JRadioButton Pink;
    private javax.swing.JRadioButton Red;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JButton TransistorBtn;
    private javax.swing.ButtonGroup WireColor;
    private javax.swing.JPanel WireColorPanel;
    private javax.swing.JPanel WirePanel;
    private Workspace Workspace;
    private javax.swing.JButton XOrBtn;
    private javax.swing.JButton clearCurrentColorBtn;
    private javax.swing.JButton clearWiresBtn;
    private javax.swing.JLabel currentLevel;
    private javax.swing.JPanel gatesPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jumpTo;
    private javax.swing.JButton lockBtn;
    private javax.swing.JPanel navBox;
    private javax.swing.JButton nextLevel;
    private javax.swing.JButton previousLevel;
    private javax.swing.JPanel removeWiresPanel;
    private javax.swing.JPanel textPanel;
    private javax.swing.JPanel toolPanel;
    private javax.swing.JPanel toolbar;
    private javax.swing.JLabel toolbarLabel;
    private javax.swing.JButton undoLastWireBtn;
    // End of variables declaration//GEN-END:variables
}
