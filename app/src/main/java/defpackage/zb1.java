package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zb1<K, V> extends o92<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final yb1 c;

    public zb1(rv1<K> rv1Var, rv1<V> rv1Var2) {
        super(rv1Var, rv1Var2);
        this.c = new yb1(rv1Var.a(), rv1Var2.a());
    }

    @Override // defpackage.o92, defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.c;
    }

    @Override // defpackage.T23
    public final Object f() {
        return new HashMap();
    }

    @Override // defpackage.T23
    public final int g(Object obj) {
        return ((HashMap) obj).size() * 2;
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
        return new HashMap((Map) null);
    }

    @Override // defpackage.T23
    public final Object m(Object obj) {
        return (HashMap) obj;
    }
}
