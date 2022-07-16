<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login page</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <style type="text/css">
    
    	html, body{
    		height:100%;
    		background-color:#f2f2f2;
    	}
    	
    	.container{
    		display:flex;
    		justify-content: center;
    		align-items: center;  
    		height:100%;  		
    	}
    	
    	.login-panel{
    		width:500px;
    	}
 
    </style>
</head>
<body>
    <div class="container">
       
    	 <div class="login-panel card-panel">
    	 	<h3 class="center-align">Вход пользователя</h3>
    	   <div class="row">
    	   		
			   <form class="col s12" method="post">
			      <div class="row">
			        <div class="input-field col s12">
			          <input id="userName" name="userName" type="text" class="validate">
			          <label for="userName">Логин</label>
			        </div>
				  </div>
			      <div class="row">
			        <div class="input-field col s12">
			          <input id="password" name="password" type="password" class="validate">
			          <label for="password">Пароль</label>
			        </div>
			      </div>
			      <div class="row">
			        <div class="col s12 center-align">
			         <input type="submit" class="waves-effect waves-light btn-large" value="Войти"/>
			        </div>
			      </div>
			      
			    </form>
					       
            </div>
         </div>
                 
		
    </div>
    
</body>
</html>