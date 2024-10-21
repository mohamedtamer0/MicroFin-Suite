# MicroFin-Suite

# 🌟 Master Microservices with Spring Boot, Docker, Kubernetes

This project demonstrates the implementation of **Microservices Architecture** using **Spring Boot**, **Spring Cloud**, **Docker**, and **Kubernetes**. It includes services like **Accounts**, **Cards**, and **Loans**, along with a **Config Server** for centralized configuration management.

## 📚 Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Configuration Files](#configuration-files)
- [Config Server Configuration](#config-server-configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## 🚀 Features

- Microservices for Accounts, Cards, and Loans management.
- Centralized configuration management using Spring Cloud Config Server.
- Docker containers for easy deployment.
- Kubernetes integration for container orchestration.

## 🛠️ Technologies Used

- Java ☕
- Spring Boot 🌱
- Spring Cloud ☁️
- Docker 🐳
- Kubernetes ☸️
- RabbitMQ for messaging 📦

## 🏁 Getting Started

### Prerequisites

- Java JDK 17 or higher
- Docker 🐋
- Docker Compose
- Maven 🧪

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/mohamedtamer0/MicroFin-Suite.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd MicroFin-Suite
    ```

3. **Start the services using Docker Compose:**

    Navigate to the desired environment folder (e.g., `docker-compose/default`) and run:

    ```bash
    docker-compose up
    ```

4. **Access the services:**

    Open your web browser and go to:
    - Accounts Service: [http://localhost:8081](http://localhost:8081) 📋
    - Cards Service: [http://localhost:8082](http://localhost:8082) 🃏
    - Loans Service: [http://localhost:8083](http://localhost:8083) 💰
    - Config Server: [http://localhost:8084](http://localhost:8084) ⚙️

## 📂 Project Structure

```text
├── accounts
│   ├── src
│   ├── main
│   │   └── java/com/tamer/accounts
│   ├── resources
│   ├── test
│   ├── pom.xml
├── cards
│   ├── src
│   ├── main
│   │   └── java/com/tamer/cards
│   ├── resources
│   ├── test
│   ├── pom.xml
├── loans
│   ├── src
│   ├── main
│   │   └── java/com/tamer/loans
│   ├── resources
│   ├── test
│   ├── pom.xml
├── configserver
│   ├── src
│   ├── resources
│   ├── test
│   ├── pom.xml
├── docker-compose
│   ├── default
│   │   ├── common-config.yml
│   │   └── docker-compose.yml
│   ├── prod
│   │   ├── common-config.yml
│   │   └── docker-compose.yml
│   ├── qa
│   │   ├── common-config.yml
│   │   └── docker-compose.yml
└── Microservices.postman_collection.json
```

# ⚙️ Configuration Files

The project includes several YAML configuration files for different environments:

## Accounts Service
- **`accounts-prod.yml`**: Configuration for production environment.
- **`accounts-qa.yml`**: Configuration for QA environment.
- **`accounts.yml`**: Default configuration.

## Cards Service
- **`cards-prod.yml`**: Configuration for production environment.
- **`cards-qa.yml`**: Configuration for QA environment.
- **`cards.yml`**: Default configuration.

## Loans Service
- **`loans-prod.yml`**: Configuration for production environment.
- **`loans-qa.yml`**: Configuration for QA environment.
- **`loans.yml`**: Default configuration.

# 📜 Config Server Configuration

This section describes the configuration for the Config Server in the MicroFin-Suite project.

## YAML Configuration

The `application.yml` file configures the Config Server to use a Git repository for centralized configuration management.

```yaml
spring:
  application:
    name: "configserver"
  profiles:
    active: git
  cloud:
    config:
      server:
        git:
          uri: "https://github.com/mohamedtamer0/MicroFin-config.git"
          default-label: main
          timeout: 5
          clone-on-start: true
          force-pull: true
  rabbitmq:
    host: "localhost"
    port: 5672
    username: "guest"
    password: "guest"

encrypt:
  key: "45D81EC1EF61DF9AD8D3E5BB397F9"

management:
  endpoints:
    web:
      exposure:
        include: "*"
  health:
    readiness-state:
      enabled: true
    liveness-state:
      enabled: true
  endpoint:
    health:
      probes:
        enabled: true

server:
  port: 8084
```



# 📖 Usage

You can run the services independently or in conjunction, depending on your needs. Make sure to check the service health and logs using Docker commands:

```bash
docker-compose logs
```

# 🤝 Contributing

If you wish to contribute to this project, please fork the repository and submit a pull request with your changes.

# 📝 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

# 📬 Contact

For any inquiries, please contact me at: [your-email@example.com]

