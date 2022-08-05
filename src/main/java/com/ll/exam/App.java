package com.ll.exam;

public class App {
    public static final String BASE_PACKAGE_PATH = "com.ll.exam";
    public static String DB_HOST = "localhost";
    public static int DB_PORT = 3306;
    public static String DB_ID = "lldj";
    public static String DB_PASSWORD = "lldj1234";
    public static String DB_NAME = "blog";
    public static boolean isProd = false;

    static {
        String profilesActive = System.getenv("SPRING_PROFILES_ACTIVE");

        if (profilesActive != null && profilesActive.equals("production")) {
            isProd = true;
        }

        if (isProd) {
            // 운영DB 정보
            DB_HOST = "172.17.0.1";
            DB_PORT = 3306;
            DB_ID = "lldjlocal";
            DB_PASSWORD = "1234";
            DB_NAME = "site1";
        }
    }
}
