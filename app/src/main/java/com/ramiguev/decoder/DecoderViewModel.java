package com.ramiguev.decoder;

import androidx.lifecycle.ViewModel;

public class DecoderViewModel extends ViewModel {

    public String setSpace(String frame) {
        int strlenth = frame.length();
        int blankcount = 0;

        if (strlenth <= 2) {
            blankcount = 0;
        } else {
            blankcount = strlenth % 2 > 0 ? strlenth / 2 : frame.length() / 2 - 1;
        }

        if (blankcount > 0) {
            for (int i = 0; i < blankcount; i++) {
                frame = frame.substring(0, (i + 1) * 2 + i) + " " + frame.substring((i + 1) * 2 + i, strlenth + i);
            }
        }
        return frame;
    }

    static String replaceCharacter(String frame){
        String frameChar = frame.replaceAll("333", "q");
        String frameChar2 = frameChar.replaceAll("3", "");

        return frameChar2.replaceAll("q", "3");
    }
    public static String unHex(String field60) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<field60.length();i+=2)
        {
            String s = field60.substring(i, (i + 2));
            int decimal = Integer.parseInt(s, 16);
            str.append((char) decimal);
        }
        return str.toString();
    }
}
