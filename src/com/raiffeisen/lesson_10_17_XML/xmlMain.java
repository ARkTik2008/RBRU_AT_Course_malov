package com.raiffeisen.lesson_10_17_XML;

import org.w3c.dom.Document;
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

    public static void main(String[] args) throws IOException {
        Map<String, String> inData = parseFile();
    }

    private static Map<String, String> parseFile() throws IOException {

        HashMap<String, String> data = new HashMap<>();
        Files.readAllLines(Paths.get("C://Work/RBRU_AT_Course_malov/src/com/raiffeisen/1.xml")).forEach(
                l -> {
                    String[] tmp = l.split(":");
                    data.put(tmp[0].trim(), tmp[1].trim());
                }
        );
        return data;
    }

    public static Document readXml() throws ParserConfigurationException, IOException, SAXException {
        File fXmlFile = new File("C://Work/RBRU_AT_Course_malov/src/com/raiffeisen/1.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

        doc.getDocumentElement().normalize();
        return doc;
    }

}
