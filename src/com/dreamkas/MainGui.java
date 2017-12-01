package com.dreamkas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;

public class MainGui extends JFrame {
    private static final int mWidth = 500;
    private static final int mHeighth = 500;
    private JButton updateDrawer;
    private JPanel MainPanel;
    private JLabel ipLabel;
    private FrontEnd m_fe;
    private JTextField ipTextField;
    private JTextArea LogField;
    private JTabbedPane UpdaterPane;
    private JTable configTable;
    private JButton getConfigButton;
    private JButton saveDataBase;
    private JTextField ipTextFieldUpdConfig;
    private JTextField textFieldUuid;
    private JButton buttonGenUuid;
    private JFormattedTextField formattedTextField1;
    private JPanel ConfigPanel;
    private JLabel laStatus;
    private JFrame additionalFrame;
    private String currentOperation;


    private Vector<String> configFieldTypes;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        MainPanel = new JPanel();
        MainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        UpdaterPane = new JTabbedPane();
        MainPanel.add(UpdaterPane, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));
        UpdaterPane.addTab("Обновление", panel1);
        updateDrawer = new JButton();
        updateDrawer.setText("Обновить кассу");
        panel1.add(updateDrawer, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ipTextField = new JTextField();
        panel1.add(ipTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        ipLabel = new JLabel();
        ipLabel.setText("IP адрес ККТ");
        panel1.add(ipLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, 1, 1, null, new Dimension(68, 29), null, 0, false));
        ConfigPanel = new JPanel();
        ConfigPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        UpdaterPane.addTab("Конфиг", ConfigPanel);
        final JLabel label1 = new JLabel();
        label1.setText("IP адрес ККТ");
        ConfigPanel.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, 1, 1, null, new Dimension(68, 29), null, 0, false));
        ipTextFieldUpdConfig = new JTextField();
        ConfigPanel.add(ipTextFieldUpdConfig, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        saveDataBase = new JButton();
        saveDataBase.setText("Сохранить конфиг");
        ConfigPanel.add(saveDataBase, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        getConfigButton = new JButton();
        getConfigButton.setText("Загрузить конфиг");
        ConfigPanel.add(getConfigButton, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textFieldUuid = new JTextField();
        ConfigPanel.add(textFieldUuid, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonGenUuid = new JButton();
        buttonGenUuid.setText("Сгенерировать UUID");
        ConfigPanel.add(buttonGenUuid, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laStatus = new JLabel();
        laStatus.setText("Простаивает");
        ConfigPanel.add(laStatus, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        LogField = new JTextArea();
        MainPanel.add(LogField, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 50), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MainPanel;
    }


    //обработчик нажатия кнопки левой
    public class LeftButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            LogField.setText("");
            System.out.println(ipTextField.getText());
            m_fe.updateDrawer(ipTextField.getText());

            laStatus.setText("В процессе...");
            updateDrawer.setEnabled(false);
            saveDataBase.setEnabled(false);
            getConfigButton.setEnabled(false);
        }
    }

    //слушатель кнопки загрузки конфига с кассы
    public class DownloadConfigListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            LogField.setText("");
            System.out.println(ipTextFieldUpdConfig.getText());
            m_fe.downloadConfig(ipTextFieldUpdConfig.getText());

            laStatus.setText("В процессе");
            getConfigButton.setEnabled(false);
            updateDrawer.setEnabled(false);
        }
    }

    //слушатель кнопки генерации uuid
    public class GenUuidListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String uuid = UUID.randomUUID().toString();
            if (buttonGenUuid.getText().equals("Сгенерировать UUID")) {
                textFieldUuid.setText(uuid);
            }
        }
    }

    //обработчик нажатия кнопки загрузки правленного конфига на кассу
    public class UploadConfigListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            LogField.setText("");
            System.out.println("Save config to drawer!");
            int rows = configTable.getModel().getRowCount();

            Vector<Vector<String>> queryTab = new Vector<>();

            for (int i = 0; i < rows; i++) {
                Vector<String> queryLine = new Vector<>();
                queryLine.add((String) configTable.getModel().getValueAt(i, 0));
                queryLine.add((String) configTable.getModel().getValueAt(i, 1));
                queryLine.add(configFieldTypes.get(i));
                queryTab.add(queryLine);
            }


            m_fe.uploadConfig(ipTextFieldUpdConfig.getText(), queryTab);
            additionalFrame.setVisible(false);

            saveDataBase.setEnabled(false);
            laStatus.setText("В процессе...");
            updateDrawer.setEnabled(false);
            currentOperation = "Saving config";
        }
    }

    //нарисовать таблицу конфига
    public void drawConfigTable(ArrayList<ArrayList<String>> config) {
        configFieldTypes = new Vector<>();
        configTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //заполнить массивы полей и значений
        Vector<String> columns = new Vector<>();

        columns.add("Name");
        columns.add("Value");

        Object[] colArr = columns.toArray();
        DefaultTableModel tableModel = new DefaultTableModel(colArr, 0);

        try {
            for (int i = 0; i < config.size(); i++) {
                Vector<String> row = new Vector<>();
                row.add(config.get(i).get(0));
                String changedEncode = config.get(i).get(2);
                row.add(changedEncode);
                configFieldTypes.add(config.get(i).get(1));
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        //рисовать таблицу
        configTable.setModel(tableModel);
        configTable.setAutoscrolls(true);
        configTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane scroll = new JScrollPane(configTable,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        additionalFrame = new JFrame("PagingTableModel");
        additionalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        additionalFrame.setContentPane(scroll);
        additionalFrame.setBounds(30, 50, 1300, 600);
        additionalFrame.setVisible(true);

        saveDataBase.setEnabled(true);
        getConfigButton.setEnabled(false);
        laStatus.setText("Простаивает");
    }

    //сброс гуевых юнитов в дефолтное состояние
    public void resetGui(String msg) {
        if (msg.equals("Success")) {
            if (currentOperation.equals("Saving config")) {
                saveDataBase.setEnabled(false);
                getConfigButton.setEnabled(true);
                currentOperation = "";
                laStatus.setText("Простаивает");
                updateDrawer.setEnabled(true);
                System.out.println("GUI: ОПЕРАЦИЯ УСПЕШНО ЗАВЕРШЕНА!!!");
                printLogString("GUI: ОПЕРАЦИЯ УСПЕШНО ЗАВЕРШЕНА!!!\n");
                return;
            }
        } else {
            saveDataBase.setEnabled(false);
            getConfigButton.setEnabled(true);
            currentOperation = "";
        }

        laStatus.setText("Простаивает");
        updateDrawer.setEnabled(true);

        if (msg.equals("Success")) {
            System.out.println("GUI: ОПЕРАЦИЯ УСПЕШНО ЗАВЕРШЕНА!!!");
            printLogString("GUI: ОПЕРАЦИЯ УСПЕШНО ЗАВЕРШЕНА!!!\n");
        } else if (msg.equals("Failed")) {
            System.out.println("GUI: ОПЕРАЦИЯ ПРОВАЛЕНА!!!");
            printLogString("GUI: ОПЕРАЦИЯ ПРОВАЛЕНА!!!\n");
        }
    }

    public MainGui() {
        setContentPane(MainPanel);
        setSize(mWidth, mHeighth);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        saveDataBase.setEnabled(false);
        laStatus.setText("Простаивает");
        currentOperation = "";

        configTable = new JTable();


        LeftButtonListener buttonLeft = new LeftButtonListener();
        updateDrawer.addActionListener(buttonLeft);

        DownloadConfigListener buttonDownloadConfig = new DownloadConfigListener();
        getConfigButton.addActionListener(buttonDownloadConfig);

        UploadConfigListener buttonUploadConfig = new UploadConfigListener();
        saveDataBase.addActionListener(buttonUploadConfig);

        GenUuidListener buttonGenUuidListener = new GenUuidListener();
        buttonGenUuid.addActionListener(buttonGenUuidListener);

        /*try {
            MaskFormatter mf = new MaskFormatter("###.###.###.###");
            mf.setPlaceholderCharacter(' ');
            formattedTextField1.setFormatterFactory(new DefaultFormatterFactory(mf));
            formattedTextField1.requestFocus();
            formattedTextField1.selectAll();
        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
    }

    //установить ссылку на frontEnd
    public void setFrontEnd(FrontEnd fe) {
        this.m_fe = fe;
    }

    //напечатать строку лога
    public void printLogString(String logString) {
        LogField.append(logString);
    }
}
