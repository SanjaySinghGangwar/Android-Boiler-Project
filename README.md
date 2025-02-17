# Project Boilerplate

This boilerplate project includes the following features and integrations:

- **WorkManager**: Handles background tasks, such as syncing data, uploading files, or scheduling jobs.
- **Fastlane (CI/CD)**: Automates build, testing, and deployment processes.
- **Room Database**: Local database solution for persistent storage.
- **Automatic App Signing**: Seamlessly manages app signing for multiple build variants.
- **Navigation Groups**: Simplifies navigation between app components.
- **LiveData**: Reactive data handling for UI updates.
- **Firebase Cloud Messaging (FCM)**: Enables push notifications and messaging services.
- **Hilt (Dagger)**: Provides dependency injection for easier object management.
- **Coroutines**: Supports asynchronous programming and concurrency handling.
- **DataStore**: A modern, coroutine-based solution for storing key-value pairs or typed objects.
- **Retrofit**: A powerful HTTP client for managing API calls and network requests.
- **ViewModel**: Manages UI-related data in a lifecycle-conscious way to survive configuration changes.
- **Lottie**: Integrates animated graphics and vector-based visual effects.
- **SharedPreferences**: Provides simple, synchronous key-value storage for small amounts of data.
- **Play In-App Update**: Integrates Google's in-app update mechanism for smooth updates.
- **Facebook Ads Integration**: Supports Facebook ads for app monetization.
- **Google Ads Integration**: Adds Google ads for additional monetization options.

### Base Classes

- **Base Activity**: Provides a common structure for activities.
- **Base Fragment**: Shared functionality for fragments.
- **Base Dialog Fragment**: Common dialog fragment functionalities.
- **Base Bottom Sheet**: Standard structure for bottom sheet dialogs.
- **Etc.**: Additional shared components and utilities for code reuse.


# ---------------------  Android Topic  ---------------------

## Fundamentals
- **App Components**: Activities, Services, Broadcast Receivers, Content Providers
- **Application Lifecycle**: Application class, Process death handling
- **Context**: Types (Activity, Application), Use cases
- **Intents**: Explicit vs. implicit, Intent filters
- **Manifest File**: Declaring components, Permissions, Metadata
- **Android System Architecture**: Linux kernel, HAL, Binder IPC

## User Interface
- **XML Layouts**: Styles, Themes, include/merge tags
- **Views & ViewGroups**: Custom Views, Canvas/Paint, MotionLayout
- **Adaptive Layouts**: Fragments for multi-pane, WindowManager (foldables)
- **RecyclerView**: DiffUtil, ListAdapter, SnapHelper
- **Jetpack Compose**: State management, Modifiers, Navigation, Theming
- **Material Design**: Components (BottomNavigation, Snackbar), Material You (Dynamic Color)
- **Animations**: ViewPropertyAnimator, Lottie, AnimatedVectorDrawable

## Data Storage
- **SharedPreferences**: vs. DataStore (Preferences/Proto)
- **Room Database**: DAOs, Relations, Migration, Testing
- **File Storage**: Scoped Storage (MediaStore, SAF), FileProvider
- **Backup**: Auto Backup for Apps, BackupManager
- **Caching**: DiskLruCache, Retrofit caching strategies

## Networking
- **Retrofit**: Coroutine support, Interceptors, Error handling
- **OkHttp**: Cache, Timeouts, Certificate Pinning
- **Protocols**: gRPC, MQTT (IoT), GraphQL (Apollo)
- **Security**: TLS/SSL, Certificate validation, Certificate Transparency

## Permissions & Security
- **Runtime Permissions**: One-time, grouped permissions (Android 13+)
- **Biometric Auth**: Strong vs. weak biometrics, CryptoObject
- **Encryption**: AES, RSA, Android Keystore System
- **App Security**: Network Security Config, HTTPS pinning, Obfuscation (R8)
- **Privacy**: Data anonymization, Advertising ID restrictions

## Multithreading & Concurrency
- **Coroutines**: Flows, Channels, CoroutineScope (lifecycle-aware)
- **RxJava**: Observables, Subjects (alternative to coroutines)
- **WorkManager**: Chained tasks, Constraints, PeriodicWork
- **Thread Management**: ThreadPoolExecutor, Synchronization (Mutex)

## Jetpack Components
- **Navigation Component**: Deep links, Nested graphs, Compose integration
- **Data Binding**: Two-way binding, Binding adapters
- **CameraX**: Image analysis, Video capture
- **App Startup**: Initialization of components
- **Hilt**: Dependency injection (scopes, qualifiers)

## Testing
- **Unit Testing**: JUnit5, MockK, Turbine (Flow testing)
- **UI Testing**: Espresso (Idling Resources), Compose testing APIs
- **Instrumentation Tests**: UI Automator, Barista

## Multimedia
- **Camera**: Camera2 API, ML Kit (barcode scanning)
- **ExoPlayer**: Custom DRM, Adaptive streaming (HLS, DASH)
- **Image Processing**: Glide/Coil (image loading), Bitmap manipulation

## Location & Maps
- **Google Maps**: Clustering, Heatmaps, Offline maps
- **Location APIs**: FusedLocationProviderClient, Geocoding

## Firebase
- **Firebase ML**: Custom models (TensorFlow Lite), Text recognition
- **Remote Config**: A/B testing, Feature toggles
- **App Distribution**: Beta testing, Crashlytics analytics
- **Dynamic Links**: Deep linking with attribution

## Background Processing
- **Foreground Services**: Notifications, Ongoing tasks
- **JobScheduler**: vs. WorkManager (backward compatibility)
- **AlarmManager**: Exact alarms (Android 12+ restrictions)

## Sensors & Hardware
- **Sensor Types**: Proximity, Ambient light, Step counter
- **Bluetooth**: BLE (GATT), Classic Bluetooth (sockets)

## Performance Optimization
- **Memory Management**: LeakCanary, onTrimMemory()
- **Battery Optimization**: Doze mode, Background limits
- **APK Size**: R8 optimization, Dynamic feature modules
- **Tools**: Android Profiler, Systrace, Baseline Profiles

## Modern Android Development (MAD)
- **Architecture**: MVI, Unidirectional Data Flow, Clean Architecture layers
- **Kotlin**: Sealed classes, Extension functions, DSLs
- **App Startup**: Optimizing cold starts, Class preloading

## App Distribution
- **Google Play**: App signing, Target API requirements, Policy compliance
- **Alternatives**: Amazon Appstore, Huawei AppGallery
- **In-App Updates**: Flexible vs. immediate
- **Monitoring**: Vitals (ANR, crashes), Play Console metrics

## Android Customization
- **Theming**: Dark mode, Dynamic colors (Material You)
- **Animations**: Shared element transitions

## Internationalization & Accessibility
- **Localization**: Plurals, Date/number formatting
- **RTL**: Layout mirroring, android:supportsRtl

## Tools & Libraries
- **Debugging**: Stetho
- **CI/CD**: GitHub Actions, Fastlane, Firebase App Distribution


# ------------------  Interview Questions   ------------------ 
Will add soon