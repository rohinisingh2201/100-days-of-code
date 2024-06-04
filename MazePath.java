package Backtracking;

import java.util.ArrayList;

public class MazePath {

    public static void main(String[] args) {
//        path("", 3, 3);
        System.out.println(pathRet("", 3, 3)); //return an arraylist
    }


    static void path(String p, int r, int c) {  // p - processed string
        if(r == 1 && c == 1) {
            System.out.print(p + " ");
            return;
        }

        if(r > 1) {
            path(p + 'D', r - 1, c);
        }

        if(c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    //return an ARRAYLIST
    static ArrayList<String> pathRet(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1) {
            list.addAll(pathRet(p + 'D', r-1, c));
        }

        if(c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }

        return list;
    }
}
//output - [DDRR, DRDR, DRRD, RDDR, RDRD, RRDD]

