# web-test
## Java Golang Rust 常用web框架性能测试
### 测试内容：Demo Hello World
### 测试环境：Mac m1max
### 测试工具：wrk 线程10 连接1000
---
### rust_axum_0.7.4 内存占用21M

```
Running 40s test @ http://localhost:8080
  10 threads and 1000 connections   10线程 1000连接 持续40秒
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.37ms    2.33ms  85.98ms   95.81%
    Req/Sec    14.41k     4.60k   36.67k    73.88%
  Latency Distribution 耗时分布
     50%    0.89ms
     75%    1.37ms
     90%    2.17ms
     99%   10.84ms
  5733517 requests in 40.10s, 710.83MB read  40秒处理5733517个请求 读取了710.83MB数据
  Socket errors: connect 759, read 108, write 0, timeout 0
Requests/sec: 142984.12  平均每秒处理142984个请求
Transfer/sec:     17.73MB 平均秒每秒处理数据
```
### rust_actix_4 内存占用8M

```
Running 40s test @ http://localhost:8080
  10 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.46ms    2.76ms 116.57ms   97.94%
    Req/Sec    14.03k     5.17k   85.42k    73.55%
  Latency Distribution
     50%    1.32ms
     75%    1.56ms
     90%    1.75ms
     99%   10.74ms
  5573066 requests in 40.10s, 467.71MB read
  Socket errors: connect 759, read 189, write 0, timeout 0
Requests/sec: 138982.68
Transfer/sec:     11.66MB
```

### go_fiber_2.52.5 内存占用 11M
```
Running 40s test @ http://localhost:8080
  10 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     1.59ms    3.90ms 134.10ms   97.15%
    Req/Sec    14.34k     7.40k  147.51k    89.83%
  Latency Distribution
     50%    0.98ms
     75%    1.59ms
     90%    2.31ms
     99%   14.44ms
  5689786 requests in 40.10s, 705.41MB read
  Socket errors: connect 759, read 109, write 0, timeout 0
Requests/sec: 141895.49
Transfer/sec:     17.59MB
```

### go_chi_5.1.0 内存占用19M

```
Running 40s test @ http://localhost:8080
  10 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.04ms    1.76ms  60.92ms   82.86%
    Req/Sec     7.82k     2.83k   48.40k    87.65%
  Latency Distribution
     50%    3.26ms
     75%    3.60ms
     90%    3.89ms
     99%    8.77ms
  3116195 requests in 40.08s, 383.37MB read
  Socket errors: connect 759, read 108, write 0, timeout 0
Requests/sec:  77744.98
Transfer/sec:      9.56MB
```


### go_gin_1.10.0 内存占用19M

```
Running 40s test @ http://localhost:8080
  10 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.02ms    1.66ms  53.09ms   82.98%
    Req/Sec     7.84k     3.19k   46.06k    78.04%
  Latency Distribution
     50%    3.21ms
     75%    3.54ms
     90%    3.85ms
     99%    8.51ms
  3125042 requests in 40.09s, 381.47MB read
  Socket errors: connect 759, read 105, write 0, timeout 0
Requests/sec:  77942.79
Transfer/sec:      9.51MB
```


### go_echo_4.12.0 内存占用20M

```
Running 40s test @ http://localhost:8080
  10 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.03ms    1.53ms  54.77ms   82.85%
    Req/Sec     7.85k     2.43k   34.55k    83.75%
  Latency Distribution
     50%    3.23ms
     75%    3.56ms
     90%    3.85ms
     99%    7.80ms
  3126967 requests in 40.06s, 387.67MB read
  Socket errors: connect 759, read 107, write 0, timeout 0
Requests/sec:  78055.53
Transfer/sec:      9.68MB
```


### java_springboot_3.3.0 内存占用580M
```
Running 40s test @ http://localhost:8080/test
  10 threads and 1000 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.65ms   17.82ms 342.34ms   98.59%
    Req/Sec     7.22k     2.42k   15.81k    73.64%
  Latency Distribution
     50%    3.01ms
     75%    3.17ms
     90%    3.30ms
     99%   81.77ms
  2156984 requests in 40.04s, 257.52MB read
  Socket errors: connect 759, read 175, write 0, timeout 0
Requests/sec:  53872.05
Transfer/sec:      6.43MB
```