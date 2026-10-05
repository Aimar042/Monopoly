package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IPoperty;

public class GoCellInfoFormatter implements CellInfoFormatter {
    
    public static final String GO_CELL_LABEL = "<html><b>Go</b></html>";
    
    public String format(IPoperty cell) {
        return GO_CELL_LABEL;
    }
}
