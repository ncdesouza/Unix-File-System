package com.jfsfunctions;

import java.util.StringTokenizer;

/**
 * @author Peter Little
 *
 * sfs_getsize(char *pathname): If the specified file is a regular file, this function should return the number of
 * bytes in the file. If it is a directory file, this function should return the number of directory entries in the file.
 */
public abstract class JfsGetSize implements JfsInterface {


    public int jfsGetSize(String pathname) {

        /*
         * parse the pathname to determine if it is a correct pathname
         */
        int tokenCounter = 0;
        String token;
        String[] tokens = new String[64];
        StringTokenizer tokenizer = new StringTokenizer(pathname, "\\");

        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            System.out.println(token);
            tokenCounter ++;

            if (token.length() > 5){
                System.out.println("ERROR: INVALID PATHNAME");
                return 0;
            }else tokens[tokenCounter - 1] = token;
        }

        if (tokenCounter == 0){
            System.out.println("ERROR: INVALID PATHNAME");
            return 0;
        }

        String fileName = tokens[tokenCounter - 1];
        System.out.println(fileName);


        /*
        int fileType = CurFile.JfsGetType(CurFile.path);

            if (fileType == 0){ //is a directory

        } else if (fileType == 1){ // is a file

            }
            */
        return 0;
    }
}
