package com.servlet_01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sqServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int k = 0;
        Cookie cookies[] = req.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("k")) { 
                    k = Integer.parseInt(c.getValue());
                }
            }
        }

        k = (int) Math.pow(k, 2);

        PrintWriter outPrintWriter = res.getWriter();
        outPrintWriter.println("Square Result = " + k);
    }
}
