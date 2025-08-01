import java.util.Scanner;

class Dragon{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int drag[] = new int[3];
            int slot[] = new int[3];
            for(int i = 0; i < 3; i++) {
                drag[i] = sc.nextInt();
            }
            for(int i = 0; i < 3; i++) {
                slot[i] = sc.nextInt();
            }
            int dra=0;
            int slo=0;
            for(int i=0; i < 3; i++) {
                dra += drag[i];
                slo += slot[i];
            }
            if(dra > slo) {
                System.out.println("Dragon");
            } else if(dra < slo) {
                System.out.println("Sloth");
            } else {
                if(drag[0] > slot[0] || drag[1] > slot[1] || drag[2] > slot[2]) {
                    System.out.println("Dragon");
                } else if(drag[0] < slot[0] || drag[1] < slot[1] || drag[2] < slot[2]) {
                    System.out.println("Sloth");
                } else {
                    System.out.println("Tie");
                }
            }
        }
    }
}