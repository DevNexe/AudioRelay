package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class wh6 {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ wh6(bi6 bi6Var, int i, boolean z, boolean z2) {
        this.d = bi6Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final b60 a(SSLSocket sSLSocket) throws UnknownServiceException {
        b60 b60Var;
        boolean z;
        int i = this.a;
        List list = (List) this.d;
        int size = list.size();
        while (true) {
            if (i >= size) {
                b60Var = null;
                break;
            }
            int i2 = i + 1;
            b60Var = (b60) list.get(i);
            if (b60Var.b(sSLSocket)) {
                this.a = i2;
                break;
            }
            i = i2;
        }
        if (b60Var == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.c + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i3 = this.a;
        int size2 = list.size();
        while (true) {
            if (i3 >= size2) {
                z = false;
                break;
            }
            int i4 = i3 + 1;
            if (((b60) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3 = i4;
        }
        this.b = z;
        boolean z2 = this.c;
        String[] strArr = b60Var.c;
        String[] strArrP = strArr != null ? qf5.p(sSLSocket.getEnabledCipherSuites(), strArr, pq.c) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = b60Var.d;
        String[] strArrP2 = strArr2 != null ? qf5.p(sSLSocket.getEnabledProtocols(), strArr2, gk2.w) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        pq.QnHx qnHx = pq.c;
        byte[] bArr = qf5.a;
        int length = supportedCipherSuites.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (qnHx.compare(supportedCipherSuites[i5], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i5++;
        }
        if (z2 && i5 != -1) {
            String str = supportedCipherSuites[i5];
            strArrP = (String[]) Arrays.copyOf(strArrP, strArrP.length + 1);
            strArrP[strArrP.length - 1] = str;
        }
        b60.QnHx qnHx2 = new b60.QnHx(b60Var);
        qnHx2.c((String[]) Arrays.copyOf(strArrP, strArrP.length));
        qnHx2.f((String[]) Arrays.copyOf(strArrP2, strArrP2.length));
        b60 b60VarA = qnHx2.a();
        if (b60VarA.c() != null) {
            sSLSocket.setEnabledProtocols(b60VarA.d);
        }
        if (b60VarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(b60VarA.c);
        }
        return b60Var;
    }

    public final void b(String str) {
        ((bi6) this.d).r(this.a, this.b, this.c, str, null, null, null);
    }

    public final void c(Object obj, String str) {
        ((bi6) this.d).r(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void d(Object obj, String str, Object obj2) {
        ((bi6) this.d).r(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void e(String str, Object obj, Object obj2, Object obj3) {
        ((bi6) this.d).r(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
