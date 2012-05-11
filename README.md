
    javac Server.java -cp $VERTX_HOME/lib/jars/vert.x-core.jar:$VERTX_HOME/lib/jars/vert.x-platform.jar

    vertx run Server -cp . -instances 4

