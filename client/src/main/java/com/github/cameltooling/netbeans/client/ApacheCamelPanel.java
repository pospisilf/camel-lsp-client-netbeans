/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License", destination); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cameltooling.netbeans.client;

import com.github.cameltooling.netbeans.client.preferences.ProcessPreferences;
import org.openide.util.NbPreferences;

public final class ApacheCamelPanel extends javax.swing.JPanel {

    private final ApacheCamelOptionsPanelController controller;

    ApacheCamelPanel(ApacheCamelOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ApacheCamelMainLabel = new javax.swing.JLabel();
        CatalogVersionLabel = new javax.swing.JLabel();
        RuntimeProviderLabel = new javax.swing.JLabel();
        AdditionalComponentsLabel = new javax.swing.JLabel();
        ResetDefaultButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdditionalComponentsTextBox = new javax.swing.JTextArea();
        CatalogVersionTextField = new javax.swing.JTextField();
        RuntimeProviderCombo = new javax.swing.JComboBox<>();

        ApacheCamelMainLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(ApacheCamelMainLabel, org.openide.util.NbBundle.getMessage(ApacheCamelPanel.class, "ApacheCamelPanel.ApacheCamelMainLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(CatalogVersionLabel, org.openide.util.NbBundle.getMessage(ApacheCamelPanel.class, "ApacheCamelPanel.CatalogVersionLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(RuntimeProviderLabel, org.openide.util.NbBundle.getMessage(ApacheCamelPanel.class, "ApacheCamelPanel.RuntimeProviderLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(AdditionalComponentsLabel, org.openide.util.NbBundle.getMessage(ApacheCamelPanel.class, "ApacheCamelPanel.AdditionalComponentsLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(ResetDefaultButton, org.openide.util.NbBundle.getMessage(ApacheCamelPanel.class, "ApacheCamelPanel.ResetDefaultButton.text")); // NOI18N
        ResetDefaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetDefaultButtonActionPerformed(evt);
            }
        });

        AdditionalComponentsTextBox.setColumns(20);
        AdditionalComponentsTextBox.setRows(5);
        jScrollPane1.setViewportView(AdditionalComponentsTextBox);

        CatalogVersionTextField.setText(org.openide.util.NbBundle.getMessage(ApacheCamelPanel.class, "ApacheCamelPanel.CatalogVersionTextField.text")); // NOI18N

        RuntimeProviderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "SPRINGBOOT", "QURAKUS", "KARAF" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ApacheCamelMainLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CatalogVersionLabel)
                            .addComponent(RuntimeProviderLabel))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CatalogVersionTextField)
                            .addComponent(RuntimeProviderCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdditionalComponentsLabel)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResetDefaultButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ApacheCamelMainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatalogVersionLabel)
                    .addComponent(CatalogVersionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RuntimeProviderLabel)
                    .addComponent(RuntimeProviderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdditionalComponentsLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ResetDefaultButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Set default values while "Reset Default" button is pressed.
     */
    private void ResetDefaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetDefaultButtonActionPerformed
        CatalogVersionTextField.setText(Utilities.CATALOG_VERSION_DEFAULT); // catalog version
        RuntimeProviderCombo.setSelectedIndex(Utilities.CATALOG_PROVIDER_DEFAULT); // catalog provider
        AdditionalComponentsTextBox.setText(Utilities.ADDITIONAL_COMPONENTS_DEFAULT); // additional components
    }//GEN-LAST:event_ResetDefaultButtonActionPerformed

    /**
     * Load preference values into form.
     */
    void load() {
        CatalogVersionTextField.setText(NbPreferences.forModule(ApacheCamelPanel.class).get(Utilities.CAMEL_CATALOG_VERSION_PREF, Utilities.CATALOG_VERSION_DEFAULT)); // catalog version
        RuntimeProviderCombo.setSelectedIndex(NbPreferences.forModule(ApacheCamelPanel.class).getInt(Utilities.CAMEL_CATALOG_RUNTIME_PROVIDER_PREF, Utilities.CATALOG_PROVIDER_DEFAULT)); // catalog provider
        AdditionalComponentsTextBox.setText(NbPreferences.forModule(ApacheCamelPanel.class).get(Utilities.CAMEL_ADDITIONAL_COMPONENT_PREF, Utilities.ADDITIONAL_COMPONENTS_DEFAULT)); // additional components
    }

    /**
     * Store preference values from form.
     */
    void store() {
        NbPreferences.forModule(ApacheCamelPanel.class).put(Utilities.CAMEL_CATALOG_VERSION_PREF, CatalogVersionTextField.getText()); // catalog version
        NbPreferences.forModule(ApacheCamelPanel.class).putInt(Utilities.CAMEL_CATALOG_RUNTIME_PROVIDER_PREF, RuntimeProviderCombo.getSelectedIndex()); // catalog provider
        NbPreferences.forModule(ApacheCamelPanel.class).put(Utilities.CAMEL_ADDITIONAL_COMPONENT_PREF, AdditionalComponentsTextBox.getText()); // additional components
        new ProcessPreferences().sendDidChangeConfiguration();
    }

    boolean valid() {
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdditionalComponentsLabel;
    private javax.swing.JTextArea AdditionalComponentsTextBox;
    private javax.swing.JLabel ApacheCamelMainLabel;
    private javax.swing.JLabel CatalogVersionLabel;
    private javax.swing.JTextField CatalogVersionTextField;
    private javax.swing.JButton ResetDefaultButton;
    private javax.swing.JComboBox<String> RuntimeProviderCombo;
    private javax.swing.JLabel RuntimeProviderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
