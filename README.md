# 🧾 Customer Service

Microservicio responsable de la gestión de clientes en la plataforma. Este servicio maneja información como el perfil del cliente, datos de contacto, historial, y configuraciones personalizadas.

---

## 🛠 Tecnologías utilizadas

- Lenguaje: [Java]
- Framework: [Spring Boot]
- Base de datos: [MongoDB]
- Arquitectura: Microservicios
- API: REST

---

## 📁 Estructura del proyecto

📁 com.bank.<microservice-name>
  - 📁 config → Configuración del microservicio (MongoDB, seguridad, WebFlux, etc.)
  - 📁 controller → Controladores REST
  - 📁 dto → Clases para la transferencia de datos
  - 📁 entity → Modelos de la base de datos
  - 📁 repository → Repositorios con Spring Data
  - 📁 service → Lógica de negocio
  - 📁 exception → Manejo de excepciones
  - 📁 util → Clases utilitarias
