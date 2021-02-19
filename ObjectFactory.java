
public class ObjectFactory {
	public static AirlineFeatues getAirlineInstance()
	{
		String airlinesName = System.getProperty("airlinesName");
		
		try {
			Class c = Class.forName(airlinesName);
			return (AirlineFeatues) c.newInstance();
		
			} catch (InstantiationException | IllegalAccessException|ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
		
	}
}
