package api.Endpoints;

public class End_point_urls 
{
	// HERE WE ARE USING THE API for pet module ...END POINT URLs.......
	// POST ---
	// GET  ---https://petstore.swagger.io/v2/store/order/{orderId}
	/// [For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions]
	// UPDATE -
	// DELETE -
	
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	
	// THE BELOW URL's ARE FOR STORE MODULE.....
	public static String Get_url =base_url+"/store/order/{orderID}";
	public static String  post_url=base_url+"/store/order";
	public static String delete_url =base_url+"/store/order/{orderID}";
	public static String update_url =base_url+"/store/order/{orderID}";
	
	// THE BELOW URL's ARE FOR PET MODULE...
	
	
}
