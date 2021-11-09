<%-- 
    Document   : mktdashboard
    Created on : Nov 9, 2021, 5:05:30 PM
    Author     : CHAUBNMHE153019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page trimDirectiveWhitespaces="true" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0,minimum-scale=1">
        <title>Manage Banner</title>
        <!-- Icon -->
            <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/favicon.ico" type="image/x-icon">
            <!-- Google Fonts -->
            <link
              href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap"
              rel="stylesheet"
            />
         <!--BOOTSTRAP5-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/dataTables.bootstrap5.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/dashboard.css" />
        <!--FONTAWESOME-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <!--CSS-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/queries.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/daterangepicker.css" />
        
    </head>
    <body>
        <div class="wrapper">
            <!-- Sidebar Holder -->
           

            <!-- Page Content Holder -->
            <div id="content">
                 <%@include file="model/SidebarMarketing.jsp" %>
                

                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <h4>Dashboard</h4>
                        </div>
                    </div>
                    <!-- Dashboard -->
                    <form>
                    <input type="text" name="basic" id="data" value="07/01/2021 - 07/27/2021" />
                    <input class=" btn btn-sm btn-secondary" type="submit" value="Go" >
                    </form>
                    <div class="false-For-Bottom-Text">
                        <div class="mypiechart">	
                                <canvas id="myCanvas" width="300" height="300"></canvas>
                        </div>
                    </div>
            </div>

        </div>

        <div class="overlay"></div>

        <!-- BOOTSTRAP5-->
        <script
          src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
          crossorigin="anonymous"
        ></script>
        <!-- From A CDN -->
        <script src="https://cdn.jsdelivr.net/npm/moment@latest/moment.min.js"></script>
        <!-- jQuery CDN -->
        <script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
        <!-- Bootstrap Js CDN -->
        <!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->
        <!-- jQuery Custom Scroller CDN -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>
        
        <script type="text/javascript">
            $(document).ready(function () {
                $("#sidebar").mCustomScrollbar({
                    theme: "minimal"
                });

                $('#dismiss, .overlay').on('click', function () {
                    $('#sidebar').removeClass('active');
                    $('.overlay').fadeOut();
                });

                $('#sidebarCollapse').on('click', function () {
                    $('#sidebar').addClass('active');
                    $('.overlay').fadeIn();
                    $('.collapse.in').toggleClass('in');
                    $('a[aria-expanded=true]').attr('aria-expanded', 'false');
                });
            });
            $(function(){
                $('#data').daterangepicker({
                    "timePicker": true,
                    ranges: {
                        'Today': [moment(), moment()],
                        'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                        'Last 7 Days': [moment().subtract(6, 'days'), moment()],
                        'Last 30 Days': [moment().subtract(29, 'days'), moment()],
                        'This Month': [moment().startOf('month'), moment().endOf('month')],
                        'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                     },
                    "startDate": "11/03/2021",
                    "endDate": "11/09/2021"
                }, function(start, end, label) {
                  console.log("New date range selected: ' + start.format('YYYY-MM-DD') + ' to ' + end.format('YYYY-MM-DD') + ' (predefined range: ' + label + ')");
                });
              });
            
        </script>
        <script src="${pageContext.request.contextPath}/js/daterangepicker.js"></script>
        <script src="${pageContext.request.contextPath}/js/rpie.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/dataTables.bootstrap5.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/script1.js"></script>
        <script type="text/javascript">	
            var obj = {
                values: [1,1,1,1,1],
                colors: ['#4CAF50', '#00BCD4', '#E91E63', '#FFC107', '#9E9E9E'],
                animation: true, // Takes boolean value & default behavious is false
                animationSpeed: 0, // Time in miliisecond & default animation speed is 20ms
                fillTextData: true, // Takes boolean value & text is not generate by default 
                fillTextColor: '#fff', // For Text colour & default colour is #fff (White)
                fillTextAlign: 1.30, // for alignment of inner text position i.e. higher values gives closer view to center & default text alignment is 1.85 i.e closer to center
                fillTextPosition: 'inner', // 'horizontal' or 'vertical' or 'inner' & default text position is 'horizontal' position i.e. outside the canvas
                doughnutHoleSize: 50, // Percentage of doughnut size within the canvas & default doughnut size is null
                doughnutHoleColor: '#fff', // For doughnut colour & default colour is #fff (White)
                offset: 1, // Offeset between two segments & default value is null
                pie: 'normal', // if the pie graph is single stroke then we will add the object key as "stroke" & default is normal as simple as pie graph
                isStrokePie: { 
                        stroke: 20, // Define the stroke of pie graph. It takes number value & default value is 20
                        overlayStroke: true, // Define the background stroke within pie graph. It takes boolean value & default value is false
                        overlayStrokeColor: '#eee', // Define the background stroke colour within pie graph & default value is #eee (Grey)
                        strokeStartEndPoints: 'Yes', // Define the start and end point of pie graph & default value is No
                        strokeAnimation: true, // Used for animation. It takes boolean value & default value is true
                        strokeAnimationSpeed: 20, // Used for animation speed in miliisecond. It takes number & default value is 20ms
                        fontSize: '60px', // Used to define text font size & default value is 60px
                        textAlignement: 'center', // Used for position of text within the pie graph & default value is 'center'
                        fontFamily: 'Arial', // Define the text font family & the default value is 'Arial'
                        fontWeight: 'bold' //  Define the font weight of the text & the default value is 'bold'
                    }
              };
           generatePieGraph('myCanvas', obj);
        </script>
    </body>
</html>
