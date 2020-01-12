package app;

import encryptdecryptconfig.AES;

public class RunApplication {
    public static void main(String args[]) {
        String myCTSEmployeeNum = "808527";
        String secretKey = "0101@2020";

        String encryptedEmpNum = AES.encrypt(myCTSEmployeeNum, secretKey);
        String decryptedEmpNum = AES.decrypt(encryptedEmpNum, secretKey);

        System.out.println("encryptedEmpNum#  " +encryptedEmpNum);
        System.out.println("decryptedEmpNum#  " +decryptedEmpNum);

    }
}
