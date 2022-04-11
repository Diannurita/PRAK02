int sisi, alas, tinggi;
    double jari;

    public bangunRuang(int sisi1){
        this.sisi=sisi1;
        int luas = sisi1*sisi1;
        System.out.println(luas);
    }
    public bangunRuang(int tinggi1, int alas1){
        this.alas=alas1;
        this.tinggi=tinggi1;
        int luas = alas1 * tinggi1 / 2;
        System.out.println(luas);
    }
    public bangunRuang (double jari1){
        this.jari=jari1;
        if(jari1%7==0){
            double hasil = 22/7 * jari1 * jari1;
            System.out.println(hasil);
        }else{
            double hasil = 3.14 * jari1 * jari1;
            int hasil1 = (int)(hasil);
            Double hasil2 = (double) hasil1;
            System.out.println(hasil2);
        }

    }
}
public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pilih = sc.nextInt();

    switch (pilih){
        case 1 :
            int sisi = sc.nextInt();
            bangunRuang persegi = new bangunRuang(sisi);
            break;
        case 2 :
            int alas = sc.nextInt();
            int tinggi = sc.nextInt();
            bangunRuang segitiga = new bangunRuang(tinggi,alas);
            break;
        case 3 :
            double jari = sc.nextDouble();
            bangunRuang lingkaran = new bangunRuang(jari);
            break;
        default :
            System.out.println("Input yang anda masukan tidak sesuai");


    }
    }
}