package test;

import org.jblas.DoubleMatrix;
import doubleMatrix.Concat;
import model.filterModel;
import model.ModelKF;
import Jama.*;

import trueSolution.TrueinGround;
import trueSolution.TrueSolution;
import filters.Estimation;
import targetGroundTruth.*;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {

		int cells=2;

	    TargetGroundTruth groundtruth=new GroundTruth(cells);


	    Estimation.exportResult(groundtruth, 100, "SensorSchedule_KFSM");
	}	
}
