package pr4.task3;

public class App {
	public static void getStatistics(Game g){
		System.out.println("Getting game statistics:");
        g.a();
        g.b();
        g.c();
	}
	public static void main(String[] args){
		LogicGame logicGame = new LogicGame();
		MemoryGame memoryGame = new MemoryGame();
		
		System.out.println("LogicGame:");
		getStatistics(logicGame);
		logicGame.d();
		
		System.out.println("MemoryGame:");
		getStatistics(memoryGame);//p параметр типа гейм, гейм может хранить и логик и мемори, рантайм
		memoryGame.d();
		
		System.out.println("IPhone:");
		IPhone Iphone = new IPhone();
		Iphone.sell();
		Iphone.plugIn();
				
				
		
	}
}
