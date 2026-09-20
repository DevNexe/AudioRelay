package defpackage;

import kotlinx.coroutines.sync.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class cj2 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ QnHx w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj2(QnHx qnHx, Object obj) {
        super(1);
        this.w = qnHx;
        this.x = obj;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        this.w.a(this.x);
        return sd5.a;
    }
}
