rootProject.name = "batch-study"


include(
    "batch",
    "batch:batch-core",
    "batch:batch-csv-reader",
    "batch:batch-csv-writer",
    "batch:batch-bulk-insert"
)

include(
    "payment",
    "payment:payment-domain"
)


pluginManagement {
    repositories {
        gradlePluginPortal()
    }

    val pluginVersions = mapOf(
        "org.jetbrains.kotlin" to "1.4.21",
        "org.jetbrains.kotlin.plugin" to "1.4.21",
        "org.springframework" to "2.4.1",
        "io.spring" to "1.0.10.RELEASE"
    )

    resolutionStrategy {
        eachPlugin {
            if (pluginVersions.containsKey(requested.id.namespace)) {
                useVersion(pluginVersions[requested.id.namespace])
            }
        }
    }
}