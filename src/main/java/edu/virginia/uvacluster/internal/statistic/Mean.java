package edu.virginia.uvacluster.internal.statistic;

import java.util.List;

import edu.virginia.uvacluster.internal.Cluster;

public class Mean extends Statistic {

	public Mean(StatisticRange range) {
		super(range, "mean");
	}

	public double transform(List<Double> values, Cluster cluster) {
		double mean = 0;
	    double sum = 0;
	    double numElements = values.size();

	    for (Double value: values)
	    {
	      sum += value;
	    }

	    if (numElements > 0)
	      mean = sum/numElements;
	    
	    return mean;
	}
}
