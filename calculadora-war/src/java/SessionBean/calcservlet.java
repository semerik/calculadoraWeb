/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author inged
 */
public class calcservlet extends HttpServlet {

    @EJB
    private calcbeanLocal calcbean;

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
 /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calcservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int a = Integer.parseInt(request.getParameter("t1"));
            int b = Integer.parseInt(request.getParameter("t2"));
            out.println("<h1>SUM = " + calcbean.addition(a, b) + "</h1>");
            
            out.println("</body>");
            out.println("</html>");
             */

            int a = Integer.parseInt(request.getParameter("t1"));
            int b = Integer.parseInt(request.getParameter("t2"));

            // Verifica qué botón se presionó
            if (request.getParameter("suma") != null) {
                // Suma
                int resultado = calcbean.addition(a, b);
                out.println("<h1>Resultado: " + resultado + "</h1>");
            } else if (request.getParameter("resta") != null) {
                // Resta
                int resultado = calcbean.restar(a, b);
                out.println("<h1>Resultado: " + resultado + "</h1>");
            } else if (request.getParameter("multiplicacion") != null) {
                // Multiplicación
                int resultado = calcbean.multiplicar(a, b);
                out.println("<h1>Resultado: " + resultado + "</h1>");
            } else if (request.getParameter("division") != null) {
                // División
                if (b != 0) {
                    int resultado = calcbean.dividir(a, b);
                    out.println("<h1>Resultado: " + resultado + "</h1>");
                } else {
                    out.println("<h1>Error: división entre cero</h1>");
                }
            } else if (request.getParameter("modulo") != null) {
                // Módulo
                if (b != 0) {
                    int resultado = calcbean.modulo(a, b);
                    out.println("<h1>Resultado: " + resultado + "</h1>");
                } else {
                    out.println("<h1>Error: división entre cero</h1>");
                }
            } else if (request.getParameter("cuadrado") != null) {
                // Cuadrado
                int resultado = calcbean.cuadrado(a);
                out.println("<h1>Resultado: " + resultado + "</h1>");
            } else {
                out.println("<h1>Error: no se especificó una operación</h1>");
            }

            out.close();

        }
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
