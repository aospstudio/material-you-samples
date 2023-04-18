# Material You Sample
Material You interface with dynamic theme support for your Android projects

## Requirements
```bash
Android Studio Electric Eel 2022.1.1 Patch 2 or higher,
Gradle version: 8.0.2,
SDK API 33,
Platform Tools: 34.0.0 rc03,
AndroidX libraries,
Kotlin
```

## What's up?
```bash
Material You interface full support
Dynamic theme support (12.0+)
Splash screen (under 12.0)
Dark mode
```

## Themes
```bash
"@style/BaseTheme" (Main Application Theme)
"@style/BaseTheme.Splash" (Splash Screen Theme)
"@style/BaseTheme.Settings" (Settings and Other Pages Theme)
```

## Monochrome icon
Create an svg icon named ic_launcher_monochrome.xml and add it to res>drawable directory.
To enable Monochrome icon on Android 12 and above, add the following line to the path res>mipmap-anydpi-v26>ic_launcher.xml

```bash
<monochrome android:drawable="@drawable/ic_launcher_monochrome" />
```

## Screenshots
<img src="https://raw.githubusercontent.com/aospstudio/material-you-samples/main/screenshots/materialyou.png" width="90%">

## License
[Apache 2.0](https://github.com/aospstudio/material-you-samples/blob/main/LICENSE)

## Developer Website
[AOSP STUDIO](https://aospstudio.com)
