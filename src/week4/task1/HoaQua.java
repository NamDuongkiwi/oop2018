package week4.task1;

class HoaQua {
    String mausac, xuatxu;
    int giatien;
    public HoaQua(){
        this.giatien = 13000;
        this.mausac = "Đỏ";
        this.xuatxu = "China";
    }
    public HoaQua(String mausac, String xuatxu, int giatien) {
        this.mausac = mausac;
        this.xuatxu = xuatxu;
        this.giatien = giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public int getGiatien() {
        return giatien;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public String getMausac() {
        return mausac;
    }
}