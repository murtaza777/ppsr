$(document).ready(function () {
    //var fieldPosition = 0;
    $("#dropdown").change(function () {
        //fieldPosition++;
        var select = $("#dropdown").val();
        if (select == 'blank') {
            $("#requestForm").remove()
        }
        else {
            $("#requestForm").remove()
            $.get("./" + select,
                function (data) {
                    $("#selection").after(data);
                });
        }
    });
});