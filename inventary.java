import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class inventary extends JFrame implements ActionListener {
    private HashMap<String, Integer> inventory;
    private JLabel itemNameLabel, quantityLabel, messageLabel;
    private JTextField itemNameField, quantityField;
    private JButton addButton, removeButton, displayButton;

    public inventary() {
        inventory = new HashMap<String, Integer>();

        setTitle("Inventory Management");
        setLayout(new GridLayout(4, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        itemNameLabel = new JLabel("Item Name:");
        add(itemNameLabel);
        itemNameField = new JTextField();
        add(itemNameField);

        quantityLabel = new JLabel("Quantity:");
        add(quantityLabel);
        quantityField = new JTextField();
        add(quantityField);

        addButton = new JButton("Add Item");
        addButton.addActionListener(this);
        add(addButton);

        removeButton = new JButton("Remove Item");
        removeButton.addActionListener(this);
        add(removeButton);

        displayButton = new JButton("Display Inventory");
        displayButton.addActionListener(this);
        add(displayButton);

        messageLabel = new JLabel("");
        add(messageLabel);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String itemName = itemNameField.getText();
            int quantity = Integer.parseInt(quantityField.getText());
            addItem(itemName, quantity);
            itemNameField.setText("");
            quantityField.setText("");
            messageLabel.setText(itemName + " added to inventory.");
        } else if (e.getSource() == removeButton) {
            String itemName = itemNameField.getText();
            int quantity = Integer.parseInt(quantityField.getText());
            removeItem(itemName, quantity);
            itemNameField.setText("");
            quantityField.setText("");
        } else if (e.getSource() == displayButton) {
            displayInventory();
        }
    }

    public void addItem(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            inventory.put(itemName, inventory.get(itemName) + quantity);
        } else {
            inventory.put(itemName, quantity);
        }
    }

    public void removeItem(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);
            if (currentQuantity >= quantity) {
                inventory.put(itemName, currentQuantity - quantity);
                messageLabel.setText(quantity + " " + itemName + " removed from inventory.");
            } else {
                messageLabel.setText(
                        "Cannot remove " + quantity + " " + itemName + ". Only " + currentQuantity + " are available.");
            }
        } else {
            messageLabel.setText("Item " + itemName + " is not available in the inventory.");
        }
    }

    public void displayInventory() {
        String inventoryStr = "Current inventory:\n";
        for (String itemName : inventory.keySet()) {
            inventoryStr += itemName + " : " + inventory.get(itemName) + "\n";
        }
        messageLabel.setText(inventoryStr);
    }

    public static void main(String[] args) {
        inventary inventoryManagement = new inventary();
    }
}
