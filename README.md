# Game Companion

Game Companion is an Android application designed to serve as a versatile tool for gamers. It lets you select a game you want to play and searches for nearby players to queue with.

## Features

-   **User Authentication**: Secure sign-up and login functionality using Firebase Authentication.
-   **Game Browsing**: A home screen to browse and view details about different games, with data fetched from Firebase Realtime Database.
-   **User Profile**: A central profile screen providing access to various features of the app.
-   **Wallet Management**: Users can add and view their payment methods in the "My Wallet" section. Payment information is managed locally.
-   **In-App Chat**: A simple, real-time chat interface for user communication.
-   **Camera Integration**: Allows users to take photos with the device camera or select images from their album.
-   **VIP Center**: A dedicated section for viewing VIP subscription options.
-   **Settings & Information**: Includes options for logging out, switching accounts, and viewing application information.

## Technologies Used

-   **Languages**: Kotlin, Java
-   **Platform**: Android SDK
-   **Backend**: Firebase (Authentication, Realtime Database)
-   **Architecture**: Fragment-based architecture with both manual fragment transactions and the Android Jetpack Navigation Component.
-   **UI**: Android Material Components, RecyclerView, CardView.
-   **Build Tool**: Gradle

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

-   Android Studio Arctic Fox | 2020.3.1 or later
-   An Android device or emulator with API level 21 or higher

### Installation

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/whitetiger47/Game-Companion.git
    ```
2.  **Open in Android Studio:**
    Open the cloned `Game-Companion` directory in Android Studio.
3.  **Sync Gradle:**
    Allow Android Studio to download all the required Gradle dependencies.
4.  **Run the app:**
    Build and run the application on an Android emulator or a physical device. The project includes the `google-services.json` file required to connect to the Firebase project.

## Project Structure

The project follows a standard Android application structure.

-   `app/src/main/java/com/example/gamecompanion/`: Contains the main source code.
    -   `adapters/`: RecyclerView adapters, such as `MyWalletRecyclerViewAdapter`.
    -   `camera/`: Contains the `Camera` activity for handling photo capture and selection.
    -   `chat/`: Includes classes for the chat feature (`Chat`, `MsgAdapter`, etc.).
    -   `models/`: Data models like `PaymentModel`.
    -   `persistence/`: In-memory data persistence, e.g., `PaymentsPersistence`.
    -   Other `.kt` and `.java` files are Fragments that represent different screens of the app (e.g., `LoginFragment`, `HomeFragment`, `MyProfileFragment`).
-   `app/src/main/res/`: Contains all application resources.
    -   `layout/`: XML layout files for activities and fragments.
    -   `drawable/`: Vector drawables, images, and custom backgrounds.
    -   `navigation/`: The navigation graph (`navigation_graph.xml`) for fragment navigation.
    -   `values/`: Resource files for strings, colors, and themes.

## License
This project is licensed under the MIT License - see the [LICENSE](https://github.com/whitetiger47/Game-Companion/blob/master/LICENSE) file for details.

