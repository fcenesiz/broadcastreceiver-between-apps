## sender

````kotlin
val intent = Intent("my.action.name")
sendBroadcast(intent, "my.own.permission")
````

Manifest file:
`````xml
    <permission android:name="my.own.permission" android:protectionLevel="signature"/>

`````

## receiver

Manifest file:
`````xml

<uses-permission android:name="my.own.permission"/>


<receiver android:name=".MyReceiver"
    android:exported="true">
    <intent-filter>
        <action android:name="my.action.name"/>
    </intent-filter>
</receiver>
`````