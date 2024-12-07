/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.WorkFlow;

import ecosystemworkflow.UserAccount.UserAccount;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author gunav
 */
public class InventoryUpdateRequest extends WorkRequest{
    
    private String itemCategory; // "Drug", "Blood", "Equipment"
    private HashMap<String, InventoryItem> inventoryItems;
    private String locationId;
    private String updateType; // "Addition", "Removal", "Audit"
    private boolean isUrgent;
    private double totalValue;
    private String storageConditions;
    
    public InventoryUpdateRequest(String message, UserAccount sender, UserAccount receiver, 
            String itemCategory, String locationId, boolean isUrgent) {
        super(message, sender, receiver);
        this.itemCategory = itemCategory;
        this.locationId = locationId;
        this.isUrgent = isUrgent;
        this.inventoryItems = new HashMap<>();
        this.updateType = "Audit";
        this.totalValue = 0.0;
    }
    
    // Inner class to represent inventory items
    public class InventoryItem {
        private String itemId;
        private String itemName;
        private int quantity;
        private double unitPrice;
        private Date expiryDate;
        
        public InventoryItem(String itemId, String itemName, int quantity, 
                double unitPrice, Date expiryDate) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.expiryDate = expiryDate;
        }
        
        // Getters and setters for InventoryItem
        public String getItemId() { return itemId; }
        public void setItemId(String itemId) { this.itemId = itemId; }
        public String getItemName() { return itemName; }
        public void setItemName(String itemName) { this.itemName = itemName; }
        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
        public double getUnitPrice() { return unitPrice; }
        public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
        public Date getExpiryDate() { return expiryDate; }
        public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }
    }
    
    // Methods to manage inventory items
    public void addInventoryItem(String itemId, String itemName, int quantity, 
            double unitPrice, Date expiryDate) {
        InventoryItem item = new InventoryItem(itemId, itemName, quantity, unitPrice, expiryDate);
        inventoryItems.put(itemId, item);
        updateTotalValue();
    }
    
    public void removeInventoryItem(String itemId) {
        inventoryItems.remove(itemId);
        updateTotalValue();
    }
    
    private void updateTotalValue() {
        this.totalValue = inventoryItems.values().stream()
                .mapToDouble(item -> item.getQuantity() * item.getUnitPrice())
                .sum();
    }
    
    // Getters and setters
    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public HashMap<String, InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public boolean isIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public String getStorageConditions() {
        return storageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }
    
    // Utility methods
    public boolean hasExpiredItems() {
        Date currentDate = new Date();
        return inventoryItems.values().stream()
                .anyMatch(item -> item.getExpiryDate().before(currentDate));
    }
    
    public int getTotalItemCount() {
        return inventoryItems.values().stream()
                .mapToInt(InventoryItem::getQuantity)
                .sum();
    }
    
    @Override
    public String toString() {
        return "InventoryUpdateRequest{" +
                "requestId='" + getId() + '\'' +
                ", itemCategory='" + itemCategory + '\'' +
                ", locationId='" + locationId + '\'' +
                ", updateType='" + updateType + '\'' +
                ", isUrgent=" + isUrgent +
                ", totalItems=" + getTotalItemCount() +
                ", totalValue=" + String.format("%.2f", totalValue) +
                ", status='" + getStatus() + '\'' +
                '}';
    }
    
}
