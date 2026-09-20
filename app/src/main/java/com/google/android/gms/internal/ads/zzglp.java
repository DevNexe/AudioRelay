package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglp {
    public static final Logger b = Logger.getLogger(zzglp.class.getName());
    public static final List c;
    public static final boolean d;
    public static final zzglp zza;
    public static final zzglp zzb;
    public static final zzglp zzc;
    public static final zzglp zzd;
    public static final zzglp zze;
    public static final zzglp zzf;
    public static final zzglp zzg;
    public final zzglx a;

    static {
        if (zzgcz.zzb()) {
            c = zzb("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            d = false;
        } else if (zzgmh.zzb()) {
            c = zzb("GmsCore_OpenSSL", "AndroidOpenSSL");
            d = true;
        } else {
            c = new ArrayList();
            d = true;
        }
        zza = new zzglp(new zzglq());
        zzb = new zzglp(new zzglu());
        zzc = new zzglp(new zzglw());
        zzd = new zzglp(new zzglv());
        zze = new zzglp(new zzglr());
        zzf = new zzglp(new zzglt());
        zzg = new zzglp(new zzgls());
    }

    public zzglp(zzglx zzglxVar) {
        this.a = zzglxVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = c.iterator();
        Exception exc = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            zzglx zzglxVar = this.a;
            if (!zHasNext) {
                if (d) {
                    return zzglxVar.zza(str, null);
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
            }
            try {
                return zzglxVar.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
    }
}
