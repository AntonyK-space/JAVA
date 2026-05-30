let data;
function init(){
	$.ajaxSetup({async: false});

	let link = "https://friendly-waddle-4jv75qgjg5p7hj5g7-8300.app.github.dev";
	let route = "/games"
	games = $.getJSON(link+route).responseJSON;

	generateCards1(games)
}

function init0(){
	$.ajaxSetup({async: false});

	let link = "https://friendly-waddle-4jv75qgjg5p7hj5g7-8300.app.github.dev";
	let route = "/games"
	games = $.getJSON(link+route).responseJSON;

	filter_1(games)
}

function generateCards(games){
	let output = document.getElementById("output");
	let bld = "";
	for(let x = 0; x < games.length; x++){
		let game = games[x];
		bld +='<div id ="output" class="card">';
		bld +=`<h1>Game Name: ${game.gameName}</h1>`;
		bld +=`<h2>Developer: ${game.gameDeveloper}</h2>`;
		bld +=`<h3>Game Genre: ${game.gameType}</h3>`;
		bld +='</div>';
	}
	output.innerHTML = bld;
}

function generateCards1(games){
	let output = document.getElementById("output");
	let bld = "";
	for(let x = 0; x < games.length; x++){
		let game = games[x];
			bld +=`<div class="row">`;
			bld +=`<div class="column">`;
			bld +=`<div class="flip-card">`;
			bld +=`<div class="flip-card-inner">`;
			bld +=`<div class="flip-card-front">`
			bld +=`<h1>Game Name: ${game.gameName}</h1>`
			bld +=`</div>`;
			bld +=`<div class="flip-card-back">`;
			bld +=`<h1>Developer: ${game.gameDeveloper}</h1>`;
			bld +=`<h2>Game Genre: ${game.gameType}</h2>`;
			bld +=`</div>`;
			bld +=`</div>`;
			bld +=`</div>`;
			bld +=`</div>`;
			bld +=`</div>`;
	}
	output.innerHTML = bld;
}


function filter_0(games){
	let gameType = parseInt(document.getElementById("type").value);
	let output = document.getElementById("output");
	let bld = "";
	for(let i = 0; x < games.length; i++){
		let game = games[i];
		if(game.gameType == gameType){
			bld +=`<div class="row">`;
			bld +=`<div class="column">`;
			bld +=`<div class="flip-card">`;
			bld +=`<div class="flip-card-inner">`;
			bld +=`<div class="flip-card-front">`
			bld +=`<h1>Game Name: ${game.gameName}</h1>`
			bld +=`</div>`;
			bld +=`<div class="flip-card-back">`;
			bld +=`<h1>Developer: ${game.gameDeveloper}</h1>`;
			bld +=`<h2>Game Genre: ${game.gameType}</h2>`;
			bld +=`</div>`;
			bld +=`</div>`;
			bld +=`</div>`;
			bld +=`</div>`;
			bld +=`</div>`;
		}
	}
	output.innerHTML = bld;
}