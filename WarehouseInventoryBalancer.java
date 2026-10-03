public class WarehouseInventoryBalancer {
    public void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        int highestQty = -1;
        String highestLocation = "";
        
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highestQty) {
                highestQty = sectionA[i];
                highestLocation = "Section A, Item " + i;
            }
        }
        
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > highestQty) {
                highestQty = sectionB[i];
                highestLocation = "Section B, Item " + i;
            }
        }
        
        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";
        
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status + " | Highest Quantity: " + highestQty + " (" + highestLocation + ")");
    }
}
