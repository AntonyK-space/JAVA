let data;

async function init(){
	link = ("https://friendly-waddle-4jv75qgjg5p7hj5g7-8500.app.github.dev/songs");
	info = await fetch(link);
	data = await info.json();
}

function filter(){
	let year = parseInt(document.getElementById("year").value);
	let output = document.getElementById("output");
	let build = "";
	for (let i = 0; i < data.length; i++){
		let info = data[i];
		if(info.year == year){
			build +=`<div class="row">`;
			build +=`<div class="column">`;
			build +=`<div class="flip-card">`;
			build +=`<div class="flip-card-inner">`;
			build +=`<div class="flip-card-front">`
			build +=`<h1>Song Name: ${info.Name}</h1>`
			build +=`</div>`;
			build +=`<div class="flip-card-back">`;
			build +=`<h2>Composer: ${info.Composer}</h2>`;
			build +=`<h3>Unit Price: ${info.UnitPrice}</h3>`;
			build +=`</div>`;
			build +=`</div>`;
			build +=`</div>`;
			build +=`</div>`;
			build +=`</div>`;
		}
	}
	output.innerHTML= build;
}



