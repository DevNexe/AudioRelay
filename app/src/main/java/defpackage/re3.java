package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class re3<T> implements qe3<T>, ri2<T> {
    public final la0 w;
    public final /* synthetic */ ri2<T> x;

    public re3(ri2<T> ri2Var, la0 la0Var) {
        this.w = la0Var;
        this.x = ri2Var;
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.w;
    }

    @Override // defpackage.ri2, defpackage.is4
    public final T getValue() {
        return this.x.getValue();
    }

    @Override // defpackage.ri2
    public final void setValue(T t) {
        this.x.setValue(t);
    }
}
