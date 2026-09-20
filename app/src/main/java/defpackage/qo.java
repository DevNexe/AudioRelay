package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class qo<T> extends oo<T> {
    public final x81<te3<? super T>, z80<? super sd5>, Object> z;

    /* JADX WARN: Multi-variable type inference failed */
    public qo(x81<? super te3<? super T>, ? super z80<? super sd5>, ? extends Object> x81Var, la0 la0Var, int i, lg lgVar) {
        super(la0Var, i, lgVar);
        this.z = x81Var;
    }

    @Override // defpackage.oo
    public final String toString() {
        return "block[" + this.z + "] -> " + super.toString();
    }
}
