package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oo6 extends yn6 implements Serializable {
    public final Object w;
    public final Object x;

    public oo6(Object obj, List list) {
        this.w = obj;
        this.x = list;
    }

    @Override // defpackage.yn6, java.util.Map.Entry
    public final Object getKey() {
        return this.w;
    }

    @Override // defpackage.yn6, java.util.Map.Entry
    public final Object getValue() {
        return this.x;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
