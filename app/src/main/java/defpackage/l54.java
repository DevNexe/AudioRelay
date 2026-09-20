package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l54 implements iw0<e54> {
    public final og3<at> a = s75.QnHx.a;

    @Override // defpackage.og3
    public final Object get() {
        at atVar = this.a.get();
        HashMap map = new HashMap();
        ie3 ie3Var = ie3.DEFAULT;
        b4.QnHx qnHx = new b4.QnHx();
        Set<e54.CQf> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        qnHx.c = setEmptySet;
        qnHx.a = 30000L;
        qnHx.b = 86400000L;
        map.put(ie3Var, qnHx.a());
        ie3 ie3Var2 = ie3.HIGHEST;
        b4.QnHx qnHx2 = new b4.QnHx();
        Set<e54.CQf> setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        qnHx2.c = setEmptySet2;
        qnHx2.a = 1000L;
        qnHx2.b = 86400000L;
        map.put(ie3Var2, qnHx2.a());
        ie3 ie3Var3 = ie3.VERY_LOW;
        b4.QnHx qnHx3 = new b4.QnHx();
        Set<e54.CQf> setEmptySet3 = Collections.emptySet();
        if (setEmptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        qnHx3.c = setEmptySet3;
        qnHx3.a = 86400000L;
        qnHx3.b = 86400000L;
        Set<e54.CQf> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e54.CQf.NETWORK_UNMETERED, e54.CQf.DEVICE_IDLE)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        qnHx3.c = setUnmodifiableSet;
        map.put(ie3Var3, qnHx3.a());
        if (atVar == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (map.keySet().size() < ie3.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new a4(atVar, map);
    }
}
