/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csvjdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import static java.sql.JDBCType.BOOLEAN;
import static java.sql.JDBCType.INTEGER;
import static javax.json.JsonValue.ValueType.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author naren
 */
@WebServlet(name = "TestExcelServlet", urlPatterns = {"/testExcel.xls"})
public class TestExcelServlet extends HttpServlet {

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
            throws ServletException, IOException, FileNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestExcelServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet TestExcelServlet at " + request.getContextPath() + "</h1>");
            out.println("<H2> Store.XLS File Content</H2>");
            
            
//            String fileName = "C:\\store.xls";
            
            File f = new File("C:\\store.xls");
            FileInputStream inp = new FileInputStream(f);
        
            HSSFWorkbook  wb = new HSSFWorkbook (inp);
            HSSFSheet sheet = wb.getSheetAt(0);            
            //Iterating through the rows
            
            int rows = sheet.getLastRowNum();
            int cols = sheet.getRow(1).getLastCellNum();
            out.println("<table border='1'>");
            for(int i=0; i<rows; i++)
            {   
                out.println("<tr>");
                HSSFRow row = sheet.getRow(i);
                for(int j=0; j<cols; j++)
                {
                    HSSFCell cell = row.getCell(j);
                    //out.println("<td>"+cell.getStringCellValue()+"</td>");
                    
                    out.println("<td>"+cell+"</td>");
//                    if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC ){
//                        out.println("<td>"+cell.getNumericCellValue() +"</td>");
//                    }else if(cell.getCellType() == HSSFCell.CELL_TYPE_STRING){
//                        out.println("<td>"+cell.getStringCellValue()+"</td>");
//                    } else {
//                        out.println("<td>"+cell.getCellFormula()+"</td>");
//                    }
                        
                    
                    //out.println("The Cell Type is: "+cell.getCellType());

            
                }
                out.println("</tr>");
            }
        
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            
            
         
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
