package com.company;
import java.util.*;

public class Main
    {

        public static void main(String[] args)
            {
                Scanner strscan = new Scanner(System.in);
                String str1;
                String str2;
                char[] str1array;
                char[] str2array;
                System.out.println("Enter First Word.");
                str1 = strscan.nextLine();
                System.out.println("Enter Second Word.");
                str2 = strscan.nextLine();
                str1array = str1.toLowerCase().toCharArray();
                str2array = str2.toLowerCase().toCharArray();
                Arrays.sort(str1array);
                Arrays.sort(str2array);
                boolean isAnagram = false;
                if (str1.length() != str2.length())
                    {
                        isAnagram = false;
                    }
                else
                    {

                        for (int i = 0; i < str1.length(); i++) {

                            if (str1array[i] != str2array[i])
                                {
                                    isAnagram = false;
                                }
                            else
                                {
                                    isAnagram = true;
                                }

                    }
                }
                System.out.println(isAnagram);
            }
    }
