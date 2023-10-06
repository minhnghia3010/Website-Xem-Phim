package control;

import dao.DAO;
import entity.*;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;

@WebServlet(name="ClickEditControl", urlPatterns={"/ClickEdit"})
public class ClickEditControl extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        DAO dao = new DAO();
        
        //Tài khoản
        String idTaiKhoan = request.getParameter("idTK");
        TaiKhoan idTK = dao.getTaiKhoanByIDTaiKhoan(idTaiKhoan);
        request.setAttribute("idTaiKhoan", idTK);
        
        //Đánh giá
        String idDanhGia = request.getParameter("idDG");
        AdminDanhGia idDG = dao.getDanhGiaByIDDanhGia(idDanhGia);
        request.setAttribute("idDanhGia", idDG);
        
        //Thông tin phim
        String idThongTinPhim = request.getParameter("idAdTTP");
        AdminThongTinPhim idAdTTP = dao.getTTPByIDTTP(idThongTinPhim);
        request.setAttribute("idThongTinPhim", idAdTTP);
        
        //Phim
        String idPhim = request.getParameter("idAdP");
        AdminPhim idAdP = dao.getPhimByIDAdPhim(idPhim);
        request.setAttribute("idPhim", idAdP);
        
        //Thể loại
        String idTheLoai = request.getParameter("idTL");
        TheLoai idTL = dao.getTheLoaiByIDTL(idTheLoai);
        request.setAttribute("idTheLoai", idTL);
        
        //Danh Mục
        String idDanhMuc = request.getParameter("idDM");
        DanhMuc idDM = dao.getDanhMucByIDDM(idDanhMuc);
        request.setAttribute("idDanhMuc", idDM);
        
        request.getRequestDispatcher("Admin").forward(request, response);
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

}
