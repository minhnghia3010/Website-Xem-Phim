package control;

import dao.DAO;
import entity.*;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(name="SearchControl", urlPatterns={"/Search"})
public class SearchControl extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String txtSearch = request.getParameter("action");
        
        if(txtSearch != null){
            switch(txtSearch) {
                case "menu":
                    getSearchMenu(request,response); 
                  break;
                case "theloai":
                    getSearchTheLoai(request,response); 
                  break;
                default:
                    getSearchMenu(request,response); 
              }
        }
        
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void getSearchMenu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       request.setCharacterEncoding("UTF-8");
        String txtMenu = request.getParameter("txtMenu");
        
        //B1: get data from dao
    	DAO dao = new DAO();
        List<TheLoai> listTL = dao.getAllTheLoai();
        List<DanhMuc> listDM = dao.getAllDanhMuc();
        List<QuocGiaPhim> listQGP = dao.getAllQuocGiaPhim();
        List<NamsxPhim> listNSXP = dao.getAllNamsxPhim();
        List<TopPhimMoi> listP = dao.SearchByTenPhim(txtMenu);
        
    	//B2: set data to jsp
        request.setAttribute("listTheLoai", listTL);
        request.setAttribute("listDanhMuc", listDM);
        request.setAttribute("listQuocGiaPhim", listQGP);
        request.setAttribute("listNamsxPhim", listNSXP);
        request.setAttribute("listPhim", listP);
        
        request.getRequestDispatcher("./html/movies.jsp").forward(request, response);
    }

    private void getSearchTheLoai(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        String genreSearch = request.getParameter("genre");
        String yearSearch = request.getParameter("year");
        String countrySearch = request.getParameter("country");
        
        //B1: get data from dao
    	DAO dao = new DAO();
        List<TheLoai> listTL = dao.getAllTheLoai();
        List<DanhMuc> listDM = dao.getAllDanhMuc();
        List<QuocGiaPhim> listQGP = dao.getAllQuocGiaPhim();
        List<NamsxPhim> listNSXP = dao.getAllNamsxPhim();
        List<TopPhimMoi> listP = dao.SearchByTLQGNSX(genreSearch, yearSearch, countrySearch);
        
    	//B2: set data to jsp
        request.setAttribute("listTheLoai", listTL);
        request.setAttribute("listDanhMuc", listDM);
        request.setAttribute("listQuocGiaPhim", listQGP);
        request.setAttribute("listNamsxPhim", listNSXP);
        request.setAttribute("listPhim", listP);
        
        request.getRequestDispatcher("./html/movies.jsp").forward(request, response);
    }

}
