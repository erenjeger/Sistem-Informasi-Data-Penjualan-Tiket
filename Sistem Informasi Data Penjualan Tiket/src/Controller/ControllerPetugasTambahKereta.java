/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.awt.event.ActionListener;
import Model.AplikasiGUI;
import Model.*;
import View.*;
import View.HalamanPetugas;
import java.awt.event.ActionEvent;

/**
 *
 * @author KURNIA
 */
public class ControllerPetugasTambahKereta implements ActionListener {
    AplikasiGUI model;
    PetugasTambahKereta view;
    
    public ControllerPetugasTambahKereta(AplikasiGUI model) {
        this.model = model;
        view = new PetugasTambahKereta();
        view.setVisible(true);
        view.addListerner(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(view.getBtnTambah())) {
           if (model.)
           
            
        } else if (source.equals(view.getBtnKembali())) {
            ControllerHalamanPetugas hp = new ControllerHalamanPetugas();
            view.dispose();
        } 
    
    }
    
    
}
