import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/***
 * 使用jsoup
 * @author zhangjie
 * @date 2019/4/16 16:28
 */
public class JsoupDemo1 {
    /*
        1.导入jar包
        2.获取Document对象，根据xml文档获取
            Jsoup.parse
        3. 获取元素对象Element
     */
    public static void main(String[] args) throws IOException {
        String path=JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path),"utf-8");

        Elements elements=document.getElementsByTag("name");

        System.out.println(elements.size());

        Element element=elements.get(0);
        Element element1=elements.get(1);

        System.out.println(element.text());
        System.out.println(element1.text());
    }
}
