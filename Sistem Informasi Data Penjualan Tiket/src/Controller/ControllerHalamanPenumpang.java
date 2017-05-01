/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.AplikasiGUI;
import Model.Penumpang;
import View.HalamanPenumpang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author KURNIA
 */
public class ControllerHalamanPenumpang implements ActionListener {    

    AplikasiGUI model;
    HalamanPenumpang view;
    Penumpang pen;
    
    public ControllerHalamanPenumpang(AplikasiGUI model) {
        this.model = model;
        view = new HalamanPenumpang();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = new Object();
        
        if(source.equals(view.getBtnPesanTiket())) {
            new ControllerPenumpangPesanTiket();
            view.dispose();
        } else if (source.equals(view.getBtnLihatTiket())) {
            new ControllerPenumpangLihatTiket();
            view.dispose();
        } else if (source.equals(view.getBtnKeluar())) {
            new ControllerHome(model);
            view.dispose();
        }
    }
}
    