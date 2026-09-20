package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t60<T> implements ra3<T> {
    public final T a;

    /* JADX WARN: Multi-variable type inference failed */
    public t60(Integer num) {
        this.a = num;
    }

    @Override // defpackage.ra3
    public final vq2<T> a(c54 c54Var) {
        bs2 bs2VarS = vq2.s(this.a);
        return c54Var != null ? bs2VarS.u(c54Var) : bs2VarS;
    }

    @Override // defpackage.ra3
    public final T getValue() {
        return this.a;
    }

    @Override // defpackage.ra3
    public final void setValue(T t) {
    }
}
