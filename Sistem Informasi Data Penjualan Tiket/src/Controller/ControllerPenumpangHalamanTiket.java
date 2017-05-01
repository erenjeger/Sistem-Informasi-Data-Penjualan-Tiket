/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AplikasiGUI;
import Model.Penumpang;
import Model.Tiket;
import Model.Kereta;
import Model.Rute;
import View.PenumpangHalamanTiket;
import java.awt.event.ActionListener;

/**
 *
 * @author KURNIA
 */
public class ControllerPenumpangHalamanTiket implements ActionListener {
    
    AplikasiGUI model;
    PenumpangHalamanTiket view;
    Penumpang pen;
    
    public ControllerPenumpangHalamanTiket(AplikasiGUI model, Penumpang pen) {
        this.model = model;
        view = new PenumpangHalamanTiket();
        view.setVisible(true);
        view.addListener(this);
        this.pen = pen;
        view.setLbforNoID(pen.toString().getIdPenumpang());
        view.setLbforNama(pen.getNama());
        view.setLbforTanggal(pen.getTanggal());
        view.setLbforNKereta(pen.getNama());
        view.setLbforStasiun1(pen.getRute().getStasiun1().getNama());
        view.setLbforStasiun2(pen.getRute().getStasiun2().getNama());
        view.setLbforKelas(pen.getJenis());
        view.setLbforHarga(pen.getHarga());
    }
}
