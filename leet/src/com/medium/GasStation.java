package com.medium;

public class GasStation {

	public int canCompleteCircuit(int[] gas, int[] cost){
		if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
			return -1;
		}
		int rem = 0;
		int total = 0;
		int index = -1;
		
		for (int i = 0; i < gas.length; i++) {
			rem += gas[i] - cost[i];
			total += gas[i] - cost[i];
			if (rem < 0) {
				index = i;
				rem = 0;
			}
		}
		return total < 0 ? -1 : index + 1;
	}
}
