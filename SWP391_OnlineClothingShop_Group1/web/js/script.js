window.onscroll = function() {mySticky()};

// Get the navbar
var navbar = document.getElementById("navbar2");
//var logo= document.getElementById("logo");
// Get the offset position of the navbar
var sticky = 300;

// Add the sticky class to the navbar when you reach its scroll position. Remove "sticky" when you leave the scroll position
function mySticky() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky");
  } else {
    navbar.classList.remove("sticky");
  }
}

$(window).resize(function(){
 
    // Lấy thông số
    var width = $(window).width();
    var height = $(window).height();
    if (width <= 768){
        $('.left, .right').addClass('responsive_768');
    }
    else{
        $('.left, .right').removeClass('responsive_768');
    }
});