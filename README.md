[![](https://jitpack.io/v/arnabkundu-developer/TransAct.svg)](https://jitpack.io/#arnabkundu-developer/TransAct)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19)

# TransAct - Activity Transition Library for Android

- Simple Code
- Smooth Transition Effect
- Transition Speed Control for custom animation

## Setup
Add this dependency  to project level Build Gradle
```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add this dependency  to app level Build Gradle
```groovy
	dependencies {
	   compile 'com.github.kunduarnab:TransAct:1.0'
	}
```

## Using
After startActivity() just add any of the line to animate through activities
```java
TransAct.slideLeft(this);
TransAct.slideRight(this);
TransAct.slideDown(this);
TransAct.slideUp(this);
TransAct.zoom(this);
TransAct.windmill(this);
TransAct.spin(this);
TransAct.diagonal(this);
TransAct.split(this);
TransAct.shrink(this);
TransAct.card(this);
TransAct.inAndOut(this);
TransAct.swipeLeft(this);
TransAct.swipeRight(this);
```

