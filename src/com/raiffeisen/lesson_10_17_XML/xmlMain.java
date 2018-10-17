package com.raiffeisen.lesson_10_17_XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import java.nio.file.Files;

public class xmlMain {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Map<String, String> inData = parseFile();

        Document doc = readXml();

        inData.entrySet().forEach(e->getNode(e.getKey(),doc).setTextContent(e.getValue()));
    }

    private static Map<String, String> parseFile() throws IOException {

        HashMap<String, String> data = new HashMap<>();
        Files.readAllLines(Paths.get("C:/tmp/1.txt")).forEach(
                l -> {
                    String[] tmp = l.split(":");
                    data.put(tmp[0].trim(), tmp[1].trim());
                }
        );
        return data;
    }
    public static Element getNode(String name, Document document){
        NodeList nList = document.getElementsByTagName("root");
        for (int temp = 0; temp < nList.getLength(); temp++){
            Node nNode = nList.item(temp);
            if ((nNode.getNodeType() == Node.ELEMENT_NODE) &&(nNode.getNodeName().equals(name))){
                return (Element) nNode;
            }
        }
    return null;
    }


    public static Document readXml() throws ParserConfigurationException, IOException, SAXException {
        File fXmlFile = new File("C:/tmp/1.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

        doc.getDocumentElement().normalize();
        return doc;
    }

}
