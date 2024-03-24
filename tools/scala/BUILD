load("@io_bazel_rules_scala//scala_proto:scala_proto_toolchain.bzl", "scala_proto_toolchain","scala_proto_deps_toolchain")
load("@io_bazel_rules_scala//scala:providers.bzl", "declare_deps_provider")

scala_proto_toolchain(
    name = "scala_proto_toolchain",
    with_grpc = False,
    with_flat_package = False,
    with_single_line_to_string = False,
    visibility = ["//visibility:public"],
)

toolchain(
    name = "scalapb_toolchain",
    toolchain = ":scala_proto_toolchain",
    toolchain_type = "@io_bazel_rules_scala//scala_proto:toolchain_type",
    visibility = ["//visibility:public"],
)

toolchain(
    name = "scalapb_deps_toolchain",
    toolchain = ":scalapb_deps_toolchain_impl",
    toolchain_type = "@io_bazel_rules_scala//scala_proto:deps_toolchain_type",
)

scala_proto_deps_toolchain(
    name = "scalapb_deps_toolchain_impl",
    dep_providers = [
        ":scalapb_compile_dependencies",
        ":scalapb_worker_deps_provider",
    ],
    visibility = ["//visibility:public"],
)

declare_deps_provider(
    name = "scalapb_compile_dependencies",
    deps_id = "scalapb_compile_deps",
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:protobuf_java",
        "@io_bazel_rules_scala_scala_library//jar",
        "@maven//:com_lihaoyi_fastparse_2_13",
        "@maven//:com_thesamet_scalapb_lenses_2_13",
        "@maven//:com_thesamet_scalapb_scalapb_runtime_2_13",
        "@maven//:org_scala_lang_modules_scala_collection_compat_2_13",
    ],
)

declare_deps_provider(
    name = "scalapb_worker_deps_provider",
    deps_id = "scalapb_worker_deps",
    visibility = ["//visibility:public"],
    deps = [
        "@com_google_protobuf//:protobuf_java",
        "@maven//:com_thesamet_scalapb_compilerplugin_2_13",
        "@maven//:com_thesamet_scalapb_protoc_bridge_2_13",
    ],
)
