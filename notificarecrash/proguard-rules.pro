
-keepattributes Signature
-keepattributes Exceptions
-keepclasseswithmembers class * {
    @retrofit.http.* <methods>;
}

-dontwarn okhttp3.**
-dontwarn okio.**