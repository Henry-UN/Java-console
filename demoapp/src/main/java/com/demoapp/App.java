package com.demoapp;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] websites = {"www.google.com", "www.amazon.com", "www.facebook.com"};

        for (String website : websites) {
            try {
                InetAddress[] addresses = InetAddress.getAllByName(website);
                System.out.println("IP addresses for " + website + ":");
                for (InetAddress address : addresses) {
                    System.out.println(address.getHostAddress());
                }
            } catch (UnknownHostException e) {
                System.err.println("Unable to resolve IP address for " + website);
            }
        }
    }
}
