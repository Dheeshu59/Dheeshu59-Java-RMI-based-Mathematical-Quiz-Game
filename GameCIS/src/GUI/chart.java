package GUI;
import java.io.IOException;


import io.quickchart.QuickChart;
public class chart {
	
		public static String getResults(String[] []data) {
			
			{
		        QuickChart chart = new QuickChart();
				chart.setWidth(500);
				chart.setHeight(300);
				chart.setConfig("{\n" +
		                "  type: 'doughnut',\n" +
		                "  data: {\n" +
		                "    datasets: [\n" +
		                "      {\n" +
		                "        data: ["+Integer.parseInt(data[0][1])+", "+Integer.parseInt(data[1][1])+","+Integer.parseInt(data[2][1])+" ,"+Integer.parseInt(data[3][1])+""
		                        + " ,"+Integer.parseInt(data[4][1])+" ], \n" +
		                "        backgroundColor: [ 'rgb(255, 99, 132)', 'rgb(255, 159, 64)','rgb(255, 205, 86)', 'rgb(75, 192, 192)', 'rgb(54, 162, 235)', 'rgb(180, 109, 222)' ],\n" +
		                "      },\n" +
		                "    ],\n" +
		                "    labels: ['"+data[0][0]+"', '"+data[1][0]+"', '"+data[2][0]+"','"+data[3][0]+"','"+data[4][0]+"'],\n" +
		                "  },\n" +
		                "  options: {\n" +
		                "    plugins: {\n" +
		                "      datalabels: {\n" +
		                "        formatter: (value) => {\n" +
		                "          return value + '%';\n" +
		                "        }\n" +
		                "      }\n" +
		                "    }\n" +
		                "  }\n" +
		                "}"
				);
		                

				System.out.println(chart.getShortUrl());
		                String url ="https://quickchart.io/chart?c=%7B%0A%20%20type%3A%20%27bar%27%2C%0A%20%20data%3A%20%7B%0A%20%20%20%20labels%3A%20%5B%27Q1%27%2C%20%27Q2%27%2C%20%27Q3%27%2C%20%27Q4%27%5D%2C%0A%20%20%20%20datasets%3A%20%5B%7B%0A%20%20%20%20%20%20label%3A%20%27Users%27%2C%0A%20%20%20%20%20%20data%3A%20%5B50%2C%2060%2C%2070%2C%20180%5D%0A%20%20%20%20%7D%2C%20%7B%0A%20%20%20%20%20%20label%3A%20%27Revenue%27%2C%0A%20%20%20%20%20%20data%3A%20%5B100%2C%20200%2C%20300%2C%20400%5D%0A%20%20%20%20%7D%5D%0A%20%20%7D%0A%7D%0A" ;
		                
		                return url;
		    }

	    }
	

public static String getCA(String [][] data)
{
    QuickChart chart = new QuickChart();
	chart.setWidth(500);
	chart.setHeight(300);
	chart.setConfig("{\n" +
            "  type: 'doughnut',\n" +
            "  data: {\n" +
            "    datasets: [\n" +
            "      {\n" +
            "        data: ["+Integer.parseInt(data[0][1])+", "+Integer.parseInt(data[1][1])+"],\n" +
            "        backgroundColor: [ 'rgb(255, 99, 132)', 'rgb(255, 159, 64)', ],\n" +
            "      },\n" +
            "    ],\n" +
            "    labels: ['"+data[0][0]+"', '"+data[1][0]+"'],\n" +
            "  },\n" +
            "  options: {\n" +
            "    plugins: {\n" +
            "      datalabels: {\n" +
            "        formatter: (value) => {\n" +
            "          return value + '%';\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}"
	);
            

	System.out.println(chart.getShortUrl());
            String url = "https://quickchart.io/sandbox/#%7B%0A%20%20type%3A%20'pie'%2C%0A%20%20data%3A%20%7B%0A%20%20%20%20labels%3A%20%5B'Q1'%2C%20'Q2'%2C%20'Q3'%2C%20'Q4'%5D%2C%0A%20%20%20%20datasets%3A%20%5B%7B%0A%20%20%20%20%20%20label%3A%20'Users'%2C%0A%20%20%20%20%20%20data%3A%20%5B50%2C%2060%2C%2070%2C%20180%5D%0A%20%20%20%20%7D%2C%20%7B%0A%20%20%20%20%20%20label%3A%20'Revenue'%2C%0A%20%20%20%20%20%20data%3A%20%5B100%2C%20200%2C%20300%2C%20400%5D%0A%20%20%20%20%7D%5D%0A%20%20%7D%0A%7D%0A";
            
            return url;
}
}

