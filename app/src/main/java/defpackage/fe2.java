package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fe2 {
    public final AbstractMap a;

    public fe2(int i) {
        if (i != 1) {
            this.a = new HashMap();
        } else {
            this.a = new ConcurrentHashMap();
        }
    }
}
