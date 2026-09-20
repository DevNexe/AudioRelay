package defpackage;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class NfSJ extends x43 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = x43.QnHx.c() && Build.VERSION.SDK_INT >= 29;
    }

    public NfSJ() {
        dq4[] dq4VarArr = new dq4[4];
        dq4VarArr[0] = x43.QnHx.c() && Build.VERSION.SDK_INT >= 29 ? new oKn9() : null;
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
    public final void d(SSLSocket sSLSocket, String str, List<? extends kg3> list) {
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
    @SuppressLint({"NewApi"})
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
