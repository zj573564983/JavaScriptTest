
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;

import java.io.File;
import java.io.IOException;
import java.util.List;

/***
 * 测试XPath
 * @author zhangjie
 * @date 2019/4/16 16:50
 */
public class JsoupDemo4 {
    public static void main(String[] args) throws IOException {
        String path=JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path),"utf-8");

        //根据document对象，创建JXDocument
        JXDocument jxDocument=JXDocument.create(document);

        //结合xpath语法查询
        //查询所有student标签
        List<JXNode> sel = jxDocument.selN("//student");
        System.out.println(sel);

        System.out.println("--------");
        List<JXNode> jxNodeList = jxDocument.selN("//student/name");
        System.out.println(jxNodeList);

        System.out.println("--------");
        List<JXNode> jxNodeList1 = jxDocument.selN("//student/name[@id='test1']");
        System.out.println(jxNodeList1);


    }
}
