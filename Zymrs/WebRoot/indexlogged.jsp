<%@ include file="headerlogged.jsp" %>
<link rel="stylesheet" type="text/css" href="http://athena.fhict.nl/users/i270018/ZYMRS/css/style.css" media="screen" />
  <section class="page">
  
  <div class="searchinput">
   <form class="form">
   <input type="radio" name="searchoption" value="flight" checked="checked">Flight
   <input type="radio" name="searchoption" value="hotel">Hotel
   <input type="radio" name="searchoption" value="flightandhotel">Flight and Hotel
   <input type="radio" name="searchoption" value="all">Flight, Hotel and Car<br></br>
   
   From: <input type="text" name="origin">
   To: <input type="text" name="destination"><br></br>
   
   <input type="radio" name="class" value="bussiness">Bussiness
   <input type="radio" name="class" value="economic" checked="checked">Economic<br></br>
   
   <input type="radio" name="one-way" value="one-way">Round
   <input type="radio" name="round" value="round" checked="checked">One-Way<br></br>
   
   Leave: <input type="date"  name="depart"><br></br>
   
   Return: <input type="date" name="arrive"><br></br>
   
  <label for="passenger">Adult</label>
  <select name="adult">
  <option value="1" selected>1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  </select>
  
  <label for="passenegrs">Children</label>
  <select name="children">
  <option value="0" selected>0</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  </select></br></br>
  
  <input class="btn" type="submit" value="SEARCH" style="float:right"><br></br>
  
  </form>
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
