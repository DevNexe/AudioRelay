package defpackage;

import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes3.dex */
public class r94<E> extends p94 {
    public final wm<sd5> A;
    public final E z;

    /* JADX WARN: Multi-variable type inference failed */
    public r94(Object obj, xm xmVar) {
        this.z = obj;
        this.A = xmVar;
    }

    @Override // defpackage.p94
    public final void s() {
        this.A.u();
    }

    @Override // defpackage.p94
    public final E t() {
        return this.z;
    }

    @Override // kotlinx.coroutines.internal.QnHx
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(lf0.a(this));
        sb.append('(');
        return o5.d(sb, this.z, ')');
    }

    @Override // defpackage.p94
    public final void u(nt<?> ntVar) {
        Throwable closedSendChannelException = ntVar.z;
        if (closedSendChannelException == null) {
            closedSendChannelException = new ClosedSendChannelException();
        }
        this.A.x(new fq3.QnHx(closedSendChannelException));
    }

    @Override // defpackage.p94
    public final py4 v() {
        if (this.A.q(sd5.a, null) == null) {
            return null;
        }
        return ym.w;
    }
}
