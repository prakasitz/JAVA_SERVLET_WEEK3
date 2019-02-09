/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praka.servlet.assignment3;

/**
 *
 * @author praka
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.praka.servlet.assignment3.Student;
import com.praka.servlet.assignment3.StudentDB;

/**
 *
 * @author praka
 */
public class showStudent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = resp.getWriter()) {
            String id = req.getParameter("student");
            out.println("<!DOCTYPE html>");
            out.println("<html><body>");
            
           Student std = StudentDB.getStudentById(id);
           
           if(std != null) {
                out.println("<p>id="+std.getId()+"</p>");
                out.println("<p>name="+std.getName()+"</p>");
                out.println("<p>lastname="+std.getLastname()+"</p>");
           } else {
               out.println("<p>id="+id+" Not found</p>");
           }
           
            
            out.println("</body></html>");
        } catch (Exception e) {
            System.out.println("Error: 500 server problem");
        }
    }
    
    
        
    
    
    
        
    
}

