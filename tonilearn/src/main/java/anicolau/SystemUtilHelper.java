package anicolau;

/**
 * com.iesemilidarder.anicolau
 * Class SystemUtilHelper
 * By berto. 08/10/2018
 */
public class SystemUtilHelper {

    private SystemUtilHelper() {

    }

    public static void consolePrint(String message) {
        System.out.println(message);
    }


    public static void logError(Exception e) {
        consolePrint("ERROR:" + e);
    }


}
