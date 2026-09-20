package defpackage;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class qt2 implements yl {
    public final jg1 a;
    public final wm<xp3> b;

    public qt2(jg1 jg1Var, xm xmVar) {
        this.a = jg1Var;
        this.b = xmVar;
    }

    @Override // defpackage.yl
    public final void a(bj3 bj3Var, xp3 xp3Var) {
        if (bj3Var.L) {
            return;
        }
        this.b.x(xp3Var);
    }

    @Override // defpackage.yl
    public final void b(IOException iOException) {
        Object obj;
        wm<xp3> wmVar = this.b;
        if (wmVar.isCancelled()) {
            return;
        }
        boolean z = false;
        if (!(iOException.getSuppressed().length == 0)) {
            iOException = iOException.getSuppressed()[0];
        }
        if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            if (message != null && mv4.y(message, "connect", true)) {
                z = true;
            }
            jg1 jg1Var = this.a;
            if (z) {
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append(jg1Var.a);
                sb.append(", connect_timeout=");
                ah1.CQf cQf = ah1.d;
                ah1.QnHx qnHx = (ah1.QnHx) jg1Var.a();
                if (qnHx == null || (obj = qnHx.b) == null) {
                    obj = "unknown";
                }
                sb.append(obj);
                sb.append(" ms]");
                iOException = new ConnectTimeoutException(sb.toString(), iOException);
            } else {
                iOException = X.b(jg1Var, iOException);
            }
        }
        wmVar.x(new fq3.QnHx(iOException));
    }
}
