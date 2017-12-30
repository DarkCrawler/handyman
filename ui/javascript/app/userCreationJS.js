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

function submitUserForCreation() {
   
}