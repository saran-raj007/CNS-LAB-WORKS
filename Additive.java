
//Aditive cipher
import java.util.*;  
public class Additive
{
    static void ans(String s,int k){
        int l=s.length();
        int f=0;
        char [] store =new char[l];
        for(int i=0;i<l;i++){
            int pos=s.charAt(i)-97;
            int val=(pos+k)%26;
            char an=(char)(val+97);
            store[f++]=an;
            
            
        }
        System.out.println("After Encryption: ");
        System.out.println(store);
        System.out.println("After Decryption: ");
        for(int i=0;i<l;i++){
            int pos=store[i]-97;
            int val=(pos-k);
            if(val<0){
                val=26+val;
            }
            int d=val%26;
            char an=(char)(d+97);
            System.out.print(an);
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the plain text: ");
		String plain=sc.nextLine().toLowerCase();
		System.out.println("Enter the key: ");
		int x=sc.nextInt();
		ans(plain,x);
		
	}
}
