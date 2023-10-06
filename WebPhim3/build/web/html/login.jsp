<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./css/appLogin.css" />
        <title>Đăng Nhập & Đăng Ký</title>
    </head>
    <body>
        <div class="container">
            <div class="forms-container">
                <div class="signin-signup">
                    <!-- LOGIN -->
                    <form action="Login" class="sign-in-form" method="post">
                        <h2 class="title">Đăng Nhập</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input name="user" type="text" placeholder="Tên Người Dùng" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input name="pass" type="password" placeholder="Mật Khẩu" />
                        </div>
                        <input type="submit" value="Đăng Nhập" class="btn solid" />
                        <% String error = request.getParameter("error"); %>
                        <% if (error != null) { %>
                        <p style="color: red;">Sai tên đăng nhập hoặc mật khẩu. Vui lòng thử lại.</p>
                        <% } %>
                        <p class="social-text">Hoặc đăng nhập với các nền tảng xã hội dưới đây</p>
                        <div class="social-media">
                            <a href="#" class="social-icon">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-twitter"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-google"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-linkedin-in"></i>
                            </a>
                        </div>
                    </form>
                    <!-- END LOGIN -->
                    <!-- REGIST -->
                    <form action="Signup" class="sign-up-form" method="get">
                        <h2 class="title">Đăng Ký</h2>
                        <div class="input-field">
                            <i class="fas fa-user"></i>
                            <input name="user" type="text" placeholder="Tên Người Dùng" />
                        </div>
                        <div class="input-field">
                            <i class="fas fa-lock"></i>
                            <input name="pass" type="password" placeholder="Mật Khẩu" />
                        </div>
                        <input type="submit" class="btn" value="Đăng Ký" />
                        <p class="social-text">Hoặc đăng ký với các nền tảng xã hội dưới đây</p>
                        <div class="social-media">
                            <a href="#" class="social-icon">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-twitter"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-google"></i>
                            </a>
                            <a href="#" class="social-icon">
                                <i class="fab fa-linkedin-in"></i>
                            </a>
                        </div>
                    </form>
                </div>
            </div>
            <!-- END REGIST -->

            <div class="panels-container">
                <div class="panel left-panel">
                    <div class="content">
                        <h3>Đăng ký tại đây ?</h3>
                        <p>
                            "Phim ảnh là một cách để giao tiếp với người khác, để chia sẻ những câu chuyện của bạn và để kết nối với
                            nhau." - Steven Spielberg
                        </p>
                        <button class="btn transparent" id="sign-up-btn">
                            Đăng Ký
                        </button>
                    </div>
                    <img src="./images/film1.jpg" class="image" alt="" />
                </div>
                <div class="panel right-panel">
                    <div class="content">
                        <h3>Đăng nhập tại đây ?</h3>
                        <p>
                            "Phim ảnh là một cách để trốn thoát khỏi thực tế, nhưng nó cũng là một cách để hiểu rõ hơn về thực tế." -
                            Martin Scorsese
                        </p>
                        <button class="btn transparent" id="sign-in-btn">
                            Đăng Nhập
                        </button>
                    </div>
                    <img src="./images/film2.jpg" class="image" alt="" />
                </div>
            </div>
        </div>

        <script src="./js/appLogin.js"></script>
    </body>
</html>