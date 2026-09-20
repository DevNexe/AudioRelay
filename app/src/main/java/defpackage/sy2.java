package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sy2 {
    public jtf w;
    public boolean x;
    public av y;
    public float z = 1.0f;
    public jy1 A = jy1.Ltr;

    public static final class QnHx extends cx1 implements j81<ro0, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(ro0 ro0Var) {
            sy2.this.h(ro0Var);
            return sd5.a;
        }
    }

    public sy2() {
        new QnHx();
    }

    public boolean b(float f) {
        return false;
    }

    public boolean e(av avVar) {
        return false;
    }

    public void f(jy1 jy1Var) {
    }

    public abstract long g();

    public abstract void h(ro0 ro0Var);
}
