package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class h54 extends oa0 implements ti0 {
    public static final /* synthetic */ int z = 0;
    public final c54 y;

    public h54(c54 c54Var) {
        this.y = c54Var;
    }

    @Override // defpackage.ti0
    public final am0 b(long j, Runnable runnable, la0 la0Var) {
        final vl0 vl0VarC = this.y.c(runnable, j, TimeUnit.MILLISECONDS);
        return new am0() { // from class: f54
            @Override // defpackage.am0
            public final void a() {
                vl0VarC.a();
            }
        };
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h54) && ((h54) obj).y == this.y;
    }

    @Override // defpackage.ti0
    public final void f(long j, xm xmVar) {
        xmVar.B(new u04(this.y.c(new qs1(3, xmVar, this), j, TimeUnit.MILLISECONDS)));
    }

    @Override // defpackage.oa0
    public final void g(la0 la0Var, Runnable runnable) {
        this.y.b(runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.y);
    }

    @Override // defpackage.oa0
    public final String toString() {
        return this.y.toString();
    }
}
