package hava;
import java.util.Scanner;
public class hava {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int heat;
		System.out.println("Hava sıcaklığını giriniz");
		heat=scanner.nextInt();
		if(heat<5)
		{
			System.out.println("Kayak yapınız");
		}
		
		else if(heat>=5&&heat<25)
		{
			if(heat>=5&&heat<15)
			{
				System.out.println("Sinemaya gidiniz");
			}
			else if(heat>=15&&heat<25)
			{
				System.out.println("pikniğe gidiniz");
			}
			
		}
		
		else
		{
			System.out.println("Yüzmeye gidiniz");
		}

	}

}
