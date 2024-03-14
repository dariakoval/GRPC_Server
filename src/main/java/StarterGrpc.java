import io.grpc.Server;
import io.grpc.ServerBuilder;
import seervice.GRPCService;

import java.io.IOException;

public class StarterGrpc {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("сервер run");
        Server server= ServerBuilder
                .forPort(8080)
                .addService(new GRPCService())
                .build();
        server.start();

        server.awaitTermination();
    }
}
