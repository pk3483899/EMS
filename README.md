Employee Management

1. **Technologies Used:**
   - Backend: Java, J2EE, Servlets, JDBC
   - Frontend: HTML,JSP
   - Server: Tomcat
   - Architecture: MVC
  



![Index](https://github.com/pk3483899/Employmee-Management/assets/78607856/b2f51a7e-bfa4-43ab-beec-857eceb0401f)






2. **Login:**
   - User enters email and password.
   - Controller checks credentials with the database.
   - If matched, the user is redirected to the welcome page.
   - If not matched, an error message is displayed on the login page.
  
![Login Error](https://github.com/pk3483899/Employmee-Management/assets/78607856/0a0eec2e-1f0c-4f2d-a6d5-cb1043b02a17)

![Login](https://github.com/pk3483899/Employmee-Management/assets/78607856/963af4ea-b305-40ac-b9aa-f19c380be1f0)





3. **Welcome Page:**
   - User can insert, read, update, and delete data.
  
![Welcome page](https://github.com/pk3483899/Employmee-Management/assets/78607856/3e54d4b3-0f8b-41c9-a25f-a1f5c0771dfd)




     - Insert Data:
       - User inputs details.
       - Data is sent to the controller, which interacts with the model to store it in the database.

![insert data](https://github.com/pk3483899/Employmee-Management/assets/78607856/1cc9fc9d-221d-4261-8221-4c1ca2483f63)

![Saving Data](https://github.com/pk3483899/Employmee-Management/assets/78607856/faf78405-3f6a-4be2-bb89-80823aa56777)


       
     - Read Data:
       - User clicks on a link.
       - Controller calls a model method to read data from the database.
       - Data is sent to the view layer for display.

![read data](https://github.com/pk3483899/Employmee-Management/assets/78607856/abc4e1b9-540e-4354-8618-af85beb1ca2b)

       
     - Delete Data:
       - User deletes data.
       - Deletion request is sent to the controller, which interacts with the model to delete data from the database.

![delete data](https://github.com/pk3483899/Employmee-Management/assets/78607856/6162f619-df2b-4dc7-9667-8efb5689d219)

       
     - Update Data:
       - User modifies data.
       - Modified data is sent to the controller, updating the database through the model.
       
![update](https://github.com/pk3483899/Employmee-Management/assets/78607856/afd956b6-be72-4310-99c8-97a400ed100f)
![updated](https://github.com/pk3483899/Employmee-Management/assets/78607856/03401b57-0879-4518-afaf-9c558af99d4f)



4. **Logout:**
   - User clicks on the logout button.
   - Logout request is sent to the controller.
   - Controller logs the user out and redirects them to the login page.
   - If the user tries to go back, they are prompted to log in again.
  
![Logout](https://github.com/pk3483899/Employmee-Management/assets/78607856/7f36e798-d470-446a-9513-408e5f8d8b69)


![DB](https://github.com/pk3483899/Employmee-Management/assets/78607856/41c5b97f-55ed-48b8-a260-b6fe17da5ed4)
![Authentication](https://github.com/pk3483899/Employmee-Management/assets/78607856/c262ef01-6c95-4c99-af64-e0860b4bf766)



Ensure secure user authentication, implement proper validation, and sanitize inputs to prevent security vulnerabilities. Additionally, consider session management for enhanced security during user interactions.
