package defpackage;

import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class zu2 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ j81<Object, sd5> w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ la0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu2(j81<Object, sd5> j81Var, Object obj, la0 la0Var) {
        super(1);
        this.w = j81Var;
        this.x = obj;
        this.y = la0Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        UndeliveredElementException undeliveredElementExceptionG = fp1.G(this.w, this.x, null);
        if (undeliveredElementExceptionG != null) {
            ps0.K(this.y, undeliveredElementExceptionG);
        }
        return sd5.a;
    }
}
