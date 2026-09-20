package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class HPnW implements x94<Object> {
    public final /* synthetic */ Object[] a;

    public HPnW(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.x94
    public final Iterator<Object> iterator() {
        return new tj1(this.a);
    }
}
