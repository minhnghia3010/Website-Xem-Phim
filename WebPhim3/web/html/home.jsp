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
                <!-- HERO SECTION -->
                <div class="hero-section">
                    <!-- HERO SLIDE -->
                    <div class="hero-slide">
                        <div class="owl-carousel carousel-nav-center" id="hero-carousel">
                            <!-- SLIDE ITEM -->
                        <c:forEach items="${listTop5PM}" var="o">
                            <div class="hero-slide-item">
                                <img src="${o.anh}" alt="">
                                <div class="overlay"></div>
                                <div class="hero-slide-item-content">
                                    <div class="item-content-wraper">
                                        <div class="item-content-title top-down">${o.tenphim}</div>
                                        <div class="movie-infos top-down delay-2">
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
                                        <div class="item-content-description top-down delay-4">${o.tomtat}</div>
                                        <div class="item-action top-down delay-6">
                                            <a href="Detail?idP=${o.id}" class="btn btn-hover"> <i
                                                    class="bx bxs-right-arrow"></i> <span>Xem ngay</span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                        <!-- END SLIDE ITEM -->
                    </div>
                </div>
                <!-- END HERO SLIDE -->
                <!-- TOP MOVIES SLIDE -->
                <div class="top-movies-slide">
                    <div class="owl-carousel" id="top-movies-slide">
                        <!-- MOVIE ITEM -->
                        <c:forEach items="${listTop10PM}" var="o">
                            <div class="movie-item">
                                <img src="${o.anh}" alt="">
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
                            </div>
                        </c:forEach>
                        <!-- END MOVIE ITEM -->
                    </div>
                </div>
                <!-- END TOP MOVIES SLIDE -->
            </div>
            <!-- END HERO SECTION -->

            <!-- LATEST MOVIES SECTION -->
            <section>
                <div class="container">
                    <div class="section-header">Phim mới nhất</div>
                    <div class="movies-slide carousel-nav-center owl-carousel">
                        <!-- MOVIE ITEM -->
                        <c:forEach items="${listPLM}" var="o">
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
            </section>
            <!-- END LATEST MOVIES SECTION -->

            <!-- LATEST SERIES SECTION -->
            <section>
                <div class="container">
                    <div class="section-header">Series mới nhất</div>
                    <div class="movies-slide carousel-nav-center owl-carousel">
                        <!-- MOVIE ITEM -->
                        <c:forEach items="${listPSM}" var="o">
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
            </section>
            <!-- END LATEST SERIES SECTION -->

            <!-- LATEST CARTOONS SECTION -->
            <section>
                <div class="container">
                    <div class="section-header">Hoạt hình mới nhất</div>
                    <div class="movies-slide carousel-nav-center owl-carousel">
                        <!-- MOVIE ITEM -->
                        <c:forEach items="${listPHHM}" var="o">
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
            </section>
            <!-- END LATEST CARTOONS SECTION -->

            <!-- SPECIAL MOVIE SECTION -->
            <section>
                <c:forEach items="${listPNN}" var="o">
                    <div class="hero-slide-item">
                        <img src="${o.anh}" alt="">
                        <div class="overlay"></div>
                        <div class="hero-slide-item-content">
                            <div class="item-content-wraper">
                                <div class="item-content-title">${o.tenphim}</div>
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
                                <div class="item-content-description">${o.tomtat}</div>
                                <div class="item-action">
                                    <a href="Detail?idP=${o.id}" class="btn btn-hover"> <i
                                            class="bx bxs-right-arrow"></i> <span>Xem ngay</span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </section>
            <!-- END SPECIAL MOVIE SECTION -->

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
    </body>
</html>