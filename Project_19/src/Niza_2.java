import java.util.Scanner;
public class Niza_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Presmetaj go i ispecati go proizvodot na clenovite na nizata");
System.out.print("Vcitaj broj na clenovi vo niza");
int n = input.nextInt();
int niza[]= new int[n];
System.out.println("Vcitaj clenovi vo niza");
for (int i= 0; i<niza.length; i++) { 
System.out.println(i+ "-->");
niza[i]= input.nextInt();
}
double p=1;
for(int i=0;i<niza.length;i++);
p=p*niza[1];
System.out.println("p="+p);
	}

	}


