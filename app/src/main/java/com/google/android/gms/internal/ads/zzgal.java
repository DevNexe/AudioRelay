package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgal {
    public static zzgak zza(String str) throws GeneralSecurityException {
        ConcurrentHashMap concurrentHashMap;
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Logger logger = zzgbe.a;
        synchronized (zzgbe.class) {
            concurrentHashMap = zzgbe.g;
            mapUnmodifiableMap = Collections.unmodifiableMap(concurrentHashMap);
        }
        if (!mapUnmodifiableMap.containsKey(str)) {
            throw new GeneralSecurityException("cannot find key template: ".concat(str));
        }
        synchronized (zzgbe.class) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(concurrentHashMap);
        }
        return (zzgak) mapUnmodifiableMap2.get(str);
    }
}
