package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nt0<T> extends qj4 {
    public nt0(at3 at3Var) {
        super(at3Var);
    }

    public abstract void d(v61 v61Var, T t);

    public final void e(T t) {
        v61 v61VarA = a();
        try {
            d(v61VarA, t);
            v61VarA.x.executeInsert();
        } finally {
            c(v61VarA);
        }
    }
}
