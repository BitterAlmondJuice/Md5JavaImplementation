import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.lang.Integer;

/*me he quedado en la parte de añadir inicializadores, el low order byte va primero, es decir, a = 01 23 45 67 pero en realidad en hex tal y como estoy
acostumbrado se escribe 67 45 23 01, es decir, cada elemento de byte hexadecicimal en orden original pero con el orden invertido entre bytes

Al final escribi todos los registros de 32 bits (del A al D)

Ahora debo escribir las funciones para procesar las palabras de 32 bits

*/

public class Principal {

    static final String clearString = "abcd";

    static final int a0 = 0x67452301;

    static final int b0 = 0xEFCDAB89;

    static final int c0 = 0x98BADCFE;

    static final int d0 = 0x10325476;

    static final byte zeroByte = 0b00000000;

    static final byte firstAppendByte = (byte) 0x80;

    static byte[] byteString = clearString.getBytes(StandardCharsets.UTF_8);

    static byte[] word1 = new byte[4];
    static byte[] word2 = new byte[4];
    static byte[] word3 = new byte[4];
    static byte[] word4 = new byte[4];
    static byte[] word5 = new byte[4];
    static byte[] word6 = new byte[4];
    static byte[] word7 = new byte[4];
    static byte[] word8 = new byte[4];
    static byte[] word9 = new byte[4];
    static byte[] word10 = new byte[4];
    static byte[] word11 = new byte[4];
    static byte[] word12 = new byte[4];
    static byte[] word13 = new byte[4];
    static byte[] word14 = new byte[4];
    static byte[] word15 = new byte[4];
    static byte[] word16 = new byte[4];

    public static void byteArrayHex(byte[] byteArray) {

        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(Integer.toHexString(Byte.toUnsignedInt(byteArray[i])) + " ");
        }
    }

    public static byte[] byteArrayPadding(byte[] byteArray, int firstAppendByte, byte zeroByte) {

        int contadorCopia = 0;
        int contadorPadding = byteArray.length + 1;
        int contadorPadding2 = contadorPadding + 1;

        byte[] auxByteArray = new byte[64];

        for (; contadorCopia < byteArray.length; contadorCopia++) {

            auxByteArray[contadorCopia] = byteArray[contadorCopia];

        }

        auxByteArray[byteArray.length] = (byte) firstAppendByte;

        for (; contadorPadding != 54; contadorPadding++) {

            auxByteArray[contadorPadding] = zeroByte;

        }

        for (; contadorPadding2 < 63; contadorPadding2++) {

            auxByteArray[contadorPadding2] = zeroByte;

        }

        auxByteArray[63] = (byte) byteString.length;


        return auxByteArray;

    }

    public static byte F (byte[] a, byte[] b, byte[] c){
        byte F = 0b00000000;


        return F;

    }


    public static void main(String[] args) {

        System.out.println("clear string: " + clearString);
        System.out.print("byte string: ");
        byteArrayHex(byteString);
        System.out.println("\nFirst padding byte has been appended");
        System.out.print("byte string: ");
        byteArrayHex(byteArrayPadding(byteString, firstAppendByte, zeroByte));



    }


}
