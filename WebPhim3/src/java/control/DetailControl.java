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

@WebServlet(name = "DetailControl", urlPatterns = {"/Detail"})
public class DetailControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String idP = request.getParameter("idP");
        String idTL = request.getParameter("idTL");

        //B1: get data from dao
        DAO dao = new DAO();
        XemPhim xp = dao.getPhimByIDPhim(idP);
        List<Top10Phim> listTop10P = dao.getTop10Phim();
        List<TheLoai> listTLByIDP = dao.getTheLoaiByIDPhim(idP);
        List<DanhMuc> listDMByIDP = dao.getDanhMucByIDPhim(idP);
        List<TheLoai> listTL = dao.getAllTheLoai();
        List<DanhMuc> listDM = dao.getAllDanhMuc();
        List<TheLoai> listTLByIDTL = dao.getTheLoaiByIDTheLoai(idTL);
        List<TopPhimMoi> list10PNN = dao.get10PhimNgauNhien();
        List<DanhGiaPhim> listDGP = dao.getListDanhGiaPhim(idP);

        //B2: set data to jsp
        request.setAttribute("listTheLoai", listTL);
        request.setAttribute("listDanhMuc", listDM);
        request.setAttribute("listTop10P", listTop10P);
        request.setAttribute("XemPhim", xp);
        request.setAttribute("listTLByIDP", listTLByIDP);
        request.setAttribute("listDMByIDP", listDMByIDP);
        request.setAttribute("listTLByIDTL", listTLByIDTL);
        request.setAttribute("list10PNN", list10PNN);
        request.setAttribute("listDGP", listDGP);

        request.getRequestDispatcher("./html/detail.jsp").forward(request, response);
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
