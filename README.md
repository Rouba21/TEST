# MediZen — User Module (JavaFX test)

A small JavaFX + JDBC module used to build and test **user management** for the MediZen project before integrating it into the main application.

## What it does

- `User` model (email, password, roles stored as JSON, username, last name, date of birth, blocked flag)
- `UserService`: create, read, update and delete users in MySQL through JDBC
- Simple JavaFX screen (`test.fxml`) to try the service

## Tech

Java 17 · JavaFX / FXML · Maven · MySQL (JDBC) · Jackson (JSON roles)

## Run

1. Create a MySQL database named `rouba` with a `user` table, or change the connection in `src/main/java/Medizen/Utils/MaConnexion.java`.
2. Start the app:
   ```bash
   mvn clean javafx:run
   ```

## Related

- [MediZen](https://github.com/Rouba21/MediZen): web version (Symfony)
- [MedizenJavafx](https://github.com/Rouba21/MedizenJavafx): desktop version (JavaFX)
