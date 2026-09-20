package com.google.android.gms.internal.ads;

import defpackage.cr6;
import defpackage.pd6;
import defpackage.yq6;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgbe {
    public static final Logger a = Logger.getLogger(zzgbe.class.getName());
    public static final AtomicReference b = new AtomicReference(new cr6());
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public static final ConcurrentHashMap f = new ConcurrentHashMap();
    public static final ConcurrentHashMap g = new ConcurrentHashMap();

    public static synchronized void a(Map map, String str, boolean z) {
        if (z) {
            ConcurrentHashMap concurrentHashMap = d;
            if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((cr6) b.get()).a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!g.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (g.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzgpx, java.lang.Object] */
    public static void b(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            g.put((String) entry.getKey(), zzgak.zze(str, ((zzgek) entry.getValue()).zza.zzaw(), ((zzgek) entry.getValue()).zzb));
        }
    }

    @Deprecated
    public static zzfzv zza(String str) {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentHashMap concurrentHashMap = e;
        Locale locale = Locale.US;
        zzfzv zzfzvVar = (zzfzv) concurrentHashMap.get(str.toLowerCase(locale));
        if (zzfzvVar != null) {
            return zzfzvVar;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strConcat);
    }

    public static zzgac zzb(String str) {
        return ((cr6) b.get()).d(str).zzb();
    }

    public static synchronized zzgjg zzc(zzgjl zzgjlVar) {
        zzgac zzgacVarZzb;
        zzgacVarZzb = zzb(zzgjlVar.zzf());
        if (!((Boolean) d.get(zzgjlVar.zzf())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgjlVar.zzf())));
        }
        return zzgacVarZzb.zza(zzgjlVar.zze());
    }

    public static synchronized zzgpx zzd(zzgjl zzgjlVar) {
        zzgac zzgacVarZzb;
        zzgacVarZzb = zzb(zzgjlVar.zzf());
        if (!((Boolean) d.get(zzgjlVar.zzf())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgjlVar.zzf())));
        }
        return zzgacVarZzb.zzb(zzgjlVar.zze());
    }

    public static Class zze(Class cls) {
        zzgbb zzgbbVar = (zzgbb) f.get(cls);
        if (zzgbbVar == null) {
            return null;
        }
        return zzgbbVar.zza();
    }

    public static Object zzf(zzgjg zzgjgVar, Class cls) {
        return zzg(zzgjgVar.zzf(), zzgjgVar.zze(), cls);
    }

    public static Object zzg(String str, zzgnf zzgnfVar, Class cls) {
        return ((cr6) b.get()).a(cls, str).zzd(zzgnfVar);
    }

    public static Object zzh(String str, zzgpx zzgpxVar, Class cls) {
        return ((cr6) b.get()).a(cls, str).zze(zzgpxVar);
    }

    public static Object zzi(String str, byte[] bArr, Class cls) {
        return zzg(str, zzgnf.zzv(bArr), cls);
    }

    public static Object zzj(zzgba zzgbaVar, Class cls) throws GeneralSecurityException {
        zzgbb zzgbbVar = (zzgbb) f.get(cls);
        if (zzgbbVar == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(zzgbaVar.zzb().getName()));
        }
        if (zzgbbVar.zza().equals(zzgbaVar.zzb())) {
            return zzgbbVar.zzc(zzgbaVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + zzgbbVar.zza().toString() + ", got " + zzgbaVar.zzb().toString());
    }

    public static synchronized void zzl(zzgeo zzgeoVar, zzgem zzgemVar, boolean z) {
        AtomicReference atomicReference = b;
        cr6 cr6Var = new cr6((cr6) atomicReference.get());
        cr6Var.b(zzgeoVar, zzgemVar);
        String strZzc = zzgeoVar.zzc();
        String strZzc2 = zzgemVar.zzc();
        a(zzgeoVar.zza().zzc(), strZzc, true);
        a(Collections.emptyMap(), strZzc2, false);
        if (!((cr6) atomicReference.get()).a.containsKey(strZzc)) {
            c.put(strZzc, new pd6(zzgeoVar, 14));
            b(zzgeoVar.zzc(), zzgeoVar.zza().zzc());
        }
        ConcurrentHashMap concurrentHashMap = d;
        concurrentHashMap.put(strZzc, Boolean.TRUE);
        concurrentHashMap.put(strZzc2, Boolean.FALSE);
        atomicReference.set(cr6Var);
    }

    public static synchronized void zzm(zzgac zzgacVar, boolean z) {
        try {
            if (zzgacVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = b;
            cr6 cr6Var = new cr6((cr6) atomicReference.get());
            synchronized (cr6Var) {
                if (!zzgcy.zza(1)) {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                cr6Var.e(new yq6(zzgacVar), false);
            }
            if (!zzgcy.zza(1)) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            String strZzf = zzgacVar.zzf();
            a(Collections.emptyMap(), strZzf, z);
            d.put(strZzf, Boolean.valueOf(z));
            atomicReference.set(cr6Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void zzn(zzgem zzgemVar, boolean z) {
        AtomicReference atomicReference = b;
        cr6 cr6Var = new cr6((cr6) atomicReference.get());
        cr6Var.c(zzgemVar);
        String strZzc = zzgemVar.zzc();
        a(zzgemVar.zza().zzc(), strZzc, true);
        if (!((cr6) atomicReference.get()).a.containsKey(strZzc)) {
            c.put(strZzc, new pd6(zzgemVar, 14));
            b(strZzc, zzgemVar.zza().zzc());
        }
        d.put(strZzc, Boolean.TRUE);
        atomicReference.set(cr6Var);
    }

    public static synchronized void zzo(zzgbb zzgbbVar) {
        try {
            if (zzgbbVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class clsZzb = zzgbbVar.zzb();
            ConcurrentHashMap concurrentHashMap = f;
            if (concurrentHashMap.containsKey(clsZzb)) {
                zzgbb zzgbbVar2 = (zzgbb) concurrentHashMap.get(clsZzb);
                if (!zzgbbVar.getClass().getName().equals(zzgbbVar2.getClass().getName())) {
                    a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(clsZzb.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsZzb.getName(), zzgbbVar2.getClass().getName(), zzgbbVar.getClass().getName()));
                }
            }
            concurrentHashMap.put(clsZzb, zzgbbVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
