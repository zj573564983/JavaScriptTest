import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/***
 * 选择器查询
 * @author zhangjie
 * @date 2019/4/16 16:47
 */
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        String path=JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path),"utf-8");

        Elements elements=document.select("name");
        System.out.println(elements);


    }
}
