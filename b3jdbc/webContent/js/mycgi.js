/**
 * Company wide js
 */
console.log("In js file line 1");
x = "Hello World";
y = new Date();
z=x+" today is "+y;
// document.write(z);


function validate(){
	submit = true;
	if(document.getElementsByName("fname")[0].value==""){
		submit=false;
		
		// document.getElementsByName("fname")[0].style.border="1px solid red";
		document.getElementsByName("fname")[0].focus;
		document.getElementsByName("errFname")[0].innerHTML="Firstname cannot be null";
	}
	
	if(!document.getElementsByName("gender")[0].checked) {
		if(!document.getElementsByName("gender")[1].checked){
		submit=false;
		document.getElementsByName("errRd")[0].innerHTML="Select a radio btn for gender";
		document.getElementsByName("errRd")[0].style = "color:red;"
		document.getElementsByName("gender")[0].style.outline = "1px solid red";
		console.log("In radio check");
		
		}
	}
	return submit;
}

y="inital val";

function echo(){
	y= "Echo msg";
	console.log(y);
}

function printMsg(y){
	console.log(y);
	
}

function callerFunction(x){
	setTimeout(echo,3000);
	x(y);
}



printMsg("via pmsg");
callerFunction(printMsg);

function successHand(){
	console.log("success");
}

function errorHand(){
	console.log("error");
}

pmf = function(sh,eh){
	x =1;
	if(x==0){sh();};
	if(x!=0){eh();};
	
}

pm = new Promise(pmf);
pm.then(
	function(){console.log("Successff");},
	function(){console.log("ErrorSf");}
	
);
pm.then(successHand,errorHand);
