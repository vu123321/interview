package _1233_remove_sub_folder_from_file_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveFoldersFromFileSystem {
    public static void main(String[] args) {

        String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> output = removeSubfolders(folder);
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
}
