window.onscroll = function() {mySticky();myTopBtn();};
window.resize= function() {mySticky();};
window.onload= function() {mySticky();};
// Get the navbar

//var logo= document.getElementById("logo");
// Get the offset position of the navbar
var sticky = 300;
var myTopBtnOffset = 500;

// Add the sticky class to the navbar when you reach its scroll position. Remove "sticky" when you leave the scroll position
function mySticky() {
  var navbar = document.getElementById("navbar2");
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky");
  } else {
    navbar.classList.remove("sticky");
  }
  var width = window.screen.width;
  var height = window.screen.height;
  navbar = document.getElementById("navbar1");
  if (width < 992){
      navbar.classList.add('sticky');
  }
  else{
      navbar.classList.remove('sticky');
  }
}
myTBTN = document.getElementById("myTBTN");
function myTopBtn() {
  if (document.body.scrollTop > 500 || document.documentElement.scrollTop > 500) {
    myTBTN.style.display = "block";
  } else {
    myTBTN.style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0; // For Safari
  document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
}