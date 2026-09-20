package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w80 implements ua0 {
    public final la0 w;

    public w80(la0 la0Var) {
        this.w = la0Var;
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.w;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.w + ')';
    }
}
