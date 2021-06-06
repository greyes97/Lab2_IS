var parameters = {
    target: '#myFunction',
    data: [{
        fn: 'sin(x)',
        color: 'red'
    }],
    grid: true,
    yAxis: {domain: [-1, 1]},
    xAxis: {domain: [0, 2*Math.PI]}
};

function plot() {
    var f = document.querySelector("#function").value;
    var color = document.querySelector("#color").value;
    document.getElementById("color").style.display = 'none';
    parameters.data[0].fn = f;
    parameters.xAxis.domain = [-15, 15];
    parameters.yAxis.domain = [-10, 10];
    parameters.data[0].color = color;

    functionPlot(parameters);
}




