//問1

/*function circleArea(area,pi=3.14){
    return(area*area)*pi;
}

document.write(circleArea(5)+"<br>");
document.write(circleArea(7)+"<br>");
document.write(circleArea(10)+"<br>");*/


//問2

function totalPrice(number1,number2,adult=500,child=200){
    return(adult*number1)+(child*number2);
}

//A
document.write(totalPrice(2,4));
document.write("<br>");
//B
document.write(totalPrice(1,5));
document.write("<br>");
//C
document.write(totalPrice(3,7));
document.write("<br>");