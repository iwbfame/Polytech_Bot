package org.example.Parser;
import org.jsoup.Jsoup;
import java.util.Scanner;

public class Parser {
    public String tcp() {
        var document = Jsoup.connect("https://courses.openedu.ru/courses/course-v1:spbstu+DIGTECH+spring_2024/1631c603162a48d1bae0ec100b537cc2/").get();
        var titleElements = document.select("tr");
        for (var element : titleElements) {
            System.out.println("\n" + element.text());
        }
        return element.text();
    }
    public String economica() {
        var document = Jsoup.connect("https://courses.openedu.ru/courses/course-v1:spbstu+ECONCULT+spring_2024/9e43fc645e7d403f9187e63b81508020/").get();
        var titleElements = document.select("tr");
        for (var element : titleElements) {
            System.out.println("\n" + element.text());
        }
        return element.text();
    }
    public String history() {
        var document = Jsoup.connect("https://courses.openedu.ru/courses/course-v1:spbstu+RUSHIS2+spring_2024/f49f8ce4188f4e4f8aa2cce759674846/").get();
        var titleElements = document.select("tr");
        for (var element : titleElements) {
            System.out.println("\n" + element.text());
        }
        return element.text();
    }
    public String group513090330001() {
        var document = Jsoup.connect("https://ruz.spbstu.ru/faculty/125/groups/39466").get();
        var titleElements = document.select("tr");
        for (var element : titleElements) {
            System.out.println("\n" + element.text());
        }
        return element.text();
    }
    public String group513090230001() {
        var document = Jsoup.connect("https://ruz.spbstu.ru/faculty/125/groups/39467").get();
        var titleElements = document.select("tr");
        for (var element : titleElements) {
            System.out.println("\n" + element.text());
        }
        return element.text();
    }
    public String group513090230002() {
        var document = Jsoup.connect("https://ruz.spbstu.ru/faculty/125/groups/39468").get();
        var titleElements = document.select("tr");
        for (var element : titleElements) {
            System.out.println("\n" + element.text());
        }
        return element.text();
    }
    public String group513090330001() {
        var document = Jsoup.connect("https://ruz.spbstu.ru/faculty/125/groups/39469").get();
        var titleElements = document.select("tr");
        for (var element : titleElements) {
            System.out.println("\n" + element.text());
        }
        return element.text();
    }


}

