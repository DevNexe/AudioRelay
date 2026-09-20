package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public class x43 {
    public static volatile x43 a;
    public static final Logger b;

    public static final class QnHx {
        public static ArrayList a(List list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((kg3) obj) != kg3.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kg3) it.next()).w);
            }
            return arrayList2;
        }

        public static byte[] b(List list) {
            gg ggVar = new gg();
            for (String str : a(list)) {
                ggVar.L(str.length());
                ggVar.T(0, str.length(), str);
            }
            return ggVar.n(ggVar.x);
        }

        public static boolean c() {
            return ur1.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[PHI: r1
  0x014c: PHI (r1v3 x43) = (r1v1 x43), (r1v0 x43), (r1v4 x43) binds: [B:65:0x014a, B:23:0x006c, B:24:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    static {
        x43 x43Var;
        new QnHx();
        x43 ks1Var = null;
        if (QnHx.c()) {
            for (Map.Entry<String, String> entry : Oe.b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (Oe.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(Xq.a);
                }
            }
            x43Var = NfSJ.d ? new NfSJ() : null;
            if (x43Var == null) {
                if (U3s.e) {
                    ks1Var = new U3s();
                }
                x43Var = ks1Var;
            }
        } else if (ur1.a("Conscrypt", Security.getProviders()[0].getName())) {
            x43Var = p60.d ? new p60() : null;
            if (x43Var == null) {
                if (!ur1.a("BC", Security.getProviders()[0].getName())) {
                    if (ce.d) {
                        x43Var = new ce();
                    } else {
                        x43Var = null;
                    }
                    if (x43Var == null) {
                        if (ur1.a("OpenJSSE", Security.getProviders()[0].getName())) {
                            if (iv2.d) {
                                x43Var = new iv2();
                            } else {
                                x43Var = null;
                            }
                            if (x43Var == null) {
                                if (ls1.c) {
                                    x43Var = new ls1();
                                } else {
                                    x43Var = null;
                                }
                                if (x43Var == null) {
                                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        ks1Var = new ks1(cls.getMethod("put", SSLSocket.class, Class.forName(ur1.d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null)), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName(ur1.d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null), Class.forName(ur1.d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null));
                                    }
                                    if (ks1Var != null) {
                                        x43Var = ks1Var;
                                    } else {
                                        x43Var = new x43();
                                    }
                                }
                            }
                        } else {
                            if (ls1.c) {
                                x43Var = new ls1();
                            } else {
                                x43Var = null;
                            }
                            if (x43Var == null) {
                                if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    ks1Var = new ks1(cls2.getMethod("put", SSLSocket.class, Class.forName(ur1.d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null)), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName(ur1.d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null), Class.forName(ur1.d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null));
                                }
                                if (ks1Var != null) {
                                    x43Var = ks1Var;
                                } else {
                                    x43Var = new x43();
                                }
                            }
                        }
                    }
                } else if (ur1.a("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (ls1.c) {
                        x43Var = new ls1();
                    } else {
                        x43Var = null;
                    }
                    if (x43Var == null) {
                        if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            ks1Var = new ks1(cls3.getMethod("put", SSLSocket.class, Class.forName(ur1.d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null)), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName(ur1.d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null), Class.forName(ur1.d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null));
                        }
                        if (ks1Var != null) {
                            x43Var = ks1Var;
                        } else {
                            x43Var = new x43();
                        }
                    }
                } else {
                    if (iv2.d) {
                        x43Var = new iv2();
                    } else {
                        x43Var = null;
                    }
                    if (x43Var == null) {
                        if (ls1.c) {
                            x43Var = new ls1();
                        } else {
                            x43Var = null;
                        }
                        if (x43Var == null) {
                            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                ks1Var = new ks1(cls4.getMethod("put", SSLSocket.class, Class.forName(ur1.d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null)), cls4.getMethod("get", SSLSocket.class), cls4.getMethod("remove", SSLSocket.class), Class.forName(ur1.d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null), Class.forName(ur1.d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null));
                            }
                            if (ks1Var != null) {
                                x43Var = ks1Var;
                            } else {
                                x43Var = new x43();
                            }
                        }
                    }
                }
            }
        } else if (!ur1.a("BC", Security.getProviders()[0].getName())) {
            if (ce.d) {
                x43Var = new ce();
            } else {
                x43Var = null;
            }
            if (x43Var == null) {
                if (ur1.a("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (ls1.c) {
                        x43Var = new ls1();
                    } else {
                        x43Var = null;
                    }
                    if (x43Var == null) {
                        if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                            Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            ks1Var = new ks1(cls5.getMethod("put", SSLSocket.class, Class.forName(ur1.d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null)), cls5.getMethod("get", SSLSocket.class), cls5.getMethod("remove", SSLSocket.class), Class.forName(ur1.d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null), Class.forName(ur1.d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null));
                        }
                        if (ks1Var != null) {
                            x43Var = ks1Var;
                        } else {
                            x43Var = new x43();
                        }
                    }
                } else {
                    if (iv2.d) {
                        x43Var = new iv2();
                    } else {
                        x43Var = null;
                    }
                    if (x43Var == null) {
                        if (ls1.c) {
                            x43Var = new ls1();
                        } else {
                            x43Var = null;
                        }
                        if (x43Var == null) {
                            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                ks1Var = new ks1(cls6.getMethod("put", SSLSocket.class, Class.forName(ur1.d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null)), cls6.getMethod("get", SSLSocket.class), cls6.getMethod("remove", SSLSocket.class), Class.forName(ur1.d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null), Class.forName(ur1.d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null));
                            }
                            if (ks1Var != null) {
                                x43Var = ks1Var;
                            } else {
                                x43Var = new x43();
                            }
                        }
                    }
                }
            }
        } else if (ur1.a("OpenJSSE", Security.getProviders()[0].getName())) {
            if (ls1.c) {
                x43Var = new ls1();
            } else {
                x43Var = null;
            }
            if (x43Var == null) {
                try {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        try {
                            Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            ks1Var = new ks1(cls7.getMethod("put", SSLSocket.class, Class.forName(ur1.d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null)), cls7.getMethod("get", SSLSocket.class), cls7.getMethod("remove", SSLSocket.class), Class.forName(ur1.d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null), Class.forName(ur1.d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null));
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (ks1Var != null) {
                    x43Var = ks1Var;
                } else {
                    x43Var = new x43();
                }
            }
        } else {
            if (iv2.d) {
                x43Var = new iv2();
            } else {
                x43Var = null;
            }
            if (x43Var == null) {
                if (ls1.c) {
                    x43Var = new ls1();
                } else {
                    x43Var = null;
                }
                if (x43Var == null) {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        ks1Var = new ks1(cls8.getMethod("put", SSLSocket.class, Class.forName(ur1.d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null)), cls8.getMethod("get", SSLSocket.class), cls8.getMethod("remove", SSLSocket.class), Class.forName(ur1.d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null), Class.forName(ur1.d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null));
                    }
                    if (ks1Var != null) {
                        x43Var = ks1Var;
                    } else {
                        x43Var = new x43();
                    }
                }
            }
        }
        a = x43Var;
        b = Logger.getLogger(rt2.class.getName());
    }

    public static void i(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public B8C b(X509TrustManager x509TrustManager) {
        return new z8(c(x509TrustManager));
    }

    public kb5 c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new l9((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<kg3> list) {
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        return true;
    }

    public void j(Object obj, String str) {
        if (obj == null) {
            str = ur1.d(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", str);
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() {
        return SSLContext.getInstance("TLS");
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextK.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError(ur1.d(e, "No System TLS: "), e);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            throw new IllegalStateException(ur1.d(Arrays.toString(trustManagers), "Unexpected default trust managers: ").toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
