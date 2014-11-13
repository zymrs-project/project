<%@ include file="header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <section class="page">
  
  <div class="searchinput">
  <div class="formcontainer">
   <form class="form" action="/Zymrs/register.do" method="post">
   
   <label>First Name</label>
   <input type="text" name="firstname" class="formregister" maxlength="20"><br></br>
   <label>Last Name</label> 
   <input type="text" name="lastname" class="formregister" maxlength="20"><br></br>
   <label>Address</label> 
   <input type="text" name="address" class="formregister" maxlength="20"><br></br>
   <label>City</label> 
   <input type="text" name="city" class="formregister" maxlength="20"><br></br>
   <label>Email</label> 
   <input type="text" name="email" class="formregister"><br></br>
   <label>User ID</label>
   <input type="text" name="username" class="formregister" maxlength="10"><br></br>
   <label>Password</label>
   <input type="password" name="password" class="formregister" maxlength="15"><br></br>
   <label>repeat password</label>
   <input type="password" name="rpassword" class="formregister" maxlength="15"><br></br>
  
  <input class="btnsearch" type="submit" value="SUBMIT" style="float:right; color:#06F; background-color:#63C"><br></br>
  
  </form>
  </div>
  </div>
  
  <div class="homeinnerpage">
  
   <p>The agency brings you the cheapest flights, and hotels to the top destinations</p>
  <p>We work with more than 500 partners to achive our goal of delivering the best and cheapest service</p>
  <h3><a href="" >Top Destinations</a></h3>
  <h3><a href="" >Cheap Destinations</a></h3>
  <h3><a href="" >New Destinations</a></h3>
  <p>Join us @</p> 
  <h3><a href="" >Facebook</a></h3>
  <h3><a href="" >Twitter</a></h3>
  
  <div id="grouppicture">
   <img src="images/group.jpg" style= "width:180px; height:180px">
   </div>
  </div> 
  <div class="commercialpage">
  
 <div id="sliderFrame">
        <div id="slider">
            <a href=""><img src="http://athena.fhict.nl/users/i270018/ZYMRS/images/turkey.jpg" /></a>
           <a href=""> <img src="http://athena.fhict.nl/users/i270018/ZYMRS/images/slide1.jpg" /></a>
            <a href=""><img src="http://athena.fhict.nl/users/i270018/ZYMRS/images/slide2.jpg" /></a>
            <a href=""><img src="http://athena.fhict.nl/users/i270018/ZYMRS/images/slide3.jpg" /></a>
            <a href=""><img src="http://athena.fhict.nl/users/i270018/ZYMRS/images/slide4.jpg" /></a>
           <a href=""> <img src="http://athena.fhict.nl/users/i270018/ZYMRS/images/slide5.jpg" /></a>
        </div>
        <!--Custom navigation buttons on both sides-->
        <div class="group1-Wrapper">
            <a onClick="imageSlider.previous()" class="group1-Prev"></a>
            <a onClick="imageSlider.next()" class="group1-Next"></a>
        </div>
        <!--nav bar-->
        <div style="text-align:center;padding:20px;z-index:20;">
            <a onClick="imageSlider.previous()" class="group2-Prev"></a>
            <a id='auto' onClick="switchAutoAdvance()"></a>
            <a onClick="imageSlider.next()" class="group2-Next"></a>
        </div>
    </div>
  
  
  </div>   
          
 </section>
 <c:if test="${requestScope.RegisterInfo =='success'}">
<script language='javascript'>alert('Congratulation!Register successfully!')</script>
</c:if>
 <c:if test="${requestScope.RegisterInfo =='failed'}">
<script language='javascript'>alert('Username already exists!')</script>
</c:if>
 <script type="text/javascript">
        //The following script is for the group 2 navigation buttons.
        function switchAutoAdvance() {
            imageSlider.switchAuto();
            switchPlayPauseClass();
        }
        function switchPlayPauseClass() {
            var auto = document.getElementById('auto');
            var isAutoPlay = imageSlider.getAuto();
            auto.className = isAutoPlay ? "group2-Pause" : "group2-Play";
            auto.title = isAutoPlay ? "Pause" : "Play";
        }
        switchPlayPauseClass();
    </script>
            
         
<%@ include file="footer.jsp" %>
