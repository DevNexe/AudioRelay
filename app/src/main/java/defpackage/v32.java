package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v32<K, V> extends o92<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final u32 c;

    public v32(rv1<K> rv1Var, rv1<V> rv1Var2) {
        super(rv1Var, rv1Var2);
        this.c = new u32(rv1Var.a(), rv1Var2.a());
    }

    @Override // defpackage.o92, defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.c;
    }

    @Override // defpackage.T23
    public final Object f() {
        return new LinkedHashMap();
    }

    @Override // defpackage.T23
    public final int g(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // defpackage.T23
    public final Iterator h(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((Map) obj).size();
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new LinkedHashMap((Map) null);
    }

    @Override // defpackage.T23
    public final Object m(Object obj) {
        return (LinkedHashMap) obj;
    }
}
