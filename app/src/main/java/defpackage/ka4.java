package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ka4 extends l91 implements j81<Iterable<Object>, Iterator<Object>> {
    public static final ka4 F = new ka4();

    public ka4() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // defpackage.j81
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        return iterable.iterator();
    }
}
