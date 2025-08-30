/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec7Strings;

public class ParseDatfromaURL {

    public static void main(String[] args) {
        String url = "https://dtu.edu.vn/portals/0/home.aspx";

        String protocol = "";
        String domain = "";
        String path = "";
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex != -1) {
            protocol = url.substring(0, protocolEndIndex);

            int domainStartIndex = protocolEndIndex + 3;
            int pathStartIndex = url.indexOf("/", domainStartIndex);

            if (pathStartIndex != -1) {
                domain = url.substring(domainStartIndex, pathStartIndex);
                path = url.substring(pathStartIndex);
            } else {
                domain = url.substring(domainStartIndex);
                path = "/"; // Không có path cụ thể
            }
        }

        System.out.println("URL: " + url);
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }
}

