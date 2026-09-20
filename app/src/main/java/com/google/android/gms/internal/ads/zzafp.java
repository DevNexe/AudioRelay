package com.google.android.gms.internal.ads;

import defpackage.bj0;
import defpackage.ss3;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafp {
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    public static UUID zza(byte[] bArr) {
        ss3 ss3Var;
        zzed zzedVar = new zzed(bArr);
        if (zzedVar.zzd() < 32) {
            ss3Var = null;
        } else {
            zzedVar.zzF(0);
            if (zzedVar.zze() == zzedVar.zza() + 4 && zzedVar.zze() == 1886614376) {
                int iZze = (zzedVar.zze() >> 24) & 255;
                if (iZze > 1) {
                    bj0.b("Unsupported pssh version: ", iZze, "PsshAtomUtil");
                } else {
                    UUID uuid = new UUID(zzedVar.zzr(), zzedVar.zzr());
                    if (iZze == 1) {
                        zzedVar.zzG(zzedVar.zzn() * 16);
                    }
                    int iZzn = zzedVar.zzn();
                    if (iZzn == zzedVar.zza()) {
                        byte[] bArr2 = new byte[iZzn];
                        zzedVar.zzB(bArr2, 0, iZzn);
                        ss3Var = new ss3(uuid, bArr2);
                    }
                }
                ss3Var = null;
            } else {
                ss3Var = null;
            }
        }
        if (ss3Var == null) {
            return null;
        }
        return (UUID) ss3Var.x;
    }
}
