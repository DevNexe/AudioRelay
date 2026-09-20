package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a44 implements Runnable {
    public final /* synthetic */ l44 w;
    public final /* synthetic */ z34 x;
    public final /* synthetic */ g44 y;

    public class QnHx implements kh1 {
        public QnHx() {
        }

        @Override // defpackage.kh1
        public final void onAdLoaded() {
            a44 a44Var = a44.this;
            a44Var.y.b.put(a44Var.x.a, a44Var.w);
        }
    }

    public a44(g44 g44Var, l44 l44Var, z34 z34Var) {
        this.y = g44Var;
        this.w = l44Var;
        this.x = z34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.b(new QnHx());
    }
}
