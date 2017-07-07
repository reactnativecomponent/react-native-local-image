
# react-native-local-image

## Getting started

`$ npm install react-native-local-image --save`

### Mostly automatic installation

`$ react-native link react-native-local-image`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-local-image` and add `RNLocalImage.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNLocalImage.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNLocalImagePackage;` to the imports at the top of the file
  - Add `new RNLocalImagePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-local-image'
  	project(':react-native-local-image').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-local-image/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-local-image')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNLocalImage.sln` in `node_modules/react-native-local-image/windows/RNLocalImage.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNLocalImage;` to the usings at the top of the file
  - Add `new RNLocalImagePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNLocalImage from 'react-native-local-image';

// TODO: What to do with the module?
RNLocalImage;
```
  
