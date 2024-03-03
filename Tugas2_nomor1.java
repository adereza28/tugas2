public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan NIM Anda:");
        String nim = input.nextLine();

        System.out.println("Masukkan Nama Anda:");
        String nama = input.nextLine();

        System.out.println("Masukkan Fakultas Anda:");
        String fakultas = input.nextLine();

        System.out.println("Masukkan Jurusan Anda:");
        String jurusan = input.nextLine();

        System.out.println("\nData yang Anda masukkan:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Jurusan: " + jurusan);

        input.close();
    }
}


