<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="nav-wrapper">
    <div class="container">
        <div class="nav">
            <a href="Home" class="logo"> <i
                    class='bx bx-movie-play bx-tada main-color'></i>Fl<span
                    class="main-color">i</span>x
            </a>
            <form action="Search" class="seach" method="post">
                <input type="text" name="action" value="menu" hidden>
                <input type="text" name="txtMenu">
                <button type="submit">Tìm Kiếm</button>
            </form>
            <ul class="nav-menu" id="nav-menu">
                <li><a href="Home">Trang chủ</a></li>
                <li class="menu-dropdown"><a>Thể Loại</a>
                    <ul class="menu">
                        <c:forEach items="${listTheLoai}" var="o">
                            <li><a href="TheLoai?idTL=${o.id}">${o.tentheloai}</a></li>
                            </c:forEach>
                    </ul></li>
                <li class="menu-dropdown"><a>Danh Mục</a>
                    <ul class="menu">
                        <c:forEach items="${listDanhMuc}" var="o">
                            <li><a href="DanhMuc?idDM=${o.id}">${o.tendanhmuc}</a></li>
                            </c:forEach>
                    </ul></li>
                <li><a href="Movies">Phim</a></li>
                    <c:if test="${sessionScope.ttk != null}">
                        <c:if test="${sessionScope.ttk.quyen == 1}">
                        <li><a href="Admin">Hi ${sessionScope.ttk.tentaikhoan}</a></li>
                        </c:if>
                        <c:if test="${sessionScope.ttk.quyen != 1}">
                        <li><a href="">Hi ${sessionScope.ttk.tentaikhoan}</a></li>
                        </c:if>
                    <li><a href="Logout" class="btn btn-hover"> <span>Đăng xuất</span>
                        </c:if>
                        <c:if test="${sessionScope.ttk == null}">
                            <li><a href="Login" class="btn btn-hover"> <span>Đăng nhập</span>
                                </c:if>

                            </a></li>
            </ul>
            <!-- MOBILE MENU TOGGLE -->
            <div class="hamburger-menu" id="hamburger-menu">
                <div class="hamburger"></div>
            </div>
        </div>
    </div>
</div>
