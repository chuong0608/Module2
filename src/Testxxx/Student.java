package Testxxx;

public class Student {
    private int maSV;
    private String ten;
    private int tuoi;

    public Student() {
    }

    public Student(int maSV, String ten, int tuoi) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
class QuanLySinhVien{
    private QuanLySinhVien[] quanLySinhViens= new QuanLySinhVien[10];

    public QuanLySinhVien(QuanLySinhVien[] quanLySinhViens) {
        this.quanLySinhViens = quanLySinhViens;
    }

    public QuanLySinhVien() {
    }

    public QuanLySinhVien[] getQuanLySinhViens() {
        return quanLySinhViens;
    }

    public void setQuanLySinhViens(QuanLySinhVien[] quanLySinhViens) {
        this.quanLySinhViens = quanLySinhViens;
    }

    public void Them(QuanLySinhVien quanLySinhVien){

    }
    public void Sua(QuanLySinhVien quanLySinhVien,int index){

    }
    public void Xoa(){

    }
    public void Timiem(){

    }
}
