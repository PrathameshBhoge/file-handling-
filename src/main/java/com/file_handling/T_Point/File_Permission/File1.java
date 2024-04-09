package com.file_handling.T_Point.File_Permission;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class File1 {
    public static void main(String[] args) {
        String srg = "IO Package\\NewFile.txt";

        FilePermission file1 = new FilePermission("IO Package\\-", "read");
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);
        FilePermission file2 = new FilePermission(srg, "read");
        permission.add(file2);
        if(permission.implies(new FilePermission(srg, "read"))) {
            System.out.println("Read, Write permission is granted for the path "+srg );
        }else {
            System.out.println("No Read, Write permission is granted for the path "+srg);            }
    }
}
