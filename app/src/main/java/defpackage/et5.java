package defpackage;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class et5 extends ed7 {
    public final transient int A;
    public final transient tc7 y;
    public final transient Object[] z;

    public et5(tc7 tc7Var, Object[] objArr, int i) {
        this.y = tc7Var;
        this.z = objArr;
        this.A = i;
    }

    @Override // defpackage.ea7
    public final int a(Object[] objArr) {
        return e().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.y.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }
}
