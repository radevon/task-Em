/**
 * 
 */
 //загрузка блока с комментариями по каждой статье
 function loadComments(idBlock){ 
	  	fetch('./api/comments/'+idBlock)
   	  		.then(response => response.json())
   	  		.then(items => {
   			let container=document.querySelector("#c-"+idBlock);
   			let el='';
   			for(let c of items){
				let delIcon='<span title="Удалить комментарий" class="del-ico" onclick="deleteComment('+idBlock+','+c.commentId+')">X</span>';
  				el+='<blockquote><span class="user-info">'+c.user.userName+'</span> от <span class="comment-date">'+ (new Date(c.dateAt)).toLocaleDateString()+'</span>: <i>'+c.commentText+'</i>'+(globalCurrentUserName==c.user.userName?delIcon:'')+'</blockquote>';
     		}
  			container.innerHTML=el;
  	  		});
  	  }
  	  	  
// возвращает куки с указанным name,
// или undefined, если ничего не найдено
function getCookie(name) {
  let matches = document.cookie.match(new RegExp(
    "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
  ));
  return matches ? decodeURIComponent(matches[1]) : undefined;
}

// Добавление комментария
function addComment(idBlock){
	event.preventDefault();
  	const text=document.querySelector("#comment-text-"+idBlock).value;
 	if(text.trim()=='')
  	 return false;
          		
  	 let comment={textId:idBlock,commentText:text};
  	 fetch('./api/comment/',
  	  { method: 'POST',
  	    headers: {'Content-Type': 'application/json;charset=utf-8' },
  		body: JSON.stringify(comment)})
  	  	.then(response => response.json())
  	  	.then(items => {
  	  		document.querySelector("#comment-text-"+idBlock).value='';
  	  		loadComments(idBlock);
  		});
  }
  
  // удаление своего комментария, который оставлял пользователь
 function deleteComment(idBlock,idComment){ 
	fetch('./api/comment/'+idComment,
  	  { method: 'DELETE' })
  	  	.then(response => response.json())
  	  	.then(items => {
  	  		loadComments(idBlock);
  		});
}