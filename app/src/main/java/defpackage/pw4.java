package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pw4 extends nj4<Integer> implements js4<Integer> {
    public pw4(int i) {
        super(1, Integer.MAX_VALUE, lg.DROP_OLDEST);
        e(Integer.valueOf(i));
    }

    @Override // defpackage.js4
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.D;
            numValueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.E + ((long) ((int) ((r() + ((long) this.G)) - this.E)))) - 1))]).intValue());
        }
        return numValueOf;
    }
}
