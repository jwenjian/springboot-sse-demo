# springboot-sse-demo
Demo project that use SSE in SpringBoot to send message to UI.

# About SSE
[SSE](https://en.wikipedia.org/wiki/Server-sent_events) is a server push technology enabling a browser to receive automatic updates from a server via HTTP connection. The Server-Sent Events EventSource API is standardized as part of HTML5[1] by the W3C.

# Dependency

## Java
- SpringBoot Starter Web
- Thymleaf

## UI
- [danmaku](https://github.com/weizhenye/Danmaku)
- [water.css](https://github.com/kognise/water.css)

# Run
> Requirement:
1. JDK8+
2. Maven3+

1. Clone the repository
2. `mvn clean install -DskipTests`
3. `java -jar target/sse-demo-0.0.1-SNAPSHOT.jar`
4. Browse `http://localhost:4000` in your browser
> Note: IE is not supported, see [Browser_compatibility](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Browser_compatibility)

You can also see the dev tools for detail.

# Screenshot
- UI
![image](https://user-images.githubusercontent.com/25657798/62934355-eac69c80-bdf6-11e9-9050-c46ea697db84.png)

- Network in Dev tool
![image](https://user-images.githubusercontent.com/25657798/62934783-f9fa1a00-bdf7-11e9-8d28-0631acc52072.png)

