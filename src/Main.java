import javax.xml.crypto.dsig.CanonicalizationMethod;

public class Main {

	String numeroHexadecimal;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numeroHexadecimal = toHex(349);
		//cambioBase(10, 6);
	}
		
	
	private String toHex(int dec) {
        int cociente=16, residuo=0;
        String numeroHex="", numeroHex1="";
        if(dec<16) { 
        	numeroHex=firstHex(dec);
        } else { 
			do {
        		cociente=dec/16;
        		residuo=dec%16; 
        		dec=cociente; 
        		numeroHex1=firstHex(residuo); 
        		numeroHex=numeroHex1+numeroHex;
        		dec=cociente;         
        		} while (dec>=16);
        numeroHex1=firstHex(dec);
        numeroHex=numeroHex1+numeroHex;
        }
        return numeroHex;
    }
	public String firstHex(int dec) {
        String numeroHex="";
        if(dec < 16) {
            switch(dec) {
                    case 10:
                    numeroHex="A";
                    break;
                    case 11:
                    numeroHex="B";
                    break;
                    case 12:
                    numeroHex="C";
                    break;
                    case 13:
                    numeroHex="D";
                    break;
                    case 14:
                    numeroHex="E";
                    break;
                    case 15:
                    numeroHex="F";
                    break;
                    default:
                    numeroHex=Integer.toString(dec);
                    break;
                }
            return numeroHex;
        } else {
        return "false";
        }
    }
	
}
