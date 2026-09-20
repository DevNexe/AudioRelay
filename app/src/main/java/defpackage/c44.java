package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c44 implements Runnable {
    public final /* synthetic */ n44 w;
    public final /* synthetic */ z34 x;
    public final /* synthetic */ i44 y;

    public class QnHx implements kh1 {
        public QnHx() {
        }

        @Override // defpackage.kh1
        public final void onAdLoaded() {
            c44 c44Var = c44.this;
            c44Var.y.b.put(c44Var.x.a, c44Var.w);
        }
    }

    public c44(i44 i44Var, n44 n44Var, z34 z34Var) {
        this.y = i44Var;
        this.w = n44Var;
        this.x = z34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.b(new QnHx());
    }
}
