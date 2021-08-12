function goDelNotice(n){
	let ok = confirm('삭제하시겠습니까?')
	if(ok){
		location.href="notice.del?n_no=" + n;
	}
}

function goUpdateNotice(n){
	let ok = confirm('수정하시겠습니까?')
	if(ok){
		location.href="goUpdateNotice?n_no=" + n;
	}
}

function goDelStory(n){
	let ok = confirm('삭제하시겠습니까?')
	if(ok){
		location.href="story.del?s_no=" + n;
	}
}

function goUpdateStory(n){
	let ok = confirm('수정하시겠습니까?')
	if(ok){
		location.href="goUpdateStory?s_no=" + n;
	}
}