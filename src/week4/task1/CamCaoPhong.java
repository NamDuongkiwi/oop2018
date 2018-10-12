package week4.task1;

class CamCaoPhong extends Cam {
    // them thuộc tính độ dày của vỏ
    String day;
    public CamCaoPhong(String mausac, String xuatxu, int giatien, int cannang, String day) {
        super(mausac, xuatxu, giatien, cannang);
        this.day = day;
    }
    public String getday(){
        return this.day;
    }
    public voi setday(String day){
        this.day = day;
    }
    //thêm phương thức check chất lượng cam
    public void check(){
        if(this.day == "dày");
            System.out.println("cam đểu");
        else if(this.day == "mỏng")
            System.out.println("cam hịn");
    }
    
    
}
