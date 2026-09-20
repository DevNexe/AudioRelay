package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgpr extends LinkedHashMap {
    public static final zzgpr x;
    public boolean w;

    static {
        zzgpr zzgprVar = new zzgpr();
        x = zzgprVar;
        zzgprVar.w = false;
    }

    public zzgpr() {
        this.w = true;
    }

    public static zzgpr zza() {
        return x;
    }

    public final void a() {
        if (!this.w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                iHashCode = zzgox.zzb((byte[]) key);
            } else {
                if (key instanceof zzgop) {
                    throw new UnsupportedOperationException();
                }
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                iHashCode2 = zzgox.zzb((byte[]) value);
            } else {
                if (value instanceof zzgop) {
                    throw new UnsupportedOperationException();
                }
                iHashCode2 = value.hashCode();
            }
            i += iHashCode2 ^ iHashCode;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = zzgox.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = zzgox.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }

    public final zzgpr zzb() {
        return isEmpty() ? new zzgpr() : new zzgpr(this);
    }

    public final void zzc() {
        this.w = false;
    }

    public final void zzd(zzgpr zzgprVar) {
        a();
        if (zzgprVar.isEmpty()) {
            return;
        }
        putAll(zzgprVar);
    }

    public final boolean zze() {
        return this.w;
    }

    public zzgpr(Map map) {
        super(map);
        this.w = true;
    }
}
