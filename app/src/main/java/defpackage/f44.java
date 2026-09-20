package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f44 implements Runnable {
    public final /* synthetic */ t44 w;
    public final /* synthetic */ z34 x;
    public final /* synthetic */ i44 y;

    public class QnHx implements kh1 {
        public QnHx() {
        }

        @Override // defpackage.kh1
        public final void onAdLoaded() {
            f44 f44Var = f44.this;
            f44Var.y.b.put(f44Var.x.a, f44Var.w);
        }
    }

    public f44(i44 i44Var, t44 t44Var, z34 z34Var) {
        this.y = i44Var;
        this.w = t44Var;
        this.x = z34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.b(new QnHx());
    }
}
