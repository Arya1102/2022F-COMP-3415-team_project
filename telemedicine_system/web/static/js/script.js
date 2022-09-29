$(document).ready(function() {
    $("#res_reg").hide();
    $("#res_login").hide();
    $("#med_reg").hide();
    $("#med_login").hide();

    $("#res_reg_btn").click(function() {
        $("#res_reg").show();
        $("#res_login").hide();
        $("#med_reg").hide();
        $("#med_login").hide();
    })

    $("#res_login_btn").click(function() {
        $("#res_reg").hide();
        $("#res_login").show();
        $("#med_reg").hide();
        $("#med_login").hide();
    })

    $("#med_reg_btn").click(function() {
        $("#res_reg").hide();
        $("#res_login").hide();
        $("#med_reg").show();
        $("#med_login").hide();
    })

    $("#med_login_btn").click(function() {
        $("#res_reg").hide();
        $("#res_login").hide();
        $("#med_reg").hide();
        $("#med_login").show();
    })

    
})