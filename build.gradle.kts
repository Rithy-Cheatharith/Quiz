// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}
dependencies {
    implementation(libs.foundation.layout.android)
    implementation(libs.foundation.layout.desktop)
}

fun implementation(desktop: Any) {

}
