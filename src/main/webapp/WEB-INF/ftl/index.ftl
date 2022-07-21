<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Главная страница материалов</title>
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script src="resources/js/script.js"></script>
    
</head>
<body>
	<script type="text/javascript">
	let globalCurrentUserName='${auth.getName()}';
	</script>

	<nav>
    <div class="nav-wrapper">
      <ul id="nav-mobile" class="right">
        <li><a href="./">Все материалы</a></li>
        <li class="red"><a href="./logout">Выйти из ${auth.getName()}</a></li>
      </ul>
    </div>
  </nav>
  
  <div class="container">
  <h2>Список полезных материалов</h2>
   <#list texts as text>
             <div class="row">
			    <div class="col s12">
			      <div class="card-panel note">
			        <span>
			        	${text.textContent}
			        </span>
			        <span class="badge green white-text">${text.getPublishDateAsString()}</span>
			        
			        <hr/>
			        <small><b>Комментарии:</b></small>
			        <div class="comments" id="c-${text.textId}">			        
			        </div>
			        <div class="add-block">
			        	 <textarea id="comment-text-${text.textId}" class="tx-area"></textarea>
          				 <a class="btn lime darken-4" href="#" onclick="addComment(${text.textId})">Добавить комментарий</a>
			        </div>
			        
			        <script type="text/javascript">
			        	loadComments(${text.textId});
			        </script>
			      </div>
			    </div>
			  </div>
   </#list>
  
  </div>
  
 
</body>
</html>