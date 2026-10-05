package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IPoperty;

public class FreeParkingCellInfoFormatter implements CellInfoFormatter {
    
    public static final String FP_CELL_LABEL = "<html><b>Free Parking</b></html>";
    
    public String format(IPoperty cell) {
        return FP_CELL_LABEL;
    }
}
