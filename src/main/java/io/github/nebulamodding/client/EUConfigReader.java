package io.github.nebulamodding.client;


// THIS FILE IS DEMONIC!!! DO NOT TOUCH

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class EUConfigReader {
    // I May Do This Later

    public static boolean devToolsEnabled = true;

    public static void doShitUrConfig() {
        File file = new File("arethsbetterconfigfile.txt");

        Scanner sc = new Scanner("arethsbetterconfigfile.txt");
        String tfDevTools = sc.nextLine();
        if(Objects.equals(tfDevTools, "false")) {
            devToolsEnabled = false;


        }
        else {
            devToolsEnabled = true;
        }

    }
;

}
