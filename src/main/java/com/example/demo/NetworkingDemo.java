package com.example.demo;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.google.com";

        InetAddress inetAddr = Inet4Address.getByName(url);
        System.out.println(inetAddr);
        System.out.println("Address : " + Arrays.toString(inetAddr.getAddress()));
        System.out.println("Host Address : " + inetAddr.getHostAddress());

        System.out.println("isSiteLocalAddress: " +  inetAddr.isSiteLocalAddress());
    }   
}
