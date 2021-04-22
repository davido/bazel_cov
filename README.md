To reproduce run with bazel@HEAD:

```
  $ bazel coverage javatests/cov:CovTest
INFO: Using default value for --instrumentation_filter: "^//java/cov[/:]".
INFO: Override the above default with --instrumentation_filter
INFO: Analyzed target //javatests/cov:CovTest (0 packages loaded, 0 targets configured).
INFO: Found 1 test target...
FAIL: //javatests/cov:CovTest (see /home/davido/.cache/bazel/_bazel_davido/842e4e28830cd5724c3a44ec2d887148/execroot/__main__/bazel-out/k8-fastbuild/testlogs/javatests/cov/CovTest/test.log)
Target //javatests/cov:CovTest up-to-date:
  bazel-bin/javatests/cov/CovTest.jar
  bazel-bin/javatests/cov/CovTest
INFO: Elapsed time: 0.498s, Critical Path: 0.40s
INFO: 2 processes: 1 internal, 1 linux-sandbox.
INFO: Build completed, 1 test FAILED, 2 total actions
//javatests/cov:CovTest                                                  FAILED in 0.4s
  /home/davido/.cache/bazel/_bazel_davido/842e4e28830cd5724c3a44ec2d887148/execroot/__main__/bazel-out/k8-fastbuild/testlogs/javatests/cov/CovTest/test.log

INFO: Build completed, 1 test FAILED, 2 total actions
```
