package com.pboreg;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

import java.sql.*;
import java.sql.ResultSet;

public class Controller {


    public TableColumn<TampilTabel, SimpleIntegerProperty>colId;
    public TableColumn<TampilTabel, SimpleStringProperty>colNama;
    public TableColumn<TampilTabel, SimpleStringProperty>colPlat;
    public TableColumn<TampilTabel, SimpleStringProperty>colJk;
    public TableView<TampilTabel>tbData;

    private Connection conn;
    public TextField txtfldID;
    public TextField txtfldNama;
    public TextField txtfldPlat;
    public TextField txtJenis;

    public Button btnRefresh;
    public Button btnDelete;
    public Button btnAdd;
    public Button btnUpdate;
    public Button btnClear;

    private Koneksi Koneksi = new Koneksi();

    public void setOcClickadd(ActionEvent actionEvent) {

        String id = txtfldID.getText();
        String nama = txtfldNama.getText();
        String plat = txtfldPlat.getText();
        String kendaraan = txtJenis.getText();

        txtfldID.setText("");
        txtfldNama.setText("");
        txtfldPlat.setText("");
        txtJenis.setText("");

        //input data ke tabel pesan pada database pbo-reguler
        String query ="INSERT INTO steam(id, nama, plat, kendaraan) VALUES(" + id + ", '" + nama + "', '" + plat + "', '" + kendaraan +"')";
        int hasil = Koneksi.manipulasiData(query);

        if (hasil == 1) {
            System.out.println("Data berhasil ditambah ke dalam database");
            this.tampilDataTabelView();
        }
    }

    public void setOnClickupdate(ActionEvent actionEvent) {

        String id = txtfldID.getText();
        String nama = txtfldNama.getText();
        String plat = txtfldPlat.getText();
        String kendaraan = txtJenis.getText();

        String query = "UPDATE steam set nama = '"+ nama +"', plat = '"+ plat +"', kendaraan = '"+ kendaraan+" ' WHERE id = '" + id + "'";
        int hasil = Koneksi.manipulasiData(query);

        if (hasil == 1) {
            System.out.println("Data berhasil di update");
            this.tampilDataTabelView();
        }
    }

    public void setOnClickdelete(ActionEvent actionEvent) {

        String id = txtfldID.getText();
        String nama = txtfldNama.getText();
        String plat = txtfldPlat.getText();
        String kendaraan = txtJenis.getText();

        String query = "DELETE FROM steam WHERE id = '" + id + "'";
        int hasil = Koneksi.manipulasiData(query);

        if (hasil == 1) {
            System.out.println("Data berhasil dihapus dari database");

            txtfldID.setText("");
            txtfldNama.setText("");
            txtfldPlat.setText("");
            txtJenis.setText("");
            this.tampilDataTabelView();
        }
    }

    public void setOnClickRefresh(ActionEvent actionEvent) {

        try {
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/pbo-reguler";
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT id, nama, plat, kendaraan FROM steam WHERE id = '" +txtfldID.getText()+ "'");

            while (rs.next()) {
                String id = rs.getString("id");
                String nama = rs.getString("nama");
                String plat = rs.getString("plat");
                String kendaraan = rs.getString("kendaraan");
                txtfldNama.setText(nama);
                txtfldPlat.setText(plat);
                txtJenis.setText(kendaraan);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void setOnClickclear(ActionEvent actionEvent) {

        txtfldID.setText("");
        txtfldNama.setText("");
        txtfldPlat.setText("");
        txtJenis.setText("");
        this.tampilDataTabelView();
    }
    private void tampilDataTabelView() {
        colId.setCellValueFactory(new PropertyValueFactory<>("Id"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("Nama"));
        colPlat.setCellValueFactory(new PropertyValueFactory<>("Plat"));
        colJk.setCellValueFactory(new PropertyValueFactory<>("Kendaraan"));

        try {
            String query = "SELECT * FROM steam";
            ResultSet hasil = Koneksi.getData(query);
            ObservableList<TampilTabel> TampilTabels = FXCollections.observableArrayList();
            tbData.setItems(TampilTabels);
            while (hasil.next()) {
                int id = hasil.getInt(1);
                String nama = hasil.getString(2);
                String plat = hasil.getString(3);
                String kendaraan = hasil.getString(4);
                TampilTabels.add(new TampilTabel(id,nama,plat,kendaraan));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        tbData.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPesanDetail(newValue));
    }
    private void showPesanDetail(TampilTabel pesan) {

        if (pesan != null) {
            txtfldID.setText(pesan.idProperty().getValue().toString());
            txtfldNama.setText(pesan.getNama());
            txtfldPlat.setText(pesan.getPlat());
            txtJenis.setText(pesan.getKendaraan());
        } else {
            txtfldID.setText("");
            txtfldNama.setText("");
            txtfldPlat.setText("");
            txtJenis.setText("");
        }
    }
}