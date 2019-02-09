/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praka.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author praka
 */
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = resp.getWriter()) {
            String user = req.getParameter("user");
            String pass = req.getParameter("pass");
            out.println("<!DOCTYPE html>");
            out.println("<html><body>");
            
            if(user.equals("admin") && pass.equals("1234")) {
                out.println("<p style='color:green;'>Login success</p>");
            } else {
                out.println("<p style='color:green;'>Login fail</p>"+user+" "+pass+"<br>");
            }
            
            out.println("user = "+req.getParameter("user")+"<br>");
            out.println("pass = "+req.getParameter("pass")+"<br>");
            
            out.println("</body></html>");
        } catch (Exception e) {
            System.out.println("Error: 500 server problem");
        }
    }
    
    
        
    
    
    
        
    
}
