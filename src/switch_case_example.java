/* Soru: �yle bir program yaz�n ki bu program, verilen bir de�erin �ift mi, tek mi yoksa
 * say� do�rusunun soldunda (�rne�in -1) olup olmad���n� switch- case ve if yap�s�yla yaz�p
 * ekrana yazd�r�n. */


public class switch_case_example {

	public static void main(String[] args) {
		
		int a=60,c; // a kendimizin de�i�tirebilece�imiz bir de�i�ken ve c'yi ise sonradan de�er atayaca��m�z i�in de�er atamad�k.
		
		c=a%2; // a'ye atad���m�z de�erin modunu alarak �ift bir say� m� yoksa tek bir say� m� oldu�unu anlayaca��z.
		
		switch(c) {
		
		case 0:
			if(a<0 && c==0) {
				System.out.println("Say�n�z say� do�rusunun solunda ve �ift bir say�.");
			}
			else {
				System.out.println("Say�n�z say� do�rusun sa��nda ve �ift bir say�.");
				}
			break;
			
			
		case 1:
			System.out.println(a + " say�s� bir tek say�d�r!");
			break;
			
			
		case -1:
			System.out.println(a + " say�s� tek ve say� do�rusunun solundad�r.");
			break;
			
		default:
			
			
		}
		
		
			
			
		}
		

	}


