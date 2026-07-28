import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

@Suppress("ConstPropertyName")
object Versions {

    // On change edit aaps-ci.yml
    const val appVersion = "3.4.2.3"
    const val versionCode = 1500

    const val compileSdk = 36
    const val minSdk = 27
    const val targetSdk = 28
    const val wearMinSdk = 27
    const val wearTargetSdk = 28

    val javaVersion = JavaVersion.VERSION_21
    val jvmTarget = JvmTarget.JVM_21
    const val jacoco = "0.8.11"
}
