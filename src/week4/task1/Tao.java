package week4.task1;

class Tao extends HoaQua {
    String Huongvi;

    public Tao(String mausac, String xuatxu, int giatien, String huongvi) {
        super(mausac, xuatxu, giatien);
        Huongvi = huongvi;
    }

    public void setHuongvi(String huongvi) {
        Huongvi = huongvi;
    }

    public String getHuongvi() {
        return Huongvi;
    }
    public int tinhtien(int soluong){            // tính giá tiền khi mua 1 số lượng táo
        return soluong*giatien;
    }
}