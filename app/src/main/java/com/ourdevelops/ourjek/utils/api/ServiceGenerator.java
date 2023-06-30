package com.ourdevelops.ourjek.utils.api;

import android.util.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ourdevelops.ourjek.BuildConfig;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.utils.AppLogger;
import com.ourdevelops.ourjek.utils.BooleanSerializerDeserializer;
import com.ourdevelops.ourjek.utils.Log;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pagodalabs on 10/13/2019.
 */

public class ServiceGenerator {
    private static BooleanSerializerDeserializer booleanSerializerDeserializer = new BooleanSerializerDeserializer();
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            httpClient.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
            httpClient.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            OkHttpClient okHttpClient = httpClient.build();
            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .serializeNulls()
            .registerTypeAdapter(Boolean.class, booleanSerializerDeserializer)
            .registerTypeAdapter(boolean.class, booleanSerializerDeserializer)
            .create();


    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(Constants.CONNECTION)
                    .client(getUnsafeOkHttpClient())
//                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson));

    public static <S> S createService(Class<S> serviceClass) {
        return createService(serviceClass, null, null,null);
    }


//    public static <S> S createService(Class<S> serviceClass, String username, String password) {
//        if (!httpClient.interceptors().isEmpty()) {
//            httpClient.interceptors().clear();
//        }
//        String userId = getLoggedInUserId();
//        AppLogger.INSTANCE.log("my user id == > " + userId);
//        android.util.Log.d("checker", "createService:" + username + " password " + password);
//
//        if (username != null && password != null) {
//            String credentials = username + ":" + password;
//
//            final String basic =
//                    "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);
//
//            httpClient.addInterceptor(chain -> {
//                Request original = chain.request();
//
//                Request.Builder requestBuilder = null;
//                try {
//                    requestBuilder = original.newBuilder()
//                            .addHeader("user", "sabin")
//                            .addHeader("password", "123456")
//
//
//
////                            .addHeader("IdCustomer", userId)
////                            .addHeader("deviceType", "android")
////                            .addHeader("appVersion",  BuildConfig.VERSION_NAME)
//
//
//
////                                .addHeader("password", String.valueOf(encrypt(password)))
//                            //                            .header("Authorization", basic)
////                                .header("Accept", "application/json")
////                                .addHeader("Content-Type", " application/json")
//                            .method(original.method(), original.body());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//                Request request = null;
//                if (requestBuilder != null) {
//                    request = requestBuilder.build();
//                }
//                return chain.proceed(request);
//            });
//        }
//
//        if (BuildConfig.DEBUG) {
//            if (Log.LOG) {
//                HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//                logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//                httpClient.addInterceptor(logging);
//            }
//        }
//
//        OkHttpClient client = httpClient
//                .connectTimeout(60, TimeUnit.SECONDS)
//                .readTimeout(60, TimeUnit.SECONDS)
//                .writeTimeout(60, TimeUnit.SECONDS)
//                .build();
//        Retrofit retrofit = builder.client(client).build();
//        return retrofit.create(serviceClass);
//    }

    public static <S> S createService(Class<S> serviceClass, String username, String password,String token) {
        if (!httpClient.interceptors().isEmpty()) {
            httpClient.interceptors().clear();
        }
        String userId = getLoggedInUserId();
        AppLogger.INSTANCE.log("my user id == > " + userId);
        android.util.Log.d("checker", "createService:" + username + " password " + password);

        if (username != null && password != null && token != null) {
            String credentials = username + ":" + password;

            final String basic =
                    "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

            httpClient.addInterceptor(chain -> {
                Request original = chain.request();

                Request.Builder requestBuilder = null;
                try {
                    requestBuilder = original.newBuilder()
                            .header("user", "sabin")
                            .header("password", "123456")
                            .method(original.method(), original.body());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Request request = null;
                if (requestBuilder != null) {
                    request = requestBuilder.build();
                }
                return chain.proceed(request);
            });
        }

        if (BuildConfig.DEBUG) {
            if (Log.LOG) {
                HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
                logging.setLevel(HttpLoggingInterceptor.Level.BODY);
                httpClient.addInterceptor(logging);
            }
        }

        OkHttpClient client = httpClient
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = builder.client(client).build();
        return retrofit.create(serviceClass);
    }



    public static <S> S createService(Class<S> serviceClass, String username, String password, String latitude, String longitude) {
        if (!httpClient.interceptors().isEmpty()) {
            httpClient.interceptors().clear();
        }
        String userId = getLoggedInUserId();
        AppLogger.INSTANCE.log("my user id == > " + userId);
        android.util.Log.d("checker", "createService:" + username + " password " + password);
        if (username != null && password != null) {
            String credentials = username + ":" + password;

            final String basic =
                    "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

            httpClient.addInterceptor(chain -> {
                Request original = chain.request();

                Request.Builder requestBuilder = null;
                try {
                    requestBuilder = original.newBuilder()
                            .addHeader("user", username)
                            .addHeader("password", password)
                            .addHeader("IdCustomer", userId)
                            .addHeader("CustomerLatitude", latitude)
                            .addHeader("CustomerLongitude", longitude)
                            .addHeader("deviceType", "android")
                            .addHeader("appVersion",  BuildConfig.VERSION_NAME)
//                                .addHeader("password", String.valueOf(encrypt(password)))
                            //                            .header("Authorization", basic)
//                                .header("Accept", "application/json")
//                                .addHeader("Content-Type", " application/json")
                            .method(original.method(), original.body());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Request request = requestBuilder.build();
                return chain.proceed(request);
            });
        }

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            httpClient.addInterceptor(logging);
        }

        OkHttpClient client = httpClient
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = builder.client(client).build();
        return retrofit.create(serviceClass);
    }

    public static String getLoggedInUserId() {
        if (BaseApp.loginUser != null) {
            return BaseApp.loginUser.getId();
        } else {
            return "";
        }
    }


}
