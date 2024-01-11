
import java.util.Scanner;
public class NewClass {
public static void main(String[]args){
      Scanner masuk = new Scanner(System.in);
      int pilih;
      int a=0, b=0, c=0;
      int i, j, k;
      int matriksA [][] = new int[3][3];
      int matriksB [][] = new int[3][3];
      int hasil[][] = new int[3][3];
   do {
    System.out.println("============ Menu Pilihan ============");
    System.out.println("1.Penjumlahan dan Pengurangan Matriks");
    System.out.println("2.Matriks Transpose");
    System.out.println("3.Matriks Balikan");
    System.out.println("4.Determinan");
    System.out.println("5.Sistem Persamaan Linear");
    System.out.println("6.Keluar");
            
    System.out.println("-----------------");
    System.out.print("Pilihan Anda : ");
    pilih = masuk.nextInt();
    switch(pilih){
        case 1:
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Pengurangan Matriks");
            System.out.print("Pilih : ");
            pilih = masuk.nextInt();
            switch(pilih){
                case 1:
                //input elemen matriks A
                System.out.println("Penjumlahan Matriks");
                System.out.println("Matriks A");
                System.out.println("Masukan elemen matriks : ");
                for (i=0; i<2; i++){
                for (j=0; j<2; j++){
                System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) + ") = ");
                matriksA[i][j] = masuk.nextInt();
                }
                }
                //input elemen matriks B
                System.out.println("Matriks B");
                System.out.println("Masukan elemen matriks : ");
                for (i=0; i<2; i++){
                for (j=0; j<2; j++){
                System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) + ") = ");
                matriksB[i][j] = masuk.nextInt();
                }
                }
              //melakukan penjumlahan
                System.out.println("=================================");
                System.out.println("Hasil Penjumlahan Matriks A dan B ");
                for (i=0; i <2; i++){
                for (j = 0; j <2; j++){
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(+(hasil[i][j])+" " );
                }
                System.out.println("  ");
                }
                System.out.println("===================");
                case 2:
                System.out.println("Pengurangan Matriks");
                System.out.println("Matriks A");
                System.out.println("Masukan elemen matriks : ");
                for (i=0; i<2; i++){
                for (j=0; j<2; j++){
                System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) + ") = ");
                matriksA[i][j] = masuk.nextInt();
                }
                }
                //input elemen matriks B
                System.out.println("Matriks B");
                System.out.println("Masukan elemen matriks : ");
                for (i=0; i<2; i++){
                for (j=0; j<2; j++){
                System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) + ") = ");
                matriksB[i][j] = masuk.nextInt();
                }
                }
               
              //melakukan pengurangan
                System.out.println("=================================");
                System.out.println("Hasil Pengurangan Matriks A dan B ");
                for (i=0; i <2; i++){
                for (j = 0; j <2; j++){
                hasil[i][j] = matriksA[i][j] - matriksB[i][j];
                System.out.print(+(hasil[i][j])+" " );
                }
                System.out.println("  ");
                }
                break;
                default:
                System.out.print("Masukan hanya bisa '1' atau '2' ");
                }
     while (true){
                System.out.print("Kembali ke menu awal (y/n) : ");
                char kembali = masuk.next().charAt(0);
                if (kembali == 'y' || kembali == 'Y'){
                break; //kembali ke menu awal
                } else if (kembali == 'n' || kembali == 'N'){
                pilih = 6;
                break; //keluar dari program
                } else {
                System.out.println("Anda hanya bisa memasukan 'y' atau 'n' ");
                }
                }
     
     break;
        case 2:
            Scanner scan = new Scanner(System.in);
            int pilihan;
            int matriks[][] = new int[10][10];
            int transpose[][]= new int[10][10];
            System.out.println("1. Matriks ordo 2x2 : ");
            System.out.println("2. Matriks ordo 3x3 : ");
            System.out.print("Pilih ordo matriks : ");
            pilih = scan.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Matriks ordo 2x2");
                    System.out.println("Masukan elemen matriks : ");
                    for(i=0; i<2; i++){
                    for(j=0; j<2; j++){
                    System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) + ") = ");
                    matriks[i][j] = scan.nextInt();
                    }
                    }
                    for(i=0; i<2; i++){
                    for(j=0; j<2; j++){
                    transpose[j][i] = matriks[i][j];
                    }
                    }
                    System.out.println("Hasil Transpose matriks : ");
                    for(i=0; i<2; i++){
                    System.out.print("[ ");
                    for(j=0; j<2; j++){
                    System.out.print(transpose[i][j] + " ");  
                    }
                    System.out.println(" ]");
                    }
                case 2:
                    System.out.println("================");
                    System.out.println("Matriks ordo 3x3");
                    System.out.println("Masukan elemen matriks : ");
                    for(i=0; i<3; i++){
                    for(j=0; j<3; j++){
                    System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) + ") = ");
                    matriks[i][j] = scan.nextInt();
                    }
                    }
                    for(i=0; i<3; i++){
                    for(j=0; j<3; j++){
                    transpose[j][i] = matriks[i][j];
                    }
                    }
                    System.out.println("Hasil Transpose matriks : ");
                    for(i=0; i<3; i++){
                    System.out.print("[ ");
                    for(j=0; j<3; j++){
                    System.out.print(transpose[i][j] + " ");
                    }
                    System.out.println(" ]");
                    }
                    break;
                default:
                    System.out.print("Masukan hanya bisa '1' atau '2' ");                
            }
                while (true){
                    System.out.print("Kembali ke menu awal (y/n) : ");
                    char kembali = masuk.next().charAt(0);
                    if (kembali == 'y' || kembali == 'Y'){
                    break; //kembali ke menu awal
                    } else if (kembali == 'n' || kembali == 'N'){
                    pilih = 6;
                    break; //keluar dari program
                    } else {
                    System.out.println("Anda hanya bisa memasukan 'y' atau 'n' ");
                    }
                    }
             break;
        case 3:
            Scanner input = new Scanner(System.in);
            System.out.println("Matriks Balikan ordo 2x2");
            int[][] matriks1 = new int [2][2];
            System.out.println("Masukan elemen matriks : ");
            for (i=0; i<2; i++){
            for (j=0; j<2; j++){
            System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) + ") = ");
            matriks1[i][j] = input.nextInt();
            }
            System.out.println();
            }
            System.out.println("Matriks Asli  : ");
            for (i=0; i<2; i++){
            System.out.print("[ ");
            for (j=0; j<2; j++){
            System.out.print(matriks1[i][j]+" ");
            }
            System.out.println(" ]");
            }
        //menghitung determinan matriks
            double determinan = (matriks1[0][0]*matriks1[1][1])
                               -(matriks1[0][1]*matriks1[1][0]);
            System.out.println("Determinan : " + determinan);
            int temp=matriks1[0][0];
            matriks1[0][0] = matriks1[1][1];
            matriks1[1][1] = temp;
            matriks1[0][1]*= -1;
            matriks1[1][0]*= -1;
        //output adjoin
            System.out.println("\n Matriks Adjoin : ");
            for (i=0; i<2; i++){
            System.out.print("[ ");
            for (j=0; j<2; j++){
            System.out.print(matriks1[i][j]+" ");
            }
            System.out.println(" ]");
            }    
        //menghitung invers matriks
            System.out.print("Matriks balikanya : \n");
            for (i=0; i<2; i++){
            System.out.print("[ ");
            for (j=0; j<2; j++){
            System.out.print(matriks1[i][j]+ " " +determinan+ " ");
            }
            System.out.println(" ]");
            }
            while (true){
            System.out.print("Kembali ke menu awal (y/n) : ");
            char kembali = masuk.next().charAt(0);
            if (kembali == 'y' || kembali == 'Y'){
            break; //kembali ke menu awal
            } else if (kembali == 'n' || kembali == 'N'){
            pilih = 6;
            break; //keluar dari program
            } else {
            System.out.println("Anda hanya bisa memasukan 'y' atau 'n' ");
            }
            }
        break;
        case 4:
            int in;
            Scanner inp = new Scanner(System.in);
            System.out.println("Mencari Determinan Matriks");
            System.out.println("1. Matriks 2x2");
            System.out.println("2. Matriks 3x3");
            System.out.print("Pilih ordo matriks : ");
            pilih = inp.nextInt();
            switch(pilih){
                case 1:
                    int Tem;
                    Scanner inpt = new Scanner(System.in);
                    System.out.println("Matriks ordo 2x2");
                    int[][] matriksX = new int [2][2];
                    System.out.println("Masukan elemen matriks : ");
                    for (i=0; i<2; i++){
                    for (j=0; j<2; j++){
                    System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) + ") = ");
                    matriksX[i][j] = inpt.nextInt();
                    }
                    System.out.println();
                    }
                    System.out.println("Matriks Asli  : ");
                    for (i=0; i<2; i++){
                    System.out.print("[ ");
                    for (j=0; j<2; j++){
                    System.out.print(matriksX[i][j]+" ");
                    }
                    System.out.println(" ]");
                    }
        //menghitung determinan matriks
                    double det = (matriksX[0][0]*matriksX[1][1])-
                                 (matriksX[0][1]*matriksX[1][0]);
                    System.out.println("Determinan : " + det);
                    int Temp = matriksX[0][0];
                    matriksX[0][0] = matriksX[1][1];
                    matriksX[1][1] = Temp;
                    matriksX[0][1]*= -1;
                    matriksX[1][0]*= -1;
                    System.out.println("================");
                case 2:
                    System.out.println("Matriks ordo 3x3");
                    int[][] matrikss = new int [3][3];
                    System.out.println("Masukan elemen matriks : ");
                    for (i=0; i<3; i++){
                    for (j=0; j<3; j++){
                    System.out.print("Nilai a("+ (i + 1) + "," + (j + 1) +") = ");
                    matrikss[i][j] = inp.nextInt();
                    }
                    System.out.println();
                    }
                    System.out.println("Matriks Asli  : ");
                    for (i=0; i<3; i++){
                    System.out.print("[ ");
                    for (j=0; j<3; j++){
                
                    System.out.print(matrikss[i][j]+" ");
                    }
                    System.out.println(" ]");
                    }
        //menghitung determinan matriks
                    float detr;
                    detr = (matrikss[0][0]*matrikss[1][1]*matrikss[2][2])
                          +(matrikss[0][1]*matrikss[1][2]*matrikss[2][0])
                          +(matrikss[0][2]*matrikss[1][0]*matrikss[2][1])
                          +(matrikss[2][0]*matrikss[1][1]*matrikss[0][2])
                          -(matrikss[2][1]*matrikss[1][2]*matrikss[0][0])
                          -(matrikss[2][2]*matrikss[1][0]*matrikss[0][1]);
                    System.out.println("Determinan : " + detr);
                    break;
            default :
                    System.out.print("Masukan hanya bisa '1' atau '2' ");
                    }
            while (true){
            System.out.print("Kembali ke menu awal (y/n) : ");
            char kembali = masuk.next().charAt(0);
            if (kembali == 'y' || kembali == 'Y'){
            break; //kembali ke menu awal
            } else if (kembali == 'n' || kembali == 'N'){
            pilih = 6;
            break; //keluar dari program
            } else {
            System.out.println("Anda hanya bisa memasukan 'y' atau 'n' ");
            }
            }
        break;
        case 5:
            Scanner inputt = new Scanner(System.in);
            // Memasukkan nilai matriks koefisien A dan vektor hasil b
            System.out.println("Masukkan nilai matriks koefisien A dan vektor hasil b (matriks ordo 2x3):");
            double[][] A = new double[2][3];
            double[] B = new double[2];

            // Memasukkan nilai matriks A
            for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
            System.out.print("a" + (i + 1) + (j + 1) + ": ");
            A[i][j] = inputt.nextDouble();
            }
            }

            // Memasukkan nilai vektor b
            for (i = 0; i < 2; i++) {
            System.out.print("b" + (i + 1) + ": ");
            B[i] = inputt.nextDouble();
            }

            // Menyelesaikan SPL Ax = b
            double det = A[0][0] * A[1][1] - A[0][1] * A[1][0];

            if (det == 0) {
            System.out.println("Sistem Persamaan Tidak Memiliki Solusi");
            } else {
            double x = (B[0] * A[1][1] - A[0][1] * B[1]) / det;
            double y = (A[0][0] * B[1] - B[0] * A[1][0]) / det;

            // Menampilkan hasil
            System.out.println("Solusi SPL:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            }
            while (true){
            System.out.print("Kembali ke menu awal (y/n) : ");
            char kembali = masuk.next().charAt(0);
            if (kembali == 'y' || kembali == 'Y'){
            break; //kembali ke menu awal
            } else if (kembali == 'n' || kembali == 'N'){
            pilih = 6;
            break; //keluar dari program
            } else {
            System.out.println("Anda hanya bisa memasukan 'y' atau 'n' ");
            }
            } 
        break;
        case 6:
            System.out.println("TERIMA KASIH :) ");
            return;
        default:
            System.out.println("Anda hanya bisa memilih 1-6");
        break;
}
    
   
            
   } while (pilih != 6);
   masuk.close();
   }
}


