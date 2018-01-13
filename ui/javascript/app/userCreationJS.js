'use strict';
function populateStateDropDown() {
   $.ajax({
      url: "http://localhost:8080/getListOfStates",
      type: "GET",
      async: false,
      success: function (result) {
         _.forEach(result, function (value) {
            $('#state').append('<option>' + value + '</option>');
         });
      }
   });
}

function populateOperationCityDropDown() {
   var stateName = $('#state').find(":selected").text();
   console.log("function called for ...", stateName);
   $.ajax({
      url: "http://localhost:8080/getOpsCity?state=" + stateName,
      type: "GET",
      async: false,
      success: function (result) {
         if (_.isEmpty(result) && stateName != "Select State") {
            $('#usercityinfo').show();
         } else {
            $('#usercityinfo').hide();
            _.forEach(result, function (value) {
               $('#city').append('<option>' + value + '</option>');
            });
         }
      }
   });

}

function formValidates() {
   return true;
}

function validateEmailMailIdExists() {

}

function addListeners() {
   var emailText = document.getElementById("email");

   emailText.addEventListener("focusout", function () {
      validateEmailMailIdExists();
   }, false);
}

function checkPasswordMatch() {
   var password = document.getElementById("pwd");
   var password_confirm = document.getElementById("pwd_confirm");

   if (password.value != password_confirm.value) {
      password_confirm.setCustomValidity("Password should match !!");
   } else {
      password_confirm.setCustomValidity("");
   }
}

function submitUserCreationForm() {
   var firstName = document.getElementById("firstName").value;
   var middleName = document.getElementById("middleName").value;
   var lastName = document.getElementById("lastName").value;
   var primaryMobile = document.getElementById("primaryMobile").value;
   var secondaryMobile = document.getElementById("secondaryMobile").value;
   var emailId = document.getElementById("email").value;
   var password = document.getElementById("pwd").value;
   var addressLine1 = document.getElementById("addressLine1").value;
   var addressList2 = document.getElementById("addressLine2").value;
   var state = $("#state option:selected").val();
   var city = $("#city option:selected").val();
   var pincode = document.getElementById("pincode").value;
   var landmark = document.getElementById("landmark").value;

   var requestBody = {
      personalInfo: {
         password: password,
         firstName: firstName,
         middleName: middleName,
         lastName: lastName,
         primaryMobileNumber: primaryMobile,
         secondaryMobileNumber: secondaryMobile,
         registeredEmailId: emailId,
         addresses: [
            {
               addressLine1: addressLine1,
               addressList2: addressList2,
               city: city,
               state: state,
               country: 'India',
               landmark: landmark,
               pincode: pincode,
               isAddressPrimary: true
            }
         ]
      }
   };
    
var json_payload = JSON.stringify(requestBody )
   $.ajax({
      url: "http://localhost:8080/user/insert",
      type: "POST",
      data: json_payload,
      async: false,
      contentType: "application/json;charset=utf-8",
      success: function (result) {
         /*  _.forEach(result, function (value) {
          $('#state').append('<option>' + value + '</option>');
          });*/
         console.log("somehting")
      }
   });

}
