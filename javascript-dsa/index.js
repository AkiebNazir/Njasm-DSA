// // window.alert("this is a warning")
// //print to console
// console.log("what is you name")

// // take input from prompt and print it to console
// let username1 = window.prompt("what is Your name");
// console.log(username1)

// // take input form html input text box and change the label:
// let username
// document.getElementById("mysubmit").onclick = function() {
//     username = document.getElementById("mytext").value;
//     console.log(username)
//     document.getElementById("mylabel").innerHTML = "hello " + username
// }

// -------------------***************************************-----------------

// manual counter;
// let counter
// document.getElementById("increase").onclick = function() {
//     counter += 1 

//     document.getElementById("counter").innerHTML = counter
// }
// document.getElementById("reset").onclick = function() {
//     counter = 0
//     document.getElementById("counter").innerHTML = counter
// }
// document.getElementById("decrease").onclick = function() {
//     counter -= 1
//     document.getElementById("counter").innerHTML = counter
// }
// -----------**************************************------------
//888888888888888888888888888888888888888888888888888



//888888888888888888888888888888888888888888888888888
// string --- methods ..... indexing/lower/upper/replace
// document.getElementById("replaceb").onclick = function(){
//     let entered_text = document.getElementById("inputbox").value
//     let tor = document.getElementById("replaceto").value
//     let withr = document.getElementById("replacewith").value
//     let alpha = document.getElementById("letter").value
//     let ind = document.getElementById("indexl").value
//     let index_of = entered_text.indexOf(alpha)
//     let lett = entered_text.charAt(ind)
//     document.getElementById("out1").innerHTML = index_of
//     document.getElementById("out").innerHTML = lett
//     let upper = entered_text.toUpperCase()
//     let lower = entered_text.toLowerCase()
//     document.getElementById("out2").innerText = upper
//     document.getElementById("out3").innerText = lower
//     result_text = entered_text.replaceAll(tor, withr)
//     document.getElementById("result").innerText = result_text
// }

// let myname = "Hello Akieb"
// document.getElementById("titlebar").innerHTML = myname
// -------------------------*************************-------------------

// if conditions in javascript

// document.getElementById("subbutton").onclick = function(){
//     let age = document.getElementById("inbox").value
//     console.log(age)

    // if (age > 120){
    //     document.getElementById("display").innerHTML = 
    //     "Please enter a valid value"
    // }
    // else if (age >= 64){
    //     document.getElementById("display").innerHTML = 
    //     "You are a senior citizen"
    // } else if (age >= 18){
    //     document.getElementById("display").innerHTML = 
    //     "You are an adult"

    // } else if (age < 0){
    //     document.getElementById("display").innerHTML = 
    //     "You are not Born YET ....!"
    // } else if(age < 18) {
    //     document.getElementById("display").innerHTML = 
    //     "you are not an adult yet ... !"
    // }
    //     else {
    //     document.getElementById("display").innerHTML =
    //     "please enter a number value between 1 to 120"
    // }

    // switch(true){
    //     case age > 10:
    //         document.getElementById("display").innerHTML = 
    //         "The entered age is above ten"
    //         break
    //     default:
    //         document.getElementById("display").innerHTML = 
    //         "printing the default text line"

    // }
// }


let age = checkFunc(18)
console.log(age)

function checkFunc(num){
    return num >=18 ? "you are above 18" : "you are not adult yet"
}

// unique elements in an array ... !
function uniqueArrayElements(arr){
    let i = 0;
    let j = 1;
    while (j < arr.length){
        if (arr[i]===arr[j]){
            j += 1;
        } else {
            i += 1;
            arr[i] = arr[j];    
        }
    }
    return arr.slice(0, i+1)
}

let arr = [1,1,1,2,2,2,3,4,5,5,5]
arr = uniqueArrayElements(arr)
const elementArray =  document.getElementById("return_array");
elementArray.innerHTML = "Result is: "  + "<p>"+ "[" +arr+"]"+"</p>"
elementArray.classList.add("result")


function uniqueArrayUsingFor(arr){
    let i = 0
    for(let  j= 1; j < arr.length; j++){
       if (arr[i] !==arr[j]) {
            i += 1;
            arr[i] = arr[j];
        }     
    }
    return arr.slice(0, i+1)
} 


let arr1 = [1,1,1,2,2,2,3,4,5,5,5]
const forArray = document.getElementById("for_loop");
forArray.innerHTML = uniqueArrayUsingFor(arr1)



function maxSubArraySum(arr, num){
    let maxNum = 0
    let tempNum = 0
    if(arr.length < num){
        return -1
    }
    for(let i = 0; i < num; i++){
        tempNum += arr[i]
    }
    maxNum = tempNum
    for (let i = 0; i < arr.length-num; i++){
        tempNum = tempNum - arr[i] + arr[num + i]
        if (tempNum > maxNum){
            maxNum = tempNum
        }
    }
    return maxNum
}

let arr2 = [1,2,6,7,4,9,6,8,7,9]
let num = 3
const logMaxNum = document.getElementById("max_num");
logMaxNum.innerHTML = maxSubArraySum(arr2, num) 







