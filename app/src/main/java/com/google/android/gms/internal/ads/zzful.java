package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzful extends zzfum implements Map {
    @Override // com.google.android.gms.internal.ads.zzfum
    public /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public abstract Map c();

    @Override // java.util.Map
    public final void clear() {
        c().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return c().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return c().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return c().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public Object get(@CheckForNull Object obj) {
        return c().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return c().keySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return c().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return c().values();
    }
}
