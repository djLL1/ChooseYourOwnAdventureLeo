package Story;

public class Story {
	
	private String name;
	
	public Story (String name) {
		this.name=name;
	}
	//Intro dialouge
	public void Intro() {
		System.out.println( name+ " lies awake on a damp floor in what can be only described as a touchy dungeon, you don’t recall how you ended up "
				+ "\n" + "there and a monitor turns on. “I want to play a game " + name + ". It’s the SAW man! You ecstatically get up but your mind wanders what to do.");

	}
	//first option
	public void Option1A() {
		System.out.println("Before you is a treadmill made out of sandpaper, it moves at 4 Miles per hour, at a steady pace to prevent immediate death "
				+ "\n" +"but allows a slow descent of both body and mind. This experiment will last for 3 days, however before you lies 3 doors each of differing "
				+ "\n" +"colors, each with a different challenge awaiting you. A sense of both fear and fulfillment awakens in you. As horrible as the experiment"
				+ "\n" +" sounds, there’s still a chance that the other doors might hold a fate worse. What do you do?");
	
	}
	//second option
	public void Option1B() {
		System.out.println("Your body sprints at what can only be described as mach speed towards the monitor. You easily obliterated it however at the"
				+ "\n" +" cost of your foot. Lying on the floor all of a sudden the ground moves and begins to press and crush your body against the wall, you died!");
	}
	//third option
	public void Option1C() {
		System.out.println("You get up and ignore the monitor. You blatantly let the warnings coming from the monitor go past you. Eventually you make"
				+ "\n" +" out a red rusted door, “Freedom” is your final thought as you enter through this door. You fall into what is essentially a human glue "
				+ "\n" +"trap face first. You slowly fade to consciousness thinking how easily this could’ve been avoided, you died!");
	}
	//fourth option
	public void Option1D() {
		System.out.println("Your primal instincts rise to the surface of your psyche, this puppet was somehow able to overpower and capture you,"
				+ "\n" +" IMPOSSIBLE! Without hesitation you start swinging and flailing across the room hitting both the walls and the floor. All of a"
				+ "\n" +" sudden the ground starts moving, but you’re still too primal to notice any differences in your surroundings. Slowly the floor"
				+ "\n" +" gripping onto your skin by its gritty texture smashes your body against the wall headfirst, even filled to the brim with"
				+ "\n" +" adrenaline you weren’t able to move away in time, you died!");
	}
	//first option part 2
	public void Option2A() {
		System.out.println("You get your bearings and see a red rusty door. You open the red door slowly, to avoid any unforeseen traps,"
				+ "\n" +" and from what you can tell you see a giant wall covered in a sticky white substance blocking the doorway. Not knowing"
				+ "\n" +" what else to do as the sandpaper treadmill begins, you take a leap of faith through the sticky wall in hopes of"
				+ "\n" +" bursting through it. Your body easily splats against it, but no recognizable damage can be seen. Trying to step out of"
				+ "\n" +" it you realize you’re stuck in a human glue trap. You slowly fade to consciousness thinking how easily this could’ve been"
				+ "\n" +" avoided, you died!");
	}
	//second option part 2
	public void Option2B() {
		System.out.println("Your eye while looking catches an odd detail. In this damp and dank room, here lies a squeaky clean door, on top"
				+ "\n" +" of this it’s a beautiful blue color. You reason that it must be so clean due to it’s possible exterior to the outside world."
				+ "\n" +" Easily you take a hop and skip towards the door and open it. From the other side of the room, the famous Reverse Bear trap mask is"
				+ "\n" +" launched towards your face and locks on. Still thinking there’s a chance you make a break to go further into the room,"
				+ "\n" +" however this expedition is left fruitless. As you panic more and more as the mechanism turns, you feel betrayed by your"
				+ "\n" +" instincts and you are brought to tears. Left confused and frustrated the face mask goes off, you died!");
	}
	//third option part 2
	public void Option2C() {
		System.out.println("Looking around, your nose detects a particularly alarming smell. Your head twists and contorts to meet this aroma."
				+ "\n" +" As your eyes focus on the odor, a glistening yellow door focuses into your sight. Such a pungent scent can only lead to"
				+ "\n" +" one place, a landfill, and as your mind perceives it, a possible way out. You grip the handle and open the door, the smell"
				+ "\n" +" begins to overwhelm senses as it becomes stronger. The floor begins to move which prompts you to leap into the yellow door."
				+ "\n" + " You think you are safe but you slowly descend into a pit further and further, deeper and deeper down. You land on broken"
				+ "\n" +" glass? No, the sensation is more of plastic pins piercing your skin. You open your eyes, the left side of your vision blurred"
				+ "\n" +" and redden, the right side still intact. A dim light illuminates with what little power it can contain. What you can perceive"
				+ "\n" +" is varied, but obvious. You have fallen into a pit of used syringe needles. Trying to lift yourself to escape, your body cannot"
				+ "\n" +" move without tearing itself apart. You are left there waiting in a dim imperceivable pit, you died!");
	}
	//fourth option part 2
	public void Option2D() {
		System.out.println("After hearing the monitor's warning, you decide the best option is to do nothing! You sit there as the floor begins"
				+ "\n" +" to move slowly. Walking and sitting on the floor doesn't cause any discomfort, however you’re still afraid of being crushed"
				+ "\n" +" while being pushed between the walls and the floor. After a moderate amount of walking, for what seems like 30 minutes, a"
				+ "\n" +" trapdoor above you pops open and a ladder comes down. You climb the ladder and are greeted with the Borah senior class of"
				+ "\n" +" 2023. A scream can be heard from the entire class, calling 'HAPPY SENIOR PRANK', " + name + " Not only was this a great prank,"
						+ " you were taught a valuable lesson of patience, you live!");
	
	}
}
