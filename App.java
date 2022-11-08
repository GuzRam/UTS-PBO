public class App {
    public static void main(String[] args) throws Exception {
        TenagaDidik karyawan1 = new TenagaDidik(111,"Ucup", "Praya","12-November-2002","Laki-Laki", 2022);
        karyawan1.display();
        karyawan1.waktuLembur(20);
        karyawan1.setUangLembur(0);
        karyawan1.displaygaji();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(112, "Paijo", "Mataram","19-Agustus-1987" , "Laki-Laki", 2002);
        dosen1.setNomorIndukDosen(987123);
        dosen1.setJurusan("INFORMATIKA");
        dosen1.display();
        dosen1.displayDosen_Jurusan();
        dosen1.waktuLembur(6);
        dosen1.displaygaji();
    }
}
