package se.kth.iv1350.pos.model;

import se.kth.iv1350.pos.model.*;
import se.kth.iv1350.pos.view.View;
import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.integration.*;

public class Receipt {
    private Sale sale = new Sale();
    
    public Receipt(Sale sale) {
        this.sale = sale;
    }
    
//    public Receipt getReceipt(Sale sale) {
        
//    }
}