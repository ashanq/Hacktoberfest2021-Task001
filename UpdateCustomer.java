public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone"); 
		String username = request.getParameter("un"); 
		String pass = request.getParameter("pass");
		
		boolean isTrue; 
		
		isTrue = CustomerDBUtil.updatecustomer(id, name, email, phone, username, pass); 
		
		if(isTrue == true) { 
			
			
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		
	}

}
