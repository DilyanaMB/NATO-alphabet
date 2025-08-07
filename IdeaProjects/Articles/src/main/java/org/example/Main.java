package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> params = Arrays.asList(sc.nextLine().split(","));
        Article article = new Article(params.get(0), params.get(1), params.get(2));
        int count = Integer.parseInt(sc.nextLine());
        while (count > 0) {
            count--;
            List<String> commands = Arrays.asList(sc.nextLine().split(":"));
            String command = commands.get(0);
            switch (command) {
                case "Edit":
                    article.editContent(commands.get(1));
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commands.get(1));
                    break;
                case "Rename":
                    article.rename(commands.get(1));
                    break;
            }
        }
        System.out.println(article.toString());
    }
}