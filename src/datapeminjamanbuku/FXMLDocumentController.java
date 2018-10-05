/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapeminjamanbuku;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Label label;
    
    @FXML
    private Label judul;
    
    @FXML
    private Label Anama;
    
    @FXML
    private Label Akelas;
    
    @FXML
    private Label AnamaBuku;
    
    @FXML
    private Label ATelepon;
    
    @FXML
    private Label Apeminjaman;
    
    @FXML
    private Label Apengembalian;
    
    @FXML
    private TextField editnama;
    
    @FXML
    private TextField editkelas;
    
    @FXML
    private TextField editnamabuku;
    
    @FXML
    private TextField editnomertelepon;
    
    @FXML
    private TextField edittanggalpeminjaman;
    
    @FXML
    private TextField edittanggalpengembalian;
    
    @FXML
    private Button Button1;
    
    @FXML
    private Button Buttonhapus;
    
     @FXML
    private TextArea teksKonfirmasi;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    void Klikkedua(ActionEvent event) {
        
        if(editnama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Nama");
         }else if(editkelas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Kelas");
        }else if(editnamabuku.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Nama Buku");
        }else if(editnomertelepon.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Nomor Telepon");
        }else if (edittanggalpeminjaman.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Tanggal Peminjaman");
        }else if (edittanggalpengembalian.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Tanggal Pengembalian");
            
        }else{
              String nama = editnama.getText();
              String kelas = editkelas.getText();
              String namabuku = editnamabuku.getText();
              String tanggalpeminjaman = edittanggalpeminjaman.getText();
              String tanggalpengembalian = edittanggalpengembalian.getText();
                    
            
            teksKonfirmasi.setText("Nama : " +Anama+"\n"+"Kelas : " +Akelas+"\n"+"Nama Buku : " +AnamaBuku+"\n"+"Nomor Telepon : "+ 
                ATelepon+"\n"+"Tanggal Peminjaman : "+edittanggalpeminjaman+"\n"+"tanggal pengembalian : Rp. " +edittanggalpengembalian);              
        }        
        

    }
    
    @FXML
    void hapusIsian (ActionEvent event) {
        
        editnama.setText("");
        editkelas.setText("");
        editnamabuku.setText("");
        editnomertelepon.setText("");
        edittanggalpeminjaman.setText("");
        edittanggalpengembalian.setText("");
        teksKonfirmasi.setText("");
        
    }
    
    @Override
     public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    }
    
