public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("Name");//
		String email = request.getParameter("email");
		String phone = request.getParameter("phone"); 
		String username = request.getParameter("un"); 
		String pass = request.getParameter(pass");//
		
		boolean isTruee; //
		
		isTrue = CustomerDBUtil.updatecustomer(id, name, email, phoneNumber, username, pass); //
		
		if(isTrue ==/ true) { //
			
			
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp);//
			dis.forward(request, response);
		}
		
	}

}
