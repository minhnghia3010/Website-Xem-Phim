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
        <link rel="stylesheet" href="./css/grid.css">
        <link rel="stylesheet" href="./css/app.css">
    </head>
    <body>
        <!-- NAV -->
        <jsp:include page="menu.jsp"></jsp:include>
            <!-- END NAV -->

            <div class="on-top hidden">
                <h1>&Hat;</h1>
            </div>

            <!-- MAIN -->
            <main>
                <div class="main-container">
                    <article>
                        <!-- MOVIES -->
                        <section>
                            <div class="container">
                                <div>
                                    <h1>
                                        <a href="Home">Trang chủ</a> &gt; <a href="#">Phim</a>
                                    </h1>
                                </div>
                                <div class="container-series">
                                    <div class="section-header">
                                        Tất cả phim
                                        <form action="Search" method="get">
                                            <input type="text" name="action" value="theloai" hidden>
                                            <div class="container-filter">
                                            <select name="genre">
                                                  <option value="0">--Chọn--</option>
                                                <c:forEach items="${listTheLoai}" var="o">
                                                    <option value="${o.id}">${o.tentheloai}</option>
                                                </c:forEach>
                                            </select>
                                            <select name="year">
                                                 <option value="null">--Chọn--</option>
                                                <c:forEach items="${listNamsxPhim}" var="o">
                                                    <option value="${o.namsx}">${o.namsx}</option>
                                                </c:forEach>
                                            </select>
                                            <select name="country">
                                                 <option value="null">--Chọn--</option>
                                                <c:forEach items="${listQuocGiaPhim}" var="o">                                                
                                                    <option value="${o.quocgia}">${o.quocgia}</option>
                                                </c:forEach>
                                            </select>
                                            <button type="submit" class="btn-filter">Tìm kiếm</button>									
                                        </div>
                                    </form>
                                </div>
                                <div class="movies">
                                    <!-- MOVIE ITEM -->
                                    <c:forEach items="${listPhim}" var="o">
                                        <a href="Detail?idP=${o.id}" class="movie-item"> <img src="${o.anh}" alt="">
                                            <div class="movie-item-content">
                                                <div class="movie-item-title">${o.tenphim}</div>
                                                <div class="movie-infos">
                                                    <div class="movie-info">
                                                        <i class="bx bxs-star"></i> <span>${o.luotxem}</span>
                                                    </div>
                                                    <div class="movie-info">
                                                        <i class="bx bxs-time"></i> <span>${o.thoiluong}</span>
                                                    </div>
                                                    <div class="movie-info">
                                                        <span>HD</span>
                                                    </div>
                                                    <div class="movie-info">
                                                        <span>16+</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                    </c:forEach>
                                    <!-- END MOVIE ITEM -->
                                </div>
                                <hr>
                                <div class="pagination"></div>
                            </div>
                        </div>
                    </section>
                    <!-- END MOVIES -->
                </article>
            </div>
        </main>
        <!-- END MAIN -->

        <!-- FOOTER SECTION -->
        <jsp:include page="footer.jsp"></jsp:include>
        <!-- END FOOTER SECTION -->

        <!-- COPYRIGHT SECTION -->
        <div class="copyright">Copyright 2023</div>
        <!-- END COPYRIGHT SECTION -->

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
        <script src="./js/app.js"></script>
        <script src="./js/appPaging.js"></script>
    </body>
</html>