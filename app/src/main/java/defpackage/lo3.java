package defpackage;

import kotlinx.coroutines.internal.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class lo3 extends u9 {
    public final QnHx w;

    public lo3(QnHx qnHx) {
        this.w = qnHx;
    }

    @Override // defpackage.mm
    public final void a(Throwable th) {
        this.w.p();
    }

    @Override // defpackage.j81
    public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
        a(th);
        return sd5.a;
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.w + ']';
    }
}
