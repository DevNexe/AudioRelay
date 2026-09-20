package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k33<TSubject, TContext> implements ua0 {
    public final TContext w;

    public k33(TContext tcontext) {
        this.w = tcontext;
    }

    public abstract Object a(TSubject tsubject, z80<? super TSubject> z80Var);

    public abstract TSubject c();

    public abstract Object d(z80<? super TSubject> z80Var);

    public abstract Object e(TSubject tsubject, z80<? super TSubject> z80Var);
}
