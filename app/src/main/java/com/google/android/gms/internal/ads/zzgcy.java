package com.google.android.gms.internal.ads;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcy {
    public static boolean zza(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !zzgcz.zzb();
        }
        if (zzgcz.zzb()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                zzgcz.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
