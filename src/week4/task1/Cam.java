package week4.task1;

class Cam extends HoaQua {
    //thêm thuộc tính cân nặng
    int cannang;

    public Cam(String mausac, String xuatxu, int giatien, int cannang) {
        super(mausac, xuatxu, giatien);
        this.cannang = cannang;
    }

    public void setCannang(int cannang) {
        this.cannang = cannang;
    }

    public int getCannang() {
        return cannang;
    }
    //thêm phương thúc in ra đơn hàng khi mua cam
    
    public void indonhang(){
        System.out.println("Nguồn Gốc: ");
        System.out.println("Đơn Giá: "+ giatien + "/kg");
        System.out.println("Cân Nặng: " + cannang +" kg");
        System.out.println("Thành tiền: "+ giatien*cannang + "VND");
    }
}
