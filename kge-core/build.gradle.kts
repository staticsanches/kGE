import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    id("dev.staticsanches.kge.library")
    id("org.jetbrains.kotlin.plugin.allopen") version libs.versions.kotlin
}

dependencies {
    implementation(platform(libs.lwjgl.bom))
    implementation(libs.bundles.lwjgl)

    testImplementation(kotlin("test"))
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly(libs.bundles.lwjgl) {
        val name = System.getProperty("os.name")!!
        val arch = System.getProperty("os.arch")!!
        val lwjglNatives =
            when {
                arrayOf("Linux", "SunOS", "Unit").any { name.startsWith(it) } ->
                    if (arrayOf("arm", "aarch64").any { arch.startsWith(it) }) {
                        "natives-linux${if (arch.contains("64") || arch.startsWith("armv8")) "-arm64" else "-arm32"}"
                    } else {
                        "natives-linux"
                    }

                arrayOf("Mac OS X", "Darwin").any { name.startsWith(it) } ->
                    "natives-macos${if (arch.startsWith("aarch64")) "-arm64" else ""}"

                arrayOf("Windows").any { name.startsWith(it) } ->
                    if (arch.contains("64")) {
                        "natives-windows${if (arch.startsWith("aarch64")) "-arm64" else ""}"
                    } else {
                        "natives-windows-x86"
                    }

                else ->
                    throw Error("Unrecognized or unsupported platform. Please set \"lwjglNatives\" manually")
            }
        artifact {
            classifier = lwjglNatives
        }
    }
}

allOpen {
    annotation("dev.staticsanches.kge.annotations.KGEAllOpen")
}

tasks.named("compileKotlin", KotlinCompilationTask::class.java) {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-receivers")
        freeCompilerArgs.add("-opt-in=dev.staticsanches.kge.annotations.KGESensitiveAPI")
    }
}

tasks.named("compileTestKotlin", KotlinCompilationTask::class.java) {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-receivers")
    }
}
