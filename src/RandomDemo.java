package mypkg;
import java.util.Random;
import java.util.Scanner; 

public class RandomDemo {

  public static void main(String[] args) {
    int[] sai1 = {1,2,3,4,5,6};
    int[] sai2 = {1,2,3,4,5,6};
    int[] sum = {0,0,0,0,0,0,0,0,0,0,0,0,0};
    Scanner scanner = new Scanner(System.in); 
    Random r = new Random();
    
    System.out.print("�Q�̃T�C�R����U��񐔂����:");
    int num = scanner.nextInt();    
    
    for(int i=0 ; i<num ; i++) {
      int sair1 = sai1[r.nextInt(6)];
      int sair2 = sai2[r.nextInt(6)];
      int saisum =sair1 + sair2;
      //System.out.println("<1��>��"+sair1+" <2�ڂ�>"+sair2+" <���v��>"+saisum);
    	  sum[saisum]+= 1;
    }
    System.out.println("\n=================================");
    System.out.print(" 2�F");
    for(int j = 0; j<sum[2] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n 3�F");
    for(int j = 0; j<sum[3] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n 4�F");
    for(int j = 0; j<sum[4] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n 5�F");
    for(int j = 0; j<sum[5] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n 6�F");
    for(int j = 0; j<sum[6] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n 7�F");
    for(int j = 0; j<sum[7] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n 8�F");
    for(int j = 0; j<sum[8] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n 9�F");
    for(int j = 0; j<sum[9] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n10�F");
    for(int j = 0; j<sum[10] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n11�F");
    for(int j = 0; j<sum[11] ; j++) {
    	System.out.print("��");
    }
    System.out.print("\n12�F");
    for(int j = 0; j<sum[12] ; j++) {
    	System.out.print("��");
    }
    System.out.println("\n=================================");
    for(int k = 2; k<=12 ; k++) {
    	System.out.println("\n"+k+"��"+sum[k]+"��o�܂���");
    }
  }

}