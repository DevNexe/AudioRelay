package defpackage;

import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hg4 implements wb1 {
    public final AtomicReference<af4> a = new AtomicReference<>(new af4(0));
    public final dw4<sd5> b = new rg3().G();

    public static final class QnHx extends cx1 implements j81<af4, af4> {
        public final /* synthetic */ c60 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(c60 c60Var) {
            super(1);
            this.w = c60Var;
        }

        @Override // defpackage.j81
        public final af4 invoke(af4 af4Var) {
            af4 af4Var2 = af4Var;
            yv2 yv2Var = af4Var2.b;
            af4Var2.getClass();
            return new af4(this.w, yv2Var);
        }
    }

    @Override // defpackage.wb1
    public final void a(yv2.QnHx qnHx) {
        DesugarAtomicReference.getAndUpdate(this.a, new gg4(new ig4(qnHx)));
        this.b.g(sd5.a);
    }

    @Override // defpackage.wb1
    public final void e(c60 c60Var) {
        DesugarAtomicReference.getAndUpdate(this.a, new gg4(new QnHx(c60Var)));
        this.b.g(sd5.a);
    }
}
