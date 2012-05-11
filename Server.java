import org.vertx.java.core.AsyncResult;
import org.vertx.java.core.AsyncResultHandler;
import org.vertx.java.core.Handler;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.deploy.Verticle;

public class Server extends Verticle {
  public void start() {
    final HttpServer server = vertx.createHttpServer();
    final int port = System.getenv("PORT") != null ? Integer.valueOf(System.getenv("PORT")) : 8080;

    server.requestHandler(new Handler<HttpServerRequest>() {
      public void handle(final HttpServerRequest req) {
        req.response.putHeader("Content-Type", "text/plain");
        req.response.end("hello, world");
      }
    });

    server.listen(8080);
  }
}
