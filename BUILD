load("@rules_proto//proto:defs.bzl", "proto_library")
load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scala_proto_library")

proto_library(
    name = "addressbook_proto",
    srcs = ["src/main/protobuf/addressbook.proto"],
    strip_import_prefix = "/src/main/protobuf",
    visibility = ["//visibility:public"],
)

scala_proto_library(
    name = "addressbook_scala_proto",
    visibility = ["//visibility:public"],
    deps = [
        ":addressbook_proto",
    ],
)

java_proto_library(
    name = "addressbook_java_proto",
    visibility = ["//visibility:public"],
    deps = [
        ":addressbook_proto",
    ],
)
