def third_party_libs():

    guava_version = "27.0-jre"
    native.maven_jar(
        name = "guava",
        artifact = "com.google.guava:guava:%s" % guava_version,
    )