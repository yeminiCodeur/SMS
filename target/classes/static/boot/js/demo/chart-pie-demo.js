// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Pie Chart Example
var ctx1 = document.getElementById("myPieChart");
var myPieChart1 = new Chart(ctx1, {
  type: 'pie',
  data: {
    labels: ["Blue", "Red", "Yellow", "Green"],
    datasets: [{
      data: [12.21, 15.58, 11.25, 8.32],
      backgroundColor: ['#007bff', '#dc3545', '#ffc107', '#28a745'],
    }],
  },
});


var ctx2 = document.getElementById("pie");
var myPieChart2 = new Chart(ctx2, {
	  type: 'pie',
	  data: {
	    labels: ["Blue", "Red", "Yellow", "Green", "Black"],
	    datasets: [{
	      data: [12.21, 15.58, 11.25, 8.32, 6.32],
	      backgroundColor: ['#007bff', '#dc3545', '#ffc107', '#28a745'],
	    }],
	  },
	});
	
