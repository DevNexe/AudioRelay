package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rs4 implements Map.Entry<Object, Object>, mv1.QnHx {
    public final Object w;
    public Object x;
    public final /* synthetic */ ss4<Object, Object> y;

    public rs4(ss4<Object, Object> ss4Var) {
        this.y = ss4Var;
        this.w = ss4Var.z.getKey();
        this.x = ss4Var.z.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.x;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        ss4<Object, Object> ss4Var = this.y;
        if (ss4Var.w.c().d != ss4Var.y) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.x;
        ss4Var.w.put(this.w, obj);
        this.x = obj;
        return obj2;
    }
}
