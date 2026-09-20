package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class ks1 extends x43 {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class<?> f;
    public final Class<?> g;

    public static final class QnHx implements InvocationHandler {
        public final List<String> a;
        public boolean b;
        public String c;

        public QnHx(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (ur1.a(name, "supports") && ur1.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (ur1.a(name, "unsupported") && ur1.a(Void.TYPE, returnType)) {
                this.b = true;
                return null;
            }
            boolean zA = ur1.a(name, "protocols");
            List<String> list = this.a;
            if (zA) {
                if (objArr.length == 0) {
                    return list;
                }
            }
            if ((ur1.a(name, "selectProtocol") || ur1.a(name, "select")) && ur1.a(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list2 = (List) obj2;
                    int size = list2.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            Object obj3 = list2.get(i);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj3;
                            if (list.contains(str)) {
                                this.c = str;
                                return str;
                            }
                            if (i != size) {
                                i = i2;
                            }
                        }
                    }
                    String str2 = list.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((!ur1.a(name, "protocolSelected") && !ur1.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.c = (String) obj4;
            return null;
        }
    }

    public ks1(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // defpackage.x43
    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // defpackage.x43
    public final void d(SSLSocket sSLSocket, String str, List<? extends kg3> list) {
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(x43.class.getClassLoader(), new Class[]{this.f, this.g}, new QnHx(x43.QnHx.a(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // defpackage.x43
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            QnHx qnHx = (QnHx) invocationHandler;
            boolean z = qnHx.b;
            if (!z && qnHx.c == null) {
                x43.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return qnHx.c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
