<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div class="container">
 <div class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    
    <div class="collapse navbar-collapse">
    <ul class="nav navbar-nav navbar-left">
       	<li><a href="verIntranetHome">Home</a></li>
    </ul>
         
    <ul class="nav navbar-nav">
    	<li class="dropdown">
	        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
	          Administración<b class="caret"></b>
	        </a>
	        <ul class="dropdown-menu">

	        </ul>
     	</li>
     </ul>
     
      <ul class="nav navbar-nav navbar-right"> 
     	<li id="noti_Container" >
     		
     			<div id="noti_Counter"></div>   <!--SHOW NOTIFICATIONS COUNT.-->
                <a id="noti_Button" href=""><samp class="bubble"><img src='images/notifi.png' width='24px' height='24px' /></samp></a>
                <div id="notifications">
                    <h3>Notificaciones</h3>
                   	<div style="height:300px;" id="idNotificaciones" > 
                   		
                   	
                   	</div>
                   <!-- <div class="seeAll"><a href="">Ver Todas las notificaciones</a></div>  -->
                   <a href="verIntranetHome" class="boton_2">Ver Todas las notificaciones</a>
                </div>
     	</li>     	   
     </ul>
     
      
     <ul class="nav navbar-nav navbar-right">
       	<li><a href="logout">Salir</a></li>
     </ul>
      
    </div>
  </div>
</div>  
</div>




