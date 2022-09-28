//package old.rest.okHttp;
//
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//
//import java.io.IOException;
//
//public class ApplOkHttp {
//    public static void main(String[] args) throws IOException {
//
//        OkHttpClient client = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url("https://api.github.com/users/vmuravskyi")
//                .get()
//                .build();
//        Response response = client.newCall(request).execute();
//        System.out.println(response.body().string());
//
//    }
//}
