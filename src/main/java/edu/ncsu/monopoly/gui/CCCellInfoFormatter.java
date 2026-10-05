package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IPoperty;

public class CCCellInfoFormatter implements CellInfoFormatter {
    public String format(IPoperty cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}
