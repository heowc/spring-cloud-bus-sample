### docker

```bash
$ docker run -d -p 5672:5672 --name rabbitmq rabbitmq:3.7.4-rc.4-alpine
```

### Architecture

```text
 ::Cloud Bus (with Config Server, Service Discovery)::

                 ┌───────────────────────┐
                 │ config/bus     (8888) │
                 └───────────────────────┘
 ┌───────────────────────┐   │   ┌───────────────────────┐
 │ mileage-service(8081) │ <─┼─> │ user-service   (8082) │
 └───────────────────────┘   │   └───────────────────────┘
                 ┌───────────────────────┐
                 │ discovery      (8761) │
                 └───────────────────────┘
```
