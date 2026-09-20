package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d44 implements Runnable {
    public final /* synthetic */ r44 w;
    public final /* synthetic */ z34 x;
    public final /* synthetic */ g44 y;

    public class QnHx implements kh1 {
        public QnHx() {
        }

        @Override // defpackage.kh1
        public final void onAdLoaded() {
            d44 d44Var = d44.this;
            d44Var.y.b.put(d44Var.x.a, d44Var.w);
        }
    }

    public d44(g44 g44Var, r44 r44Var, z34 z34Var) {
        this.y = g44Var;
        this.w = r44Var;
        this.x = z34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.b(new QnHx());
    }
}
