<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Flix</title>
        <!-- GOOGLE FONTS -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link
            href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;700;900&display=swap"
            rel="stylesheet">
        <!-- OWL CAROUSEL -->
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css"
              integrity="sha512-tS3S5qG0BlhnQROyJXvNjeEM4UpMXHrQfTGmbQ1gKmelCxlSEBUaxhRBj/EFTzpbP4RVSrpEikbmdJobCvhE3g=="
              crossorigin="anonymous" />
        <!-- BOX ICONS -->
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css'
              rel='stylesheet'>
        <!-- APP CSS -->
        <link rel="stylesheet" href="./css/appAdmin.css">
        <!-- APP SCRIPT -->
        <script
        src="https://cdn.jsdelivr.net/npm/chart.js@4.3.0/dist/chart.umd.min.js"></script>

    </head>

    <body>
        <aside>
            <div class="container">
                <div class="title">
                    <h1>Quản Lý Website Phim</h1>
                </div>
                <nav>
                    <ul>
                        <li value="1">Tổng quát</li>
                        <li value="2">Tài khoản</li>
                        <li value="3">Đánh giá</li>
                        <li value="4">Thông tin phim</li>
                        <li value="5">Phim</li>
                        <li value="6">Thể loại</li>
                        <li value="7">Danh mục</li>
                    </ul>
                </nav>
            </div>
        </aside>
        <main>
            <div class="hidden"></div>
            <div class="article">
                <header>
                    <div>
                        <a href="Home" class="logo"> <i
                                class='bx bx-movsie-play bx-tada main-color'></i>Fl<span
                                class="main-color">i</span>x
                        </a>
                    </div>
                    <div class="title ">
                        <h1 class="title-acticle">Tổng quát</h1>
                    </div>
                    <div>
                        <p> Xin Chào ${sessionScope.ttk.tentaikhoan}</p>
                        <a href="Home" class="btn btn-hover"> <span>Thoát</span>
                        </a>
                    </div>
                </header>
                <article>
                    <section>
                        <div class="contanier-section">
                            <div class="general-info">
                                <div class="general-info-detail">
                                    <img src="./images/icons8-eye-50.png" alt="">
                                    <div>
                                        <h1>${TongLuotXem.luotxem}</h1>
                                        <h1>Tổng lượt xem</h1>
                                    </div>
                                </div>
                                <div class="general-info-detail">
                                    <img src="./images/icons8-staff-50.png" alt="">
                                    <div>
                                        <h1>${TongNguoiDung.nguoidung}</h1>
                                        <h1>Tổng người dùng</h1>
                                    </div>
                                </div>
                                <div class="general-info-detail">
                                    <img src="./images/icons8-comment-50.png" alt="">
                                    <div>
                                        <h1>${TongDanhGia.danhgia}</h1>
                                        <h1>Tổng đánh giá</h1>
                                    </div>
                                </div>
                            </div>
                            <div class="chart">
                                <div class="month">
                                    <canvas id="chartMonth"></canvas>
                                </div>
                                <div class="type">
                                    <canvas id="charttype"></canvas>
                                </div>
                            </div>
                        </div>
                        <div class="contanier-section">
                            <a href="#create-account" class="create"> + Thêm</a>
                            <div class="section">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Tên đăng nhập</th>
                                            <th>Mật khẩu</th>
                                            <th>Quyền</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${ListTaiKhoan}" var="o">
                                            <tr>
                                                <td>${o.tentaikhoan}</td>
                                                <td>${o.matkhau}</td>
                                                <td>${o.quyen}</td>
                                                <td><a href="ClickEdit?idTK=${o.id}" class="edit">Sửa</a>
                                                    <p><a href="Delete?idTK=${o.id}" class="delete">Xóa</a></p></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="section" id="create-account">
                                <h1>thêm tài khoản</h1>
                                <form action="Add">
                                    <input type="text" name="idTK" hidden> 
                                    <input type="text" name="username" id="" placeholder="Tên đăng nhập">
                                    <input type="text" name="password" id="" placeholder="Mật khẩu">
                                    <button type="submit">thêm</button>
                                </form>
                            </div>
                            <div class="section" id="edit-account">
                                <h1>sửa tài khoản</h1>
                                <form action="Edit?idTK">
                                    <input type="text" name="idTK" value="${idTaiKhoan.id}" hidden>
                                    <input type="text" name="username" id="" placeholder="Tên đăng nhập" value="${idTaiKhoan.tentaikhoan}">
                                    <input type="text" name="password" id="" placeholder="Mật khẩu" value="${idTaiKhoan.matkhau}">
                                    <button type="submit">sửa</button>
                                </form>
                            </div>
                        </div>
                        <div class="contanier-section">
                            <a href="#create-commnet" class="create"> + Thêm</a>
                            <div class="section">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Tên đăng nhập</th>
                                            <th>Tên phim</th>
                                            <th>Nội dụng</th>
                                            <th>Điểm</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listAdminDanhGia}" var="o">
                                            <tr>
                                                <td>${o.tentaikhoan}</td>
                                                <td>${o.tenphim}</td>
                                                <td>${o.noidung}</td>
                                                <td>${o.diem}</td>
                                                <td><a href="ClickEdit?idDG=${o.id}" class="edit">Sửa</a>
                                                    <p><p><a href="Delete?idDG=${o.id}" class="delete">Xóa</a></p></p></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="section" id="create-commnet">
                                <h1>thêm đánh giá</h1>
                                <form action="Add">
                                    <input type="text" name="idDG" hidden>
                                    <select name="username">
                                        <c:forEach items="${ListTaiKhoan}" var="o">
                                            <option value="${o.id}">${o.tentaikhoan}</option>
                                        </c:forEach>
                                    </select>
                                    <select name="namemovies">
                                        <c:forEach items="${listAdminPhim}" var="o">
                                            <option value="${o.id}">${o.tenphim}</option>
                                        </c:forEach>
                                    </select>
                                    <input type="text" name="content" id="" placeholder="Nội dung">
                                    <input type="text" name="score" id="" placeholder="Điểm">
                                    <button type="submit">thêm</button>
                                </form>
                            </div>
                            <div class="section" id="edit-comment">
                                <h1>sửa đánh giá</h1>
                                <form action="Edit?idDG">
                                    <input type="text" name="idDG" hidden value="${idDanhGia.id}">
                                    <select name="username">
                                        <c:forEach items="${ListTaiKhoan}" var="o">
                                            <option value="${o.id}">${o.tentaikhoan}</option>
                                        </c:forEach>
                                    </select>
                                    <select name="namemovies">
                                        <c:forEach items="${listAdminPhim}" var="o">
                                            <option ${idDanhGia.tenphim} value="${o.id}">${o.tenphim}</option>
                                        </c:forEach>
                                    </select>
                                    <input type="text" name="content" id="" placeholder="Nội dung" value="${idDanhGia.noidung}">
                                    <input type="text" name="score" id="" placeholder="Điểm" value="${idDanhGia.diem}">
                                    <button type="submit">sửa</button>
                                </form>
                            </div>
                        </div>
                        <div class="contanier-section">
                            <a href="#create-info-movies" class="create"> + Thêm</a>
                            <div class="section">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Tên phim</th>
                                            <th>Diễn viên</th>
                                            <th>Đạo diễn</th>
                                            <th>Quốc gia</th>
                                            <th>Năm sản xuất</th>
                                            <th>Tóm tắt</th>
                                            <th>Thời lượng</th>
                                            <th>Series</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listAdminThongTinPhim}" var="o">
                                            <tr>
                                                <td>${o.tenphim}</td>
                                                <td>${o.dienvien}</td>
                                                <td>${o.daodien}</td>
                                                <td>${o.quocgia}</td>
                                                <td>${o.namsx}</td>
                                                <td class="summary">${o.tomtat}</td>
                                                <td>${o.thoiluong}</td>
                                                <td>${o.series}</td>
                                                <td><a href="ClickEdit?idAdTTP=${o.id}" class="edit">Sửa</a>
                                                    <p><a href="Delete?idAdTTP=${o.id}" class="delete">Xóa</a></p></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="section" id="create-info-movies">
                                <h1>thêm thông tin phim</h1>
                                <form action="Add">
                                    <input type="text" name="idTTP" hidden>
                                    <select name="nameinfomovies">
                                        <c:forEach items="${listAdminPhim}" var="o">
                                            <option value="${o.id}">${o.tenphim}</option>
                                        </c:forEach>
                                    </select>
                                    <input type="text" name="performer" id="" placeholder="Diễn viên">
                                    <input type="text" name="director" id="" placeholder="Tên Đạo diễn">
                                    <input type="text" name="country" id="" placeholder="Quốc gia">
                                    <input type="text" name="year" id="" placeholder="Năm sản xuất">
                                    <input type="text" name="time" id="" placeholder="Thời lượng">
                                    <input type="text" name="series" id="" placeholder="Series">
                                    <textarea name="summary" class="textarea" cols="100" rows="10" placeholder="Tóm tắt"></textarea>
                                    <button type="submit">thêm</button>
                                </form>
                            </div>
                            <div class="section" id="edit-info-movies">
                                <h1>sửa thông tin phim</h1>
                                <form action="Edit?idTTP">
                                    <input type="text" name="idTTP" hidden value="${idThongTinPhim.id}">
                                    <select name="nameinfomovies">
                                        <option value="${idThongTinPhim.idphim}">${idThongTinPhim.tenphim}</option>
                                    </select>
                                    <input type="text" name="performer" id="" placeholder="Diễn viên" value="${idThongTinPhim.dienvien}">
                                    <input type="text" name="director" id="" placeholder="Tên Đạo diễn" value="${idThongTinPhim.daodien}">
                                    <input type="text" name="country" id="" placeholder="Quốc gia" value="${idThongTinPhim.quocgia}">
                                    <input type="text" name="year" id="" placeholder="Năm sản xuất" value="${idThongTinPhim.namsx}">
                                    <input type="text" name="time" id="" placeholder="Thời lượng" value="${idThongTinPhim.thoiluong}">
                                    <input type="text" name="series" id="" placeholder="Series" value="${idThongTinPhim.series}">
                                    <textarea name="summary" class="textarea" cols="100" rows="10" placeholder="Tóm tắt">${idThongTinPhim.tomtat}</textarea>
                                    <button type="submit">sửa</button>
                                </form>
                            </div>
                        </div>
                        <div class="contanier-section">
                            <a href="#create-movies" class="create"> + Thêm</a>
                            <div class="section">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Tên phim</th>
                                            <th>Ảnh</th>
                                            <th>Link phim</th>
                                            <th>Tên thể loại</th>
                                            <th>Tên danh mục</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listAdminPhim}" var="o">
                                            <tr>
                                                <td>${o.tenphim}</td>
                                                <td>${o.anh}</td>
                                                <td>${o.link}</td>
                                                <td>${o.tentheloai}</td>
                                                <td>${o.tendanhmuc}</td>
                                                <td><a href="ClickEdit?idAdP=${o.id}" class="edit">Sửa</a>
                                                    <p><a href="Delete?idAdP=${o.id}" class="delete">Xóa</a></p></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="section" id="create-movies">
                                <h1>thêm phim</h1>
                                <form action="Add">
                                    <input type="text" name="idP" hidden>
                                    <input type="text" name="namemovies" id="" placeholder="Tên phim">
                                    <h1>Ảnh:</h1>
                                    <input type="file" id="images" name="images">
                                    <h1>Link:</h1>
                                    <input type="file" id="Link" name="Link">
                                    <select name="genre">
                                        <c:forEach items="${listTheLoai}" var="o">
                                            <option value="${o.id}">${o.tentheloai}</option>
                                        </c:forEach>
                                    </select>
                                    <select name="catalog">
                                        <c:forEach items="${listDanhMuc}" var="o">
                                            <option value="${o.id}">${o.tendanhmuc}</option>
                                        </c:forEach>
                                    </select>
                                    <button type="submit">thêm</button>
                                </form>
                            </div>
                            <div class="section" id="edit-movies">
                                <h1>sửa phim</h1>
                                <form action="Edit?idP">
                                    <input type="text" name="idP" hidden value="${idPhim.id}">
                                    <input type="text" name="namemovies" id="" placeholder="Tên phim" value="${idPhim.tenphim}">
                                    <h1>Ảnh:</h1>
                                    <input type="text" id="" name="images" placeholder="Ảnh" value="${idPhim.anh}">
                                    <h1>Link:</h1>
                                    <input type="text" id="" name="Link" placeholder="Link phim" value="${idPhim.link}">
                                    <select name="genre">
                                        <c:forEach items="${listTheLoai}" var="o">
                                            <option value="${o.id}">${o.tentheloai}</option>
                                        </c:forEach>
                                    </select>
                                    <select name="catalog">
                                        <c:forEach items="${listDanhMuc}" var="o">
                                            <option value="${o.id}">${o.tendanhmuc}</option>
                                        </c:forEach>
                                    </select>
                                    <button type="submit">sửa</button>
                                </form>
                            </div>
                        </div>
                        <div class="contanier-section">
                            <a href="#create-type" class="create"> + Thêm</a>
                            <div class="section">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Tên thể loại</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listTheLoai}" var="o">
                                            <tr>
                                                <td>${o.tentheloai}</td>
                                                <td><a href="ClickEdit?idTL=${o.id}" class="edit">Sửa</a>
                                                    <p><a href="Delete?idTL=${o.id}" class="delete">Xóa</a></p></td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                            <div class="section" id="create-type">
                                <h1>thêm thể loại</h1>
                                <form action="Add">
                                    <input type="text" name="idTL" hidden>
                                    <input type="text" name="nametype" id="" placeholder="Tên thể loại">
                                    <button type="submit">thêm</button>
                                </form>
                            </div>
                            <div class="section" id="edit-type">
                                <h1>sửa thể loại</h1>
                                <form action="Edit?idTL">
                                    <input type="text" name="idTL" value="${idTheLoai.id}" hidden>
                                    <input type="text" name="nametype" id="" placeholder="Tên thể loại" value="${idTheLoai.tentheloai}">
                                    <button type="submit">sửa</button>
                                </form>
                            </div>
                        </div>
                        <div class="contanier-section">
                            <a href="#create-catalog" class="create"> + Thêm</a>
                            <div class="section">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Danh mục</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listDanhMuc}" var="o">
                                            <tr>
                                                <td>${o.tendanhmuc}</td>
                                                <td><a href="ClickEdit?idDM=${o.id}" class="edit">Sửa</a>
                                                    <p><a href="Delete?idDM=${o.id}" class="delete">Xóa</a></p></td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                            <div class="section" id="create-catalog">
                                <h1>thêm danh mục</h1>
                                <form action="Add">
                                    <input type="text" name="idDM" hidden>
                                    <input type="text" name="namecatalog" id="" placeholder="Tên danh mục">
                                    <button type="submit">thêm</button>
                                </form>
                            </div>
                            <div class="section" id="edit-catalog">
                                <h1>sửa danh mục</h1>
                                <form action="Edit?idDM">
                                    <input type="text" name="idDM" value="${idDanhMuc.id}" hidden>
                                    <input type="text" name="namecatalog" id="" placeholder="Tên danh mục" value="${idDanhMuc.tendanhmuc}">
                                    <button type="submit">sửa</button>
                                </form>
                            </div>
                        </div>
                    </section>
                </article>
            </div>
        </main>

        <script type="text/javascript">
            //biểu đồ thống kê
            var label1 = ["Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5",
                "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10",
                "Tháng 11", "Tháng 12"];
            var values1 = [500, 305, 450, 609, 583, 525, 1034, 624, 814, 1273,
                372, 784];

            function chartMonth() {
                const data = {
                    labels: label1,
                    datasets: [
                        {
                            label: "Lượt xem theo tháng",
                            data: values1,
                            backgroundColor: ["rgba(255, 99, 132, 0.5)",
                                "rgba(248, 242, 49, 0.5)",
                                "rgba(255, 205, 86, 0.5)",
                                "rgba(109, 236, 50, 0.5)",
                                "rgba(54, 162, 235, 0.5)",
                                "rgba(153, 102, 255, 0.5)",
                                "rgba(201, 203, 207, 0.5)",
                                "rgba(255, 99, 132, 0.5)",
                                "rgba(255, 159, 64, 0.5)",
                                "rgba(153, 102, 255, 0.5)",
                                "rgba(75, 192, 192, 0.5)",
                                "rgba(109, 236, 50, 0.5)", ],
                            borderColor: ["rgb(255, 99, 132)",
                                "rgb(248, 242, 49)", "rgb(255, 205, 86)",
                                "rgb(109, 236, 50)", "rgb(54, 162, 235)",
                                "rgb(153, 102, 255)", "rgb(201, 203, 207)",
                                "rgb(255, 99, 132)", "rgb(255, 159, 64)",
                                "rgb(153, 102, 255)", "rgb(75, 192, 192)",
                                "rgb(109, 236, 50)", ],
                            borderWidth: 1,
                        }, ],
                };

                const config = {
                    type: "bar",
                    data: data,
                    options: {
                        scales: {
                            y: {
                                beginAtZero: true,
                            },
                        },
                    },
                };

                const ctd = document.getElementById("chartMonth");
                const chart = new Chart(ctd, config);
            }
            chartMonth();

            var label2 = ["Phim lẻ", "Phim chiếu rạp", "Phim thuyết minh",
                "Phim vietsub"];
            var values2 = [3736, 842, 727, 2616];

            function chartType() {
                const data = {
                    labels: label2,
                    datasets: [
                        {
                            label: "Lượt xem theo danh mục: ",
                            data: values2,
                            backgroundColor: ["rgb(255, 99, 132, 0.5)",
                                "rgb(75, 192, 192, 0.5)",
                                "rgb(255, 205, 86, 0.5)",
                                "rgb(109, 236, 50, 0.5)"],
                        }, ],
                };

                const config = {
                    type: "doughnut",
                    data: data,
                };

                const ctt = document.getElementById("charttype");
                const chart = new Chart(ctt, config);
            }
            chartType();
        </script>

        <!-- SCRIPT -->
        <!-- JQUERY -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"
                integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
        crossorigin="anonymous"></script>
        <!-- OWL CAROUSEL -->
        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"
            integrity="sha512-bPs7Ae6pVvhOSiIcyUClR7/q2OAsRiovw4vAkX+zJbw3ShAeeqezq50RIIcIURq7Oa20rW2n2q+fyXBNcU9lrw=="
        crossorigin="anonymous"></script>
        <!-- APP SCRIPT -->
        <script src="./js/appAdmin.js"></script>
    </body>
</html>