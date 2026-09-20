package defpackage;

import kotlinx.coroutines.channels.ClosedReceiveChannelException;

/* JADX INFO: loaded from: classes3.dex */
public final class nt<E> extends p94 implements ok3<E> {
    public final Throwable z;

    public nt(Throwable th) {
        this.z = th;
    }

    @Override // defpackage.ok3
    public final py4 b(Object obj) {
        return ym.w;
    }

    @Override // defpackage.ok3
    public final Object d() {
        return this;
    }

    @Override // defpackage.ok3
    public final void g(E e) {
    }

    @Override // defpackage.p94
    public final void s() {
    }

    @Override // defpackage.p94
    public final Object t() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.QnHx
    public final String toString() {
        return "Closed@" + lf0.a(this) + '[' + this.z + ']';
    }

    @Override // defpackage.p94
    public final void u(nt<?> ntVar) {
    }

    @Override // defpackage.p94
    public final py4 v() {
        return ym.w;
    }

    public final Throwable x() {
        Throwable th = this.z;
        return th == null ? new ClosedReceiveChannelException() : th;
    }
}
