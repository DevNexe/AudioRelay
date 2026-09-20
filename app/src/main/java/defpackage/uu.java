package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class uu implements x94<Object> {
    public final /* synthetic */ Iterable a;

    public uu(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.x94
    public final Iterator<Object> iterator() {
        return this.a.iterator();
    }
}
