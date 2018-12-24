function SignUpCheck(form){
    var fname = form.fname.value;
    var lname = form.lname.value;
    var uname = form.uname.value;
    var gender = form.gender.value;
    var email = form.email.value;
    var pass1 = form.password1.value;
    var pass2 = form.password2.value;
    re = /[0-9]/;
    re2 = /[a-z]/;
    if(fname === ""){
        alert("Please enter First Name");
        return false;
    }
    else if(lname === ""){
        alert("Please enter Last Name");
        return false;
    }
    else if(uname === ""){
        alert("Please enter Username");
        return false;
    }
    else if(email === ""){
        alert("Please enter your email");
        return false;
    }
     else if(gender === ""){
        alert("Please select your gender");
        return false;
    }
    else if(pass1 === ""){
        alert("Please Enter Password");
        return false;
    }
     else if(pass1.length < 8){
        alert("Password Should Contain at leat 8 Chars");
        return false;
    }
    else if(!re.test(pass1) || !re2.test(pass1)){
        alert("Password Should contain at least a number and a char");
        return false;
    }
    else if(pass2 === ""){
        alert("Please Confirm Password");
        return false;
    }
    else if(pass1 !== pass2){
        alert("Passwords do not match");
        return false;
    }
    else{
        alert("Great Job");
        return true;
    }
}
function LoginCheck(form){
    var lemail = form.lEmail.value;
    var lpass = form.lPass.value;
    if(lemail === ""){
        alert("Please Enter Email");
        return false;
    }
    else if(lpass === ""){
        alert("Please Enter Password");
        return false;
    }
    else{
        alert("Great Job");
        return true;
    }
}

function sendMessageFormCheck(form){
    var sendTo = form.sendTO.value;
    var title = form.messTitle.value;
    if(sendTo === ""){
        alert("Please enter recipient email");
        return false;
    }
    else if(title === ""){
        alert("You did not put any title for you Message. Do not worry We will still send it!");
        alert("Message Sent Successfully!");
        return true;
    }
    else
    {
        alert("Message Sent Successfully!");
    }
    return true;
}

function enableForm(form){
    var fname = form.fname.value;
    var lname = form.lname.value;
    var email = form.email.value;
    var pass1 = form.password1.value;
    var pass2 = form.password2.value;
    var editButton = form.editButton.value;
    
    fname.disabled === false;
    lname.disabled === false;
    email.disabled === false;
    pass1.disabled === false;
    pass2.disabled === false;
    
  
}