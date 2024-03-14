package seervice;
import io.grpc.stub.StreamObserver;
import org.example.grpc.GreetingServiceGrpc;
import org.example.grpc.GreetingServiceOuterClass;

public class GRPCService extends GreetingServiceGrpc.GreetingServiceImplBase{
    @Override
    public void greeting(GreetingServiceOuterClass.HelloRequest rq
            , StreamObserver<GreetingServiceOuterClass.HelloResponse> rs){
        GreetingServiceOuterClass.HelloResponse rs_cli = GreetingServiceOuterClass
                .HelloResponse
                .newBuilder()
                .setGreeting("Работает!")
                .build();
        rs.onNext(rs_cli);
        rs.onCompleted();
    }
}
