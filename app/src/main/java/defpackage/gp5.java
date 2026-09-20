package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gp5 {
    public final Map<BasePendingResult<?>, Boolean> a = DesugarCollections.synchronizedMap(new WeakHashMap());
    public final Map<z05<?>, Boolean> b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.a) {
            map = new HashMap(this.a);
        }
        synchronized (this.b) {
            map2 = new HashMap(this.b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                BasePendingResult basePendingResult = (BasePendingResult) entry.getKey();
                synchronized (basePendingResult.a) {
                    if (!basePendingResult.b()) {
                        basePendingResult.c(basePendingResult.a());
                        basePendingResult.e = true;
                    }
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((z05) entry2.getKey()).b(new ApiException(status));
            }
        }
    }
}
