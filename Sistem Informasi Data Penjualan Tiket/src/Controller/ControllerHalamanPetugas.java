/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HalamanPetugas;
import Model.AplikasiGUI;
import Model.Petugas;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author KURNIA
 */
public class ControllerHalamanPetugas implements ActionListener {
    AplikasiGUI model;
    HalamanPetugas view;
    Petugas pet;
    
    public void ControllerHalamanPetugas(AplikasiGUI model) {
        this.model = model;
        view = new HalamanPetugas();
        view.setVisible(true);
        view.addListener(this);
    }
 
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(view.getBtnLihatPenumpang())){
            ControllerPetugasLihatPenumpang plp = new ControllerPetugasLihatPenumpang(model);
            view.dispose();
        } else if(source.equals(view.getBtnLihatKereta())){
            ControllerPetugasLihatKereta plk = new ControllerPetugasLihatKereta(model);
            view.dispose();
        } else if(source.equals(view.getBtnLihatRute())){
            ControllerPetugasLihatRute plr = new ControllerPetugasLihatRute(model);
            view.dispose();
        } else if(source.equals(view.getbtnLihatStasiun())){
            ControllerPetugasLihatStasiun pls = new ControllerPetugasLihatStasiun(model);
            view.dispose();
        } else if(source.equals(view.getbtnTambahKereta())){
            ControllerPetugasTambahKereta ptk = new ControllerPetugasTambahKereta(model);
            view.dispose();
        } else if (source.equals(view.getbtnLogout())) {
            ControllerHome h = new ControllerHome(model);
            view.dispose();
        }
    }
}
