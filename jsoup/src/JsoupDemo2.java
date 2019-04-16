import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/***
 * @author zhangjie
 * @date 2019/4/16 16:43
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        String path=JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path),"utf-8");

        Elements elements=document.getElementsByTag("student");

        System.out.println(elements);
        System.out.println("------------");
        Element element=document.getElementById("test1");

        System.out.println(element);
        System.out.println("------------");
        Elements elements1=document.getElementsByAttributeValue("number","jsoup1");

        System.out.println(elements1);
    }
}
