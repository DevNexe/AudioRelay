package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1518q implements j$.util.function.L {
    public final /* synthetic */ Consumer a;

    @Override // j$.util.function.L
    public final void accept(int i) {
        this.a.accept(Integer.valueOf(i));
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }
}
