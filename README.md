

## About the app

The purpose of this app is to organise marriages and provide marriage details to the invites.

The app was created in 2021 and has since been worked on.

## Software used

This app uses the following software:

Software | Description | Links
---|---|---
Firebase (Analytics, Authentication, Crashlytics, Cloud Messaging, Firestore) | Firebase is mainly used for the authentication and database backend, as well as cloud notifications and logs events when the app unexpectedly crashes. | [Firebase](https://firebase.google.com/)

## Libraries used

For more info about the list of libraries used, check out the `build.gradle` files ([root `build.gradle`](build.gradle), [app `build.gradle`](app/build.gradle)).

---

## Downloads

Download the latest build [here](https://github.com/saswatamm/Proffus-builds/blob/master/release/com.edricchan.studybuddy-v1.0.0-rc.503.apk).

Older versions can be accessed [here](https://github.com/EdricChan03/StudyBuddy-builds/blob/master/release).

The changelog for each version can also be viewed in [CHANGELOG.md](/CHANGELOG.md).

## Screenshots

![mockup](https://user-images.githubusercontent.com/72179477/134491772-b84953be-830d-447c-b367-a159369f8af3.png)

## Building the source code

If you would like to build the source code, follow these steps:
1. Clone the project locally by either clicking the `Clone or download` > `Download ZIP` or by running the following commands:
   ```bash
   cd path/to/your/desired-location
   git clone https://github.com/saswatamm/Proffus-android.git
   ```
2. Run the following in your terminal:
   
   macOS/Linux:
   ```bash
   ./gradlew assembleDebug
   ```
   Windows:
   ```shell
   gradlew.bat assembleDebug
   ```
3. The APK should be signed with the debug key and will be available at `app/build/outputs/apk`. See [Build a debug APK](https://developer.android.com/studio/build/building-cmdline.html#DebugMode) for more info.

