# curalate-android-sdk

`curalate-android-sdk` is an API client to call Curalate's API methods from an Android app (or other project running on the JDK).

For questions or support, please contact your Curalate Account Manager or support@curalate.com.

## Installation

### Gradle

The recommended way to install the library for Android is with a build system like Gradle. Simply add the module to your build.gradle:

```groovy
dependencies {
  implementation 'com.curalate:android-sdk:0.1.2'
}
```

## Usage

### Creating the API Client

```java
CuralateApi curalate = new CuralateApi();
```

### Fetch content (no filters)

```java
GetMediaRequest request = new GetMediaRequest.Builder()
    .setDataSourceId("<YOUR_DATA_SOURCE_ID>")
    .build();

curalate.getMedia(request, new ApiHandler<GetMediaResult>() {
    @Override
    public void onSuccess(GetMediaResult result) {
        for (MediaApiItem item : result.getData().getItems()) {
            // Process the item.
        }
    }

    @Override
    public void onFailure(Exception exception) {
        // Handle the exception (either a CuralateApiException or IOException)
    }
});
```

### Fetch content (using filters)

```java
MediaFilter mediaFilter = new MediaFilter.And(
    new MediaFilter.ProductIdFilter("BQ8927"),
    new MediaFilter.LabelFilter("shopthelook")
);
GetMediaRequest request = new GetMediaRequest.Builder()
    .setDataSourceId("<YOUR_DATA_SOURCE_ID>")
    .setFilter(mediaFilter)
    .build();
```
