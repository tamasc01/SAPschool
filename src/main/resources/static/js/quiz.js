var score = 0; //Set score to 0
var total = 3; //Total number of questions
var point = 1; //Points per correct answer
var highest = total * point;

//Initializer
function init(){
	// set correct answers
	sessionStorage.setItem('a1','c');
	sessionStorage.setItem('a2','d');
	sessionStorage.setItem('a3','d');
}


// Hide all questions
$('.questionForm').hide();

//Show first question
$('#q1').show();

$('#q1 #submit').click(function(){
	$('.questionForm').hide();
	process('q1');
	$('#q2').fadeIn(300);
	return false;
});

$('#q2 #submit').click(function(){
	$('.questionForm').hide();
	process('q2');
	$('#q3').fadeIn(300);
	return false;
});

$('#q3 #submit').click(function(){
	$('.questionForm').hide();
	process('q3');
	$('#results').fadeIn(300);
	return false;
});

//Process the answer
function process(q){
	if(q == "q1"){
		var submitted = $('input[name=q1]:checked').val();
		if(submitted == sessionStorage.a1){
			score++;
		}
	}
	
	if(q == "q2"){
		var submitted = $('input[name=q2]:checked').val();
		if(submitted == sessionStorage.a2){
			score++;
		}
	}	

	if(q == "q3"){
		var submitted = $('input[name=q3]:checked').val();
		if(submitted == sessionStorage.a3){
			score++;
		}
		$('#results').html('<h3>Elért pontok száma: '+score+' a maximum 3-ból.</h3><a href="quiz">Teszt újra kitöltése!</a>');
	}
	return false;

}


//Add event listener
window.addEventListener('load',init,false);