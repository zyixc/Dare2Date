package global;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;

import account.Subscriber;
import account.VIPSubscriber;

public class GeneratedUsers {

	public enum firstName {
		David,
		Jessie,
		Jasmine,
		Brenda,
		Shari,
		Lowell,
		Deborah,
		Marcella,
		Kelvin,
		Kenneth,
		Eloise,
		Jorge,
		Jeanne,
		Angelica,
		Devin,
		Gretchen,
		Ashley,
		Janet,
		Kayla,
		Meghan,
		Homer,
		Nick,
		Angel,
		Mary;

	    public static firstName getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	}
	
	public enum lastName {
		Simmons,
		Guzman,
		Zimmerman,
		Peters,
		Fox,
		Green,
		Sanders,
		West,
		Powers,
		Knight,
		King,
		Murphy,
		Ball,
		Lyons,
		Fuller,
		Padilla,
		Vaughn,
		Jacobs,
		Gray,
		Moreno,
		Medina,
		Santiago,
		Burke,
		Brady,
		Sharp;

	    public static lastName getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	}
	
	@SuppressWarnings("static-access")
	public static GregorianCalendar generateRandomBirthDate(){
		
		 GregorianCalendar gc = new GregorianCalendar();
		 
		 int year = randBetween(1976, 1990);
		 
		 gc.set(gc.YEAR, year);

	     int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

	     gc.set(gc.DAY_OF_YEAR, dayOfYear);
		
	     return gc;

	}
	
	public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	public enum gender {
		male,
		female;

	    public static gender getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	}
	
	public enum sexualPreference {
		heterosexual,
		homosexual,
		bisexual;

	    public static sexualPreference getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	}
	
	public enum city {
		Amsterdam,
		Rotterdam,
		Hague,
		Utrecht,
		Eindhoven,
		Tilburg,
		Groningen,
		Almere;

	    public static city getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	}
	
	public enum education {
		HBO,
		MBO,
		WO;

	    public static education getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	}
	
	public enum interests {
		Skiing,
		Surfing,
		Gymnastics,
		Painting,
		Sculpting,
		Jewelry_making,
		Computer_games,
		Blogging,
		Fishing,
		Traveling,
		Swimming,
		Camping,
		Watching_movies,
		Birdwatching,
		Reading,
		Yoga,
		Food_critic,
		Football,
		Tennis,
		Dancing,
		Hunting,
		Photography,
		Gardening;

	    public static interests getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	}
	
	public static ArrayList<Subscriber> generateRandomSubscribers(){
		ArrayList<Subscriber> subscriberList = new ArrayList<Subscriber>();
		

		for(int i = 0; i < 100; i++){
			String firstname = firstName.getRandom().toString();
			String lastname = lastName.getRandom().toString();
			GregorianCalendar dateOfBirth = generateRandomBirthDate();
			String gendeR = gender.getRandom().toString();
			String sexualpreference = sexualPreference.getRandom().toString();
			String citY = city.getRandom().toString();
			String educatioN = education.getRandom().toString();
			
			ArrayList<String> interestS = new ArrayList<String>();
			for(int j = 0; j < 4; j++){
				String interest = interests.getRandom().toString();
				interestS.add(interest);
			}
			
			String hobie = "place holder";
			String description = "place holder";
			
			
			Random generator  = new Random();
			int nr = generator.nextInt(1000) + 100;
			String pass = Integer.toString(nr);		
			String email = firstname + pass + "@dare2date.com";
			
			Subscriber subscriber = new Subscriber(email, pass);
			
			subscriber.setfirstName(firstname);
			subscriber.setLastName(lastname);
			subscriber.setDateOfBirth(dateOfBirth);
			subscriber.setGender(gendeR);
			subscriber.setSexualPreference(sexualpreference);
			subscriber.setCity(citY);
			subscriber.setEducation(educatioN);
			subscriber.setInterests(interestS);
			subscriber.setHobies(hobie);
			subscriber.setDescription(description);
			
			subscriberList.add(subscriber);
		}
		
		return subscriberList;
	}

	public static ArrayList<VIPSubscriber> generateRandomVIP() {
		ArrayList<VIPSubscriber> vipList = new ArrayList<VIPSubscriber>();
		

		for(int i = 0; i < 30; i++){
			String firstname = firstName.getRandom().toString();
			String lastname = lastName.getRandom().toString();
			GregorianCalendar dateOfBirth = generateRandomBirthDate();
			String gendeR = gender.getRandom().toString();
			String sexualpreference = sexualPreference.getRandom().toString();
			String citY = city.getRandom().toString();
			String educatioN = education.getRandom().toString();
			
			ArrayList<String> interestS = new ArrayList<String>();
			for(int j = 0; j < 4; j++){
				String interest = interests.getRandom().toString();
				interestS.add(interest);
			}
			
			String hobie = "place holder";
			String description = "place holder";
			
			
			Random generator  = new Random();
			int nr = generator.nextInt(1000) + 100;
			String pass = Integer.toString(nr);		
			String email = firstname + pass + "@dare2date.com";
			
			Subscriber subscriber = new Subscriber(email, pass);
			
			subscriber.setfirstName(firstname);
			subscriber.setLastName(lastname);
			subscriber.setDateOfBirth(dateOfBirth);
			subscriber.setGender(gendeR);
			subscriber.setSexualPreference(sexualpreference);
			subscriber.setCity(citY);
			subscriber.setEducation(educatioN);
			subscriber.setInterests(interestS);
			subscriber.setHobies(hobie);
			subscriber.setDescription(description);
			
			VIPSubscriber vip = new VIPSubscriber(subscriber);
			
			vipList.add(vip);
		}
		
		return vipList;
	}
	
}
