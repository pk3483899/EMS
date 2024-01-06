Employee Management

1. **Technologies Used:**
   - Backend: Java, J2EE, Servlets, JDBC
   - Frontend: HTML,JSP
   - Server: Tomcat
   - Architecture: MVC

2. **Login:**
   - User enters email and password.
   - Controller checks credentials with the database.
   - If matched, the user is redirected to the welcome page.
   - If not matched, an error message is displayed on the login page.

3. **Welcome Page:**
   - User can insert, read, update, and delete data.
     - Insert Data:
       - User inputs details.
       - Data is sent to the controller, which interacts with the model to store it in the database.
     - Read Data:
       - User clicks on a link.
       - Controller calls a model method to read data from the database.
       - Data is sent to the view layer for display.
     - Update Data:
       - User modifies data.
       - Modified data is sent to the controller, updating the database through the model.
     - Delete Data:
       - User deletes data.
       - Deletion request is sent to the controller, which interacts with the model to delete data from the database.

4. **Logout:**
   - User clicks on the logout button.
   - Logout request is sent to the controller.
   - Controller logs the user out and redirects them to the login page.
   - If the user tries to go back, they are prompted to log in again.



Ensure secure user authentication, implement proper validation, and sanitize inputs to prevent security vulnerabilities. Additionally, consider session management for enhanced security during user interactions.
