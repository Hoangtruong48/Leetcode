package medium;

public class Problem_537_ComplexNumberMulti {
    public static String complexNumberMultiply(String num1, String num2) {
        String[] ar1 = num1.split("\\+");
        String[] ar2 = num2.split("\\+");
        String thuc1 = ar1[0];
        String ao1 = ar1[1];
        String thuc2 = ar2[0];
        String ao2 = ar2[1];
        System.out.println(thuc1 + " " + ao1 + " " + thuc2 + " " + ao2);
        // (a + bi) * (c + di) = ac + adi + bci - bd;
        // thuc = ac - bd, ao = ad + bc
        Integer a = Integer.parseInt(thuc1);
        Integer b = Integer.parseInt(ao1.substring(0, ao1.length() - 1));
        Integer c = Integer.parseInt(thuc2);
        Integer d = Integer.parseInt(ao2.substring(0, ao2.length() - 1));
        int thuc = a * c - b * d;
        int ao = a * d + b * c;
        return (thuc) + "+" + (ao) + "i";
    }
    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+1i", "1+1i"));
    }
}
