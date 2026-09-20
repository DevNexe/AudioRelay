package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b44 implements Runnable {
    public final /* synthetic */ m44 w;
    public final /* synthetic */ z34 x;
    public final /* synthetic */ h44 y;

    public class QnHx implements kh1 {
        public QnHx() {
        }

        @Override // defpackage.kh1
        public final void onAdLoaded() {
            b44 b44Var = b44.this;
            b44Var.y.b.put(b44Var.x.a, b44Var.w);
        }
    }

    public b44(h44 h44Var, m44 m44Var, z34 z34Var) {
        this.y = h44Var;
        this.w = m44Var;
        this.x = z34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.b(new QnHx());
    }
}
