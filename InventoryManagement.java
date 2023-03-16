import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class InventoryManagement extends JFrame implements ActionListener {
    private HashMap<String, Integer> inventory;
    private JLabel itemNameLabel, quantityLabel, messageLabel, usernameLabel, passwordLabel;
    private JTextField itemNameField, quantityField, usernameField, passwordField;
    private JButton addButton, removeButton, displayButton, loginButton;
    private JPanel loginPanel, inventoryPanel;
    private CardLayout cardLayout;
    private boolean isAdmin;

    public InventoryManagement() {
        inventory = new HashMap<String, Integer>();

        setTitle("Inventory Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        setLayout(cardLayout);

        // create login panel
        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(4, 2));
        usernameLabel = new JLabel("Username:");
        loginPanel.add(usernameLabel);
        usernameField = new JTextField();
        loginPanel.add(usernameField);
        passwordLabel = new JLabel("Password:");
        loginPanel.add(passwordLabel);
        passwordField = new JTextField();
        loginPanel.add(passwordField);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginPanel.add(loginButton);
        messageLabel = new JLabel("");
        loginPanel.add(messageLabel);
        add(loginPanel, "login");

        // create inventory panel
        inventoryPanel = new JPanel();
        inventoryPanel.setLayout(new GridLayout(4, 2));
        itemNameLabel = new JLabel("Item Name:");
        inventoryPanel.add(itemNameLabel);
        itemNameField = new JTextField();
        inventoryPanel.add(itemNameField);
        quantityLabel = new JLabel("Quantity:");
        inventoryPanel.add(quantityLabel);
        quantityField = new JTextField();
        inventoryPanel.add(quantityField);
        addButton = new JButton("Add Item");
        addButton.addActionListener(this);
        inventoryPanel.add(addButton);
        removeButton = new JButton("Remove Item");
        removeButton.addActionListener(this);
        inventoryPanel.add(removeButton);
        displayButton = new JButton("Display Inventory");
        displayButton.addActionListener(this);
        inventoryPanel.add(displayButton);
        messageLabel = new JLabel("");
        inventoryPanel.add(messageLabel);
        add(inventoryPanel, "inventory");

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (username.equals("admin") && password.equals("admin123")) {
                isAdmin = true;
                cardLayout.show(getContentPane(), "inventory");
            } else if (username.equals("user") && password.equals("user123")) {
                isAdmin = false;
                cardLayout.show(getContentPane(), "inventory");
            } else {
                messageLabel.setText("Invalid username or password.");
            }
            usernameField.setText("");
            passwordField.setText("");
        } else if (e.getSource() == addButton || e.getSource() == removeButton || e.getSource() == displayButton) {
            if (isAdmin) {
                handleAdminAction(e);
            } else {
                handleUserAction(e);
            }
        }
    }

    public void handleAdminAction(ActionEvent e) {
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
        } else if (e.getSource() == displayButton) {
            displayInventory();
        }
    }

    public void handleUserAction(ActionEvent e) {
        if (e.getSource() == displayButton) {
            displayInventory();
        } else {
            messageLabel.setText("You do not have permission to perform this action.");
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
                messageLabel.setText("Insufficient quantity of " + itemName + " in inventory.");
            }
        } else {
            messageLabel.setText(itemName + " not found in inventory.");
        }
    }

    public void displayInventory() {
        String inventoryString = "<html><table>";
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            inventoryString += "<tr><td>" + entry.getKey() + "</td><td>" + entry.getValue() + "</td></tr>";
        }
        inventoryString += "</table></html>";
        messageLabel.setText(inventoryString);
    }

    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();
    }
}