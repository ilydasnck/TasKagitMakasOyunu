

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasOyunu {

	public static void main(String[] args) {
		
		
		System.out.println("Taş için   (1) i\n" + "Kağıt için (2) yi\n" + "Makas için (3) ü \n" + "tuşlayınız\n");
		int bilgisayarınpuan= 0;
		int benimpuan =0;

		for (int i = 0; i < 5; i++) { // 5 kere oynanabilmesi için for döngüsü
			Scanner input = new Scanner(System.in);
			int giris = input.nextInt();
			System.out.println("Benim seçimim:"+ giris);

			// taş>makas makas>kağıt kağıt>makas
			String kazandi="Kazandınız";
			String kaybetti = "Kaybettiniz";
			
			
			String sonuc=null; //null a eşitlemezsen hata alırsın
			Random random = new Random();
			
			//Rastgele sayi
			int min = 1;
			int max = 3;
			int randomNumber = random.nextInt(max - min + 1) + min;
			System.out.println("Bilgisayarın seçimi: " + randomNumber);
			System.out.println("-------------------------------------------");
			
			//Taş Kağıt Makas karşılaştırması 
			switch (randomNumber) {
			case 1:
				sonuc = (giris == 1) ? "Berabere" : (giris == 2) ? "Kazandınız" : "Kaybettiniz";
				System.out.println(sonuc);
				break;
			case 2:
				sonuc = (giris == 1) ? "Kaybettiniz" : (giris == 2) ? "Berabere" : "Kazandınız";
				System.out.println(sonuc);
				break;
			case 3:
				sonuc = (giris == 1) ? "Kazandınız" : (giris == 2) ? "Kaybettiniz" : "Berabere";
				System.out.println(sonuc);
				break;
				
			
				}
			
			System.out.println("-------------------------------------------");

			//iki string ifadeyi karşılaştıracaksan degisken.equals(degisken2) ifadesini kullan. Sonuç olarak true ya da false döndürür.
			//Puan hesaplama
			
			if(sonuc.equals(kazandi)){
				benimpuan=benimpuan+1;
				System.out.println("Benim puanım:" + benimpuan);
				System.out.println("Bilgisayarın puanı:" +bilgisayarınpuan);
				System.out.println("-------------------------------------------");

				System.out.println("Taş için   (1) i\n" + "Kağıt için (2) yi\n" + "Makas için (3) ü \n" + "tuşlayınız\n");
			}
			else if(sonuc.equals(kaybetti)) {
				bilgisayarınpuan=bilgisayarınpuan+1;
				System.out.println("Benim puanım:" + benimpuan);
				System.out.println("Bilgisayarın puanı:" +bilgisayarınpuan);
				System.out.println("-------------------------------------------");

				System.out.println("Taş için   (1) i\n" + "Kağıt için (2) yi\n" + "Makas için (3) ü \n" + "tuşlayınız\n");
			}
			else {
				System.out.println("Benim puanım:" +benimpuan);
				System.out.println("Bilgisayarın puanı:" +bilgisayarınpuan);
				System.out.println("-------------------------------------------");

				System.out.println("Taş için   (1) i\n" + "Kağıt için (2) yi\n" + "Makas için (3) ü \n" + "tuşlayınız\n");
				
			}
			System.out.println("-------------------------------------------");

				}
		//Oyun sonucu		
		if(benimpuan>bilgisayarınpuan) {
			System.out.println("Siz kazandınız");
		}
		else {
			System.out.println("Bilgisayar kazandı");
		}
			
			}
			
		}
		




