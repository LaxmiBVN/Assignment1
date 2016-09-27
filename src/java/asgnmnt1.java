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

/**
 *
 * @author Lakshmi
 */
public class asgnmnt1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String var1= 
            request.getParameter("operand1");
            String var2= 
            request.getParameter("operand2");
            String opr3= 
            request.getParameter("operator3");
        float operand1,operand2;
        operand1 = Float.parseFloat(var1);
        operand2 = Float.parseFloat(var2);
        
        switch (opr3){
        case "+":
            out.println(add( operand1,operand2));
            break;
        case "-":
            out.println(sub( operand1,operand2));
            break;      
        case "*":
            out.println(mul( operand1,operand2));
            break;
        case "/":
            out.println(div( operand1,operand2));
            break;
            default:
                System.out.println("Invalid Operation");


        }

        }
    }
    public static float add(float x, float y)
    {
        float res = x + y;
        return res;
    }
    public static float sub(float x, float y)
    {
        float res = x - y;
        return res;
    }
    public static float mul(float x, float y)
    {
        float res = x * y;
        return res;
    }
    public static float div(float x, float y)
    {
        float res = x / y;
        return res;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
