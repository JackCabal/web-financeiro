$(function () {
    $('.datepicker').datepicker({
        language: "es",
        autoclose: true,
        format: "dd/mm/yyyy"
    });
});



function addItemToList() {
    var list = document.getElementById("list");
    var description = document.getElementById("inputGroup-sizing-default").value;
    var money = document.getElementById("money").value;
    var costCenter = parseInt(document.getElementById("inputGroupSelect02").value);
    var typeCost = parseInt(document.getElementById("inputGroupSelect01").value);
    var date = document.getElementById("fecha1").value;

    var iconeCostCenter;
    var textCostCenter;
    switch (costCenter) {
        case 1:
            iconeCostCenter = '<i class="ph-fill ph-house-line"></i>';
            textCostCenter = '<div class="text">Casa</div>';
            break;
        case 2:
            iconeCostCenter = '<i class="ph-fill ph-briefcase"></i>';
            textCostCenter = '<div class="text">Trabalho</div>';
            break;
        case 3:
            iconeCostCenter = '<i class="ph-fill ph-currency-circle-dollar"></i>';
            textCostCenter = '<div class="text">Recebimento</div>';
            break;
    }
    var historicoTypeCon = null;


    var item1 = '<div class="item col">' + iconeCostCenter + textCostCenter + '</div>';
    var item2 = '<div class="item col-4 text">' + $("#descricao").val() + '</div>';

    var item3 = '<div class="item col text">' + date + '</div>';
    var item4 = '<div class="item col text"> R$ ' + money + ',00</div>';
    // tipo de custo: 1 = receita, 2 = custo
    if (typeCost == 1) {
        historicoTypeCon = '<div class="historico-receita">' + item1 + item2 + item3 + item4 + '</div> <button onclick="deleteElement();" type="button" id="close" class="btn btn-sm btn-danger ml-1">x</button>';
    } else if (typeCost == 2) {
        historicoTypeCon = '<div class="historico-custo">' + item1 + item2 + item3 + item4 + '</div> <button onclick="deleteElement();" type="button" id="close" class="btn btn-sm btn-danger ml-1">x</button>';
    }
    var historicoCon = '<div class="historico-container">' + historicoTypeCon + '</div>';

    $("#list").append(historicoCon);


}

function deleteElement() {
    $(".btn-danger").click(function () {
        $(this).closest(".historico-container").remove();
    })
}


//WINDOWS + V ATALHO DE TRANSFERENCIA