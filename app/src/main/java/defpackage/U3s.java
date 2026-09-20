package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class U3s extends x43 {
    public static final boolean e;
    public final ArrayList c;
    public final kt d;

    public static final class QnHx implements kb5 {
        public final X509TrustManager a;
        public final Method b;

        public QnHx(X509TrustManager x509TrustManager, Method method) {
            this.a = x509TrustManager;
            this.b = method;
        }

        @Override // defpackage.kb5
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object objInvoke = this.b.invoke(this.a, x509Certificate);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.a, qnHx.a) && ur1.a(this.b, qnHx.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        e = x43.QnHx.c() && Build.VERSION.SDK_INT < 30;
    }

    public U3s() throws NoSuchMethodException {
        rr4 rr4Var;
        Method method;
        Method method2;
        dq4[] dq4VarArr = new dq4[4];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(ur1.d(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            Class.forName(ur1.d(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            Class.forName(ur1.d(".SSLParametersImpl", "com.android.org.conscrypt"));
            rr4Var = new rr4(cls);
        } catch (Exception e2) {
            x43.a.getClass();
            x43.i(5, "unable to load android socket classes", e2);
            rr4Var = null;
        }
        dq4VarArr[0] = rr4Var;
        dq4VarArr[1] = new ri0(IrK.f);
        dq4VarArr[2] = new ri0(q60.a);
        dq4VarArr[3] = new ri0(de.a);
        ArrayList arrayListE0 = oV9.e0(dq4VarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListE0) {
            if (((dq4) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new kt(method3, method2, method);
    }

    @Override // defpackage.x43
    public final B8C b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        FnN fnN = x509TrustManagerExtensions != null ? new FnN(x509TrustManager, x509TrustManagerExtensions) : null;
        return fnN == null ? super.b(x509TrustManager) : fnN;
    }

    @Override // defpackage.x43
    public final kb5 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new QnHx(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.x43
    public final void d(SSLSocket sSLSocket, String str, List<kg3> list) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((dq4) next).a(sSLSocket));
        dq4 dq4Var = (dq4) next;
        if (dq4Var == null) {
            return;
        }
        dq4Var.d(sSLSocket, str, list);
    }

    @Override // defpackage.x43
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.x43
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((dq4) next).a(sSLSocket));
        dq4 dq4Var = (dq4) next;
        if (dq4Var == null) {
            return null;
        }
        return dq4Var.c(sSLSocket);
    }

    @Override // defpackage.x43
    public final Object g() {
        kt ktVar = this.d;
        Method method = ktVar.a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            ktVar.b.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.x43
    public final boolean h(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // defpackage.x43
    public final void j(Object obj, String str) {
        kt ktVar = this.d;
        ktVar.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                ktVar.c.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        x43.i(5, str, null);
    }
}
