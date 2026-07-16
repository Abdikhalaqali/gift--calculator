function calculateGift(){

    let close = Number(document.getElementById("close").value);
    let annoy = Number(document.getElementById("annoy").value);
    let budget = Number(document.getElementById("budget").value);

    let score = (close * 30) + (annoy * 20);

    let amount = Math.round((score / 200) * budget);

    let message = "";

    if(amount < budget * 0.25){
        message = "A thoughtful card is enough 😊";
    }
    else if(amount < budget * 0.5){
        message = "A nice small gift 🎁";
    }
    else if(amount < budget * 0.75){
        message = "A great gift! ❤️";
    }
    else{
        message = "Go all out! They'll love it! 🎉";
    }

    document.getElementById("result").innerHTML =
        `<h2>Recommended Gift Budget</h2>
         <h1>KES ${amount}</h1>
         <p>${message}</p>`;
}
