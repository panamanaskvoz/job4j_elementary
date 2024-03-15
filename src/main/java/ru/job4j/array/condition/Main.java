package ru.job4j.array.condition;
import java.io.*;
import java.util.*;
public class Main {
    @SuppressWarnings({"checkstyle:WhitespaceAround", "checkstyle:LeftCurly", "checkstyle:RightCurly"})
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        var input = "aab";
        var count = 0;
        String[] ary = input.split("");
        var set = new HashSet<String>();
        var builder = new StringBuilder();
        for (int i = 0; i < ary.length; i++) {
            if (set.contains(ary[i])) {
                continue;
            }
            set.add(ary[i]);
        }

        for (var item : set) {
            for (int j = 0; j < ary.length; j++) {
                if (item.equals(ary[j])) {
                    ++count;
                }
            }
            if (count == 1) {
                builder.append(item);
            } else {
                builder.append(item + count);
            }
            count = 0;
        }
        System.out.println(builder);
    }
}
