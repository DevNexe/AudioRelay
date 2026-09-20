package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class ri0 implements dq4 {
    public final QnHx a;
    public dq4 b;

    public interface QnHx {
        boolean a(SSLSocket sSLSocket);

        dq4 b(SSLSocket sSLSocket);
    }

    public ri0(QnHx qnHx) {
        this.a = qnHx;
    }

    @Override // defpackage.dq4
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.dq4
    public final boolean b() {
        return true;
    }

    @Override // defpackage.dq4
    public final String c(SSLSocket sSLSocket) {
        dq4 dq4Var;
        synchronized (this) {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
            dq4Var = this.b;
        }
        if (dq4Var == null) {
            return null;
        }
        return dq4Var.c(sSLSocket);
    }

    @Override // defpackage.dq4
    public final void d(SSLSocket sSLSocket, String str, List<? extends kg3> list) {
        dq4 dq4Var;
        synchronized (this) {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
            dq4Var = this.b;
        }
        if (dq4Var == null) {
            return;
        }
        dq4Var.d(sSLSocket, str, list);
    }
}
