package _1233_remove_sub_folder_from_file_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveFoldersFromFileSystem {
    public static void main(String[] args) {

        String[] folder = {"a","/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> output = removeFolder(folder);
        System.out.println(output); // Output: [/a, /c/d, /c/f]

    }

    public static List<String> removeSubfolders(String[] folders) {
//        Arrays.sort(folders);
////        List<String> result = new ArrayList<>();
////        result.add(folders[0]);
////
////        for (int i = 1; i < folders.length; i++) {
////            String lastFolder = result.get(result.size() - 1);
////            lastFolder += '/';
////            System.out.println("lastFolder: "+lastFolder);
////            if (!folders[i].startsWith(lastFolder)) {
////                result.add(folders[i]);
////            }
////        }
////
////        return result;

        Arrays.sort(folders);
        List<String> result= new ArrayList<>();
        result.add(folders[0]);

        for (int i = 1; i < folders.length; i++) {
            //String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
            String lastFolder = result.get(result.size() - 1);
            // lastFolder = /a, /a/c, /c/d/s/ ..
            lastFolder += "/";
            // lastFolder = /a/, /a/c/ ...

            // folder = /a/b/c, /a
            if(!folders[i].startsWith(lastFolder)) {
                result.add(folders[i]);
            }
        }

        return result;
    }

    public static List<String> removeFolder (String[] folders) {
        Arrays.sort(folders);
        List<String> result = new ArrayList<>();
        result.add(folders[0]);

        for (int i = 1 ; i < folders.length; i++) {
            String lastFolder = result.get(result.size() - 1);
            lastFolder += '/';
            if (!folders[i].startsWith(lastFolder)) {
                result.add(folders[i]);
            }
        }

        return result;
    }

    /**
     * given a list of folder, return the folder after removing all sub-folder in those folders , you may return the answer in any folder.
     * if a folders [i] is located within another folder[j] , it is called a folder-sub of it. A sub - folder of folder[j]
     * must start with folder[j] , followed by a "/" , For example "/a/b" is a sub-folders of "/a" but "/b" is not a sub-folder of
     * "a/b/c"

     */


}
