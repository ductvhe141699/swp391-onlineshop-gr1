<%-- 
    Document   : chatbox
    Created on : Nov 8, 2021, 1:30:29 AM
    Author     : Ottelia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- icon -->
        <link rel="shortcut icon" href="resources/favicon.ico" type="image/x-icon">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <!-- link Fonts -->
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap"
            rel="stylesheet"
            />
        <!--BOOTSTRAP5-->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <!--FONTAWESOME-->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
            integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="./css/style.css" />
        <link rel="stylesheet" type="text/css" href="./css/queries.css" />
        <link rel="stylesheet" type="text/css" href="./css/homepage.css" />
        <title>Chat</title>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="img/favicon.png" rel="icon">
        <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
            rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="vendor/aos/aos.css" rel="stylesheet">
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
            function loadMessage() {
                var amount = document.getElementsByClassName("incoming_msg").length + document.getElementsByClassName("outgoing_msg").length;
                var idfriend = document.getElementById("friendId").innerHTML;
                $.ajax({
                    url: "/SWP391_OnlineClothingShop_Group1/LoadMessage",
                    type: "get",
                    data: {
                        offset: amount,
                        friendId: idfriend
                    },
                    success: function (data) {
                        var chatbox = document.getElementById("messagebox");
                        chatbox.innerHTML += data;
                    },
                    error: function (xhr) {

                    }
                });
                
            }

            function loadNewFriendMessage(friendId) {
                var messagebox = document.getElementById("messagebox");
                messagebox.innerHTML = null;

                var inputbox = document.getElementById("inputbox");
                inputbox.style.display = 'none';
                document.getElementById("friendId").innerHTML = friendId;
                loadMessage();
                inputbox.style.display = 'block';
            }
            
            function setSelected(selectdiv) {
                let elements = document.getElementsByClassName('chat_list active_chat');

                for (let i = 0; i < elements.length; i++) {
                    elements[i].className='chat_list';
                }
                
                selectdiv.className='chat_list active_chat';
                
                setFriendAvatar();
            }
            
            function setFriendAvatar() {
        
                
        
                var elements = document.getElementsByClassName('chat_list active_chat');
                
                var selectdiv = elements[0];
                
                var imgtag = selectdiv.getElementsByTagName('img')[0];
                var imgsrc = imgtag.getAttribute('src');
                
                var nametag = selectdiv.getElementsByTagName('h5')[0];
                var friendname = nametag.innerHTML;
               
                document.getElementById('friendAvatar').src = imgsrc;
                document.getElementById('friendName').innerHTML = friendname;
            }
            
            function postMessage() {

                var mess = document.querySelector('input').value;
                var messtatus = document.getElementById("status");

                if (messtatus !== null) {
                    messtatus.remove();
                }
                document.getElementById("messagebox").innerHTML += "<div class=\"outgoing_msg\">\n"
                        + "                  <div class=\"sent_msg\">\n"
                        + "                    <p>" + mess + "</p>\n"
                        + "                    <span class=\"time_date\">" + "" + "</span>\n"
                        + "                    <span id=\"status\" class=\"\">" + "ĐANG GỬI" + "</span>\n"
                        + "                  </div>\n"
                        + "                </div>";

                var idfriend = document.getElementById("friendId").innerHTML;

                $.ajax({
                    url: "/SWP391_OnlineClothingShop_Group1/LoadMessage",
                    type: "post",
                    data: {
                        message: mess,
                        friendId: idfriend
                    },
                    success: function () {
                        document.getElementById("status").innerHTML = "ĐÃ GỬI";
                        document.getElementById("textbox").value = "";
                    },
                    error: function (xhr) {
                        document.getElementById("status").innerHTML = "KHÔNG GỬI ĐƯỢC";
                    }
                });
            }
            
            $(document).ready(function () {
                var elem = document.getElementById("friendId").innerHTML;
                
                if (!elem) {
                    //alert('newelem');
                    var messagebox = document.getElementById("messagebox");
                    messagebox.innerHTML = null;

                    var inputbox = document.getElementById("inputbox");
                    inputbox.style.display = 'none';
                    
                    document.getElementById("heading").style.display = 'none';
                    
                } else {
                    //alert('elem');
                    loadNewFriendMessage(elem);
                    setFriendAvatar();
                }
            });

        </script>
    </head>

    <body >

  <%@include file="model/header.jsp" %>
        <main id="main">

            <!-- ======= Breadcrumbs Section ======= -->
            <section class="breadcrumbs">
                <div class="card-heading">
                    <h2 class="title" style="color: black; font-weight: bold;text-align: center;">Chat box</h2>
                    <c:if test="${chaterror!=null}">
                        <h3 style="color:#ff0000;font-weight: bold;text-align: center"><c:out value="${chaterror}"></c:out></h3>
                    </c:if>
                </div>
            </section><!-- End Breadcrumbs Section -->

            <h2 id="friendId" style="display:none;">${friendId}</h2>

            <section class="inner-page" style="padding-bottom: 30px;">
                <div class="container">
                    <div class="messaging">
                        <div class="inbox_msg">
                            <div class="inbox_people">
                                <div class="headind_srch">
                                    <div class="recent_heading">
                                        <h4>Recent</h4>
                                    </div>

                                </div>
                                <div class="inbox_chat">
                                    <c:set var="selectedId" value="${friendId}"></c:set>
                                    <c:forEach items="${friendList}" var="friend" >
                                        <c:choose>
                                            <c:when test="${friend.getUserID()==selectedId}">
                                                <div class="chat_list active_chat">
                                                    <a href="#" onclick="setSelected(this.parentNode);loadNewFriendMessage(${friend.getUserID()}); return false;">
                                                        <div class="chat_people">                          
                                                                <div class="chat_ib">
                                                                    <h5><c:out value="${friend.getUserName()}"></c:out></h5>

                                                                </div>
                                                            </div>
                                                        </a>
                                                    </div>
                                            </c:when>
                                            <c:otherwise>
                                                <div class="chat_list">
                                                    <a href="#" onclick="setSelected(this.parentNode);loadNewFriendMessage(${friend.getUserID()}); return false;">
                                                        <div class="chat_people">
                                                            
                                                                <div class="chat_ib">
                                                                    <h5>${friend.getUserName()}</h5>
                                                            </div>
                                                        </div>
                                                    </a>
                                                </div>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </div>
                            </div>
                            <div class="mesgs">
                                <div id="heading" class="headind_srch">
                                    <div class="recent_heading">

                                        <h4 style="
                                            max-width: 30%;
                                            float: left;"
                                             id="friendName">Recent</h4>
                                    </div>
                                    
                                </div>
                                <div class="msg_history" id="messagebox">

                                </div>
                                <div class="type_msg" id="inputbox">
                                    <div class="input_msg_write">
                                        <form action="#" method="POST" onsubmit="postMessage();event.preventDefault();">
                                            <input id = "textbox" type="text" class="write_msg" placeholder="Type a message" required style="width: 91%"/>
                                            <button class="msg_send_btn" type="submit"><i class="fa fa-paper-plane-o"
                                                                                          aria-hidden="true"></i></button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        </main><!-- End #main -->

        

        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
                class="bi bi-arrow-up-short"></i></a>
 <%@include file="model/footer.jsp" %>
        <!-- Vendor JS Files -->
        <script src="vendor/aos/aos.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="vendor/glightbox/js/glightbox.min.js"></script>
        <script src="vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="vendor/php-email-form/validate.js"></script>
        <script src="vendor/purecounter/purecounter.js"></script>
        <script src="vendor/swiper/swiper-bundle.min.js"></script>

        <!-- Template Main JS File -->
        <script src="js/main.js"></script>

        <style>
            .container {
                max-width: 1170px;
                margin: auto;
            }

            img {
                max-width: 100%;
            }

            .inbox_people {
                background: #f8f8f8 none repeat scroll 0 0;
                float: left;
                overflow: hidden;
                width: 33%;
                border-right: 1px solid #c4c4c4;
            }

            .inbox_msg {
                border: 1px solid #c4c4c4;
                clear: both;
                overflow: hidden;
            }

            .top_spac {
                margin: 20px 0 0;
            }


            .recent_heading {
                float: left;
                width: 40%;
            }

            .srch_bar {
                display: inline-block;
                text-align: right;
                width: 60%;
            }

            .headind_srch {
                padding: 10px 29px 10px 20px;
                overflow: hidden;
                border-bottom: 1px solid #c4c4c4;
            }

            .recent_heading h4 {
                color: #05728f;
                font-size: 21px;
                margin: auto;
            }

            .srch_bar input {
                border: 1px solid #cdcdcd;
                border-width: 0 0 1px 0;
                width: 80%;
                padding: 2px 0 4px 6px;
                background: none;
            }

            .srch_bar .input-group-addon button {
                background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
                border: medium none;
                padding: 0;
                color: #707070;
                font-size: 18px;
            }

            .srch_bar .input-group-addon {
                margin: 0 0 0 -27px;
            }

            .chat_ib h5 {
                font-size: 15px;
                color: #464646;
                margin: 0 0 8px 0;
            }

            .chat_ib h5 span {
                font-size: 13px;
                float: right;
            }

            .chat_ib p {
                font-size: 14px;
                color: #989898;
                margin: auto
            }

            .chat_img {
                float: left;
                width: 11%;
            }

            .chat_ib {
                float: left;
                padding: 0 0 0 15px;
                width: 88%;
            }

            .chat_people {
                overflow: hidden;
                clear: both;
            }

            .chat_list {
                border-bottom: 1px solid #c4c4c4;
                margin: 0;
                padding: 18px 16px 10px;
            }

            .inbox_chat {
                height: 550px;
                overflow-y: scroll;
            }

            .active_chat {
                background: #ebebeb;
            }

            .incoming_msg_img {
                display: inline-block;
                width: 6%;
            }

            .received_msg {
                display: inline-block;
                padding: 0 0 0 10px;
                vertical-align: top;
                width: 92%;
            }

            .received_withd_msg p {
                background: #ebebeb none repeat scroll 0 0;
                border-radius: 3px;
                color: #646464;
                font-size: 14px;
                margin: 0;
                padding: 5px 10px 5px 12px;
                width: 100%;
            }

            .time_date {
                color: #747474;
                display: block;
                font-size: 12px;
                margin: 8px 0 0;
            }

            .received_withd_msg {
                width: 57%;
            }

            .mesgs {
                float: left;
                /*padding: 00px 15px 0 25px;*/
                width: 67%;
            }

            .sent_msg p {
                background: #ff7400 none repeat scroll 0 0;
                border-radius: 3px;
                font-size: 14px;
                margin: 0;
                color: #fff;
                padding: 5px 10px 5px 12px;
                width: 100%;
            }

            .outgoing_msg {
                overflow: hidden;
                margin: 26px 12px 26px;
            }

            .sent_msg {
                float: right;
                width: 46%;
            }

            .input_msg_write input {
                background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
                border: medium none;
                color: #4c4c4c;
                font-size: 15px;
                min-height: 48px;
                width: 100%;
            }

            .type_msg {
                border-top: 1px solid #c4c4c4;
                position: relative;
                margin-left: 20px;
                margin-right: 20px;
            }

            .msg_send_btn {
                background:  none repeat scroll 0 0;
                border: medium none;
                color: #fff;
                cursor: pointer;
                font-size: 17px;
                position: absolute;
                right: 0;
                top: 10px;
                height: 15px;
                width: 15px;
                border-top: 15px solid transparent;
                border-left: 30px solid #05728f;
                border-bottom: 15px solid transparent;
            }

            .messaging {
                padding: 0 0 50px 0;
            }

            .msg_history {
                height: 516px;
                overflow-y: auto;
                flex-direction:column-reverse;
            }
        </style>
    
        <!-- BOOTSTRAP5-->
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"
        ></script>
        <!-- SCRIPT -->
        <script src="${pageContext.request.contextPath}/js/script.js"></script>
    </body>
</html>
