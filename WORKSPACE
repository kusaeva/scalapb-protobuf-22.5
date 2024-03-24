workspace(name = "scalapb-protobuf")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "bazel_features",
    sha256 = "06f02b97b6badb3227df2141a4b4622272cdcd2951526f40a888ab5f43897f14",
    strip_prefix = "bazel_features-1.9.0",
    url = "https://github.com/bazel-contrib/bazel_features/releases/download/v1.9.0/bazel_features-v1.9.0.tar.gz",
)

load("@bazel_features//:deps.bzl", "bazel_features_deps")
bazel_features_deps()

http_archive(
    name = "rules_java",
    sha256 = "976ef08b49c929741f201790e59e3807c72ad81f428c8bc953cdbeff5fed15eb",
    url = "https://github.com/bazelbuild/rules_java/releases/download/7.4.0/rules_java-7.4.0.tar.gz",
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "85fd6bad58ac76cc3a27c8e051e4255ff9ccd8c92ba879670d195622e7c0a9b7",
    strip_prefix = "rules_jvm_external-6.0",
    url = "https://github.com/bazelbuild/rules_jvm_external/releases/download/6.0/rules_jvm_external-6.0.tar.gz",
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

http_archive(
    name = "bazel_skylib",
    sha256 = "af87959afe497dc8dfd4c6cb66e1279cb98ccc84284619ebfec27d9c09a903de",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/1.2.0/bazel-skylib-1.2.0.tar.gz",
)

http_archive(
    name = "rules_proto",
    sha256 = "71fdbed00a0709521ad212058c60d13997b922a5d01dbfd997f0d57d689e7b67",
    strip_prefix = "rules_proto-6.0.0-rc2",
    url = "https://github.com/bazelbuild/rules_proto/releases/download/6.0.0-rc2/rules_proto-6.0.0-rc2.tar.gz",
)

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies")

rules_proto_dependencies()

load("@rules_proto//proto:toolchains.bzl", "rules_proto_toolchains")

rules_proto_toolchains()

http_archive(
    name = "com_github_protocolbuffers_protobuf",
    sha256 = "73d2114b110ade501c3b49547c9dd85959acaa0b4e7ff99fb785b20bea08f34b",
    strip_prefix = "protobuf-3.22.5",
    url = "https://github.com/protocolbuffers/protobuf/archive/v3.22.5.tar.gz",
)

http_archive(
    name = "com_google_protobuf",
    sha256 = "73d2114b110ade501c3b49547c9dd85959acaa0b4e7ff99fb785b20bea08f34b",
    strip_prefix = "protobuf-3.22.5",
    url = "https://github.com/protocolbuffers/protobuf/archive/v3.22.5.tar.gz",
)

http_archive(
    name = "com_google_protobuf_javalite",
    sha256 = "73d2114b110ade501c3b49547c9dd85959acaa0b4e7ff99fb785b20bea08f34b",
    strip_prefix = "protobuf-3.22.5",
    url = "https://github.com/protocolbuffers/protobuf/archive/v3.22.5.tar.gz",
)

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")

protobuf_deps()

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "7adaec1cc787ca1519550e71dbd0cb9c149ee1b06f04ba91dda07c12483aae57",
    strip_prefix = "rules_scala-6.3.0",
    url = "https://github.com/bazelbuild/rules_scala/releases/download/v6.3.0/rules_scala-v6.3.0.tar.gz",
)

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")

scala_config(scala_version = "2.13.11")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories(
    fetch_sources = True,
    overriden_artifacts = {
        "io_bazel_rules_scala_scala_library": {
            "artifact": "org.scala-lang:scala-library:2.13.11",
            "sha256": "71853291f61bda32786a866533361cae474344f5b2772a379179b02112444ed3",
        },
        "io_bazel_rules_scala_scala_compiler": {
            "artifact": "org.scala-lang:scala-compiler:2.13.11",
            "sha256": "c5a14770370e73a69367b131da1533890200b1e2aa70643b73f9ff31ef2e69ec",
        },
        "io_bazel_rules_scala_scala_reflect": {
            "artifact": "org.scala-lang:scala-reflect:2.13.11",
            "sha256": "6a46ed9b333857e8b5ea668bb254ed8e47dacd1116bf53ade9467aa4ae8f1818",
        },
    },
)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

register_toolchains("//tools/scala:scalapb_toolchain")

register_toolchains("//tools/scala:scalapb_deps_toolchain")

maven_install(
    name = "maven",
    artifacts = [
        "com.thesamet.scalapb:scalapb-runtime_2.13:0.11.15",
        "com.thesamet.scalapb:scalapb-runtime-grpc_2.13:0.11.15",
        "com.thesamet.scalapb:lenses_2.13:0.11.15",
        "com.thesamet.scalapb:compilerplugin_2.13:0.11.15",
        "com.thesamet.scalapb:protoc-bridge_2.13:0.9.5",
        "com.lihaoyi:fastparse_2.13:3.0.2",
    ],
    repositories = [
       "https://repo1.maven.org/maven2",
    ],
    use_credentials_from_home_netrc_file = True,
)

