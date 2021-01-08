package com.pboreg;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;


public class TampilTabel {
    private IntegerProperty id;
    private StringProperty nama;
    private StringProperty plat;
    private StringProperty kendaraan;

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNama() { return nama.get(); }

    public StringProperty NamaProperty() {
        return nama;
    }

    public void setNama(String nama) { this.nama.set(nama); }

    public String getPlat() { return plat.get(); }

    public StringProperty PlatProperty() { return plat; }

    public void setPlat(String plat) { this.plat.set(plat); }

    public String getKendaraan() { return kendaraan.get(); }

    public StringProperty KendaraanProperty() { return kendaraan; }

    public void setKendaraan(String kendaraan) { this.kendaraan.set(kendaraan); }

    public TampilTabel(int id, String nama, String plat, String kendaraan) {
        this.id = new SimpleIntegerProperty(id);
        this.nama = new SimpleStringProperty(nama);
        this.plat = new SimpleStringProperty(plat);
        this.kendaraan = new SimpleStringProperty(kendaraan);
    }
}
