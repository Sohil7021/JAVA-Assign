package Main;

public class Defanging_an_IP_Address {
    public static void main(String[] args) {
            String address = "1.1.1.1";
            String result = defangIpAdd(address);
        System.out.println(result);
    }
    static String defangIpAdd(String address) {
//        \. is used to match . is regex
//        return address.replaceAll("\\.","[.]");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length() ; i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            }else {
                sb.append(address.charAt(i));
            }


        }

        return sb.toString();

    }
}
