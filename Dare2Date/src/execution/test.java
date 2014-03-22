package execution;

import global.GlobalVariables;

import java.util.ArrayList;

import account.VIPSubscriber;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GlobalVariables mVariables = GlobalVariables.getInstance();
		
		ArrayList<VIPSubscriber> subscriberList = mVariables.getVipList();
		
		for(int i = 0; i < subscriberList.size(); i++){
			System.out.println(subscriberList.get(i).getFirstName() + " " + subscriberList.get(i).getLastName());
			System.out.println(subscriberList.get(i).getEducation() + " " + subscriberList.get(i).getGender());
			System.out.println(subscriberList.get(i).getInterests().get(0) + " " + subscriberList.get(i).getInterests().get(1));
			System.out.println(subscriberList.get(i).getEmail()+ " " +subscriberList.get(i).getPassword());
			System.out.println();
		}
		
	}

}
