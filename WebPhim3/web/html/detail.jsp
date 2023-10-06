<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Flix</title>
        <!-- GOOGLE FONTS -->
        <link rel="preconnect" href="https://fonts.gstatic.com" />
        <link
            href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;700;900&display=swap"
            rel="stylesheet" />
        <!-- OWL CAROUSEL -->
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css"
              integrity="sha512-tS3S5qG0BlhnQROyJXvNjeEM4UpMXHrQfTGmbQ1gKmelCxlSEBUaxhRBj/EFTzpbP4RVSrpEikbmdJobCvhE3g=="
              crossorigin="anonymous" />
        <!-- BOX ICONS -->
        <link href="https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css"
              rel="stylesheet" />
        <!-- APP CSS -->
        <link rel="stylesheet" href="./css/grid.css" />
        <link rel="stylesheet" href="./css/app.css" />
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
                        <!-- VIDEO -->
                        <section>
                            <div class="container">
                                <div>
                                    <h1>
                                        <a href="Home">Trang chủ</a>
                                        &gt; ${XemPhim.tenphim}
                                </h1>
                            </div>
                            <video src="${XemPhim.link}" controls></video>
                        </div>
                    </section>
                    <!-- END VIDEO -->

                    <!-- INFOR FILM -->
                    <section>
                        <div class="container">
                            <div class="container-info">
                                <div class="info">
                                    <!-- MOVIE ITEM -->
                                    <div class="img-info-film">
                                        <img src="${XemPhim.anh}" alt="">
                                    </div>
                                    <!-- END MOVIE ITEM -->
                                    <div class="info-film">
                                        <div>
                                            <h1>${XemPhim.tenphim}</h1>
                                            <div class="info-time">
                                                <p>${XemPhim.namsx}</p>
                                                <p>${XemPhim.quocgia}</p>
                                            </div>
                                            <div>
                                                <h3>${XemPhim.luotxem} lượt xem</h3>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="info-score">
                                            
                                            <div>
                                                <i class="bx bxs-star"></i><i class="bx bxs-star"></i><i
                                                    class="bx bxs-star"></i><i class="bx bxs-star"></i><i
                                                    class="bx bxs-star"></i><i class="bx bxs-star"></i><i
                                                    class="bx bxs-star"></i><i class="bx bxs-star"></i><i
                                                    class="bx bxs-star"></i><i class="bx bxs-star"></i>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="info-genre">
                                            <c:forEach items="${listTLByIDP}" var="o">
                                                <a href="#">${o.tentheloai}</a> 
                                            </c:forEach>
                                            <c:forEach items="${listDMByIDP}" var="o">
                                                <a href="#">${o.tendanhmuc}</a> 
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                                <div class="summary">
                                    <hr>
                                    <h3>Tóm tắt</h3>
                                    <p>${XemPhim.tomtat}</p>
                                </div>
                            </div>
                            <div class="container-series">
                                <div class="section-header">Series phim</div>
                                <div class="movies-slide carousel-nav-center owl-carousel">
                                    <!-- MOVIE ITEM -->
                                    <c:forEach items="${list10PNN}" var="o">
                                        <a href="Detail?idP=${o.id}" class="movie-item"> <img
                                                src="${o.anh}" alt="">
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
                            </div>
                        </div>
                    </section>
                    <!-- END INFOR FILM -->

                    <!-- COMMENT -->
                    <section>
                        <div class="container">
                            <div class="container-commnet">
                                <div class="commnet">
                                    <h3></h3>
                                    <form>
                                        <input type="text" name="commnet" placeholder="Bình luận">
                                        <input type="number" name="" min="1" max="10" placeholder="Điểm">
                                        <button type="submit">Gửi</button>
                                    </form>
                                </div>
                                <c:forEach items="${listDGP}" var="o">
                                    <div class="commnet">
                                        <div>
                                            <h3>${o.tentaikhoan}</h3>
                                            <p>${o.noidung}</p>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </section>
                    <!-- END COMMENT -->
                </article>
                <aside>
                    <section>
                        <div class="container-Related">
                            <div class="section-header">Top Phim</div>
                            <!-- ITEM MOVIE RELATED -->
                            <c:forEach items="${listTop10P}" var="o">
                                <a href="Detail?idP=${o.id}">
                                    <div class="item-related">
                                        <img src="${o.anh}" alt="">
                                        <div>
                                            <h4>${o.tenphim}</h4>
                                            <h4>
                                                <i class="bx bxs-star"></i>
                                            </h4>
                                            <p>${o.luotxem} lượt xem</p>
                                            <p>${o.namsx}</p>
                                        </div>
                                    </div>
                                </a>
                            </c:forEach>
                            <!--END ITEM MOVIE RELATED -->
                        </div>
                    </section>
                </aside>
            </div>
        </main>
        <!-- END MANI -->

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
    </body>
</html>