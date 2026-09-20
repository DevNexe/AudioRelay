package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zn6 extends AbstractCollection {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ zn6(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                ((xn6) ((ao6) obj)).zzr();
                break;
            default:
                ((jo6) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.w) {
            case 0:
                Iterator it = ((cp6) ((ao6) this.x).zzu()).values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                xn6 xn6Var = (xn6) ((ao6) obj);
                xn6Var.getClass();
                return new gn6(xn6Var);
            default:
                jo6 jo6Var = (jo6) obj;
                Map mapA = jo6Var.a();
                return mapA != null ? mapA.values().iterator() : new do6(jo6Var);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                return ((xn6) ((ao6) obj)).A;
            default:
                return ((jo6) obj).size();
        }
    }
}
