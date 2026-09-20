package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class t04 implements ht2<Object> {
    public final /* synthetic */ int A = 4;
    public final /* synthetic */ Object B;
    public vl0 w;
    public Object x;
    public boolean y;
    public final /* synthetic */ wm<Object> z;

    public static final class QnHx extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ vl0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(vl0 vl0Var) {
            super(1);
            this.w = vl0Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            this.w.a();
            return sd5.a;
        }
    }

    public t04(xm xmVar, Object obj) {
        this.z = xmVar;
        this.B = obj;
    }

    @Override // defpackage.ht2
    public final void b() {
        boolean z = this.y;
        wm<Object> wmVar = this.z;
        if (z) {
            if (wmVar.c()) {
                wmVar.x(this.x);
                return;
            }
            return;
        }
        int i = this.A;
        if (i == 2) {
            wmVar.x(this.B);
        } else if (wmVar.c()) {
            wmVar.x(new fq3.QnHx(new NoSuchElementException("No value received via onNext for ".concat(fj0.d(i)))));
        }
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        this.w = vl0Var;
        this.z.B(new QnHx(vl0Var));
    }

    @Override // defpackage.ht2
    public final void g(Object obj) {
        int i = this.A;
        int iH = O.h(i);
        wm<Object> wmVar = this.z;
        if (iH == 0 || iH == 1) {
            if (this.y) {
                return;
            }
            this.y = true;
            wmVar.x(obj);
            vl0 vl0Var = this.w;
            if (vl0Var != null) {
                vl0Var.a();
                return;
            } else {
                ur1.e("subscription");
                throw null;
            }
        }
        if (iH == 2 || iH == 3) {
            if (i != 4 || !this.y) {
                this.x = obj;
                this.y = true;
                return;
            }
            if (wmVar.c()) {
                wmVar.x(new fq3.QnHx(new IllegalArgumentException("More than one onNext value for ".concat(fj0.d(i)))));
            }
            vl0 vl0Var2 = this.w;
            if (vl0Var2 != null) {
                vl0Var2.a();
            } else {
                ur1.e("subscription");
                throw null;
            }
        }
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        this.z.x(new fq3.QnHx(th));
    }
}
