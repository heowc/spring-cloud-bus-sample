### docker

```bash
$ docker run -d -p 5672:5672 -p 15672:15672 rabbitmq:3.7-management-alpine
```

### Architecture

```text
 ::Cloud Bus (with Config Server, Service Discovery)::

                 ┌───────────────────────┐
                 │ config/bus     (8888) │ ↔ docker(rabbitmq)
                 └───────────────────────┘
 ┌───────────────────────┐   │   ┌───────────────────────┐
 │ mileage-service(8081) │ <─┼─> │ user-service   (8082) │
 └───────────────────────┘   │   └───────────────────────┘
                 ┌───────────────────────┐
                 │ discovery      (8761) │
                 └───────────────────────┘
```
