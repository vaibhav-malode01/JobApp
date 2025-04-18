# 💼 Job App

**Job App** is a simple job management web application built using **Spring Boot REST API** and **React**. It provides users with functionalities to **post**, **update**, **delete**, and **view** job listings. Additionally, users can search for jobs using specific keywords for a seamless job search experience.

## 🚀 Features
- Create, read, update, and delete (CRUD) job listings
- Keyword-based job search
- RESTful API for backend operations
- Responsive user interface using React

## 🧑‍💻 Tech Stack
- **Frontend:** React, Axios, Tailwind CSS
- **Backend:** Spring Boot REST API
- **Database:** MySQL / PostgreSQL (Choose as per your setup)
- **Tools:** Git, GitHub, Postman

## ⚙️ Installation
### Backend Setup
1. Clone the repository:
    ```bash
    git clone https://github.com/vaibhav-malode01/job-app.git
    ```
2. Navigate to the backend folder:
    ```bash
    cd job-app/backend
    ```
3. Configure the database in `application.properties`.
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup
1. Navigate to the frontend folder:
    ```bash
    cd job-app/frontend
    ```
2. Install dependencies:
    ```bash
    npm install
    ```
3. Start the application:
    ```bash
    npm start
    ```

## 🌐 API Endpoints
- `GET /jobs` - Get all job listings
- `POST /jobs` - Create a new job
- `GET /jobs/{id}` - Get a job by ID
- `PUT /jobs/{id}` - Update a job by ID
- `DELETE /jobs/{id}` - Delete a job by ID
- `GET /jobs/search?keyword=value` - Search jobs by keyword

## 📸 Screenshots
## 📸 Screenshots

### 🏠 Home Page – All Jobs
![Home Page](assets/ss1.png)

### ✏️ Edit Job Post
![Edit Job](assets/ss2.png)

### ➕ Create / Add New Job
![Add Job](assets/ss3.png)

### 🛢️ PostgreSQL Setup
![PostgreSQL](assets/ss4.png)


## 🤝 Contributing
Contributions are welcome! Feel free to fork this repo, make changes, and open a pull request.

## 📫 Contact
- **LinkedIn:** [Vaibhav Malode](https://linkedin.com/in/vaibhav-malode-076b34240)
- **GitHub:** [vaibhav-malode01](https://github.com/vaibhav-malode01)
- **Email:** vaibhavmalode47@gmail.com

---

💡 _Happy Coding!_
