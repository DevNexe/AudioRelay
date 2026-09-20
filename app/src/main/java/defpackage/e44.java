package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e44 implements Runnable {
    public final /* synthetic */ s44 w;
    public final /* synthetic */ z34 x;
    public final /* synthetic */ h44 y;

    public class QnHx implements kh1 {
        public QnHx() {
        }

        @Override // defpackage.kh1
        public final void onAdLoaded() {
            e44 e44Var = e44.this;
            e44Var.y.b.put(e44Var.x.a, e44Var.w);
        }
    }

    public e44(h44 h44Var, s44 s44Var, z34 z34Var) {
        this.y = h44Var;
        this.w = s44Var;
        this.x = z34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.b(new QnHx());
    }
}
