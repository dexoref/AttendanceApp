package com.codedleaf.sylveryte.attendanceapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sylveryte on 22/2/16.
 */

public class SylveryteJoinSplit {


    public static String getString(List<Student> list)
    {
        StringBuilder stringBuilder=new StringBuilder();

        for (Student s : list) {
            stringBuilder.append(s.isPresent()).append(",");

        }

       return stringBuilder.toString();
    }

    public static void setPresents(List<Student> list,String presntString)
    {
        List<String> list2=new ArrayList<String>(Arrays.asList(presntString.split(",")));

        for (int i=0;i<list.size();i++)
        {
            boolean b=Boolean.parseBoolean(list2.get(i));
            list.get(i).setIsPresent(b);
        }

    }

}
