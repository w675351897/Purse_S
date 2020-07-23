<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>

	<head>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link href="css/mui.css" rel="stylesheet" />
		<link rel="icon" href="https://jscdn.com.cn/highcharts/images/favicon.ico">

		<script src="https://code.highcharts.com.cn/highcharts/highcharts.js"></script>
		<script src="https://code.highcharts.com.cn/highcharts/modules/exporting.js"></script>
			<script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
	</head>

	<body>
		<div id="container" style="min-width:400px;height:400px"></div>
		<script src="js/mui.js"></script>
		<script type="text/javascript">
			Highcharts.chart('container', {
				chart: {
					plotBackgroundColor: null,
					plotBorderWidth: null,
					plotShadow: false,
					type: 'pie'
				},
				title: {
					text: '当月花销'
				},
				tooltip: {
					pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
				},
				plotOptions: {
					pie: {
						allowPointSelect: true,
						cursor: 'pointer',
						dataLabels: {
							enabled: true,
							format: '<b>{point.name}</b>: {point.percentage:.1f} %',
							style: {
								color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
							}
						}
					}
				},
				series: [{
					name: 'Brands',
					colorByPoint: true,
					data: [{
						name: '一般',
						y: 61.41,
						sliced: true,
						selected: true
					}, {
						name: '餐饮',
						y: 11.84
					}, {
						name: '购物',
						y: 10.85
					}, {
						name: '服饰',
						y: 14.67
					}, {
						name: '交通',
						y: 4.18
					}, {
						name: '娱乐',
						y: 1.64
					}, {
						name: '社交',
						y: 1.6
					}, {
						name: '居家',
						y: 1.2
					},{
					name: '通讯',
						y: 2.61
					}
					]
				}]
			});
			mui.init()
		</script>
	</body>

</html>
