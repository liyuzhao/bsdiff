[![](https://jitpack.io/v/liyuzhao/bsdiff.svg)](https://jitpack.io/#liyuzhao/bsdiff)

>2.x migrate to androidx

#### Step 1.
Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

#### Step 2.
Add the dependency

```
	dependencies {
	        implementation 'com.github.liyuzhao:bsdiff:v2.0.0'
	}

```