/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AplikasiGUI;
import View.PenumpangLihatTiket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author KURNIA
 */
public class ControllerPenumpangLihatTiket implements ActionListener {
    
    AplikasiGUI model;
    PenumpangLihatTiket view;
    
    public ControllerPenumpangLihatTiket(AplikasiGUI model) {
        this.model = model;
        view = new PenumpangLihatTiket();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(view.getBtnOk())) {
            new ControllerHalamanPenumpang(model);
            view.dispose();
        } else if (source.equals(view.getBtnLogout())) {
            new ControllerHome(model);
            view.dispose();
        }
    }
    
    
    
}
