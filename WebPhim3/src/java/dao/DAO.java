/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //DAO Thể Loại
    public List<TheLoai> getAllTheLoai() {
        List<TheLoai> list = new ArrayList<>();
        String query = "select * from TheLoai";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TheLoai(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Danh Mục
    public List<DanhMuc> getAllDanhMuc() {
        List<DanhMuc> list = new ArrayList<>();
        String query = "select * from DanhMuc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Thông tin phim
    public List<ThongTinPhim> getAllThongTinPhim() {
        List<ThongTinPhim> list = new ArrayList<>();
        String query = "select * from ThongTinPhim";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ThongTinPhim(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Quốc gia phim
    public List<QuocGiaPhim> getAllQuocGiaPhim() {
        List<QuocGiaPhim> list = new ArrayList<>();
        String query = "SELECT quocgia, COUNT(*) AS soluong FROM ThongTinPhim GROUP BY quocgia";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new QuocGiaPhim(rs.getString(1),
                        rs.getInt(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Năm sản xuất phim
    public List<NamsxPhim> getAllNamsxPhim() {
        List<NamsxPhim> list = new ArrayList<>();
        String query = "SELECT namsx, COUNT(*) AS orders FROM ThongTinPhim GROUP BY namsx";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NamsxPhim(rs.getInt(1),
                        rs.getInt(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Phim
    public List<TopPhimMoi> getAllPhim() {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh \n"
                + "from Phim as p, ThongTinPhim as ttp\n"
                + "where p.id = ttp.idPhim";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Top 10 phim nhieu luot xem
    public List<Top10Phim> getTop10Phim() {
        List<Top10Phim> list = new ArrayList<>();
        String query = "SELECT TOP 10 p.id, p.tenphim, ttp.namsx, p.luotxem, p.anh\n"
                + "FROM Phim as p, ThongTinPhim as ttp\n"
                + "where p.id = ttp.idPhim\n"
                + "ORDER BY luotxem DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Top10Phim(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Top 5 phim moi nhat
    public List<TopPhimMoi> getTop5PhimMoi() {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "SELECT TOP 5 p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh\n"
                + "FROM Phim as p, ThongTinPhim as ttp\n"
                + "where p.id = ttp.idPhim\n"
                + "ORDER BY namsx DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Top 10 phim moi nhat
    public List<TopPhimMoi> getTop10PhimMoi() {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "SELECT TOP 10 p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh\n"
                + "FROM Phim as p, ThongTinPhim as ttp\n"
                + "where p.id = ttp.idPhim\n"
                + "ORDER BY namsx DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Nhung bo phim le moi
    public List<TopPhimMoi> getPhimLeMoi() {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh \n"
                + "from Phim as p, DanhMuc as dm, DanhMuc_Phim as dm_p, ThongTinPhim as ttp\n"
                + "where p.id = dm_p.idPhim and dm.id = dm_p.idDanhMuc and p.id = ttp.idPhim and dm.id = 1\n"
                + "ORDER BY namsx DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Nhung bo phim series moi
    public List<PhimSeries> getPhimSeriesMoi() {
        List<PhimSeries> list = new ArrayList<>();
        String query = "SELECT p.id, p.tenphim, ttp.series, ttp.thoiluong, p.luotxem, ttp.namsx, p.anh\n"
                + "FROM ThongTinPhim as ttp, Phim as p\n"
                + "where p.id = ttp.idPhim and ttp.series is not null\n"
                + "GROUP BY p.id, p.tenphim, ttp.series, ttp.thoiluong, p.luotxem, ttp.namsx, p.anh\n"
                + "ORDER BY ttp.namsx DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new PhimSeries(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Nhung bo phim le moi
    public List<TopPhimMoi> getPhimHoatHinhMoi() {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh \n"
                + "from Phim as p, TheLoai as tl, TheLoai_Phim as tl_p, ThongTinPhim as ttp\n"
                + "where p.id = tl_p.idPhim and tl.id = tl_p.idTheLoai and p.id = ttp.idPhim and tl.id = 11\n"
                + "ORDER BY namsx DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Phim ngẫu nhiên
    public List<TopPhimMoi> getPhimNgauNhien() {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "select top 1 p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh\n"
                + "from Phim as p, TheLoai as tl, TheLoai_Phim as tl_p, ThongTinPhim as ttp\n"
                + "where p.id = tl_p.idPhim and tl.id = tl_p.idTheLoai and p.id = ttp.idPhim\n"
                + "ORDER BY NEWID()";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO 10 Phim ngẫu nhiên
    public List<TopPhimMoi> get10PhimNgauNhien() {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "SELECT TOP 10 p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh\n"
                + "from Phim as p, ThongTinPhim as ttp\n"
                + "where p.id = ttp.idPhim\n"
                + "ORDER BY newid()";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO đánh giá phim
    public List<DanhGiaPhim> getListDanhGiaPhim(String idP) {
        List<DanhGiaPhim> list = new ArrayList<>();
        String query = "select dg.id, tk.id, p.id, tk.tentaikhoan, dg.noidung\n"
                + "from DanhGia as dg, Phim as p, TaiKhoan as tk\n"
                + "where p.id = dg.idPhim and tk.id = dg.idTaiKhoan and dg.idPhim = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idP);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DanhGiaPhim(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Phim theo id the loai
    public List<TopPhimMoi> getPhimByIDTheLoai(String idTL) {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh\n"
                + "from Phim as p, ThongTinPhim as ttp, TheLoai as tl, TheLoai_Phim as tl_p\n"
                + "where p.id = ttp.idPhim and p.id = tl_p.idPhim and tl.id = tl_p.idTheLoai and tl.id = ?\n"
                + "GROUP BY p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idTL);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Phim theo id danh muc
    public List<TopPhimMoi> getPhimByIDDanhMuc(String idDM) {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh\n"
                + "from Phim as p, ThongTinPhim as ttp, DanhMuc as dm, DanhMuc_Phim as dm_p\n"
                + "where p.id = ttp.idPhim and p.id = dm_p.idPhim and dm.id = dm_p.idDanhMuc and dm.id = ?\n"
                + "GROUP BY p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDM);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Phim theo id phim
    public XemPhim getPhimByIDPhim(String idP) {
        String query = "select p.id, p.tenphim, p.anh, p.link, p.luotxem, ttp.quocgia, ttp.tomtat, ttp.namsx, ttp.thoiluong, ttp.series\n"
                + "from phim as p, ThongTinPhim as ttp\n"
                + "where p.id = ttp.idPhim and p.id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idP);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new XemPhim(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO Thể Loại theo phim
    public List<TheLoai> getTheLoaiByIDPhim(String idP) {
        List<TheLoai> list = new ArrayList<>();
        String query = "select  p.id, tl.tentheloai\n"
                + "from phim as p, TheLoai as tl, TheLoai_Phim as tl_p\n"
                + "where p.id = tl_p.idPhim and tl.id = tl_p.idTheLoai and p.id = ?\n"
                + "GROUP BY  p.id, tl.tentheloai";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idP);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TheLoai(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Danh Mục theo phim
    public List<DanhMuc> getDanhMucByIDPhim(String idP) {
        List<DanhMuc> list = new ArrayList<>();
        String query = "select p.id, dm.tendanhmuc\n"
                + "from phim as p, DanhMuc as dm, DanhMuc_Phim as dm_p\n"
                + "where p.id = dm_p.idPhim and dm.id = dm_p.idDanhMuc and p.id = ?\n"
                + "GROUP BY p.id, dm.tendanhmuc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idP);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Series phim theo series
    public List<XemPhim> getSeriesPhimBySeries(String idS) {
        List<XemPhim> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.anh, p.link, p.luotxem, ttp.quocgia, ttp.tomtat, ttp.namsx, ttp.thoiluong, ttp.series\n"
                + "from phim as p, ThongTinPhim as ttp\n"
                + "where p.id = ttp.idPhim and ttp.series like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idS);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new XemPhim(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Search phim
    public List<TopPhimMoi> SearchByTenPhim(String txtSearch) {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh\n"
                + "from Phim as p, ThongTinPhim as ttp\n"
                + "where p.id = ttp.idPhim and p.tenphim like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Search phim theo the loai, quoc gia, nam san xuat
    public List<TopPhimMoi> SearchByTLQGNSX(String genreSearch, String yearSearch, String countrySearch) {
        List<TopPhimMoi> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.luotxem, ttp.thoiluong, ttp.tomtat, ttp.namsx, p.anh\n"
                + "from Phim as p, ThongTinPhim as ttp, TheLoai as tl, TheLoai_Phim as tl_p\n"
                + "where p.id = ttp.idPhim and p.id = tl_p.idPhim and tl.id = tl_p.idTheLoai \n"
                + "and tl.id = ?\n"
                + "and ttp.namsx = ?\n"
                + "and quocgia = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, genreSearch);
            ps.setString(2, yearSearch);
            ps.setString(3, countrySearch);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TopPhimMoi(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Thể Loại theo id the loai
    public List<TheLoai> getTheLoaiByIDTheLoai(String idTL) {
        List<TheLoai> list = new ArrayList<>();
        String query = "select  tl.id, tl.tentheloai\n"
                + "from TheLoai as tl\n"
                + "where tl.id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idTL);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TheLoai(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Dang nhap tai khoan
    public TaiKhoan login(String username, String password) {
        String query = "select * from TaiKhoan\n"
                + "where tentaikhoan = ? and matkhau = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new TaiKhoan(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO kiem tra tai khoan ton tai
    public TaiKhoan checkTaiKhoanExist(String username) {
        String query = "select * from TaiKhoan\n"
                + "where tentaikhoan = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new TaiKhoan(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO tìm tài khoản theo idTK
    public TaiKhoan getTaiKhoanByIDTaiKhoan(String idTaiKhoan) {
        String query = "select *\n"
                + "from TaiKhoan\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idTaiKhoan);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new TaiKhoan(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO tìm đánh giá theo idDG
    public AdminDanhGia getDanhGiaByIDDanhGia(String idDanhGia) {
        String query = "select dg.id, tk.tentaikhoan, p.tenphim, dg.noidung, dg.diem\n"
                + "from DanhGia as dg, TaiKhoan as tk, Phim as p\n"
                + "where p.id = dg.idPhim and tk.id = dg.idTaiKhoan and dg.id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDanhGia);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new AdminDanhGia(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO tìm thông tin phim theo idTTP
    public AdminThongTinPhim getTTPByIDTTP(String idThongTinPhim) {
        String query = "select ttp.id, p.tenphim, ttp.dienvien, ttp.daodien, ttp.quocgia, ttp.namsx, ttp.tomtat, ttp.thoiluong, ttp.series, p.id\n"
                + "from ThongTinPhim as ttp, Phim as p\n"
                + "where ttp.idPhim = p.id and ttp.id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idThongTinPhim);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new AdminThongTinPhim(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO tìm phim theo id phim
    public AdminPhim getPhimByIDAdPhim(String idPhim) {
        String query = "select p.id, p.tenphim, p.anh, p.link, tl.tentheloai, dm.tendanhmuc\n"
                + "from Phim as p, TheLoai as tl, DanhMuc as dm, TheLoai_Phim as tl_p, DanhMuc_Phim as dm_p\n"
                + "where p.id = tl_p.idPhim and tl_p.idTheLoai = tl.id and p.id = dm_p.idPhim and dm_p.idDanhMuc = dm.id and p.id = ?\n"
                + "group by p.id, p.tenphim, p.anh, p.link, tl.tentheloai, dm.tendanhmuc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idPhim);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new AdminPhim(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO tìm thể loại theo id thể loại
    public TheLoai getTheLoaiByIDTL(String idTL) {
        String query = "select  *\n"
                + "from TheLoai\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idTL);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new TheLoai(rs.getInt(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO tìm danh mục theo id danh mục
    public DanhMuc getDanhMucByIDDM(String idDM) {
        String query = "select  *\n"
                + "from DanhMuc\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDM);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new DanhMuc(rs.getInt(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO Signup
    public void signup(String user, String pass) {
        String query = "insert into TaiKhoan\n"
                + "values(?, ?, 0)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Tính tổng lượt xem
    public TongLuotXem getTongLuotXem() {
        String query = "select SUM(luotxem) from Phim";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new TongLuotXem(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO Tính tổng người dùng
    public TongNguoiDung getSoNguoiDung() {
        String query = "select COUNT(id) from TaiKhoan where quyen = 0";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new TongNguoiDung(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO Tính tổng đánh giá
    public TongDanhGia getTongDanhGia() {
        String query = "select COUNT(id) from DanhGia ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new TongDanhGia(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //DAO Danh sách tài khoản
    public List<TaiKhoan> getAllTaiKhoan() {
        List<TaiKhoan> list = new ArrayList<>();
        String query = "select * from TaiKhoan";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new TaiKhoan(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Danh sách đánh giá từng bộ phim
    public List<AdminDanhGia> getListAdminDanhGia() {
        List<AdminDanhGia> list = new ArrayList<>();
        String query = "select DG.id, tk.tentaikhoan, p.tenphim, dg.noidung, dg.diem\n"
                + "from DanhGia as dg, TaiKhoan as tk, Phim as p\n"
                + "where p.id = dg.idPhim and tk.id = dg.idTaiKhoan";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new AdminDanhGia(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Danh sách thông tin phim trong Admin
    public List<AdminThongTinPhim> getListAdminThongTinPhim() {
        List<AdminThongTinPhim> list = new ArrayList<>();
        String query = "select ttp.id, p.tenphim, ttp.dienvien, ttp.daodien, ttp.quocgia, ttp.namsx, ttp.tomtat, ttp.thoiluong, ttp.series, p.id\n"
                + "from ThongTinPhim as ttp, Phim as p\n"
                + "where ttp.idPhim = p.id";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new AdminThongTinPhim(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Danh sách phim trong Admin
    public List<AdminPhim> getListAdminPhim() {
        List<AdminPhim> list = new ArrayList<>();
        String query = "select p.id, p.tenphim, p.anh, p.link, tl.tentheloai, dm.tendanhmuc\n"
                + "from Phim as p, TheLoai as tl, DanhMuc as dm, TheLoai_Phim as tl_p, DanhMuc_Phim as dm_p\n"
                + "where p.id = tl_p.idPhim and tl_p.idTheLoai = tl.id and p.id = dm_p.idPhim and dm_p.idDanhMuc = dm.id\n"
                + "group by p.id, p.tenphim, p.anh, p.link, tl.tentheloai, dm.tendanhmuc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new AdminPhim(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //DAO Xóa tài khoản
    public void deleteTaiKhoan(String idTK) {
        String query = "delete from TaiKhoan\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idTK);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Xóa đánh giá
    public void deleteDanhGia(String idDG) {
        String query = "delete from DanhGia\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDG);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Xóa admin thông tin phim
    public void deleteAdminThongTinPhim(String idAdTTP) {
        String query = "delete from ThongTinPhim\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idAdTTP);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Xóa admin phim
    public void deleteAdminPhim(String idAdP) {
        String query = "delete from Phim\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idAdP);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Xóa thể loại
    public void deleteTheLoai(String idTL) {
        String query = "delete from TheLoai\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idTL);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Xóa danh mục
    public void deleteDanhMuc(String idDM) {
        String query = "delete from DanhMuc\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDM);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin thêm tài khoản
    public void themAdTaiKhoan(String username, String password) {
        String query = "INSERT INTO TaiKhoan(tentaikhoan, matkhau, quyen)\n"
                + "VALUES (?, ?, 0)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin sửa tài khoản
    public void suaAdTaiKhoan(String idTK, String username, String password) {
        String query = "update TaiKhoan\n"
                + "set tentaikhoan = ?, matkhau = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, idTK);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin thêm đánh giá
    public void themAdDanhGia(String username, String namemovies, String content, String score) {
        String query = "INSERT INTO DanhGia(idTaiKhoan, idPhim, noidung, diem)\n"
                + "VALUES (?, ?,  ?, ?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, namemovies);
            ps.setString(3, content);
            ps.setString(4, score);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin sửa đánh giá
    public void suaAdDanhGia(String idDG, String username, String namemovies, String content, String score) {
        String query = "update DanhGia\n"
                + "set idTaiKhoan = ?, idPhim = ?, noidung = ?, diem = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, namemovies);
            ps.setString(3, content);
            ps.setString(4, score);
            ps.setString(5, idDG);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin thêm thông tin phim
    public void themAdThongTinPhim(String nameinfomovies, String performer, String director, String country, String year, String time, String series, String summary) {
        String query = "INSERT INTO ThongTinPhim(idPhim, dienvien, daodien, quocgia, namsx, thoiluong, series, tomtat)\n"
                + "VALUES (?, ?, ?, ?, ?, ?,  ?, ?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nameinfomovies);
            ps.setString(2, performer);
            ps.setString(3, director);
            ps.setString(4, country);
            ps.setString(5, year);
            ps.setString(6, time);
            ps.setString(7, series);
            ps.setString(8, summary);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin sửa thông tin phim
    public void suaAdThongTinPhim(String idThongTinPhim, String nameinfomovies, String performer, String director, String country, String year, String time, String series, String summary) {
        String query = "update ThongTinPhim\n"
                + "set idPhim = ?, dienvien = ?, daodien = ?, quocgia = ?, namsx = ?, thoiluong = ?, series = ?, tomtat = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nameinfomovies);
            ps.setString(2, performer);
            ps.setString(3, director);
            ps.setString(4, country);
            ps.setString(5, year);
            ps.setString(6, time);
            ps.setString(7, series);
            ps.setString(8, summary);
            ps.setString(9, idThongTinPhim);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin thêm phim
    public void themAdPhim(String namemovies, String images, String Link) {
        String query = "INSERT INTO Phim(tenphim, anh, link, luotxem)\n"
                + "VALUES (?, ?, ?, 0)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, namemovies);
            ps.setString(2, images);
            ps.setString(3, Link);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin thêm thể loại theo phim
    public void themAdTheLoaiPhim(String genre) {
        String query = "INSERT INTO TheLoai_Phim(idPhim, idTheLoai)\n"
                + "select Max(p.id), ?\n"
                + "from Phim as p";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, genre);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin thêm danh mục theo phim
    public void themAdDanhMucPhim(String catalog) {
        String query = "INSERT INTO DanhMuc_Phim(idPhim, idDanhMuc)\n"
                + "select Max(p.id), ?\n"
                + "from Phim as p";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, catalog);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin sửa phim
    public void suaAdPhim(String idPhim, String namemovies, String images, String Link) {
        String query = "update Phim\n"
                + "set tenphim = ?, anh = ?, link = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, namemovies);
            ps.setString(2, images);
            ps.setString(3, Link);
            ps.setString(4, idPhim);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin sửa thể loại theo phim
    public void suaAdTheLoaiPhim(String idPhim, String genre) {
        String query = "update TheLoai_Phim\n"
                + "set idTheLoai = ?\n"
                + "where idPhim = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, genre);
            ps.setString(2, idPhim);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin sửa danh mục theo phim
    public void suaAdDanhMucPhim(String idPhim, String catalog) {
        String query = "update DanhMuc_Phim\n"
                + "set idDanhMuc = ?\n"
                + "where idPhim = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, catalog);
            ps.setString(2, idPhim);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin thêm thể loại
    public void themAdTheLoai(String nametype) {
        String query = "insert into TheLoai(tentheloai)\n"
                + "values(?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nametype);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin thêm danh mục
    public void themAdDanhMuc(String namecatalog) {
        String query = "insert into DanhMuc(tendanhmuc)\n"
                + "values(?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, namecatalog);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin sửa thể loại
    public void suaAdTheLoai(String idTL, String nametype) {
        String query = "update TheLoai\n"
                + "set tentheloai = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nametype);
            ps.setString(2, idTL);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //DAO Admin sửa danh mục
    public void suaAdDanhMuc(String idDM, String namecatalog) {
        String query = "update DanhMuc\n"
                + "set tendanhmuc = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, namecatalog);
            ps.setString(2, idDM);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<TheLoai> listTL = dao.getAllTheLoai();
        List<DanhMuc> listDM = dao.getAllDanhMuc();
        List<ThongTinPhim> listTTP = dao.getAllThongTinPhim();
        List<QuocGiaPhim> listQGP = dao.getAllQuocGiaPhim();
        List<NamsxPhim> listNSXP = dao.getAllNamsxPhim();
        List<TopPhimMoi> listP = dao.getAllPhim();
        List<Top10Phim> listTop10P = dao.getTop10Phim();
        List<TopPhimMoi> listTop5PM = dao.getTop5PhimMoi();
        List<TopPhimMoi> listTop10PM = dao.getTop10PhimMoi();
        List<TopPhimMoi> listPLM = dao.getPhimLeMoi();
        List<PhimSeries> listPSM = dao.getPhimSeriesMoi();
        List<TopPhimMoi> listPHHM = dao.getPhimHoatHinhMoi();
        List<TopPhimMoi> listPNN = dao.getPhimNgauNhien();
        List<TaiKhoan> listTK = dao.getAllTaiKhoan();
        List<AdminDanhGia> listAdDG = dao.getListAdminDanhGia();
        List<AdminThongTinPhim> listAdTTP = dao.getListAdminThongTinPhim();
        List<AdminPhim> listAdP = dao.getListAdminPhim();

        for (AdminPhim o : listAdP) {
            System.out.println(o);
        }
    }
}
