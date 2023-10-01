# Mad_Practical5_21012011125

Study: Intent, types of Intent, types of Intent Action, Intent.setData() method, Intent.setType() method, TextInputEditText, TextInputLayout, Button, ConstraintLayout, CoordinatorLayout, startActivity() method, ActivityResultContracts.StartActivityForResult() method, registerForActivityResult() method, Permission in manifest, ContextCompat.checkSelfPermission(), ActivityCompat.requestPermissions() method, Uri.parse() method, 

ContactsContract.Contacts.CONTENT_TYPE

CallLog.Calls.CONTENT_TYPE

"image/*"

"tel:"

<uses-permission android:name="android.permission.READ_CONTACTS" />

AIM: What is Intent? Write down types of Intent and types of Intent Action. Create an application which demonstrates implicit Intent for following features. 

1. Make call to specific number

2. Open specific URL

3. Open Call Log

4. Open Gallery

5. Set Alarm

6. Open Camera


Question: What is Intent? Write down types of Intent and types of Intent Action.
Answer: "intent" refers to a messaging object that can be used to request an action from another component of the Android system or from a different app. Intents are a fundamental concept in Android app development and are used to initiate various actions and interactions between components of an Android application or between different Android applications.

Types of Intents in Android Mobile Application Development:

**Explicit Intents**: Explicit intents are used to specify a particular component (e.g., an activity, service, or broadcast receiver) to be invoked. They are typically used within the same app to start another component within that app.

**Implicit Intents:** Implicit intents do not specify a particular component but instead describe a general action to be performed. The Android system then resolves the intent to the appropriate component based on its intent filters. Implicit intents are often used to initiate actions that can be handled by multiple apps on the device (e.g., opening a web URL).

Types of Intent Actions in Android:

**Activity Intent Actions:**

ACTION_VIEW: Used to display data to the user, such as opening a web page, displaying a map location, or showing a contact.
ACTION_EDIT: Used to edit an existing piece of data, such as modifying a contact or a calendar event.
ACTION_DIAL: Initiates a phone call to a specified phone number.
ACTION_SEND: Launches an activity to send data, typically used for sending emails or SMS messages.

**Broadcast Intent Actions:**

ACTION_BOOT_COMPLETED: Sent when the device has finished booting.
ACTION_BATTERY_LOW: Indicates that the device's battery is running low.
ACTION_POWER_CONNECTED and ACTION_POWER_DISCONNECTED: Sent when the device is connected to or disconnected from a power source.
ACTION_AIRPLANE_MODE_CHANGED: Sent when the airplane mode is toggled on or off.

**Service Intent Actions:**

ACTION_RUN: Custom action to initiate a specific service-related task.
ACTION_SYNC: Used for initiating data synchronization with a backend server or cloud service.

**Custom Intent Actions:** Developers can define their own custom intent actions for specific functionality within their apps. These are often used to trigger specific actions or events unique to the application.

**Intent Filters:** Intent filters are used to specify which components of an app can respond to particular intent actions. Components declare their intent filters in the AndroidManifest.xml file, allowing other apps or the Android system to determine which components can handle certain actions.

