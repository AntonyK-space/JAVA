let data;
function init(){
	$.ajaxSetup({async: false});

	let link = "https://friendly-waddle-4jv75qgjg5p7hj5g7-8500.app.github.dev";
	let route = "/songs"
	songs = $.getJSON(link+route).responseJSON;

	generateCards(songs)
}

function generateCards(songs){
	let output = document.getElementById("output");
	let bld = "";
	for(let x = 0; x < songs.length; x++){
		let song = songs[x];
		bld +=`<h1>Song Name: ${song.Name}</h1>`;
		bld +=`<h2>Composer: ${song.Composer}</h2>`;
		bld +=`<h3>Unit Price: ${song.UnitPrice}</h3>`;
		bld +='<hr>'
	}
	output.innerHTML = bld;
}



